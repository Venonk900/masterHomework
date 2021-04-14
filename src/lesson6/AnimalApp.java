package lesson6;

public class AnimalApp {

    public static void main(String[] args) {
       // Animal animal = new Animal("Кто-то");
        Cat cat = new Cat("Vaska", "Brown");
        Dog dog = new Dog("Mushtar", "Simple dog");

        /*System.out.println("Animal name = " + animal.getName());
        System.out.println("Cat name = " + cat.getName());
        System.out.println("Dog name = " + dog.getName());*/


     /*   animal.voice();
        cat.voice();
        dog.voice();*/


        SiamCat siamCat = new SiamCat("Sc", "grey", 50);


        //

        Animal someAnimal = new Cat("Boris", "red");
        Animal someAnimal2 = new SiamCat("Siam", "red", 42);
        Animal someAnimal3 = new Dog("Bobik", "usual");

        Cat cattt = (Cat)someAnimal;

        cattt.voice("asdad");
        //someAnimal.voice("dasda");

        //1
        SiamCat cat1 = new SiamCat("Siam", "red", 42);
        //2
        Cat cat2 = new SiamCat("Siam", "red", 42);
        //3
        Animal cat3 = new SiamCat("Siam", "red", 42);
        //4
        Object cat4 = new SiamCat("Siam", "red", 42);


        ((SiamCat)cat4).voice();

        Animal[] animals = new Animal[]{someAnimal, someAnimal2, someAnimal3};
        for (Animal a : animals) {
            if (a instanceof Dog) {
                System.out.println("Это собака породы " + ((Dog)a).getBreed());
            }
            System.out.println(a.getName());
            a.voice();
        }

    }
}
