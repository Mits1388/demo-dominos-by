package by.dominos.api;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.restassured.RestAssured.given;

public class DominosApi {
    private static final Logger logger = LogManager.getLogger();

    public ValidatableResponse getResponse(String phone) {
        logger.info("DominosApi - getResponsePhone");
        ValidatableResponse response =
                given()
                    .body(LoginRequest.getBody(phone))
                    .contentType(ContentType.JSON)
                .when()
                    .post(LoginRequest.URL_LOGIN)
                .then()
                    .log().all();
        return response;
    }
}
