package loops.practice;

public class AsciiFigure {

    private static final int num = 7;

    public static void main(String[] args) {
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= (num * 4) - 4 * i; j++) {
                System.out.print("/");
            }

            for (int j = 1; j <= 8 * i - 8; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (num * 4) - 4 * i; j++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }
}




