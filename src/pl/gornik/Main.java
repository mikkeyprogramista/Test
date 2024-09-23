package pl.gornik;

public class Main {

    public static double getCircumference(double r) {
        double pi = 3.14;

        return 2 * r * pi;
    }
    public static void main(String[] args) {
        System.out.println(getCircumference(21.0));
        System.out.println("Hello");
    }
}
