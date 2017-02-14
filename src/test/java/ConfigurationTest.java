import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by XieChen on 2017/2/12.
 */
public class ConfigurationTest {
    private final String dbPropertiesFileName = "db.properties";
    private final String packageEnvironmentKey = "package.environment";

    /**
     * Test of get db.properties
     */
    @Test
    public void testReadDbPropertiesFile() {
        try {
            InputStream inputStream = ClassLoader.getSystemResourceAsStream(dbPropertiesFileName);
            assertNotNull(inputStream);
            Properties properties = new Properties();
            properties.load(inputStream);
            String value = properties.getProperty(packageEnvironmentKey);
            //For test profile.
            assertEquals(value, "test");
        } catch (Exception ex) {
            assertTrue(ex instanceof IOException);
        }
    }
}
