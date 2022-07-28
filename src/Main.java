public class Main {
    public static void main(String[] args) {

        // exercise 1

        // integet types
        byte numberTypeByte = 1;
        short numberTypeShort = 12;
        int numberTypeInt = 120;
        long numberTypeLong = 12_345_678L;

        // float types
        float numberTypeFloat = 12.34f;
        double numberTypeDouble = 12.3455678;
        // symbols types
        char encodingNumber = 33;
        // boolean types
        boolean compare = 10 > 5;

        // exercise 2
        System.out.println("");

        System.out.println("задание №2");

        // weights
        float boxingNumberOne = 78.2f;
        float boxingNumberTwo = 82.7f;
        // general wights
        float generalWeight = boxingNumberOne + boxingNumberTwo;
        System.out.println("Общий вес боксеров равен " + generalWeight + " кг!");
        // difference weights
        float differenceWeightBoxing = boxingNumberTwo - boxingNumberOne;
        System.out.println("Разница в весе составляет " + differenceWeightBoxing + " кг!");


        // exercise 3
        System.out.println("");

        System.out.println("задание №3");

        int sumBananas = 5 * 80;
        int sumMilks = 2 * 105;
        int iceCream = 2 * 100;
        int rawEggs = 4 * 70;

        int generalSumBreakfast = sumBananas + sumMilks + iceCream + rawEggs;

        System.out.println("Вес завтрака составляет " + generalSumBreakfast + " граммов!");

        float trnsformGrammToKillogram = (float) generalSumBreakfast / 1000;
        System.out.println("1090 граммов составляет " + trnsformGrammToKillogram + " кг!");

        // exercise 4
        System.out.println("");

        System.out.println("задание №4");


        float daysForWeightless_250 = ((float) 7 / 250 * 1000);
        float daysForWeightless_500 = (float) 7 / 500 * 1000;
        float averageSumDaysForWeightless = (daysForWeightless_250 + daysForWeightless_500) / 2;

        int toIntegerDays_250 =  (int) daysForWeightless_250 * 1;
        int toIntegerDays_500 =  (int) daysForWeightless_500 * 1;
        int toIntegerDaysAverage =  (int) averageSumDaysForWeightless * 1;



        System.out.println("на 7 киллограммов по 250 граммов в день спортсмен похудеет за " + toIntegerDays_250 + " дней");
        System.out.println("на 7 килограммов по 500 граммов в день спортсмен похудеет за " + toIntegerDays_500 + " дней");
        System.out.println("Среднее количество дней для похудения составляет  " + toIntegerDaysAverage + " дней");


        // exercise 5
        System.out.println("");

        System.out.println("задание №5");

        double percent = 0.1;
        int monthSalaryMacha = 67_760;
        int monthSalaryDenis = 83_690;
        int monthSalaryKristina = 76_230;


        double salaryIncreaseMacha = monthSalaryMacha * percent;
        double monthTotalSalaryMachaWithPercent = monthSalaryMacha + salaryIncreaseMacha;
        double yearTotalSalaryMacha = salaryIncreaseMacha * 12;

        double salaryIncreaseDenis = monthSalaryDenis * percent;
        double monthTotalSalaryDenisWithPercent = monthSalaryDenis + salaryIncreaseDenis;
        double yearTotalSalaryDenis = salaryIncreaseDenis * 12;

        double salaryIncreaseKristina = monthSalaryKristina * percent;
        double monthTotalSalaryKristinaWithPercent = monthSalaryKristina + salaryIncreaseKristina;
        double yearTotalSalaryKristina = salaryIncreaseKristina * 12;


        System.out.println("Маша теперь получает " + (int ) monthTotalSalaryMachaWithPercent * 1 +
                " рублей. Годовой доход вырос на " + (int ) yearTotalSalaryMacha * 1 + " рублей");

        System.out.println("Денис теперь получает " + (int ) monthTotalSalaryDenisWithPercent * 1 +
                " рублей. Годовой доход вырос на " + (int ) yearTotalSalaryDenis * 1 + " рублей");

        System.out.println("Кристина теперь получает " + (int ) monthTotalSalaryKristinaWithPercent * 1 +
                " рублей. Годовой доход вырос на " + (int ) yearTotalSalaryKristina * 1 + " рублей");

        System.out.println("");

        System.out.println("The end! Happy day :)");


    }





}