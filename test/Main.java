class Human {
    int id;
    String name;

    public void display() {
        System.out.print(id + " " + name);
    }
    public int idUp(int number) {
        return this.id += number;
    }
}

public class Main {
    public static void main(String[] args) {
        Human man = new Human();

        man.id = 10;
        man.name = "Long";

        man.idUp(11);
        man.display();
    }
    
}
