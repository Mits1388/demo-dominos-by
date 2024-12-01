package by.dominos.api;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {

    @Test
    @DisplayName("тест: вход без ввода номера телефона")
    public void noPhone() {

        DominosApi dominosApi = new DominosApi();
        ValidatableResponse response = dominosApi.getResponsePhone(" ");
        response
                .statusCode(400)
                .body("phone[0]", equalTo("Это поле не может быть пустым."));
    }

    @Test
    @DisplayName("тест: вход с некоректным номером телефона")
    public void incorrectPhone() {

        DominosApi dominosApi = new DominosApi();
        ValidatableResponse response = dominosApi.getResponsePhone("375298564032");

        response
                .statusCode(400)
                .body("phone[0]", equalTo("Введите корректный номер телефона."));
    }

    @Test
    @DisplayName("тест: вход с коректным номером телефона")
    public void correctPhone() {

        DominosApi dominosApi = new DominosApi();
        ValidatableResponse response = dominosApi.getResponsePhone("+375298564032");
        response
                .statusCode(200);
    }
}
