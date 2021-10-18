import java.util.Scanner;

public class Javabasic2 {

    public static void main(String[] args) {

        int nilai;

        Scanner scan = new Scanner(System.in);
        nilai = scan.nextInt();

        System.out.println("Nilai anda:");
        if (nilai >= 80) {
            System.out.println("A");
        } else if (nilai >= 61) {
            System.out.println("B");
        } else if (nilai >= 41) {
            System.out.println("C");
        } else if (nilai >= 21) {
            System.out.println("D");
        } else if (nilai >= 0) {
            System.out.println("E");
        }

    }

}
