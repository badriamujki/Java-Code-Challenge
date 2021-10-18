public class Javabasic3 {

    public static void main(String[] args) {

        for (int i = 12, j = 0; i > 0 && j < 12; i--, j++) {
            for (int k = 1; k < j; k++) {
                System.out.print("^");
            }
            for (int k = 0; k < j; k++) {
                System.out.print("^");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
