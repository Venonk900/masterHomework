package lesson6;

public class Cat extends Animal {

    //name
    protected String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void voice(){
        //super.voice();
        System.out.println("кот мявкает");
    }

    public  void voice(String mood) {
        System.out.println("meow with mood " + mood);
    }
}
