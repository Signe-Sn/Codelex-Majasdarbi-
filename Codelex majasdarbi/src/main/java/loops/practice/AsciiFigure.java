package loops.practice;

public class AsciiFigure {

    private static final int NUM = 7;
    private static final int SLASHES = 4;
    private static final int STARS = 8;

    public static void main(String[] args) {
        for (int i = 1; i <= NUM; i++) {

            for (int j = 1; j <= (NUM * SLASHES) - SLASHES * i; j++) {
                System.out.print("/");
            }

            for (int j = 1; j <= STARS * i - STARS; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (NUM * SLASHES) - SLASHES * i; j++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }
}




