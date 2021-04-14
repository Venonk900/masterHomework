package lesson5;


public class Cat {
    private  String name;
    private  String color;
    private int age;
    private int appetite;

    public Cat(String name, String color, int age) {
        super();
        validateAge(age);
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name, int age) {
        this(name, "Бандитского", age);
    }


    public Cat() {
        this("Степан", "Бандитского", 3);
        System.out.println("Создаем кота, которого видим впервые");
    }

    public void info() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", appetite=" + appetite +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        if (age > 25) {
            throw new IllegalArgumentException("Коты столько не живут");
        }
    }

    public void eat(Plate plate) {
        plate.decreaseCount(this.appetite);
        //plate.setFoodCount(plate.getFoodCount() - this.getAppetite());
    }

}
