import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("010-" + b + "-" + a);
    }
}