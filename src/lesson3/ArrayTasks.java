package lesson3;

public class ArrayTasks {

    public static void main(String[] args) {

        int min = findMin(new int[]{4, 6, -1, 7});
        System.out.println(min);

    }

    /**
     * Ищет минимальное число
     * @param array массив
     * @return
     */
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i< array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    /**
     * Найти сумму между максимумом и минимумом(не включая)
     * @param array
     * @return
     */
    public static int findBetweenMinAndMax(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        //нашли min и max
        for (int i=0; i< array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return sum;
    }


    //Заполняет диагональ +, остальные " "
    public static void fillWithPlus(String[][] arrayStr) {
        for(int i=0; i< arrayStr.length;i++){
            for(int j=0; j<arrayStr[i].length; j++) {

            }
        }
    }
}
