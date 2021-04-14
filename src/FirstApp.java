public class FirstApp {

    //main method. entry point
    public static void main(String[] args) {
        /**
         * Это просто вывод на экран
         */
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println("Hello, World!");



        //vars

        byte myByte= 111;
        short myShort = 560;
        int myInt = 10000;
        long myLong = 1000000000000L;

        char myChar = 99;
        char myCharTwo = 'A';

        double myDouble = 1.1;
        float myFloat = 3.3f;

        boolean myBool = true;

        System.out.println(myByte);

        String string = "Hello, String";

        int x=0,y,z;
        //code

        x=y=z=10;

        int sum = x+y+z;
        System.out.println("Сумма равна " + sum); //30

        String s1 = "1";

        System.out.println(s1 + (1 + 3));

        int a = 10;

       // System.out.println(a%3);


        System.out.println("-----------------");









        /**
         * logic
         * >
         * <
         * >=
         * <=
         * ==
         *
         * Объединение условий
         * || - или
         * &&  - И
         * ! - НЕ
         *
         */

        /**
         * if (boolean) { // action} else {//another action}
         * if (boolean) { // action} else if (boolean) {//another action} ... else
         */

        int x1 = 20;
        int x2 = 30;
        int c = -x1 + x2/5;
        System.out.println("x1 + x2/5 = " + c);
        boolean isPositive = c>0;
        boolean isNegative = !isPositive;
        System.out.println(isPositive);

        if (isPositive) {
            System.out.println("число положительно");
        }


            int status = 200;
        //Если тут получили положительный ответ, то обработать
        if (status == 200) {
            System.out.println("Ok response ");
        } else if (x1 > 10) {
            System.out.println("x1 not too small");
        } else {
            //some logic
        }
        //

        String s = "live";
        s += 4;


    }


    /**
     * Naming
     * class - с большой
     * методы, переменные - camelCase (callToBank) (phoneNum)
     * константы - верхний регистр  (NUMBER_PI)
     */

    /**
     * Methods - (access modifier (public)) (type) (name) (params) { body}
     */

    /**
     * Переменные (variables)
     * 2 типа переменных
     * 1) Примитивные типы
     * boolean - true/false
     *      численные типы
     *          - Целые
     *              - byte 2^8 (-128 - 127)
     *              - short 2^16 (-2^15 - 2^15-1)
     *              - char
     *              - int 2^32 //default
     *              - long 2^64
     *          - Сплавающей точкой
     *              - float (32 -bit)
     *              - double (64-bit) //default
     * 2) ссылочные типы (Object, String)
     *
     *
     * Как объявлять
     *
     *(тип) (имя) = значение;
     */
}

//FirstApp.class
//bytecode
//desc

//methods
//main
//...