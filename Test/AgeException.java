public class AgeException {
    public static void CheckAge(int age) throws InvalidAge {
        if (age < 0) {
            throw new InvalidAge("Age must > 0");
        }
    }

    public static void main(String[] args) {
        try {
            CheckAge(1.5);
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
