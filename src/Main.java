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
        int age1 = 14;
        if (age1 >= 18) {
            System.out.println("Возраст больше 18 лет!");
        } else {
            System.out.println("До совершеннолетия нужно немного подождать =)");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int weather = 4;
        if (weather <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку!");
        } else {
            System.out.println("Сегодня тепло, шапку можно не надевать!");
        }
    }


    public static void task3() {
        System.out.println("Задача 3");

        int speed = 42;
        boolean checkSpeed = speed >= 60;

        if (checkSpeed) {
            System.out.println("Если скорость " + speed + "км/ч, то придется заплатить штраф!");
        }

        else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно." );
        }
    }



    public static void task4() {
        System.out.println("Задача 4");

        int age4 = 43;

        boolean sleep = age4 < 2;
        boolean sad = age4 >= 2 && age4 <= 6;
        boolean school = age4 > 6 && age4 <= 18;
        boolean univer = age4 > 18 && age4 <=24;
        boolean work = age4 > 24 && age4 < 60;

        if (sleep) {
            System.out.println("Если вам " + age4 + ", то вам пора спать.");
        }   else
            if (sad) {
            System.out.println("Если вам " + age4 + ", то вам нужно в детский сад.");
        }   else
            if (school) {
            System.out.println("Если вам " + age4 + ", то вам пора идти в школу.");
        }   else
            if (univer) {
                System.out.println("Если вам " + age4 + ", то нужно идти в университет.");
            } else
                if (work) {
                    System.out.println("Если вам " + age4 + ", то придется идти работать.");
                } else {
                    System.out.println("Если вам " + age4 + ", то можно уже отдохнуть!");
                }



    }



    public static void task5() {
        System.out.println("Задача 5");

        int age5 = 10;
        boolean nelzya = age5 < 5;
        boolean vSoprovozhdenii = age5 >= 5 && age5 < 14;

        if (nelzya) {
            System.out.println("Ваш возраст " + age5 + ". Вам нельзя кататься на аттракционах");
        } else
            if (vSoprovozhdenii)
            {
                System.out.println("Ваш возраст " + age5 + ". Вам можно на аттракционы в сопровождении взрослого.");
            } else {
                System.out.println("Ваш возраст " + age5 + ". Вам можно кататься на всех аттракционах!");
            }

    }

    public static void task6() {
        System.out.println("Задача 6");

        int nomer = 102;

        boolean seat = nomer <= 60;
        boolean stay = nomer > 60 && nomer <= 102;

        if (seat) {
            System.out.println("Вам досталось сидячее место в вагоне!");
        } else
            if (stay) {
                System.out.println("Вам придется ехать стоя.");
            } else {
                System.out.println("К сожалению, вам не досталось места в вагоне!");
            }

    }


    public static void task7() {
        System.out.println("Задача 7");

        int one = 20;
        int two = 16;
        int three = 98;

        if (one > two && one > three) {
            System.out.println("Первое число больше всех.");
        } else
            if (two > one && two > three) {
                System.out.println("Второе число больше всех.");
            } else {
                System.out.println("Третье число больше всех.");
            }

    }


}