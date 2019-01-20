import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

public class SimpleReadArgs {
//    private static final Logger LOG = LoggerFactory.getLogger(SimpleReadArgs.class);

    private static final String ADT_PROPERTIES_KEY = "adt.properties";
    private static final String ADT_PROPERTIES_DEFAULT_FILENAME = "adt.properties";

    public static void main(String[] args) {
        String pathSeparator = System.getProperty("path.separator");
        String javaHome = System.getProperty("java.home");

        for (String arg : args) {
            System.out.println(StringUtils.upperCase(arg));
        }
        String[] javaClassPaths = System.getProperty("java.class.path").split(pathSeparator);
        System.out.println("java.class.path:");
                Stream.of(javaClassPaths).forEach(System.out::println);
        System.out.println("path.separator: " + pathSeparator);
        System.out.println("java.home: " + javaHome);
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
//            LOG.info("Connect to adt.host = " + adtHost + ", adt.port = " + adtPort);
            System.out.println("Connect to adt.host = " + adtHost + ", adt.port = " + adtPort);
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
