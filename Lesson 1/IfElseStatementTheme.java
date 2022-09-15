public class IfElseStatementTheme {

    public static void main (String args[]) {
        int age = 18;
        int num = 31;
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        boolean digitB1 = false;
        boolean digitB2 = false;
        boolean digitB3 = false;
        float growth = 1.76f;
        boolean male = true;
        char firstLetterName;

        System.out.println("1. Перевод псевдокода на язык Java\n");

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

        if(age > num){
            System.out.println("Число max " + age + " число min " + num) ;
        } else if (age < num) {
            System.out.println("Число max " + num + " число min " + age ) ;
        } else {
            System.out.println("Числа " + num + " и " + age + "равны" ) ;
        }

        System.out.println("\n3. Работа с числом\n");

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

        age = 332;
        num = 352;

        System.out.println("Числа в которых происходит поиск одинаковых цифр: " + age + "\t" + num);

        if(age % 10 == num % 10){
            digit1 = age % 10;
            digitB1 = true;
        }
        if(age / 10 % 10 == num / 10 % 10){
            digit2 = age / 10 % 10;
            digitB2 = true;
        }
        if(age / 100 == num / 100){
            digit3 = age / 100;
            digitB3 = true;
        }

        if(digitB1 && digitB2 && digitB3){
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
        firstLetterName = '\u0057';
        System.out.println(firstLetterName);
        if((int)firstLetterName == 0) {
            System.out.println("Символ NULL не буква и не число");
        } else if((int)firstLetterName == 1){
            System.out.println("Символ " + '\u0001' + " не буква и не число");
        } else if((int)firstLetterName == 2) {
            System.out.println("Символ " + '\u0002' + " не буква и не число");
        } else if((int)firstLetterName == 3) {
            System.out.println("Символ " + '\u0003' + " не буква и не число");
        } else if((int)firstLetterName == 4) {
            System.out.println("Символ " + '\u0004' + " не буква и не число");
        } else if((int)firstLetterName == 5) {
            System.out.println("Символ " + '\u0005' + " не буква и не число");
        } else if((int)firstLetterName == 6) {
            System.out.println("Символ " + '\u0006' + " не буква и не число");
        } else if((int)firstLetterName == 7) {
            System.out.println("Символ " + '\u0007' + " не буква и не число");
        } else if((int)firstLetterName == 8) {
            System.out.println("Символ " + '\u0008' + " не буква и не число");
        } else if((int)firstLetterName == 9) {
            System.out.println("Символ " + '\u0009' + " не буква и не число");
        } else if((int)firstLetterName == 11) {
            System.out.println("Символ " + '\u000B' + " не буква и не число");
        } else if((int)firstLetterName == 12) {
            System.out.println("Символ " + '\u000C' + " не буква и не число");
        } else if((int)firstLetterName == 14) {
            System.out.println("Символ " + '\u000E' + " не буква и не число");
        } else if((int)firstLetterName == 15) {
            System.out.println("Символ " + '\u000F' + " не буква и не число");
        } else if((int)firstLetterName == 16) {
            System.out.println("Символ " + '\u0010' + " не буква и не число");
        } else if((int)firstLetterName == 17) {
            System.out.println("Символ " + '\u0011' + " не буква и не число");
        } else if((int)firstLetterName == 18) {
            System.out.println("Символ " + '\u0012' + " не буква и не число");
        } else if((int)firstLetterName == 19) {
            System.out.println("Символ " + '\u0013' + " не буква и не число");
        } else if((int)firstLetterName == 20) {
            System.out.println("Символ " + '\u0014' + " не буква и не число");
        } else if((int)firstLetterName == 21) {
            System.out.println("Символ " + '\u0015' + " не буква и не число");
        } else if((int)firstLetterName == 22) {
            System.out.println("Символ " + '\u0016' + " не буква и не число");
        } else if((int)firstLetterName == 23) {
            System.out.println("Символ " + '\u0017' + " не буква и не число");
        } else if((int)firstLetterName == 24) {
            System.out.println("Символ " + '\u0018' + " не буква и не число");
        } else if((int)firstLetterName == 25) {
            System.out.println("Символ " + '\u0019' + " не буква и не число");
        } else if((int)firstLetterName == 26) {
            System.out.println("Символ " + '\u001A' + " не буква и не число");
        } else if((int)firstLetterName == 27) {
            System.out.println("Символ " + '\u001B' + " не буква и не число");
        } else if((int)firstLetterName == 28) {
            System.out.println("Символ " + '\u001C' + " не буква и не число");
        } else if((int)firstLetterName == 29) {
            System.out.println("Символ " + '\u001D' + " не буква и не число");
        } else if((int)firstLetterName == 30) {
            System.out.println("Символ " + '\u001E' + " не буква и не число");
        } else if((int)firstLetterName == 31) {
            System.out.println("Символ " + '\u001F' + " не буква и не число");
        } else if((int)firstLetterName == 32) {
            System.out.println("Символ " + '\u0020' + " не буква и не число");
        } else if((int)firstLetterName == 33) {
            System.out.println("Символ " + '\u0021' + " не буква и не число");
        } else if((int)firstLetterName == 34) {
            System.out.println("Символ " + '\u0022' + " не буква и не число");
        } else if((int)firstLetterName == 35) {
            System.out.println("Символ " + '\u0023' + " не буква и не число");
        } else if((int)firstLetterName == 36) {
            System.out.println("Символ " + '\u0024' + " не буква и не число");
        } else if((int)firstLetterName == 37) {
            System.out.println("Символ " + '\u0025' + " не буква и не число");
        } else if((int)firstLetterName == 38) {
            System.out.println("Символ " + '\u0026' + " не буква и не число");
        } else if((int)firstLetterName == 40) {
            System.out.println("Символ " + '\u0028' + " не буква и не число");
        } else if((int)firstLetterName == 41) {
            System.out.println("Символ " + '\u0029' + " не буква и не число");
        } else if((int)firstLetterName == 42) {
            System.out.println("Символ " + '\u002A' + " не буква и не число");
        } else if((int)firstLetterName == 43) {
            System.out.println("Символ " + '\u002B' + " не буква и не число");
        } else if((int)firstLetterName == 44) {
            System.out.println("Символ " + '\u002C' + " не буква и не число");
        } else if((int)firstLetterName == 45) {
            System.out.println("Символ " + '\u002D' + " не буква и не число");
        } else if((int)firstLetterName == 46) {
            System.out.println("Символ " + '\u002E' + " не буква и не число");
        } else if((int)firstLetterName == 47) {
            System.out.println("Символ " + '\u002F' + " не буква и не число");
        } else if((int)firstLetterName == 48) {
            System.out.println("Символ " + '\u0030' + " число");
        } else if((int)firstLetterName == 49) {
            System.out.println("Символ " + '\u0031' + " число");
        } else if((int)firstLetterName == 50) {
            System.out.println("Символ " + '\u0032' + " число");
        } else if((int)firstLetterName == 51) {
            System.out.println("Символ " + '\u0033' + " число");
        } else if((int)firstLetterName == 52) {
            System.out.println("Символ " + '\u0034' + " число");
        } else if((int)firstLetterName == 53) {
            System.out.println("Символ " + '\u0035' + " число");
        } else if((int)firstLetterName == 54) {
            System.out.println("Символ " + '\u0036' + " число");
        } else if((int)firstLetterName == 55) {
            System.out.println("Символ " + '\u0037' + " число");
        } else if((int)firstLetterName == 56) {
            System.out.println("Символ " + '\u0038' + " число");
        } else if((int)firstLetterName == 57) {
            System.out.println("Символ " + '\u0039' + " число");
        } else if((int)firstLetterName == 58) {
            System.out.println("Символ " + '\u003A' + " не буква и не число");
        } else if((int)firstLetterName == 59) {
            System.out.println("Символ " + '\u003B' + " не буква и не число");
        } else if((int)firstLetterName == 60) {
            System.out.println("Символ " + '\u003C' + " не буква и не число");
        } else if((int)firstLetterName == 61) {
            System.out.println("Символ " + '\u003D' + " не буква и не число");
        } else if((int)firstLetterName == 62) {
            System.out.println("Символ " + '\u003E' + " не буква и не число");
        } else if((int)firstLetterName == 63) {
            System.out.println("Символ " + '\u003F' + " не буква и не число");
        } else if((int)firstLetterName == 64) {
            System.out.println("Символ " + '\u0040' + " не буква и не число");
        } else if((int)firstLetterName == 65) {
            System.out.println("Символ " + '\u0041' + " большая буква");
        } else if((int)firstLetterName == 66) {
            System.out.println("Символ " + '\u0042' + " большая буква");
        } else if((int)firstLetterName == 67) {
            System.out.println("Символ " + '\u0043' + " большая буква");
        } else if((int)firstLetterName == 68) {
            System.out.println("Символ " + '\u0044' + " большая буква");
        } else if((int)firstLetterName == 69) {
            System.out.println("Символ " + '\u0045' + " большая буква");
        } else if((int)firstLetterName == 70) {
            System.out.println("Символ " + '\u0046' + " большая буква");
        } else if((int)firstLetterName == 71) {
            System.out.println("Символ " + '\u0047' + " большая буква");
        } else if((int)firstLetterName == 72) {
            System.out.println("Символ " + '\u0048' + " большая буква");
        } else if((int)firstLetterName == 73) {
            System.out.println("Символ " + '\u0049' + " большая буква");
        } else if((int)firstLetterName == 74) {
            System.out.println("Символ " + '\u004A' + " большая буква");
        } else if((int)firstLetterName == 75) {
            System.out.println("Символ " + '\u004B' + " большая буква");
        } else if((int)firstLetterName == 76) {
            System.out.println("Символ " + '\u004C' + " большая буква");
        } else if((int)firstLetterName == 77) {
            System.out.println("Символ " + '\u004D' + " большая буква");
        } else if((int)firstLetterName == 78) {
            System.out.println("Символ " + '\u004E' + " большая буква");
        } else if((int)firstLetterName == 79) {
            System.out.println("Символ " + '\u004F' + " большая буква");
        } else if((int)firstLetterName == 80) {
            System.out.println("Символ " + '\u0050' + " большая буква");
        } else if((int)firstLetterName == 81) {
            System.out.println("Символ " + '\u0051' + " большая буква");
        } else if((int)firstLetterName == 82) {
            System.out.println("Символ " + '\u0052' + " большая буква");
        } else if((int)firstLetterName == 83) {
            System.out.println("Символ " + '\u0053' + " большая буква");
        } else if((int)firstLetterName == 84) {
            System.out.println("Символ " + '\u0054' + " большая буква");
        } else if((int)firstLetterName == 85) {
            System.out.println("Символ " + '\u0055' + " большая буква");
        } else if((int)firstLetterName == 86) {
            System.out.println("Символ " + '\u0056' + " большая буква");
        } else if((int)firstLetterName == 87) {
            System.out.println("Символ " + '\u0057' + " большая буква");
        } else if((int)firstLetterName == 88) {
            System.out.println("Символ " + '\u0058' + " большая буква");
        } else if((int)firstLetterName == 89) {
            System.out.println("Символ " + '\u0059' + " большая буква");
        } else if((int)firstLetterName == 90) {
            System.out.println("Символ " + '\u005A' + " большая буква");
        } else if((int)firstLetterName == 91) {
            System.out.println("Символ " + '\u005B' + " не буква и не число");
        } else if((int)firstLetterName == 93) {
            System.out.println("Символ " + '\u005D' + " не буква и не число");
        } else if((int)firstLetterName == 94) {
            System.out.println("Символ " + '\u005E' + " не буква и не число");
        } else if((int)firstLetterName == 95) {
            System.out.println("Символ " + '\u005F' + " не буква и не число");
        } else if((int)firstLetterName == 96) {
            System.out.println("Символ " + '\u0060' + " не буква и не число");
        } else if((int)firstLetterName == 97) {
            System.out.println("Символ " + '\u0061' + " маленькая буква");
        } else if((int)firstLetterName == 98) {
            System.out.println("Символ " + '\u0062' + " маленькая буква");
        } else if((int)firstLetterName == 99) {
            System.out.println("Символ " + '\u0063' + " маленькая буква");
        } else if((int)firstLetterName == 100) {
            System.out.println("Символ " + '\u0064' + " маленькая буква");
        } else if((int)firstLetterName == 101) {
            System.out.println("Символ " + '\u0065' + " маленькая буква");
        } else if((int)firstLetterName == 102) {
            System.out.println("Символ " + '\u0066' + " маленькая буква");
        } else if((int)firstLetterName == 103) {
            System.out.println("Символ " + '\u0067' + " маленькая буква");
        } else if((int)firstLetterName == 104) {
            System.out.println("Символ " + '\u0068' + " маленькая буква");
        } else if((int)firstLetterName == 105) {
            System.out.println("Символ " + '\u0069' + " маленькая буква");
        } else if((int)firstLetterName == 106) {
            System.out.println("Символ " + '\u006A' + " маленькая буква");
        } else if((int)firstLetterName == 107) {
            System.out.println("Символ " + '\u006B' + " маленькая буква");
        } else if((int)firstLetterName == 108) {
            System.out.println("Символ " + '\u006C' + " маленькая буква");
        } else if((int)firstLetterName == 109) {
            System.out.println("Символ " + '\u006D' + " маленькая буква");
        } else if((int)firstLetterName == 110) {
            System.out.println("Символ " + '\u006E' + " маленькая буква");
        } else if((int)firstLetterName == 111) {
            System.out.println("Символ " + '\u006F' + " маленькая буква");
        } else if((int)firstLetterName == 112) {
            System.out.println("Символ " + '\u0070' + " маленькая буква");
        } else if((int)firstLetterName == 113) {
            System.out.println("Символ " + '\u0071' + " маленькая буква");
        } else if((int)firstLetterName == 114) {
            System.out.println("Символ " + '\u0072' + " маленькая буква");
        } else if((int)firstLetterName == 115) {
            System.out.println("Символ " + '\u0073' + " маленькая буква");
        } else if((int)firstLetterName == 116) {
            System.out.println("Символ " + '\u0074' + " маленькая буква");
        } else if((int)firstLetterName == 117) {
            System.out.println("Символ " + '\u0075' + " маленькая буква");
        } else if((int)firstLetterName == 118) {
            System.out.println("Символ " + '\u0076' + " маленькая буква");
        } else if((int)firstLetterName == 119) {
            System.out.println("Символ " + '\u0077' + " маленькая буква");
        } else if((int)firstLetterName == 120) {
            System.out.println("Символ " + '\u0078' + " маленькая буква");
        } else if((int)firstLetterName == 121) {
            System.out.println("Символ " + '\u0079' + " маленькая буква");
        } else if((int)firstLetterName == 122) {
            System.out.println("Символ " + '\u007A' + " маленькая буква");
        } else if((int)firstLetterName == 123) {
            System.out.println("Символ " + '\u007B' + " не буква и не число");
        } else if((int)firstLetterName == 124) {
            System.out.println("Символ " + '\u007C' + " не буква и не число");
        } else if((int)firstLetterName == 125) {
            System.out.println("Символ " + '\u007D' + " не буква и не число");
        } else if((int)firstLetterName == 126) {
            System.out.println("Символ " + '\u007E' + " не буква и не число");
        } else if((int)firstLetterName == 127) {
            System.out.println("Символ " + '\u007F' + " не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
        age = 300000;
        if(age < 100000){
            num = age + age / 100 * 5;
            System.out.println("Сумма вклада " + age + "начисленный процент " + age / 100 * 5 +
                               "итоговая сумма " + num );
        } else if(age > 100000 && age < 300000) {
            num = age + age / 100 * 7;
            System.out.println("Сумма вклада " + age + "начисленный процент " + age / 100 * 7 +
                    "итоговая сумма " + num );
        } else {
            num = age + age / 100 * 10;
            System.out.println("Сумма вклада " + age + " начисленный процент " + age / 100 * 10 +
                    " итоговая сумма " + num );
        }

        System.out.println("\n7. Определение оценки по предметам %\n");
        age = 59;
        num = 91;

        if(age > 91){
            System.out.println("5\tИстория");
            digit1 = 5;
        } else if(age > 73){
            System.out.println("4\tИстория");
            digit1 = 4;
        } else if(age > 60) {
            System.out.println("3\tИстория");
            digit1 = 3;
        } else if(age <= 60){
            System.out.println("2\tИстория");
            digit1 = 2;
        }
        if(num > 91){
            System.out.println("5\tПрограммирование");
            digit2 = 5;
        } else if(num > 73){
            System.out.println("4\tПрограммирование");
            digit2 = 4;
        } else if(num > 60) {
            System.out.println("3\tПрограммирование");
            digit2 = 3;
        } else if(num > 60){
            System.out.println("2\tПрограммирование");
            digit2 = 2;
        }

        digit1 = (digit1 + digit2) / 2;
        System.out.println("Средний бал оценок по предметам: " + digit1);
        age = (age + num) / 2;
        System.out.println("Средний процент по предметам: " + age);

        System.out.println("\n8. Расчет прибыли\n");

        age = 13000 * 12 - (5000 * 12 + 9000 * 12);
        if(age > 0){
            System.out.println("Прибыль за год: "+ "+" + age);
        } else if( age < 0){
            System.out.println("Прибыль за год: " + age);
        } else {
            System.out.println("Прибыль за год: " + age);
        }

        System.out.println("\n8. Подсчет количества банкнот\n");
        System.out.println("Доступные номиналы банкнот: " +
                           "\n1 USD\n" + "10 USD (доступно 5 штук)\n" + "100 USD");
        num = 567;
        digit1 = num / 100;
        num = num - digit1 * 100;
        digit2 = num / 10 % 10;
        digit3 = num % 10;

        if(digit2 > 5){
          num = (digit2 - 5) * 10;
          digit2 = 5;
          digit3 += num;
        }
        System.out.println("Необходимо банкнот: \n" + "100USD"+ "\t" + "10USD" + "\t" + "1USD" + "\t" + "\n" +
                                                       digit1 + "\t" + digit2 + "\t" + digit3);

        num = digit1 * 100 + digit2 * 10 + digit3;
        System.out.println("Исходная сумма = " + num);


    }
    }