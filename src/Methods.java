public class Methods {
    /**
     * [modifier] [type] [name] (arguments )
     * //static - для всех методов
     */


    public static void main(String[] args) {
        System.out.println(summ(1, 2));
        System.out.println(summ(3, 4));
        System.out.println(mult(3, 4));



        printStringTwice("my String! ");
        //
        System.out.println(summ());

        print("My int ", 1);
        print(1, "My int ");
    }

    /**
     * по умолчанию всегда 0
     *
     * @return
     */
    public static int summ() {
        return summ(0, 0);
    }

    /**
     * всегда суммирует с 10
     * @return
     */
    public static int summ10(int a) {
        return summ(10, a);
    }

    /**
     * Считает сумму
     *
     * @param a слагаемое
     * @param b слагаемое
     * @return сумма слагаемых
     */
    public static int summ(int a, int b) {
        return a + b;
    }


    public static int mult(int a, int b) {
        //
        return a * b;
    }


    public static void print(String s, int a) {
        System.out.println(s + a);
    }

    public static void print(int a,  String s) {
        System.out.println(s + a);
    }

    public static void printStringTwice(String string) {
        System.out.println(string);
        System.out.println(string);

    }


}
