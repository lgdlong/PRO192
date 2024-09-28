// Lớp Animal (lớp cha)
class Animal {
    // Phương thức của lớp cha
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

// Lớp Dog (lớp con kế thừa từ lớp Animal)
class Dog extends Animal {
    // Ghi đè phương thức makeSound trong lớp Dog
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

// Lớp Cat (lớp con kế thừa từ lớp Animal)
class Cat extends Animal {
    // Ghi đè phương thức makeSound trong lớp Cat
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}

// Lớp Main để chạy chương trình
public class Program {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        if (myDog instanceof Cat) {
            System.out.println("YES");
        }
        Animal myCat = new Cat();
    }
}
