package wackocourse.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        byte b = 10;
        short c = 200;
        int a = b + 60000;
        long myLongValue = 456789L;
        float myFloatValue = 23.56f;
        double myDoubleValue = 56.45d;

        double sum = a + b + c + myLongValue + myDoubleValue + myFloatValue;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("ma Long Value is " + myLongValue);
        System.out.println(sum);
    }
}
