public class VariablesTheme {
    public static void main (String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");

        byte monitorCount = 2;
        short coresCount = 8;
        int coresMhz = 4200;
        long volumeRAM = 16777216;
        float cudaCount = 1.51f;
        double cudaMhz = 2304;
        char firstCharCard = 'R';
        boolean rtxON = true;

        System.out.println("\nКоличество мониторов подключенное к компьютеру: " + monitorCount + "\n" +
                "Число ядер процессора: " + coresCount +
                "\nЧастота процессора МГц:\t" +  coresMhz + "\n" +
                "Килобайт оперативной памяти: " + volumeRAM + "\nЧастота CUDA ядер видеокарты: "
                + cudaCount + "\n" +
                "Количество CUDA ядер: " + cudaMhz +
                "\nБуква с которой начинается название видеокарты: " + firstCharCard
                + "\nЕсть ли поддержка лучей: " + rtxON );

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int bookPrice = 200;
        int penPrice = 100;
        int percentDiscount = 11;
        int discount = (penPrice + bookPrice) / penPrice * percentDiscount;
        int discountPrice = penPrice + bookPrice - discount;

        System.out.println("\nCумма скидки = " + discount + "\n"  +
                "Общая стоимость товаров со скидкой = " + discountPrice);

        System.out.println("\n3. Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" +
                "J  J  aaaaa  V V  aaaaa\n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных\n");

        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;

        System.out.println("Первоначальное значение:   "   + byteMax + "\t" + shortMax + "\t" + intMax + "\t" + longMax);

        System.out.println("Значение после инкремента: " + ++byteMax + "\t" + ++shortMax
                + "\t" + ++intMax + "\t" + ++longMax);

        System.out.println("Значение после декремента: " + --byteMax + "\t" + --shortMax  + "\t"
                + --intMax + "\t" + --longMax);

        System.out.println("\n5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        int tmp = num1;

        System.out.println("Перестановка значений переменных с помощью третьей переменной\n" +
                "Значения переменных: " + num1 + "\t" + num2);
        
        num1 = num2;
        num2 = tmp;
        System.out.println("Значения переменных: " + num1 + "\t" + num2);

        System.out.println("Перестановка значений переменных с помощью арифметических операций\n" +
                "Значения переменных: " + num1 + "\t" + num2);

        num1 = num1 + num2 - (num2 = num1);

        System.out.println("Значения переменных: " + num1 + "\t" + num2);

        System.out.println("Перестановка значений переменных с помощью побитовой операции ^\n" +
                "Значения переменных: " + num1 + "\t" + num2);

        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;

        System.out.println("Значения переменных: " + num1 + "\t" + num2);

        System.out.println("\n6. Вывод символов и их кодов\n");
        
        char char35 = '#';
        char char38 = '&';
        char char64 = '@';
        char char94 = '^';
        char char95 = '_';

        System.out.println(char35 + "\t" + (int) char35 + "\n" +
                char38 + "\t" + (int) char38 + "\n" +
                char64 + "\t" + (int) char64 + "\n" +
                char94 + "\t" + (int) char94 + "\n" +
                char95 + "\t" + (int) char95 + "\n");

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа\n");

        int num = 123;

        System.out.println("Число сотен = " + num / 100 + "\nЧисло десятков = " + num / 10 % 10 +
                "\nЧисло единиц = " + num % 10);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка\n\n");

        char slash = '/';
        char backslash = '\\';
        char bracket = '(';
        char closBracket = ')';
        char space = ' ';
        char underscore = '_';

        System.out.printf("%c%c%c%c%c%c" , space ,space ,space ,space , slash, backslash);
        System.out.printf("\n%c%c%c%c%c%c%c" ,space, space,space, slash, space , space ,backslash);
        System.out.printf("\n%c%c%c%c%c%c%c%c" , space ,space ,slash, underscore ,bracket , space , closBracket
                ,backslash);
        System.out.printf("\n%c%c%c%c%c%c%c%c%c" , space , slash , space , space , space ,
                space , space , space , backslash);
        System.out.printf("\n%c%c%c%c%c%c%c%c%c%c" , slash,underscore,underscore,underscore,underscore,
                slash,backslash,underscore,underscore,backslash);

        System.out.println("\n9. Произведение и сумма цифр числа\n");

        int number = 345;
        int multNumbers = (number / 100) * (number / 10 % 10) * (number % 10);
        int sumNumbers = (number / 100) + (number / 10 % 10) + (number % 10);

        System.out.println("Сумма цифр числа N = " + sumNumbers);

        System.out.println("Произведение цифр числа N = " + multNumbers);

        System.out.println("\n10. Преобразование секунд\n");
        int secondCount = 86399;
        int hour = secondCount / 3600;
        int min = secondCount % 3600 / 60;
        int seconds = secondCount  % 60;

        System.out.println(hour + ":" + min + ":" + seconds);

    }
}