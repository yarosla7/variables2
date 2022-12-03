import static java.util.Locale.US;

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

        /*Задача 1
    Объявите переменные типа int, byte, short, long, float, double.

    Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.

    Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».

         */

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

        /*Задача 2
    Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.

    Значения:

    27.12
    987 678 965 549
    2,786
    569
    -159
    27897
    67 */

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

        /* Задача 3
    Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.

    У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.

    Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.

    Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».

    Для объявления переменных не используйте тип var. */

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

        /* Задача 4
    Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:

    за 20 минут,
    в сутки,
    за 3 дня,
    за 1 месяц?
    Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.

    Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».

    Для объявления переменных не используйте тип var. */

        System.out.println("\nЗадача_4:");

        byte twoMinPerformance = 16;

        int oneMinPerformance = twoMinPerformance / 2;

        int twentyMinPerformance = oneMinPerformance * 20;

        int day = 1440;

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

        /* Задача 5
    На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?

    Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».

    Для объявления переменных не используйте тип var. */

        System.out.println("\nЗадача_5:");

        int sumJars = 120;

        int whiteDyeNeed = 2;

        int brownDyeNeed = 4;

        int sumClasses = sumJars / (brownDyeNeed + whiteDyeNeed);

        int whiteDyeClass = sumClasses * whiteDyeNeed;

        int brownDyeClass = sumClasses * brownDyeNeed;

        System.out.println("\nВ школе, где " + sumClasses + " классов, нужно " + whiteDyeClass + " банок белой краски и " + brownDyeClass + " банок коричневой краски");

    }

    public static void task6() {

        /*Задача 6
        Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.

        Вот один из рецептов, по которому спортсмен готовит себе завтрак:

        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Cмешать всё в блендере — и готово.

        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.

        Результат в граммах и килограммах напечатайте в консоль.*/

        System.out.println("\nЗадача_6:");

        int oneBanana = 80;

        int allBananas = oneBanana * 5;

        int milk = 2;

        int oneMilkGr = 105;

        int allMilkGr = milk * oneMilkGr;

        int iceCream = 100;

        int allIceCream = iceCream * 2;

        int egg = 70;

        int allEggs = egg * 4;

        int breakfastGr = allBananas + allMilkGr + allIceCream + allEggs;

        double breakfastKg = breakfastGr / 1000D;

        System.out.println("\nЗавтрак весит в граммах " + breakfastGr + " грамм и в килограммах " + breakfastKg + " килограмм.");

    }

    public static void task7() {

        /*Задача 7
        Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.

        Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.

        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.

        Результаты всех подсчетов выведите в консоль.*/

        System.out.println("\nЗадача_7:");

        int needToStayGr = 7000;

        int days250gr = needToStayGr / 250;

        int days500gr = needToStayGr / 500;

        double middleGrs = (250 + 500) / 2D;

        double middleDaysNeedTo = needToStayGr / middleGrs;

        System.out.println("\n" + days250gr + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");

        System.out.println(days500gr + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");

        System.out.printf(US, "И среднее количество для похудения равно %.2f дней.%n", middleDaysNeedTo);
    }

    public static void task8() {

     /* Задача 8
    Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.

    К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:

    Маша получает 67 760 рублей в месяц.
    Денис получает 83 690 рублей в месяц.
    Кристина получает 76 230 рублей в месяц.
    Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.

    Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.

    Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей». */

        System.out.println("\nЗадача_8:");

        int mashaSalaryNow = 67760;

        int denisSalaryNow = 83690;

        int kristinaSalaryNow = 76230;

        int mashaSalaryYearNow = mashaSalaryNow * 12;

        int denisSalaryYearNow = denisSalaryNow * 12;

        int kristinaSalaryYearNow = kristinaSalaryNow * 12;

        int mashaNewSalaryUp = mashaSalaryNow / 10;

        int denisNewSalaryUp = denisSalaryNow / 10;

        int kristinaNewSalaryUp = kristinaSalaryNow / 10;

        int mashaNewSalary = mashaSalaryNow + mashaNewSalaryUp;

        int denisNewSalary = denisSalaryNow + denisNewSalaryUp;

        int kristinaNewSalary = kristinaSalaryNow + kristinaNewSalaryUp;

        int mashaNewYear = mashaNewSalary * 12;

        int denisNewYear = denisNewSalary * 12;

        int kristinaNewYear = kristinaNewSalary * 12;

        int differenceMasha = mashaNewYear - mashaSalaryYearNow;

        int differenceDenis = denisNewYear % denisSalaryYearNow;

        int differenceKristina = kristinaNewYear % kristinaSalaryYearNow;

        System.out.println("\nМаша теперь получает " + mashaNewSalary + " рублей, годовой доход вырос на " + differenceMasha + " рублей.");

        System.out.println("Денис теперь получает " + denisNewSalary + " рублей, годовой доход вырос на " + differenceDenis + " рублей.");

        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей, годовой доход вырос на " + differenceKristina + " рублей.");


    }
}