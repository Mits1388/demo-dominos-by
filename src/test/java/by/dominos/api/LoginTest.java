package by.dominos.api;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {

    @Test
    @DisplayName("тест: вход без ввода номера телефона")
    public void noPhone() {

        ValidatableResponse response = new DominosApi()
                .getResponsePhone(String.valueOf(Phone.EMPTY_PHONE.getLabel()));

        response
                .statusCode(400)
                .body("phone[0]", equalTo(LoginMessage.LOGIN_EMPTY_NUMBER_PHONE));
    }

    @Test
    @DisplayName("тест: вход с некоректным номером телефона")
    public void incorrectPhone() {

        ValidatableResponse response = new DominosApi()
                .getResponsePhone(String.valueOf(Phone.INCORRECT_PHONE.getLabel()));

        response
                .statusCode(400)
                .body("phone[0]", equalTo(LoginMessage.LOGIN_INCORRECT_NUMBER_PHONE));
    }

    @Test
    @DisplayName("тест: вход с коректным номером телефона")
    public void correctPhone() {

        ValidatableResponse response = new DominosApi()
                .getResponsePhone(String.valueOf(Phone.CORRECT_PHONE.getLabel()));

        response
                .statusCode(200)
                .body("text", equalTo(LoginMessage.LOGIN_CORRECT_NUMBER_PHONE));
    }
}
