package lesson5;

public class Vakhter {
    private String name;

    public Vakhter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkUser(User user) {
        System.out.println(user.isOlderThan18());
    }
}
