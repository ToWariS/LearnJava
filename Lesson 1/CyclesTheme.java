public class CyclesTheme {

    public static void main (String args[]) {
        int i = -10;
        int j = 0;
        int sumEven = 0;
        int sumUneven = 0;
        int [] nums = { 10 , 5 , -1};
        int num = 0;
        int maxValue = 0;
        int minValue = 0;
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

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

        maxValue = 1234;
        sumEven = 0;
        while(maxValue>0) {
           sumUneven = maxValue % 10;
           System.out.print(sumUneven);
           sumEven += sumUneven;
           maxValue /= 10;
        }
        System.out.println("\n" + sumEven);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        sumEven = 0;
        for( i = 1; i<24; i+=2){
            System.out.printf(" %d",i);
            sumEven++;
            if(sumEven == 5){
                System.out.println();
                sumEven = 0;
            }
        }
        while(sumEven < 5){
            System.out.printf(" %d",0);
            sumEven++;
        }

        System.out.println("\n\n5. Проверка количества единиц на четность\n");
        minValue = maxValue = 3141591;
        sumEven = 0;
        while(maxValue>0) {
            sumUneven = maxValue % 10;
            if(sumUneven == 1){
                sumEven += sumUneven;
            }

            maxValue /= 10;
        }

        if(sumEven % 2 == 0){
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
        minValue = num;
        maxValue = 0;
        while( num != 0){
            i = num % 10;
            maxValue = maxValue * 10 + i;
            num = num / 10;
        }
        if(minValue == maxValue){
            System.out.printf("Число %d является палиндромом\n", minValue);
        } else {
            System.out.printf("Число %d не является палиндромом\n", minValue);
        }

        System.out.println("\n\n9. Определение, является ли число счастливым\n");

        maxValue = 505523;
        minValue = maxValue / 1000;
        sumEven = maxValue % 1000;
        int sum1 = 0;
        int sum2 = 0;
        for ( ; minValue != 0; minValue /= 10 ){
            sum1 += minValue % 10;
        }

        System.out.printf("Сумма цифр %d = %d\n" , maxValue / 1000 ,sum1);
        for ( ; sumEven != 0; sumEven /= 10 ){
            sum2 += sumEven % 10;
        }

        System.out.printf("Сумма цифр %d = %d\n" , maxValue % 1000 ,sum2);
        if(sum1 == sum2){
            System.out.println("Число " + maxValue + " счастливое!" );
        } else {
            System.out.println("Число " + maxValue + " не счастливое!" );
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
