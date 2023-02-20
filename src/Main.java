public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        //задача 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int weather = 5;
        if (weather < 5) {
            System.out.println("На улице " + weather + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + weather + " градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 7;
        boolean age2_6 = age >= 6 && age < 7;
        boolean age7_18 = age >= 7 && age < 19;
        boolean age19_24 = age >= 19 && age < 25;
        boolean ageMoreThan24 = age >= 25;
        if (age2_6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age7_18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age19_24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (ageMoreThan24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работе");
        }
    }
}