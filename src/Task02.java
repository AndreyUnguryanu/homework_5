import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание№2");
        System.out.println("Введите положительное число: ");
        Scanner sc = new Scanner(System.in);
        int inPut = sc.nextInt();
        boolean b = true;
        for (int p = 0; p <= inPut; p++) {
            for (int i = 2; i < p; i++) {
                if (p % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(p);
            else b = true;
        }
    }
}
