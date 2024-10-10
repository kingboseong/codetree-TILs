import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(c);
        System.out.printf("%.2f \n%.2f",a,b);
    }
}