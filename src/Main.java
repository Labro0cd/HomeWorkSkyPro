public class Main {
    public static void main(String[] args) {
        // Задача 1, 2
        int clientOS = 1;
        int clientDeviceYear = 2015;
        boolean checkIOS = clientOS == 0;
        if(checkIOS){
            if(clientDeviceYear>=2015) {
                System.out.println("Установите версию для IOS по ссылке.");
            }else {
                System.out.println("Установите облгеченную версию приложения для IOS по ссылке.");
            }
        }else if (clientDeviceYear>=2015){
            System.out.println("Установите версию для Android по ссылке.");
        }else {
            System.out.println("Установите обглеченную версию приложения для Android по ссылке.");
        }
        // Задача 3

        int year = 1604;

        boolean checkYear = year>1584&&year%4==0||year%400==0;
        if (checkYear){
            System.out.println(year+" год является високосным.");
        }else {
            System.out.println(year+" год не является високосным.");
        }
        // Задача 4

        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance<=20){
            System.out.println("Потребуется дней: 1");
        }else if (deliveryDistance<=60){
            System.out.println("Потребуется дней: 2");
        }else if (deliveryDistance<=100){
            System.out.println("Потребуется дней: 3");
        }else {
            System.out.println("Доставки нет");
        }
        // Задача 5

        int monthNumber =1;
        switch (monthNumber){
            case 1,2,12:
                System.out.println("Зима.");
                break;
            case 3,4,5:
                System.out.println("Весна.");
                break;
            case 6,7,8:
                System.out.println("Лето.");
                break;
            case 9,10,11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Неправильный номер месяца.");
        }
    }
}