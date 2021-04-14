package lesson5;

public class UserUtil {

    private UserUtil() {
        //should not been initialized
    }

    public static boolean isUserOlderThan18(User user) {
        return user.age >=18;
    }
}
