public class Main {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.print(a+"\n"+b);
    }
}