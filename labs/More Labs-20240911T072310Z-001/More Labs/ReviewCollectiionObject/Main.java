
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneList phoneList = new PhoneList();
        Phone phone;
        int id, warranty;
        String name;

        phoneList.addPhone(new Phone(1, "IPhone 15", 4));
        phoneList.addPhone(new Phone(2, "Samsung 24", 2));
        phoneList.addPhone(new Phone(3, "Sony Z", 5));
        phoneList.addPhone(new Phone(4, "Oppo", 3));
        phoneList.addPhone(new Phone(5, "Xiaomi", 1));

        while (true) {
            System.out.println("*************************");
            System.out.println("1. Print phone list");
            System.out.println("2. Add new phone");
            System.out.println("3. Find phone by id");
            System.out.println("4. Get phone biggest warranty");
            System.out.println("5. Find phone by name");
            System.out.println("6. Exit");
            System.out.print("Please enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Phone list:");
                    phoneList.printPhoneList();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter id: ");
                    id = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    System.out.print("Enter warranty:");
                    warranty = Integer.parseInt(sc.nextLine());
                    phone = new Phone(id, name, warranty);
                    if (phoneList.addPhone(phone) == true)
                    {
                        System.out.println("Phone already exists.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Id: ");
                    id = Integer.parseInt(sc.nextLine());
                    phone = phoneList.findPhoneById(id);
                    if (phone != null) {
                        System.out.println(phone);
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 4:
                    System.out.println(phoneList.getPhoneBiggestWarranty());
                    break;
                case 5:
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    List<Phone> phones = phoneList.findPhoneByName(name);
                    if (phones==null) {
                        System.out.println("Not found.");
                    } else {
                        for (Phone p : phones) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
