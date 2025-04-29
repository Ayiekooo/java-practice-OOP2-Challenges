public class Evenodd {
    public static void main(String[] args) {
        // use full package name instead of an import
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        scanner.close();
    }
}
