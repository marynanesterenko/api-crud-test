package steps;

import io.cucumber.java.Before;
import io.restassured.RestAssured;
import utils.ConfigReader;

public class Hooks {

    @Before
    public static void setUp() {
        ConfigReader.initializeProperties();
        RestAssured.baseURI = ConfigReader.getConfigProperty("api.host") + ConfigReader.getConfigProperty("api.ver");
    }
}
