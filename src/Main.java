public class Main {
    public static void main(String[] args) {

        // Задача 1
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + salary;
            System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей.");
        }

        //Задача 2
        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(j + " ");
        }
        System.out.println();
        for (; j > 0; j--) {
            System.out.print(j + " ");
        }

        // Задача 3
        int totalHuman = 12_000_000;
        int birthRateIn1000Human = 17;
        int mortalityRateIn1000Human = 8;
        for (int k = 0; k <= 10; k++) {
            totalHuman = totalHuman + ((totalHuman / 1000) * birthRateIn1000Human) - ((totalHuman / 1000) * mortalityRateIn1000Human);
            System.out.println("Год " + k + ", численость населения составляет " + totalHuman);
        }

        // Задача 4,5
        int salary2 = 12_000;
        int totalScore = 0;
        int month = 0;
        while (totalScore < 12_000_000) {
            totalScore = totalScore + salary2;
            month++;
            totalScore = totalScore + (totalScore * 7) / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + totalScore);
            }
        }

        // Задача 6
        int totalCash = 0;
        int month1 = 0;
        int sixMonth = 0;

        while (sixMonth < 18) {
            month1++;
            totalCash = totalCash + salary;
            totalCash = totalCash + (totalCash * 7) / 100;
            if (month1 % 6 == 0) {
                sixMonth++;
                System.out.println("Месяц " + month1 + ", сумма накоплений " + totalCash);
            }
        }

        // Задача 7

        int friday = 5;
        int today = 0;
        while (today < friday) {
            today++;
        }
        System.out.println("Сегодня пятница, " + today + "-е. Необходимо подготовить отчетъ.");
        while (today <= 31) {
            today = today + 7;
            if (today > 31) {
                break;
            }
            System.out.println("Сегодня пятница, " + today + "-е. Необходимо подготовить отчетъ.");
        }

        // Задача 8

        int todayYear = 2024;
        int cometIn100Year = todayYear + 100;
        int cometIn200Year = todayYear - 200;
        int l = 0;

        while (l <= cometIn100Year) {
            l++;
            if (l % 79 == 0&&cometIn200Year < l && l < cometIn100Year) {
                    System.out.println(l);
            }
        }
    }
}