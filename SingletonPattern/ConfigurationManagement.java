package SingletonPattern;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
Java class only has one instance, and provide a global point of access to this singleton instance.
*/
public class ConfigurationManagement {
    private static final ConfigurationManagement INSTANCE = new ConfigurationManagement();
    private Properties properties;

    /**
     * Constructor
     */
    private ConfigurationManagement() {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream("config.properties")) {
            if (input != null) {
                properties.load(input);
            } else {
                System.out.println("Configurations file not found!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConfigurationManagement getInstance() {
        return INSTANCE;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
