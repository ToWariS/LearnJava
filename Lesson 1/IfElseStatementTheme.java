public class IfElseStatementTheme {
    public static void main (String args[]) {
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
        if((int)symbol == 0) {
            System.out.println("Символ NULL не буква и не число");
        } else if((int)symbol == 1) {
            System.out.println("Символ " + '\u0001' + " не буква и не число");
        } else if((int)symbol == 2) {
            System.out.println("Символ " + '\u0002' + " не буква и не число");
        } else if((int)symbol == 3) {
            System.out.println("Символ " + '\u0003' + " не буква и не число");
        } else if((int)symbol == 4) {
            System.out.println("Символ " + '\u0004' + " не буква и не число");
        } else if((int)symbol == 5) {
            System.out.println("Символ " + '\u0005' + " не буква и не число");
        } else if((int)symbol == 6) {
            System.out.println("Символ " + '\u0006' + " не буква и не число");
        } else if((int)symbol == 7) {
            System.out.println("Символ " + '\u0007' + " не буква и не число");
        } else if((int)symbol == 8) {
            System.out.println("Символ " + '\u0008' + " не буква и не число");
        } else if((int)symbol == 9) {
            System.out.println("Символ " + '\u0009' + " не буква и не число");
        } else if((int)symbol == 11) {
            System.out.println("Символ " + '\u000B' + " не буква и не число");
        } else if((int)symbol == 12) {
            System.out.println("Символ " + '\u000C' + " не буква и не число");
        } else if((int)symbol == 14) {
            System.out.println("Символ " + '\u000E' + " не буква и не число");
        } else if((int)symbol == 15) {
            System.out.println("Символ " + '\u000F' + " не буква и не число");
        } else if((int)symbol == 16) {
            System.out.println("Символ " + '\u0010' + " не буква и не число");
        } else if((int)symbol == 17) {
            System.out.println("Символ " + '\u0011' + " не буква и не число");
        } else if((int)symbol == 18) {
            System.out.println("Символ " + '\u0012' + " не буква и не число");
        } else if((int)symbol == 19) {
            System.out.println("Символ " + '\u0013' + " не буква и не число");
        } else if((int)symbol == 20) {
            System.out.println("Символ " + '\u0014' + " не буква и не число");
        } else if((int)symbol == 21) {
            System.out.println("Символ " + '\u0015' + " не буква и не число");
        } else if((int)symbol == 22) {
            System.out.println("Символ " + '\u0016' + " не буква и не число");
        } else if((int)symbol == 23) {
            System.out.println("Символ " + '\u0017' + " не буква и не число");
        } else if((int)symbol == 24) {
            System.out.println("Символ " + '\u0018' + " не буква и не число");
        } else if((int)symbol == 25) {
            System.out.println("Символ " + '\u0019' + " не буква и не число");
        } else if((int)symbol == 26) {
            System.out.println("Символ " + '\u001A' + " не буква и не число");
        } else if((int)symbol == 27) {
            System.out.println("Символ " + '\u001B' + " не буква и не число");
        } else if((int)symbol == 28) {
            System.out.println("Символ " + '\u001C' + " не буква и не число");
        } else if((int)symbol == 29) {
            System.out.println("Символ " + '\u001D' + " не буква и не число");
        } else if((int)symbol == 30) {
            System.out.println("Символ " + '\u001E' + " не буква и не число");
        } else if((int)symbol == 31) {
            System.out.println("Символ " + '\u001F' + " не буква и не число");
        } else if((int)symbol == 32) {
            System.out.println("Символ " + '\u0020' + " не буква и не число");
        } else if((int)symbol == 33) {
            System.out.println("Символ " + '\u0021' + " не буква и не число");
        } else if((int)symbol == 34) {
            System.out.println("Символ " + '\u0022' + " не буква и не число");
        } else if((int)symbol == 35) {
            System.out.println("Символ " + '\u0023' + " не буква и не число");
        } else if((int)symbol == 36) {
            System.out.println("Символ " + '\u0024' + " не буква и не число");
        } else if((int)symbol == 37) {
            System.out.println("Символ " + '\u0025' + " не буква и не число");
        } else if((int)symbol == 38) {
            System.out.println("Символ " + '\u0026' + " не буква и не число");
        } else if((int)symbol == 40) {
            System.out.println("Символ " + '\u0028' + " не буква и не число");
        } else if((int)symbol == 41) {
            System.out.println("Символ " + '\u0029' + " не буква и не число");
        } else if((int)symbol == 42) {
            System.out.println("Символ " + '\u002A' + " не буква и не число");
        } else if((int)symbol == 43) {
            System.out.println("Символ " + '\u002B' + " не буква и не число");
        } else if((int)symbol == 44) {
            System.out.println("Символ " + '\u002C' + " не буква и не число");
        } else if((int)symbol == 45) {
            System.out.println("Символ " + '\u002D' + " не буква и не число");
        } else if((int)symbol == 46) {
            System.out.println("Символ " + '\u002E' + " не буква и не число");
        } else if((int)symbol == 47) {
            System.out.println("Символ " + '\u002F' + " не буква и не число");
        } else if((int)symbol == 48) {
            System.out.println("Символ " + '\u0030' + " число");
        } else if((int)symbol == 49) {
            System.out.println("Символ " + '\u0031' + " число");
        } else if((int)symbol == 50) {
            System.out.println("Символ " + '\u0032' + " число");
        } else if((int)symbol == 51) {
            System.out.println("Символ " + '\u0033' + " число");
        } else if((int)symbol == 52) {
            System.out.println("Символ " + '\u0034' + " число");
        } else if((int)symbol == 53) {
            System.out.println("Символ " + '\u0035' + " число");
        } else if((int)symbol == 54) {
            System.out.println("Символ " + '\u0036' + " число");
        } else if((int)symbol == 55) {
            System.out.println("Символ " + '\u0037' + " число");
        } else if((int)symbol == 56) {
            System.out.println("Символ " + '\u0038' + " число");
        } else if((int)symbol == 57) {
            System.out.println("Символ " + '\u0039' + " число");
        } else if((int)symbol == 58) {
            System.out.println("Символ " + '\u003A' + " не буква и не число");
        } else if((int)symbol == 59) {
            System.out.println("Символ " + '\u003B' + " не буква и не число");
        } else if((int)symbol == 60) {
            System.out.println("Символ " + '\u003C' + " не буква и не число");
        } else if((int)symbol == 61) {
            System.out.println("Символ " + '\u003D' + " не буква и не число");
        } else if((int)symbol == 62) {
            System.out.println("Символ " + '\u003E' + " не буква и не число");
        } else if((int)symbol == 63) {
            System.out.println("Символ " + '\u003F' + " не буква и не число");
        } else if((int)symbol == 64) {
            System.out.println("Символ " + '\u0040' + " не буква и не число");
        } else if((int)symbol == 65) {
            System.out.println("Символ " + '\u0041' + " большая буква");
        } else if((int)symbol == 66) {
            System.out.println("Символ " + '\u0042' + " большая буква");
        } else if((int)symbol == 67) {
            System.out.println("Символ " + '\u0043' + " большая буква");
        } else if((int)symbol == 68) {
            System.out.println("Символ " + '\u0044' + " большая буква");
        } else if((int)symbol == 69) {
            System.out.println("Символ " + '\u0045' + " большая буква");
        } else if((int)symbol == 70) {
            System.out.println("Символ " + '\u0046' + " большая буква");
        } else if((int)symbol == 71) {
            System.out.println("Символ " + '\u0047' + " большая буква");
        } else if((int)symbol == 72) {
            System.out.println("Символ " + '\u0048' + " большая буква");
        } else if((int)symbol == 73) {
            System.out.println("Символ " + '\u0049' + " большая буква");
        } else if((int)symbol == 74) {
            System.out.println("Символ " + '\u004A' + " большая буква");
        } else if((int)symbol == 75) {
            System.out.println("Символ " + '\u004B' + " большая буква");
        } else if((int)symbol == 76) {
            System.out.println("Символ " + '\u004C' + " большая буква");
        } else if((int)symbol == 77) {
            System.out.println("Символ " + '\u004D' + " большая буква");
        } else if((int)symbol == 78) {
            System.out.println("Символ " + '\u004E' + " большая буква");
        } else if((int)symbol == 79) {
            System.out.println("Символ " + '\u004F' + " большая буква");
        } else if((int)symbol == 80) {
            System.out.println("Символ " + '\u0050' + " большая буква");
        } else if((int)symbol == 81) {
            System.out.println("Символ " + '\u0051' + " большая буква");
        } else if((int)symbol == 82) {
            System.out.println("Символ " + '\u0052' + " большая буква");
        } else if((int)symbol == 83) {
            System.out.println("Символ " + '\u0053' + " большая буква");
        } else if((int)symbol == 84) {
            System.out.println("Символ " + '\u0054' + " большая буква");
        } else if((int)symbol == 85) {
            System.out.println("Символ " + '\u0055' + " большая буква");
        } else if((int)symbol == 86) {
            System.out.println("Символ " + '\u0056' + " большая буква");
        } else if((int)symbol == 87) {
            System.out.println("Символ " + '\u0057' + " большая буква");
        } else if((int)symbol == 88) {
            System.out.println("Символ " + '\u0058' + " большая буква");
        } else if((int)symbol == 89) {
            System.out.println("Символ " + '\u0059' + " большая буква");
        } else if((int)symbol == 90) {
            System.out.println("Символ " + '\u005A' + " большая буква");
        } else if((int)symbol == 91) {
            System.out.println("Символ " + '\u005B' + " не буква и не число");
        } else if((int)symbol == 93) {
            System.out.println("Символ " + '\u005D' + " не буква и не число");
        } else if((int)symbol == 94) {
            System.out.println("Символ " + '\u005E' + " не буква и не число");
        } else if((int)symbol == 95) {
            System.out.println("Символ " + '\u005F' + " не буква и не число");
        } else if((int)symbol == 96) {
            System.out.println("Символ " + '\u0060' + " не буква и не число");
        } else if((int)symbol == 97) {
            System.out.println("Символ " + '\u0061' + " маленькая буква");
        } else if((int)symbol == 98) {
            System.out.println("Символ " + '\u0062' + " маленькая буква");
        } else if((int)symbol == 99) {
            System.out.println("Символ " + '\u0063' + " маленькая буква");
        } else if((int)symbol == 100) {
            System.out.println("Символ " + '\u0064' + " маленькая буква");
        } else if((int)symbol == 101) {
            System.out.println("Символ " + '\u0065' + " маленькая буква");
        } else if((int)symbol == 102) {
            System.out.println("Символ " + '\u0066' + " маленькая буква");
        } else if((int)symbol == 103) {
            System.out.println("Символ " + '\u0067' + " маленькая буква");
        } else if((int)symbol == 104) {
            System.out.println("Символ " + '\u0068' + " маленькая буква");
        } else if((int)symbol == 105) {
            System.out.println("Символ " + '\u0069' + " маленькая буква");
        } else if((int)symbol == 106) {
            System.out.println("Символ " + '\u006A' + " маленькая буква");
        } else if((int)symbol == 107) {
            System.out.println("Символ " + '\u006B' + " маленькая буква");
        } else if((int)symbol == 108) {
            System.out.println("Символ " + '\u006C' + " маленькая буква");
        } else if((int)symbol == 109) {
            System.out.println("Символ " + '\u006D' + " маленькая буква");
        } else if((int)symbol == 110) {
            System.out.println("Символ " + '\u006E' + " маленькая буква");
        } else if((int)symbol == 111) {
            System.out.println("Символ " + '\u006F' + " маленькая буква");
        } else if((int)symbol == 112) {
            System.out.println("Символ " + '\u0070' + " маленькая буква");
        } else if((int)symbol == 113) {
            System.out.println("Символ " + '\u0071' + " маленькая буква");
        } else if((int)symbol == 114) {
            System.out.println("Символ " + '\u0072' + " маленькая буква");
        } else if((int)symbol == 115) {
            System.out.println("Символ " + '\u0073' + " маленькая буква");
        } else if((int)symbol == 116) {
            System.out.println("Символ " + '\u0074' + " маленькая буква");
        } else if((int)symbol == 117) {
            System.out.println("Символ " + '\u0075' + " маленькая буква");
        } else if((int)symbol == 118) {
            System.out.println("Символ " + '\u0076' + " маленькая буква");
        } else if((int)symbol == 119) {
            System.out.println("Символ " + '\u0077' + " маленькая буква");
        } else if((int)symbol == 120) {
            System.out.println("Символ " + '\u0078' + " маленькая буква");
        } else if((int)symbol == 121) {
            System.out.println("Символ " + '\u0079' + " маленькая буква");
        } else if((int)symbol == 122) {
            System.out.println("Символ " + '\u007A' + " маленькая буква");
        } else if((int)symbol == 123) {
            System.out.println("Символ " + '\u007B' + " не буква и не число");
        } else if((int)symbol == 124) {
            System.out.println("Символ " + '\u007C' + " не буква и не число");
        } else if((int)symbol == 125) {
            System.out.println("Символ " + '\u007D' + " не буква и не число");
        } else if((int)symbol == 126) {
            System.out.println("Символ " + '\u007E' + " не буква и не число");
        } else if((int)symbol == 127) {
            System.out.println("Символ " + '\u007F' + " не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
        int depSum = 300000;
        int endSum;
        int depPercent;
        if(depSum < 100000){
            depPercent = depSum / 100 * 5;
            endSum = depSum + depPercent ;
            System.out.println("Сумма вклада " + depSum + "начисленный процент " + depPercent +
                    "итоговая сумма " + endSum );
        } else if(depSum > 100000 && age < 300000) {
            depPercent = depSum / 100 * 7;
            endSum = depSum + depPercent ;
            System.out.println("Сумма вклада " + depSum + "начисленный процент " + depPercent +
                    "итоговая сумма " + endSum );
        } else {
            depPercent = depSum / 100 * 10;
            endSum = depSum + depPercent ;
            System.out.println("Сумма вклада " + depSum + "начисленный процент " + depPercent +
                    "итоговая сумма " + endSum );
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

        int profit = 13000 * 12 - (5000 * 12 + 9000 * 12);
        if(age > 0){
            System.out.println("Прибыль за год: "+ "+" + profit);
        } else if( age < 0){
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