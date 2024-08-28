public class Main {
    public static void main(String[] args) {

        // Задача 1

        int arrMonth[] = new int[]{100_000, 50_000, 30_000, 55_000, 10_000};
        int total = 0;
        for (int i = 0; i < arrMonth.length; i++) {
            final int k = arrMonth[i];
            total +=k;
        }
        System.out.println("Сумма трат за месяц составила: "+total+" рублей.");

        // Задача 2

        int arrWeek[] = new int[]{5_000, 1_000, 20_000, 11_000, 4_000};
        int maxWaste = 0;

        for (int item : arrWeek) {
            if (item > maxWaste) {
                maxWaste = item;
            }
        }
        int minWaste = maxWaste;
        for (int value : arrWeek) {
            if (value < minWaste) {
                minWaste = value;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+minWaste+" рублей. Максимальная сумма трат за неделю составила "+maxWaste+" рублей.");

        // Задача 3

        int[] arr3 = {20_000, 30_000, 100_000, 34_000, 123_001};
        int totalArr3 = 0;
        for (int j : arr3) {
            totalArr3 += j;
        }
        double middleTotal = (double) totalArr3/arr3.length;
        System.out.println("Средняя сумма трат за месяц составила "+middleTotal+" рублей.");

        // Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            final char k = reverseFullName[i];
            System.out.print(k);
        }
    }
}