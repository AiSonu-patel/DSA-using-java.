import java.util.Scanner;

class ArrayExample {
    void demoArray() {
        try (Scanner sc = new Scanner(System.in)) {
            ;
            // int n = 0;
            int[] arr = new int[3];
            // arr[0]=10;
            // arr[1]=20;
            // arr[2]=30;
            // System.out.println(arr[0]);
            // System.out.println(arr[1]);
            // System.out.println(arr[2]);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();

            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

public class ArraysExamples {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArray();

    }
}