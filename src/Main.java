public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
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
        } else if (age7_18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age19_24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (ageMoreThan24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работе");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageKid = 16;
        boolean ageLessThan5 = ageKid < 5;
        boolean age5_14 = ageKid >= 5 && ageKid < 14;
        boolean ageMoreThan14 = ageKid >= 14;
        if (ageLessThan5) {
            System.out.println("Если возраст ребенка равен " + ageKid +
                    ", то ему нельзя кататься на аттракционе");
        } else if (age5_14) {
            System.out.println("Если возраст ребенка равен " + ageKid +
                    ", то ему можно кататься на аттракционе в сопровождении");
        } else if (ageMoreThan14) {
            System.out.println("Если возраст ребенка равен " + ageKid +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int capacity = 102;
        int seat = 60;
        int standingPlace = capacity - seat;
        int countOfPassengers = 80;
        if (countOfPassengers > capacity) {
            System.out.println("В вагоне больше нет мест");
        } else if (countOfPassengers > standingPlace && countOfPassengers <= capacity) {
            System.out.println("В вагоне остались только стоячие места");
        } else if (countOfPassengers <= standingPlace) {
            System.out.println("В вагоне еще есть сидячие места");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 999;
        int two = 800;
        int three = 100;
        if (one > two) {
            if (one > three) {
                System.out.println("Максимально число " + one);
            } else if (three > one) {
                System.out.println("Максимальное число " + three);
            }
        } else if (two > three) {
            System.out.println("Максимальное число " + two);
        } else
            System.out.println("Максимальное число " + three);
    }
}