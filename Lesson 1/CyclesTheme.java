public class CyclesTheme {
    public static void main (String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int sumEven = 0;
        int sumUneven = 0;
        int i = -10;
        int j = 0;
            do {
                if(i % 2 == 0){
                   sumEven += i;
                } else {
                   sumUneven += i;
                }
                ++i;
            } while( i <= 21 );
        System.out.printf("В промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d\n" , sumEven, sumUneven);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int nums[] = { 10 , 5 , -1};
        int maxValue = 0;
        int minValue = 0;
        for(i = 0 ; i < nums.length ; i++){
            if( nums[i] > maxValue){
                 maxValue = nums[i];
            } else if(nums[i] < minValue){
                 minValue = nums[i];
            }
         }

        System.out.println("Интервал значений между " + minValue + " " + maxValue);
        for (i = maxValue - 1 ; i > minValue ; i--){
             System.out.print(i + " ");
         }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");
        int revNum = 0;
        int numc = 0;
        int num = 1234;
        while(num>0) {
            numc = num % 10;
           System.out.print(numc);
            revNum += numc;
           num /= 10;
        }
        System.out.println("\n" + revNum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int numCount = 0;
        for( i = 1; i<24; i+=2){
            System.out.printf(" %d",i);
            numCount++;
            if(numCount == 5){
                System.out.println();
                numCount = 0;
            }
        }
        while(numCount < 5){
            System.out.printf(" %d",0);
            numCount++;
        }

        System.out.println("\n\n5. Проверка количества единиц на четность\n");

        int num1 = 3141591;
        int oneCount1 = 0;
        int oneCount2 = 0;
        while(num1>0) {
            oneCount2 = num1 % 10;
            if(oneCount2 == 1){
                num1 += oneCount2;
            }

            num1 /= 10;
        }

        if(num1 % 2 == 0){
            System.out.printf("Число %d содержит %d четное количество единиц" , minValue , sumEven );
        } else {
            System.out.printf("Число %d содержит %d нечетное количество единиц" , minValue , sumEven );
        }

        System.out.println("\n\n6. Отображение фигур в консоли\n");

        for (i = 0; i < 5; i++){
            for (j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        i = 5;
        
        while(i > 0) {
            j = 0;
            while(j < i) {
                System.out.print("#");
                j++;
            }

            System.out.println();
            i--;
        }

        System.out.println();
        
        i = 1;

        do {
            j = 0;
            do {
                System.out.print("$");
                j++;
            } while(j < i) ;
            System.out.println();
            i++;
        } while(i < 3);

        i = 3;
        
        do {
            j = 0;
            do {
                System.out.print("$");
                j++;
            } while(j < i) ;
            System.out.println();
            i--;
        } while(i > 0);

        System.out.println("\n\n7. Отображение ASCII-символов\n");
        char printChar = 0;
        for(i = 0 ; i <= 122 ; i++){
            if(i <= 47 && i % 2 != 0) {
                printChar = (char)i;
                System.out.printf("%c %d\n" , printChar, i);
            } else if(i >= 97 && i <= 122 && i % 2 == 0){
                printChar = (char)i;
                System.out.printf("%c %d\n" , printChar, i);
            }
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом\n");

        num = 1234321;
        int sumFirst = num;
        int sumSecond = 0;
        while( num != 0){
            i = num % 10;
            sumSecond = sumSecond * 10 + i;
            num = num / 10;
        }
        if(sumFirst == sumSecond){
            System.out.printf("Число %d является палиндромом\n", sumFirst);
        } else {
            System.out.printf("Число %d не является палиндромом\n", sumFirst);
        }

        System.out.println("\n\n9. Определение, является ли число счастливым\n");

        num = 505523;
        sumFirst = num / 1000;
        sumSecond = num % 1000;
        int sum1 = 0;
        int sum2 = 0;
        for ( ; sumFirst != 0; sumFirst /= 10 ){
            sum1 += sumFirst % 10;
        }

        System.out.printf("Сумма цифр %d = %d\n" , num / 1000 ,sum1);
        for ( ; sumSecond != 0; sumSecond /= 10 ){
            sum2 += sumSecond % 10;
        }

        System.out.printf("Сумма цифр %d = %d\n" , num % 1000 ,sum2);
        if(sum1 == sum2){
            System.out.println("Число " + num + " счастливое!" );
        } else {
            System.out.println("Число " + num + " не счастливое!" );
        }

        System.out.println("\n\n10. Вывод таблицы умножения Пифагора\n");
        System.out.print(" |");
        for (i = 2 ; i <= 9 ; i++){
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.print(" -");
        for (i = 2 ; i <= 9 ; i++){
            System.out.print(" -");
        }
        System.out.println();
        for (i = 2 ; i <= 9 ; i++){
            System.out.print(i + "|");
            for (j = 2 ; j <= 9 ; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
    }
