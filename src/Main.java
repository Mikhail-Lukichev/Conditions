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

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " года/лет, то он не достиг совершеннолетия.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = -10;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + "км/ч, придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 20;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора в университет");
        } else if (age >= 24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 8;
        System.out.println("Если возраст ребенка равен " + age);
        if (age < 5) {
            System.out.println("он не может кататься");
        } else if (age >= 5 && age < 14) {
            System.out.println("он может кататься со взрослым");
        } else {
            System.out.println("он может кататься самостоятельно");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int paxNumber = 80;
        int seatCapacity = 60;
        int carCapacity = 102;
        if (paxNumber < seatCapacity) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (paxNumber >= seatCapacity && paxNumber < carCapacity) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Мест не осталось");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 23;
        int two = 54;
        int three = 34;
        if (one > two) {
            if (one > three) {
                System.out.println("Variable one is the biggest. Its value is " + one);
            } else {
                System.out.println("Variable three is the biggest. Its value is " + three);
            }
        } else {
            if (two > three) {
                System.out.println("Variable two is the biggest. Its value is " + two);
            } else {
                System.out.println("Variable three is the biggest. Its value is " + three);
            }
        }
    }
}