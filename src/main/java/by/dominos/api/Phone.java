package by.dominos.api;

public enum Phone {
    CORRECT_PHONE("+375298564032"),
    INCORRECT_PHONE("375298564032"),
    EMPTY_PHONE(" ");

    public final String label;

    Phone(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
