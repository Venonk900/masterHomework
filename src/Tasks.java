public class Tasks {

    public static void main(String[] args) {

        System.out.println(fact(-100));
        System.out.println(fact(-0));
        System.out.println(fact(4));
    }

    /**
     * Сумма четных или нечетных чисел
     * @param number число до которого считать
     * @param e Четное или нечетное
     * @return сумму запрошенных чисел
     */
    public static int evenSum(int number, MyEnum e) {
        int sum = 0;
        for (int i = number; i > 0; i--) {
            switch (e) {
                case ODD: {
                    //усли нечетное
                    if (i % 2 != 0) {
                        sum += i;
                    }
                    break;
                }
                case EVEN: {
                    //усли четное
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }
            }

        }
        return sum;
    }


    /**
     * вывести на экран всек кубы чисел от A до B
     */
    public static void printCubes(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i * i * i);
        }
    }


    /**
     * Посчитать факториал числа
     * 4! = 1 * 2 * 3 * 4
     * если число меньше 0, то вернуть -1
     */
    public static int fact(int n) {
        //провыеряем входное условие
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
