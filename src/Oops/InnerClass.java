package Oops;

public class InnerClass {

    void clap(){
        System.out.println("Clap");
    }

    class Toys{ // it's a non-static class

        void jump(){
            System.out.println("jump");
        }
    }

    public static void main(String[] args) {

        // creating object of non-static class;
//        Toys toy = new Toys();  // inside static method you cannot call or create non-static class or method;

        // If you want to create an object then you must have to create an object of their parent class then you can do that;;
        InnerClass inner = new InnerClass();
        Toys toy = inner.new Toys();
        toy.jump();

    }
}
