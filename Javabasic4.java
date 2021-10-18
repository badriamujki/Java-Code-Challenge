import java.util.Scanner;

public class Javabasic4 {

    public static void main(String[] args) {
        compute();
    }

    static void compute() {
        Scanner scan = new Scanner(System.in);
        int nilai = scan.nextInt();
        System.out.println("Nilai anda:");

        if (nilai >= 80 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai >= 61 && nilai <= 80) {
            System.out.println("B");
        } else if (nilai >= 41 && nilai <= 61) {
            System.out.println("C");
        } else if (nilai >= 21 && nilai <= 41) {
            System.out.println("D");
        } else if (nilai >= 0 && nilai <= 21) {
            System.out.println("E");
        } else if (nilai >= 100) {
            System.out.println("Error");
        }

    }

}
