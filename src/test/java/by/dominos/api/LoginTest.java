package by.dominos.api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {
    @Test
    @DisplayName("тест: вход без ввода номера телефона")
    public void noPhone() {
        given()
                .body(LoginRequest.getBody(" "))
                .contentType(ContentType.JSON)
        .when()
                .post(LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(400)
                .body("phone[0]", equalTo("Это поле не может быть пустым."));
    }

    @Test
    @DisplayName("тест: вход с некоректным номером телефона")
    public void incorrectPhone() {
        given()
                .body(LoginRequest.getBody("375298564032"))
                .contentType(ContentType.JSON)
        .when()
                .post(LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(400)
                .body("phone[0]", equalTo("Введите корректный номер телефона."));
    }

    @Test
    @DisplayName("тест: вход с коректным номером телефона")
    public void correctPhone() {
        given()
                .body(LoginRequest.getBody("+375298564032"))
                .contentType(ContentType.JSON)
        .when()
                .post(LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200);
    }
}
