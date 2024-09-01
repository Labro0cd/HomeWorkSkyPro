public class Main {
    public static void main(String[] args) {
        // Задача 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
        // Задача 2
        System.out.println("Данные Ф.И.О сотрудника для заполнения отчета - "+fullName.toUpperCase());
        // Задача 3
        String fullName1 = " Иванов Семён Семёнович";
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName1.replace('ё','е'));
    }
}