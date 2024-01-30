public class PrintFibonacci {
    public static void Fiboacci(int a, int b, int n) {
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        Fiboacci(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        Fiboacci(a, b, n-2);

    }
}
