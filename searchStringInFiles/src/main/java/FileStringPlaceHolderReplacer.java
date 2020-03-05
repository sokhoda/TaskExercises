import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStringPlaceHolderReplacer {
    private final static String IN_FILENAME = "C:\\Users\\Oleksandr_Khodakovsk\\OneDrive - EPAM\\myConfig\\unexistingFile.txt";

    private final static String IN_ISO_LANGUAGES_FILENAME = "C:\\Users\\Oleksandr_Khodakovsk\\OneDrive - EPAM\\myConfig\\adt\\ISO_LANG1.csv";

    public static void main(String[] args) {
        replaceString(IN_FILENAME);
        new File(getClass().getResource(IN_FILENAME).toURI());
    }

    public static Map<String, String> readData(String filename) {
        String content;
        try {
            content = FileUtils.readFileToString(new File(filename), "UTF-8");
        } catch (IOException e) {
            //Simple exception handling, replace with what's necessary for your use case!
            throw new RuntimeException("Generating file failed", e);
        }
        return Arrays.stream(content.split("\\r\\n"))
                .map(row -> {
                    String[] split = row.split(",");
                    return Pair.of(StringUtils.replace(split[1], ";", ","), split[2]);
                })
                .collect(Collectors.toMap(Pair::getValue, Pair::getKey, (left, right) -> right, TreeMap::new));
    }

    private static void replaceString(String inFilename) {
        try {
            String content = Stream.of("email00112", "email0023")
                    .collect(Collectors.joining(",\n", "email\n", StringUtils.EMPTY));

            File file = new File(inFilename);
//            String content = String.join(",\n", Arrays.asList("email112", "email23"));
            FileUtils.writeStringToFile(file, content, "UTF-8");
        } catch (IOException e) {
            //Simple exception handling, replace with what's necessary for your use case!
            throw new RuntimeException("Generating file failed", e);
        }
    }
}
