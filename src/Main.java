// Homework 1.8
// Aleksandr Zubanov
// 2022/08/12


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        calculateLeapYear(1917); // Task 1
        printCurrentOS(1, 1977); // Task 2
        int deliveryDistance = 200; // Task 3
        System.out.println("Потребуется дней: " + calculateDeliveryDays(deliveryDistance));
    }

// Task 1


    public static void calculateLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println((int) year + " год является високосным");
        } else {
            System.out.println((int) year + " год не является високосным");
        }
    }
// Task 2


    public static void printCurrentOS(int typeOS, int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        if (typeOS == 0 && yearOfIssue >=  currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (typeOS == 0 && yearOfIssue <  currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (typeOS == 1 && yearOfIssue >=  currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (typeOS == 1 && yearOfIssue <  currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша версия операционной системы не найдена.");
        }
    }
// Task 3

    public static int calculateDeliveryDays(int deliveryDistance) {
       int deliveryDays = 1;
       int interval = 40;
       int startInterval = 20;
        if (deliveryDistance > startInterval) {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        return deliveryDays;
    }
}




