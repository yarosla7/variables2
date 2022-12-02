public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {

        System.out.println("\nЗадача_1:");

        byte a = 4;

        short b = 128;

        int c = 33768;

        long d = 6L;

        float e = 4.42132132132132132211F;

        double f = 321.3;

        System.out.println("\nЗначение переменной с типом byte равно " + a);

        System.out.println("Значение переменной с типом short равно " + b);

        System.out.println("Значение переменной с типом int равно " + c);

        System.out.println("Значение переменной с типом long равно " + d);

        System.out.println("Значение переменной с типом float равно " + e);

        System.out.println("Значение переменной с типом double равно " + f);


    }

    public static void task2() {

        System.out.println("\nЗадача_2:");

        double a = 27.12;

        long b = 987678965549L;

        float c = 2.786F;

        int d = 569;

        short e = -159;

        int f = 27897;

        byte g = 67;

        System.out.println("\nЗначение переменной с типом byte равно " + g);

        System.out.println("Значение переменной с типом short равно " + e);

        System.out.println("Значение переменной с типом int равно " + d + " и " + f);

        System.out.println("Значение переменной с типом long равно " + b);

        System.out.println("Значение переменной с типом float равно " + c);

        System.out.println("Значение переменной с типом double равно " + a);


    }

    public static void task3() {

        System.out.println("\nЗадача_3:");

        byte luClass = 23;

        byte anClass = 27;

        byte ecClass = 30;

        short allPaper = 480;

        int allStudents = luClass + anClass + ecClass;

        int papersForOneStudent = allPaper / allStudents;

        System.out.println("\nНа каждого ученика рассчитано " + papersForOneStudent + " листов бумаги");


    }

    public static void task4() {

        System.out.println("\nЗадача_4:");

        byte twoMinPerformance = 16;

        int oneMinPerformance = twoMinPerformance / 2;

        int twentyMinPerformance = oneMinPerformance * 20;

        int day = 24;

        int dayPerformance = oneMinPerformance * day;

        int threeDays = day * 3;

        int threeDaysPerformance = threeDays * oneMinPerformance;

        int oneMonth = day * 30;

        long oneMonthPerformance = oneMinPerformance * oneMonth;

        System.out.println("\nЗа 20 минут машина произвела " + twentyMinPerformance + " штук бутылок.");

        System.out.println("За сутки машина произвела " + dayPerformance + " штук бутылок.");

        System.out.println("За 3 дня машина произвела " + threeDaysPerformance + " штук бутылок.");

        System.out.println("За один месяц произвела " + oneMonthPerformance + " штук бутылок.");

    }

    public static void task5() {

        System.out.println("\nЗадача_5:");

        int sumJars = 120;

        int whiteDyeNeed = 2;

        int brownDyeNeed = 4;

        int oneClassNeed = whiteDyeNeed + brownDyeNeed;

        int sumClasses = sumJars / oneClassNeed;

        int whiteDyeClass = sumClasses * whiteDyeNeed;

        int brownDyeClass = sumClasses * brownDyeNeed;

        System.out.println("\nВ школе, где " + sumClasses + " классов, нужно " + whiteDyeClass + " банок белой краски и " + brownDyeClass + " банок коричневой краски");

    }

    public static void task6() {

        //Задача 6
        //Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        //
        //Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        //
        //Бананы — 5 штук (1 банан — 80 грамм).
        //Молоко — 200 мл (100 мл = 105 грамм).
        //Мороженое-пломбир — 2 брикета по 100 грамм.
        //Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        //Смешать всё в блендере — и готово.
        //
        //Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        //
        //Результат в граммах и килограммах напечатайте в консоль.

        System.out.println("\nЗадача_6:");

        int oneKg = 1000;

        double ml = 1.05;

        int oneBanana = 80;

        int allBananas = oneBanana * 5;

        int allMilkMl = 200;

        double allMilkGr = allMilkMl * ml;

        int iceCream = 100;

        int allIceCream = iceCream * 2;

        int egg = 70;

        int allEggs = egg * 4;

        double breakfastGr = (int) (allBananas + allMilkGr + allIceCream + allEggs);

        double breakfastKg = breakfastGr / oneKg;

        System.out.println("\nЗавтрак весит в граммах " + breakfastGr + " грамм и в киллограммах " + breakfastKg + " киллограмм.");

    }

    public static void task7() {

        //Задача 7
        //Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //
        //Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
        //
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //
        //Результаты всех подсчетов выведите в консоль.

        System.out.println("\nЗадача_7:");

        int oneKg = 1000;

        int needToStayKg = 7;

        int needToStayGr = needToStayKg * oneKg;

        int days250gr = needToStayGr / 250;

        int days500gr = needToStayGr / 500;

        int middleGrs = (250 + 500) / 2;

        int middleDaysNeedTo = (days250gr + days500gr) / 2;

        System.out.println("\n" + days250gr + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");

        System.out.println(days500gr + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");

        System.out.println(middleDaysNeedTo + " дней уйдет на похудение, если спортсмен будет терять каждый день по среднее количеств грамм (" + middleGrs + " грамм).");

    }

    public static void task8() {


    }
}



