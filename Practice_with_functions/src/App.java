public class App {
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void displayResult(double average) {
        System.out.println("The average is: " + average);
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 2.5;
        double c = 40;
        double res = calculateAverage(a, b, c);
        displayResult(res);
    }
}