package innerClasses;

public class Electrocar {
    private int id;

    //inner not static class
    private class Motor{
        public void startMotor(){
            System.out.println("Motor is starting...");
        }
    }

    //inner static class
    public static class Battery{
        private void charge(){
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someClass = new SomeClass();
        test(someClass);

        System.out.println("Electrocar " + id + " is starting..");
    }

    private void test(Object object){

    }
}
