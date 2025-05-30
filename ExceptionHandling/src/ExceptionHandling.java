public class ExceptionHandling {

    public static void divideNumbers(int a, int b) {
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        divideNumbers(10, 0);
    }
}
