package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j >= Math.min(i, height - 1 - i) && j <= Math.max(i, height - 1 - i)) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int length = 3;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j >= Math.min(i, length - 1 - i) && j <= Math.max(i, length - 1 - i)) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
