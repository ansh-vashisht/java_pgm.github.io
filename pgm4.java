package lab1;
import java.util.*;

public class pgm4 {
    static double av(int a[], int i) {
        int sum = 0;
        for (int i1 = 0; i1 < i; i1++)
            sum += a[i1];
        return (double) sum / i;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[] = new int[20];
        int i = 0;
        for (; i < 20; i++) {
            System.out.println("Enter the number: ");
            int o = obj.nextInt();
            if (o == -1)
                break;
            a[i] = o;
        }
        double average = av(a, i);
        System.out.printf("Average is %.2f%n", average);
    }
}
