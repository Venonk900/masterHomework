package lesson5;

public class MyApp {


    public static void main(String[] args) {
        User user = new User(1, "Vasya", "Dvornik", 33);
        User user2 = new User(1, "Vasya", "Dvornik", 8);

        //1
        System.out.println(user.isOlderThan18());
        System.out.println(user2.isOlderThan18());

        //2
        System.out.println(UserUtil.isUserOlderThan18(user));
        System.out.println(UserUtil.isUserOlderThan18(user2));

        //3
        Vakhter vakhter = new Vakhter("Kolyan");
        vakhter.checkUser(user);
        vakhter.checkUser(user2);

        System.out.println(1 == resolve(1, 1));
        System.out.println(2 == resolve(5, 10));



        //Покорми кота

        Cat cat = new Cat();
        cat.setAppetite(30);
        Plate plate = new Plate(150);



        plate.setFoodCount(plate.getFoodCount() - cat.getAppetite());
        cat.info();
        plate.info();

        cat.eat(plate);

        cat.info();
        plate.info();


    }

    //ax = b;
    public static double resolve(int a, int b) {
        return 0;
    }

}

