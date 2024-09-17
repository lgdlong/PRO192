class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();  // Explicit call to Parent constructor
        System.out.println("Child constructor");
    }
}

public class test {
    public static void main(String[] args) {
        Child child = new Child();  // Will output both constructor calls
    }
}
