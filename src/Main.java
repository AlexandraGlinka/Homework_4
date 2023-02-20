public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
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
}