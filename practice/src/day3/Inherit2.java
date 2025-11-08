package day3;

public class Inherit2 {
    public static class Parent {
        public Parent() {
            System.out.println("I am parent");
        }
    }

    public static class Child extends Parent {
        public Child() {
            System.out.println("I am child");
        }
    }

    public static void main(String[] args) {
        Child c1 = new Child();
    }
}