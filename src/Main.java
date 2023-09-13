public class Main {
    public static void main(String[] args) {

        int speedOfLight = 299792458;
        byte time = 12;
        short daysOfTheYear = 365;
        long distanceToNeptune = 340000000000000L;
        float gradePointAverage = 3.8f;
        double salary = 20.3;
        System.out.println("Значение переменной " +  speedOfLight + " с типом int равно 299792458.");
        System.out.println("Значение переменной " +  time + " с типом byte равно 12.");
        System.out.println("Значение переменной " +  daysOfTheYear + "с типом double равно 365.");
        System.out.println("Значение переменной " +  distanceToNeptune + " с типом long равно 340000000000000L.");
        System.out.println("Значение переменной " +  gradePointAverage + "с типом float равно 3.8f.");
        System.out.println("Значение переменной " +  salary + "с типом double равно 20.3.");

        speedOfLight = 27897;
        speedOfLight = 569;
        time = 67;
        daysOfTheYear = -159;
        distanceToNeptune = 987678965549L;
        gradePointAverage = 2.786f;
        salary = 27.12;

        byte LyudmilyPavlovny = 23;
        byte AnnySergeevny = 27;
        byte EkaterinyAndreevny = 30;
        int sheetsOfPaper = 480;
        double result  = (double) sheetsOfPaper / (LyudmilyPavlovny + AnnySergeevny + EkaterinyAndreevny);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги.");

        byte bottles = 16;
        byte estimatedTime = 2;
        byte minutesHour = 60;
        int twentyMinutes = 20 / estimatedTime * bottles;
        float perDay = (float) (24 * minutesHour) / estimatedTime * bottles;
        double threeDays = (double) (72 * minutesHour) / (estimatedTime * bottles);
        double oneMounts = (double) (720 * minutesHour) / estimatedTime * bottles;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок.");
        System.out.println("За сутки минут машина произвела " + perDay + " штук бутылок.");
        System.out.println("За 3 дня минут машина произвела " + threeDays + " штук бутылок.");
        System.out.println("За 1 месяц минут машина произвела " + oneMounts + " штук бутылок.");

        byte totalPaint = 120;
        byte whitePain = 2;
        byte grayPain = 4;
        int oneClass = whitePain + grayPain;
        int totalClasses = totalPaint / oneClass;
        int totalWhitePain = totalClasses * whitePain;
        int totalGrayPain = totalClasses * grayPain;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePain + " банок белой краски и " + totalGrayPain + " банок коричневой краски");

        int banana = 5 * 1 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int egg = 4 * 1 * 70;
        int gram = banana + milk + iceCream + egg;
        double kilograms = (double) (banana + milk + iceCream + egg) / 1000;
        System.out.println("В граммах: " + gram);
        System.out.println("В килограммах: " + kilograms);

        int excessWeight = 7;
        int excessWeightKg = excessWeight * 1000;
        int hunger = excessWeightKg / 250;
        int diet = excessWeightKg / 500;
        double averageResult = (hunger + diet) / 2;
        System.out.println("Eсли спортсмен будет терять каждый день " +
                "по 250 грамм, то он похудеет за " + hunger + "дней, " +
                "если спортсмен будет терять каждый день по 500 грамм," +
                " то он похудеет за " + diet + " дней, в среднем ему" +
                " потребуется " + averageResult + " дней");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        byte monthsOfTheYear = 12;
        int mashaYear = monthsOfTheYear * masha;
        int denisYear = monthsOfTheYear * denis;
        int kristinaYear = monthsOfTheYear + kristina;

        double mashaIncrease = masha * 1.1;
        float denisIncrease = (float) (denis * 1.1);
        double kristinaIncrease = kristina * 1.1;

        double mashaYearIncrease = monthsOfTheYear * mashaIncrease;
        double denisYearIncrease = monthsOfTheYear * denisIncrease;
        double kristinaYearIncrease = monthsOfTheYear + kristinaIncrease;

        System.out.println("Маша теперь получает " + mashaIncrease + " рублей. " +
                "Годовой доход вырос на " + mashaYearIncrease + " рублей.");
        System.out.println("Денис теперь получает " + denisIncrease + " рублей. " +
                "Годовой доход вырос на " + denisYearIncrease + " рублей.");
        System.out.println("Маша теперь получает " + kristinaIncrease + " рублей. " +
                "Годовой доход вырос на " + kristinaYearIncrease + " рублей.");



















    }
}
