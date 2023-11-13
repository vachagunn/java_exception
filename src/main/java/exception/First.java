package exception;

import java.util.Random;

public class First {

    public static void main(String[] args) {
        try {
            throwRandomException();
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Ура! Меня снова печают");
        }
    }

    public static void throwRandomException() {
        Random random = new Random();
        int exp = random.nextInt(6);

        switch (exp) {
            case 1: divideByZero();
            case 2: accessToUnexistingElement();
            case 3: playWithNullPointer();
            case 4: tryToCreateFunnyArray();
            case 5: searchSomethingOutString();
        }
    }

    public static void divideByZero() {
        int a = 777 / (666 - 666);
    }

    public static void accessToUnexistingElement(){
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length+1; i++) {
            System.out.printf("%d,", i);
        }
    }

    public static void playWithNullPointer() {
        String importantData = null;
        System.out.println("important is " + importantData);
    }

    public static void tryToCreateFunnyArray() {
        int i[] = new int[-5];
    }

    public static void searchSomethingOutString() {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }

}
