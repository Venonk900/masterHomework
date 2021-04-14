import java.util.Arrays;

public class WhileLoop {



    public static void main(String[] args) {
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 1, 11}));

    }

    private static boolean checkBalance(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        boolean result = false;


        if (array.length > 1) {
            for (int i = 0; i < array.length / 2; i++) {
                sumLeft += array[i];
                sumRight += array[array.length - 1 - i];
                if (i == (array.length / 2 - 1) && array.length % 2 != 0) {
                    sumRight += array[array.length - 2 - i];
                }
            }

            if (sumLeft > sumRight) {
                for (int i = array.length / 2; i < array.length; i++) {
                    sumLeft -= array[i];
                    sumRight += array[i];
                    if (sumLeft == sumRight) {
                        result = true;
                        break;
                    }
                }
            }
            if (sumLeft < sumRight) {
                for (int i = array.length / 2; i < array.length; i++) {
                    sumLeft += array[i];
                    sumRight -= array[i];
                    if (sumLeft == sumRight) {
                        result = true;
                        break;
                    }

                }
            } else {
                result = true;
            }
        }
        System.out.println("Массив: " + Arrays.toString(array) +" "+ result);

        return result;
    }

    public static void simpleWhile() {
        int i = 10;
        while (i>0){
            System.out.println(i);
            i--;
        }
    }

    public static void doWhile() {
        int i=10;
        do {
            System.out.println(i);
            i--;
        } while (i>0);
    }
}
