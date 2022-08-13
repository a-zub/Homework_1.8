// Homework 1.8
// Aleksandr Zubanov
// 2022/08/12


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        calculateLeapYear(1917); // Task 1

        int typeOS = 0; // Task 2
        int yearOfIssue = 2002;
        System.out.println(printCurrentOS(typeOS, yearOfIssue));

        int deliveryDistance = 200; // Task 3
        System.out.println("Потребуется дней: " + calculateDeliveryDays(deliveryDistance));
    }

// Task 1


    public static void calculateLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println((int) year + " год является високосным.");
        } else {
            System.out.println((int) year + " год не является високосным.");
        }
    }
// Task 2


    public static String printCurrentOS(int typeOS, int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        String titleOS;
        String OsVersion;
        String inputError = "Вы ввели не верные данные.";
        if (typeOS < 0 || typeOS > 1 || yearOfIssue < 0) {
            return inputError;
        }
        if (typeOS == 1) {
            titleOS = "Андроид";
        } else {
            titleOS = "iOS";
        }
        if(yearOfIssue < currentYear){
            OsVersion = "облегченную версию";
        } else {
            OsVersion = "стандартную";
        }
         return "Установите " + OsVersion + " версию приложения для " + titleOS + " по ссылке.";
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




