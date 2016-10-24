public class PinValidator {
    private static int pin = 1234;

    boolean check(int newPin) {
        return pin == newPin;
    }
}
