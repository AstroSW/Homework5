public class Main {
    public static void main(String[] args) {

        // Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 3
        int year = 2025;
        double year4 = year % 4;
        double year100 = year % 100;
        double year400 = year % 400;
        if (year >= 1584) {
            if ((year4 == 0 && year100 != 0) || year400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

        // Задача 4
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: "+ day);
        } else if (deliveryDistance <= 60) {
            day = day +1;
            System.out.println("Потребуется дней: "+ day);
        } else if (deliveryDistance <= 100) {
            day = day +2;
            System.out.println("Потребуется дней: "+ day);
        } else {
            System.out.printf("Доставки нет");
        }

        // Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}