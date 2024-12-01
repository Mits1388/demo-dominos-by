package by.dominos.api;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class DominosApi {

    public ValidatableResponse getResponsePhone(String phone) {
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
