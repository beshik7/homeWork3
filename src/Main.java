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
        System.out.println(" Задача 1 ");
        byte phone = 70;
        short screen = 555;
        int battery = 300000;
        long dcIn = 50000000;
        float keyCap = 3.55F;
        double chargeBrick = 5.9843;
        System.out.println(" значение переменной phone с типом byte равно " + phone);
        System.out.println(" значение переменной screen с типом short равно " + screen);
        System.out.println(" значение переменной battery с типом int равно " + battery);
        System.out.println(" значение переменной dcIn с типом long равно " + dcIn);
        System.out.println(" значение переменной keyCap с типом float равно " + keyCap);
        System.out.println(" значение переменной chargeBrick с типом double равно " + chargeBrick);    }
    public static void task2() {
        System.out.println(" Задача 2 ");
        float keyCap = 27.12F;
        long dcIn = 98767896554L;
        double chargeBrick = 2.786;
        short screen = 569;
        short screenSecond = -159;
        int batterySecond = 27897;
        byte phone = 67;
        System.out.println(" значение переменной keyCap с типом float равно " + keyCap);
        System.out.println(" значение переменной dcIn с типом double равно " + dcIn);
        System.out.println(" значение переменной chargeBrick с типом double равно " + chargeBrick);
        System.out.println(" значение переменной screen с типом short равно " + screen);
        System.out.println(" значение переменной screenSecond с типом short равно " + screenSecond);
        System.out.println(" значение переменной batterySecond с типом int равно " + batterySecond);
        System.out.println(" значение переменной phone с типом byte равно " + phone);
    }
    public static void task3() {
        System.out.println(" Задача 3 ");
        byte classA = 23;
        short classB = 27;
        short classC = 30;
        int overallStudent = classA + classB + classC;
        System.out.println(" Общее количество учеников " + overallStudent + " человек ");
        short overAllPaper = 480;
        double paperPerPerson = overAllPaper / overallStudent;
        System.out.println("На каждого ученика рассчитано " + paperPerPerson + " листов бумаги");
    }
    public static void task4() {
        System.out.println(" Задача 4 ");
        byte bottlePerMin = 16 / 2;
        System.out.println("Бутылок произвелено " + bottlePerMin + " в 1 минуту");
        int bottlePer20Min = bottlePerMin * 20;
        int bottlePerHour = bottlePerMin * 60;
        long bottlePerDay = bottlePerHour * 24;
        long bottlePer3Day = bottlePerHour * 3;
        long bottlePerMonth = bottlePerDay * 30;
        System.out.println("Бутылок произвелено " + bottlePer20Min + " за 20 минуту");
        System.out.println("Бутылок произвелено " + bottlePer3Day + " за 30 дней");
        System.out.println("Бутылок произвелено " + bottlePerHour + " за 1 час");
        System.out.println("Бутылок произвелено " + bottlePerDay + " за 1 день");
        System.out.println("Бутылок произвелено " + bottlePerMonth + " за 1 час");
    }
    public static void task5() {
        System.out.println(" Задача 5 ");
        int overallPaint = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        int overAllStudent = overallPaint / (whitePerClass + brownPerClass);
        int overAllWhite = overAllStudent * whitePerClass;
        int overAllBrown = overAllStudent * brownPerClass;
        System.out.println("В школе где " + overAllStudent + " классов нужно " + overAllWhite + " банок белой краски и " + overAllBrown + " банок коричневой краски");

    }
    public static void task6() {
        System.out.println(" Задача 6 ");
        short banana = 8 * 5;
        short milk = 105 * 2;
        short iceCream = 100 * 2;
        short eggs = 70 * 4;
        int breakfastWeight = banana + milk + iceCream + eggs;
        System.out.println("Спортазавтрак весит " + breakfastWeight + " граммов");
        float breakfastWeightKg = breakfastWeight / 100;
        System.out.println("Спортзавтрак весит " + breakfastWeightKg + " кг");
    }
    public static void task7() {
        System.out.println(" Задача 7 ");
        int weightToLoose = 7 * 1000;
        short firstDiet = 250;
        int resultsFirstDiet = weightToLoose / firstDiet;
        short secondDiet = 500;
        int resultsSecondDiet = weightToLoose / secondDiet;
        System.out.println("Нужно потерять " + weightToLoose + " граммов");
        System.out.println("Понадобиться " + resultsFirstDiet + " дней чтобы похудеть при первой диете");
        System.out.println("Первая диета предполгает потерю " + firstDiet + " граммов в день");
        System.out.println("Понадобиться " + resultsSecondDiet + " дней чтобы похудеть при первой диете");
        System.out.println("Вторая диета предполгает потерю " + secondDiet + " граммов  в день");
    }
    public static void task8() {
        System.out.println(" Задача 8 ");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int cristinaSalary = 760230;
        double increaseMasha = mashaSalary * 1.10;
        double increaseDenis = denisSalary * 1.10;
        double increaseCristina = cristinaSalary * 1.10;
        System.out.println("изначальная зп Маши состовляет " + mashaSalary + " рублей");
        System.out.println("Зарплата Маши увеличилась и стала " + increaseMasha + " рублей");
        System.out.println("изначальная зп Дениса состовляет " + denisSalary + " рублей");
        System.out.println("Зарплата Дениса увеличилась и стала " + increaseDenis + " рублей");
        System.out.println("изначальная зп Кристины состовляет " + cristinaSalary + " рублей");
        System.out.println("Зарплата Кристины увеличилась и стала " + increaseCristina + " рублей");



    }
    }