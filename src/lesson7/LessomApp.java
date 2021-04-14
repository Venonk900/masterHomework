package lesson7;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;

public class LessomApp {
    public static void main(String[] args) {

        String s1 = "String";
        String s2 = new String("newString");
        String s3 = new String(new char[]{'A', 'B', 'C'});
        String s4 = new String(s3);
        String s5 = s3;
        String s6 = new String(new byte[]{65, 66, 67});
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s4);
        System.out.println(s6);


        s1 = s1.concat(s2);

        s1 = s1 + s2 + 4 + new String("abc") + 5 + 5 + (10+10);
        System.out.println(s1);

        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.toUpperCase());
        System.out.println(s1);

        s1.concat(s2);

        System.out.println(s3 == s6);
        System.out.println(s3.equals(s6));

        s1.equalsIgnoreCase(s2);

        System.out.println(s1.compareTo(s2));

        String[] sArr = new String[]{s1,s2,s3,s4,s5,s6};
        Arrays.sort(sArr);
        System.out.println(Arrays.toString(sArr));
        Arrays.sort(sArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -(o1.length() - o2.length());
            }
        });

        System.out.println(Arrays.toString(sArr));

        s1 = String.valueOf(1);

        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        System.out.println(stringBuilder);
        stringBuilder.append("append").append(" ").append(1);
        System.out.println(stringBuilder);


        stringBuilder.setLength(18);

        System.out.println("'" + stringBuilder+"'");


        System.out.println(0.05 * 1_000_000_000);
    }
}
