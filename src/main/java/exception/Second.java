package exception;

public class Second {

    public static void main(String[] args) {
        testDivideByZero(10);
        testAccessToUnexistingElement(new int[]{1, 2, 3}, 3);
        testSearchSomethingOutString("java", 3);

        try {
            testDivideByZero(0);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            testAccessToUnexistingElement(new int[]{1, 2, 3}, 4);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            testSearchSomethingOutString("java", 4);
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void testDivideByZero(int denominator) {
        var result = 1000 / denominator;
    }

    public static void testAccessToUnexistingElement(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            var result = array[i];
        }
    }

    public static void testSearchSomethingOutString(String str, int index) {
        var result = str.charAt(index);
    }
}
