public class circleinfo {

    void showCircleInfo() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
        System.out.println("Circumference: " + (2 * Math.PI * radius));

        scanner.close();
    }

    public static void main(String[] args) {
        new circleinfo().showCircleInfo();
    }
}
