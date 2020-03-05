import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FileStringReplacer {
    private final static String IN_FILENAME = "C:\\Users\\Oleksandr_Khodakovsk\\dhl-ewf\\dhlEsb\\dhl-commons\\src\\main\\java\\com\\dhl\\ewf\\i18n" +
            "\\LanguageCode.java";
    private final static String OUT_FILENAME = "C:\\Users\\Oleksandr_Khodakovsk\\dhl-ewf\\dhlEsb\\dhl-commons\\src\\main\\java\\com\\dhl\\ewf\\i18n" +
            "\\LanguageCode1.java";

    private final static String IN_ISO_LANGUAGES_FILENAME = "C:\\Users\\Oleksandr_Khodakovsk\\OneDrive - EPAM\\myConfig\\adt\\ISO_LANG1.csv";

    public static void main(String[] args) {
//        replaceString(IN_FILENAME, OUT_FILENAME);
        Map<String, String> result = readData(IN_ISO_LANGUAGES_FILENAME);
        result.forEach((code, name) -> System.out.println(String.format("%s=%s", code, name)));
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

    private static void replaceString(String inFilename, String outFilename) {
        try {
            String content = FileUtils.readFileToString(new File(inFilename), "UTF-8");

            String currentCode = "aa";
            String currentName = "Name";
            String languageCodeRegex = "\\s" + currentCode + "\\s\\{";
            String replacement = " " + currentCode + "(\"" + currentName + "\")" + " {";
            content = content.replaceAll(languageCodeRegex, replacement);
            File tempFile = new File(outFilename);
            FileUtils.writeStringToFile(tempFile, content, "UTF-8");
        } catch (IOException e) {
            //Simple exception handling, replace with what's necessary for your use case!
            throw new RuntimeException("Generating file failed", e);
        }
    }
}
