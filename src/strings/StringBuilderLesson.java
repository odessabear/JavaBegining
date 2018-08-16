package strings;
import java.util.*;

public class StringBuilderLesson {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());



        System.out.println(new Date());

//        System.getProperties().list(System.out);
//        System.out.println(System.getProperty("user.name"));
//        System.out.println(System.getProperty("java.library.path"));

        /**
         * <pre>
         *     System.out.println(new Date());
         * </pre>
         */

    }
}
