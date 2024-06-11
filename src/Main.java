public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        int year = 2021;
        isYearLeap(year);

        System.out.println("Task 2");

        int clientOS = 1;
        int clientDeviceYear = 2014;
        getRecommendationOSType(clientOS, clientDeviceYear);

        System.out.println("Task 3");

        int deliveryDistance = 95;
        countDeliveryDays(deliveryDistance);
    }

    public static void isYearLeap(int year) {
        if (year > 1584 && (year % 4) == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void getRecommendationOSType(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void countDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}
