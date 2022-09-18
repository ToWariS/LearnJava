public class IfElseStatementTheme {
    public static void main (String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");

        int age = 18;
        float growth = 1.76f;
        boolean male = true;
        char firstLetterName;

        if(age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше или равен 20");
        }

        if(!male) {
            System.out.println("Мужчина");
        } else {
            System.out.println("Женщина");
        }

        if(growth < 1.80) {
            System.out.println("Рост меньше 180см");
        } else {
            System.out.println("Рост больше или равен 180см");
        }


        firstLetterName = "Имя".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Имя начинается с буквы М");
        } else if(firstLetterName == 'I') {
            System.out.println("Имя начинается с буквы I");
        } else {
            System.out.println("Имя начинается с другой буквы");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 30;
        int num2 = 20;
        if(num1 > num2){
            System.out.println("Число max " + num1 + " число min " + num2) ;
        } else if (num1 < num2) {
            System.out.println("Число max " + num2 + " число min " + num1 ) ;
        } else {
            System.out.println("Числа " + num1 + " и " + num2 + "равны" ) ;
        }

        System.out.println("\n3. Работа с числом\n");

        int num = 21;

        if(num != 0){
            System.out.println("Число " + num);
            if(num % 2 == 0){
                System.out.println("Число четное");
            } else {
                System.out.println("Число не четное");
            }
            if(num > 0){
                System.out.println("Число положительноe");
            } else {
                System.out.println("Число отрицательное");
            }
        } else {
            System.out.println("Число является нулем");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        num1 = 332;
        num2 = 352;

        System.out.println("Числа в которых происходит поиск одинаковых цифр: " + num1 + "\t" + num2);
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        boolean digitB1 = false;
        boolean digitB2 = false;
        boolean digitB3 = false;
        if(num1 % 10 == num2 % 10) {
            digit1 = num1 % 10;
            digitB1 = true;
        }
        if(num1 / 10 % 10 == num2 / 10 % 10) {
            digit2 = num1 / 10 % 10;
            digitB2 = true;
        }
        if(num1 / 100 == num2 / 100) {
            digit3 = num1 / 100;
            digitB3 = true;
        }

        if(digitB1 && digitB2 && digitB3) {
            System.out.println("Одинаковые числа: " + digit1 + " " + digit2 + " " + digit3);
            System.out.println("Одинаковые разряды: 1 2 3");
        } else if(digitB1 && digitB2) {
            System.out.println("Одинаковые числа: " + digit1 + " " + digit2);
            System.out.println("Одинаковые разряды: 1 2");
        } else if(digitB2 && digitB3) {
            System.out.println("Одинаковые числа: " + digit2 + " " + digit3);
            System.out.println("Одинаковые разряды: 2 3");
        } else if(digitB1 && digitB3) {
            System.out.println("Одинаковые числа: " + digit1 + " " + digit3);
            System.out.println("Одинаковые разряды: 1 3");
        } else if(digitB1) {
            System.out.println("Одинаковые числа: " + digit1);
            System.out.println("Одинаковые разряды: 1");
        } else if(digitB2) {
            System.out.println("Одинаковые числа: " + digit2);
            System.out.println("Одинаковые разряды: 2");
        } else if(digitB3) {
            System.out.println("Одинаковые числа: " + digit3);
            System.out.println("Одинаковые разряды: 3");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");
        char symbol = '\u0057';
        System.out.println(symbol);

        if(((int) symbol >= 0 && (int) symbol <= 47 ) || ((int) symbol >= 58 && (int) symbol <= 64)
                || ((int) symbol >= 91 && (int) symbol <= 96) || ((int) symbol >= 123 && (int) symbol <= 127) ) {
            System.out.println("Символ " + symbol + " не буква и не число");
        } else if((int) symbol >= 48 && (int) symbol <= 57)  {
            System.out.println("Символ " + symbol + " число");
        } else if((int)symbol >= 65 && (int) symbol <= 90 ) {
            System.out.println("Символ " + symbol + " большая буква");
        } else if((int)symbol == 97 && (int) symbol <= 122 ) {
            System.out.println("Символ " + symbol + " маленькая буква");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
        int depSum = 300000;
        int endSum;
        int depPercent;
        if(depSum < 100000){
            depPercent = depSum / 100 * 5;
            endSum = depSum + depPercent ;
            System.out.println("Сумма вклада " + depSum + " начисленный процент " + depPercent +
                    " итоговая сумма " + endSum );
        } else if(depSum > 100000 && age < 300000) {
            depPercent = depSum / 100 * 7;
            endSum = depSum + depPercent ;
            System.out.println("Сумма вклада " + depSum + " начисленный процент " + depPercent +
                    " итоговая сумма " + endSum );
        } else {
            depPercent = depSum / 100 * 10;
            endSum = depSum + depPercent ;
            System.out.println("Сумма вклада " + depSum + " начисленный процент " + depPercent +
                    " итоговая сумма " + endSum );
        }

        System.out.println("\n7. Определение оценки по предметам %\n");
        int histPercent = 59;
        int progPercent = 91;
        int histGrade = 0;
        int progGrade = 0;
        int gpa;
        int avgPercent;
        if(histPercent > 91){
            System.out.println("5\tИстория");
            histGrade = 5;
        } else if(histPercent > 73){
            System.out.println("4\tИстория");
            histGrade = 4;
        } else if(histPercent > 60) {
            System.out.println("3\tИстория");
            histGrade = 3;
        } else if(histPercent <= 60){
            System.out.println("2\tИстория");
            histGrade = 2;
        }
        if(progPercent > 91){
            System.out.println("5\tПрограммирование");
            progGrade = 5;
        } else if(progPercent > 73){
            System.out.println("4\tПрограммирование");
            progGrade = 4;
        } else if(progPercent > 60) {
            System.out.println("3\tПрограммирование");
            progGrade = 3;
        } else if(progPercent > 60){
            System.out.println("2\tПрограммирование");
            progGrade = 2;
        }

        gpa = (progGrade + histGrade) / 2;
        System.out.println("Средний бал оценок по предметам: " + gpa);
        avgPercent = (histPercent + progPercent) / 2;
        System.out.println("Средний процент по предметам: " + avgPercent);

        System.out.println("\n8. Расчет прибыли\n");
        int rent = 5000;
        int sell = 13000;
        int costPrice = 9000;
        int profit = sell * 12 - (rent * 12 + costPrice * 12);
        if(profit > 0){
            System.out.println("Прибыль за год: "+ "+" + profit);
        } else if( profit < 0){
            System.out.println("Прибыль за год: " + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }

        System.out.println("\n9. Подсчет количества банкнот\n");
        System.out.println("Доступные номиналы банкнот: " +
                "\n1 USD\n" + "10 USD (доступно 5 штук)\n" + "100 USD");
        int takeSum = 567;
        int hundCount = takeSum / 100;
        int tenCount;
        int oneCount;
        takeSum = takeSum - hundCount * 100;
        tenCount = takeSum / 10 % 10;
        oneCount = takeSum % 10;

        if(digit2 > 5){
            takeSum = (tenCount - 5) * 10;
            tenCount = 5;
            oneCount += takeSum;
        }
        System.out.println("Необходимо банкнот: \n" + "100USD"+ "\t" + "10USD" + "\t" + "1USD" + "\t" + "\n" +
                hundCount + "\t" + tenCount + "\t" + oneCount);

        takeSum = hundCount * 100 + tenCount * 10 + oneCount;
        System.out.println("Исходная сумма = " + takeSum);

    }
}