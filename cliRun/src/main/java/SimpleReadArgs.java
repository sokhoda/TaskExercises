import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleReadArgs {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleReadArgs.class);

    private static final String ADT_PROPERTIES_KEY = "adt.properties";
    private static final String ADT_PROPERTIES_DEFAULT_FILENAME = "\\adt.properties";

    public static void main(String[] args) {
        String property1 = System.getProperty("path.separator");
        String property3 = System.getProperty("java.home");

        for (String arg : args) {
            System.out.println(StringUtils.upperCase(arg));
        }
        String[] split = System.getProperty("java.class.path").split(property1);
        System.out.println("java.class.path:");
                Stream.of(split).forEach(System.out::println);
        System.out.println("path.separator: " + property1 + "\n" + property3 + "\n");
        System.out.println(ADT_PROPERTIES_KEY + ":" + System.getProperty(ADT_PROPERTIES_KEY));
        setUp();
    }

    public static void setUp() {
        try {
            Properties properties = loadAdtProperties();

            String adtHost = properties.getProperty("adt.host");
            int adtPort = Integer.valueOf(properties.getProperty("adt.port"));
//            try (PrintWriter writer = new PrintWriter(new File("properties.txt"))) {
//                writer.println("Connect to adt.host = " + adtHost + ", adt.port = " + adtPort);
//            }
            LOG.info("Connect to adt.host = " + adtHost + ", adt.port = " + adtPort);
        } catch (IOException e) {
            throw new RuntimeException("Loading ADT properties failure", e);
        }
    }
    private static Properties loadAdtProperties() throws IOException {
        Properties properties = new Properties();
        try (InputStream inStream = loadAdtPropertiesFile()) {
            properties.load(inStream);
        }
        return properties;
    }

    private static InputStream loadAdtPropertiesFile() throws FileNotFoundException {
        String adtPropertyPath = System.getProperty(ADT_PROPERTIES_KEY);
        return StringUtils.isEmpty(adtPropertyPath) ?
                SimpleReadArgs.class.getResourceAsStream(ADT_PROPERTIES_DEFAULT_FILENAME) :
                new FileInputStream(new File(adtPropertyPath));
    }
}
