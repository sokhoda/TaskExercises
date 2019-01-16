import com.google.common.collect.Sets;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileSearcher {
    private final static Set<String> EXCLUDE_FILE_EXT =
            Sets.newHashSet("11", "TTF", "class", "conf", "css", "csv", "doc", "gitkeep", "gzip", "history",
                    "html", "jpg", "jrxml", "json", "keep", "log", "mp3", "ogg", "pls", "plugins", "png", "properties", "psd",
                    "scala", "sql", "tif", "txt", "wsdl", "xml", "xsd", "xsl", "zip");
    private final static List<String> TRIMMING_PACKAGES = Arrays.asList("platform", "ewf", "adt", "dhl");

    public static void main(String[] args) throws IOException {

        List<String> foundEntries = new ArrayList<>();
        String currentDictionary = "ShipmentErrors.";
        String string2Find = currentDictionary + "WRONG_TERM_OF_TRADE_CODE_ERROR";
        Stream<String> dirsStream = Stream.of("C:\\dhl-ewf\\play\\modules\\java");
        Set<String> fileExtensions = Sets.newHashSet();
        dirsStream.forEach(dir -> {
            try {
                findInDirs(foundEntries, string2Find, dir, false, fileExtensions);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        if (CollectionUtils.isNotEmpty(foundEntries)) {
            outputResults(foundEntries, string2Find);
        }
    }

    private static void findInDirs(List<String> foundEntries, String string2Find, String dir, boolean stdOutEnabled, Set<String> fileExtensions) throws IOException {
        if (StringUtils.isEmpty(dir)) {
            return;
        }
        try (Stream<Path> paths = Files.walk(Paths.get(dir))) {
            foundEntries.addAll(findInDir(string2Find, paths, fileExtensions));
            if (stdOutEnabled && CollectionUtils.isNotEmpty(foundEntries)) {
                outputResults(foundEntries, string2Find);
            }
        }
    }

    private static List<String> findInDir(String string2Find, Stream<Path> paths, Set<String> fileExtensions) {
        return paths.filter(path -> {
            if (path == null || !Files.isRegularFile(path)) {
                return false;
            }
            String fileExt = Optional.ofNullable(path.getName(path.getNameCount() - 1))
                    .map(Path::toString)
                    .map(FilenameUtils::getExtension)
                    .orElse(null);

            fileExtensions.add(fileExt);
            if (EXCLUDE_FILE_EXT.contains(fileExt)) {
                return false;
            }
            try {
                return FileUtils.readFileToString(path.toFile()).contains(string2Find);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        })
                .map(FileSearcher::convertFileName)
                .collect(Collectors.toList());
    }

    private static String convertFileName(Path path) {
        String fullFileName = path.toString();
        if (StringUtils.isBlank(fullFileName)) {
            return StringUtils.EMPTY;
        }
        int k = 0;
        int inx = 0;
        int trimmingPackagesSize = TRIMMING_PACKAGES.size();
        do {
            inx = fullFileName.lastIndexOf(TRIMMING_PACKAGES.get(k));
        } while (inx == -1 && ++k < trimmingPackagesSize);
        return k < trimmingPackagesSize ? fullFileName.substring(inx + TRIMMING_PACKAGES.get(k).length()) : fullFileName;
    }

    private static void outputResults(List<String> foundEntries, String string2Find) {
        System.out.println(string2Find + " found in the following files:");
        foundEntries.forEach(System.out::println);
    }

}
