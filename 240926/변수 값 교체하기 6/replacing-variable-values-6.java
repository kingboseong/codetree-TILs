public class Main {
    public static void main(String[] args) {
        int a = 2, b = 5;
        int temp = a;
        // temp = a;
        a = b;
        b = temp;
        System.out.print(a+"\n"+b);
    }
}