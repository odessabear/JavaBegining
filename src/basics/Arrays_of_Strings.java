package basics;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "hello";
        strings[1] = "goodbye";
        strings[2] = "Java";

       for (int i = 0;i<strings.length;i++){
           System.out.println(strings[i]);
       }
        System.out.println();
        for (String string:strings) {
            System.out.println(string);
        }

    }
}
