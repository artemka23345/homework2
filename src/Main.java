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

        byte lyudmilyPavlovny = 23;
        byte annySergeevny = 27;
        byte ekaterinyAndreevny = 30;
        int sheetsOfPaper = 480;
        double result  = (double) sheetsOfPaper / (lyudmilyPavlovny + annySergeevny + ekaterinyAndreevny);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги.");

        byte bottlesPer2Minutes  = 16;
        int twentyMinutes = 20;
        int bottlesPerMinutes = bottlesPer2Minutes / 2;
        double bottlesPer20Minutes = twentyMinutes * bottlesPerMinutes;
        int bottlesPerHour = (int) (3 * bottlesPer20Minutes);
        double bottlesPerDay  = 24 * bottlesPerHour;
        double bottlesPer3Days = 3 * bottlesPerDay;
        double bottlesPer30Days = 10 * bottlesPer3Days;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + bottlesPer30Days + " штук бутылок.");


        byte totalPaint = 120;
        byte whitePain = 2;
        byte grayPain = 4;
        int oneClass = whitePain + grayPain;
        int totalClasses = totalPaint / oneClass;
        int totalWhitePain = totalClasses * whitePain;
        int totalGrayPain = totalClasses * grayPain;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePain + " банок белой краски и " + totalGrayPain + " банок коричневой краски");

        int bananaWeight = 80;
        int weight100GramsMilk = 105;
        int iceCreamBriquetteGrams = 100;
        int weightEgg = 70;

        int quantityBanana = 5;
        int quantityGramsMilk = 200;
        int quantityIceCream = 2;
        int quantityEgg = 4;

        int banana = quantityBanana * bananaWeight;
        int milk = quantityGramsMilk / 100 * weight100GramsMilk;
        int iceCream = quantityIceCream * iceCreamBriquetteGrams;
        int egg = quantityEgg * weightEgg;
        int gram = banana + milk + iceCream + egg;
        double kilograms = (double) (banana + milk + iceCream + egg) / 1000;
        System.out.println("В граммах: " + gram);
        System.out.println("В килограммах: " + kilograms);

        int excessWeight = 7;
        int excessWeightGrams = excessWeight * 1000;
        int hunger = excessWeightGrams / 250;
        int diet = excessWeightGrams / 500;
        double averageResult = (hunger + diet) / 2;
        System.out.println("Eсли спортсмен будет терять каждый день " +
                "по 250 грамм, то он похудеет за " + hunger + "дней, " +
                "если спортсмен будет терять каждый день по 500 грамм," +
                " то он похудеет за " + diet + " дней, в среднем ему" +
                " потребуется " + averageResult + " дней");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int monthsOfTheYear = 12;
        double salaryIncrease = 1.1;
        double mashaYear = monthsOfTheYear * masha;
        double denisYear = monthsOfTheYear * denis;
        double kristinaYear = monthsOfTheYear * kristina;

        double mashaIncrease = masha * salaryIncrease;
        float denisIncrease = (float) (denis * salaryIncrease);
        double kristinaIncrease = kristina * salaryIncrease;

        double mashaYearIncrease = monthsOfTheYear * mashaIncrease;
        float denisYearIncrease = monthsOfTheYear * denisIncrease;
        double kristinaYearIncrease = monthsOfTheYear * kristinaIncrease;

        double mashaAnnualDifference = mashaYearIncrease - mashaYear;
        double denisAnnualDifference = denisYearIncrease - denisYear;
        double kristinaAnnualDifference = kristinaYearIncrease - kristinaYear;

        System.out.println("Маша теперь получает " + mashaIncrease + " рублей. " +
                "Годовой доход вырос на " + mashaAnnualDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisIncrease + " рублей. " +
                "Годовой доход вырос на " + denisAnnualDifference + " рублей.");
        System.out.println("Маша теперь получает " + kristinaIncrease + " рублей. " +
                "Годовой доход вырос на " + kristinaAnnualDifference + " рублей.");


    }
}
