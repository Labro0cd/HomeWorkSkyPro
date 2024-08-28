public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] number1 = new int[]{1, 2, 3};
        double[] number2 = new double[]{1.57, 7.654, 9.986};
        int[] number3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Задача 2
        for (int k : number1) {
            System.out.print(k + ",");
        }
        System.out.println();
        for (double v : number2) {
            System.out.print(v + ",");
        }
        System.out.println();
        for (int j : number3) {
            System.out.print(j + ",");
        }
        System.out.println();

        // Задача 3

        for (int i = number1.length - 1; i >= 0; i--) {
            System.out.print(number1[i] + ",");
        }
        System.out.println();
        for (int i = number2.length - 1; i >= 0; i--) {
            System.out.print(number2[i] + ",");
        }
        System.out.println();
        for (int i = number3.length - 1; i >= 0; i--) {
            System.out.print(number3[i] + ",");
        }
        System.out.println();
        // Задача 4
        for (int i = 0; i < number3.length; i++) {
            if (number3[i] % 2 > 0) {
                number3[i] += 1;
            }
            System.out.print(number3[i] + ",");
        }
    }
}