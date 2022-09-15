
public class VariablesTheme {

    public static void main (String args[]){
        byte    onebyte = 2;
        short   oneshort = 8;
        int     oneint = 4200;
        long    onelong = 16777216;
        float   onefloat = 1.51f;
        double  onedouble = 2304;
        char    onechar = 'R';
        boolean onetrue = true;
        int     discount;
        int     price;
        char    char35 = '#';
        char    char38 = '&';
        char    char64 = '@';
        char    char94 = '^';
        char    char95 = '_';

        System.out.println("1. Создание переменных и вывод их значений на консоль");

        System.out.println("\nКоличество мониторов подключенное к компьютеру: " + onebyte + "\n" +
                "Число ядер процессора: " + oneshort + "\nЧастота процессора МГц:\t" +  oneint + "\n" +
                "Килобайт оперативной памяти: " + onelong + "\nЧастота CUDA ядер видеокарты: " + onefloat + "\n" +
                "Количество CUDA ядер: " + onedouble + "\nБуква с которой начинается название видеокарты: " + onechar
                + "\nЕсть ли поддержка лучей: " + onetrue );


        System.out.println("\n2. Расчет стоимости товара со скидкой");

        discount = (100 + 200) / 100 * 11;
        price = 100 + 200 - discount;
        System.out.println("\nCумма скидки = " + discount + "\n"  + "Общая стоимость товаров со скидкой = " + price);

        System.out.println("\n3. Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a                                                  \n" +
                "   J   a a  v   v  a a                                                 \n" +
                "J  J  aaaaa  V V  aaaaa                                                \n" +
                " JJ  a     a  V  a     a");


    System.out.println("\n4. Отображение min и max значений числовых типов данных\n");
    onebyte = Byte.MAX_VALUE;
    oneshort = Short.MAX_VALUE;
    oneint = Integer.MAX_VALUE;
    onelong = Long.MAX_VALUE;

    System.out.println("Первоначальное значение:   "   + onebyte + "\t" + oneshort + "\t" + oneint + "\t" + onelong);

    System.out.println("Значение после инкремента: " + ++onebyte + "\t" + ++oneshort
                                                     + "\t" + ++oneint + "\t" + ++onelong);

    System.out.println("Значение после декремента: " + --onebyte + "\t" + --oneshort  + "\t"
                                                     + --oneint + "\t" + --onelong);

    System.out.println("\n5. Отображение min и max значений числовых типов данных\n");

    discount = 2;
    price = 5;
        System.out.println("Перестановка значений переменных с помощью третьей переменной\n" +
                           "Значения перменных: " + discount + "\t" + price);

        oneint = discount;
        discount = price;
        price = oneint;
        System.out.println("Значения перменных: " + discount + "\t" + price);

        discount = 2;
        price = 5;

        System.out.println("Перестановка значений переменных с помощью арифметических операций\n" +
                           "Значения перменных: " + discount + "\t" + price);

        discount = discount + price - (price = discount);

        System.out.println("Значения перменных: " + discount + "\t" + price);

        discount = 2;
        price = 5;

        System.out.println("Перестановка значений переменных с помощью побитовой операции ^\n" +
                           "Значения перменных: " + discount + "\t" + price);

        discount = discount ^ price;
        price = price ^ discount;
        discount = discount ^price;

        System.out.println("Значения перменных: " + discount + "\t" + price);

        System.out.println("\n6. Вывод символов и их кодов\n");

        System.out.println(char35 + "\t" + (int)char35 + "\n" + char38 + "\t" + (int)char38 + "\n" +
                           char64 + "\t" + (int)char64 + "\n" + char94 + "\t" + (int)char94 + "\n" +
                           char95 + "\t" + (int)char95 + "\n");

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа\n");

        oneint = 123;

        System.out.println("Число сотен = " + oneint / 100 + "\nЧисло десятков = " + oneint / 10 % 10 +
                           "\nЧисло единиц = " + oneint % 10);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка\n\n");

        onechar = '/';
        char35 = '\\';
        char38 = '(';
        char64 = ')';
        char94 = ' ';
        char95 = '_';



        System.out.printf("%c%c%c%c%c%c" , char94 ,char94 ,char94 ,char94 , onechar, char35);
        System.out.printf("\n%c%c%c%c%c%c%c" ,char94, char94,char94, onechar, char94 , char94 ,char35);
        System.out.printf("\n%c%c%c%c%c%c%c%c" , char94 ,char94 ,onechar, char95 ,char38 , char94 , char64 ,char35);
        System.out.printf("\n%c%c%c%c%c%c%c%c%c" , char94 , onechar , char94 , char94 , char94 ,
                                                    char94 , char94 , char94 , char35);
        System.out.printf("\n%c%c%c%c%c%c%c%c%c%c" , onechar,char95,char95,char95,char95,
                                                     onechar,char35,char95,char95,char35);

        System.out.println("\n9. Произведение и сумма цифр числа\n");

        oneint = 345;
        discount = (oneint / 100) + (oneint / 10 % 10) + (oneint % 10);
        System.out.println("Сумма цифр числа N = " + discount);

        price = (oneint / 100) * (oneint / 10 % 10) * (oneint % 10);
        System.out.println("Сумма цифр числа N = " + price);

        System.out.println("\n10. Преобразование секунд\n");

        oneint = 86399;
        discount = oneint / 3600;
        price = (oneint - discount * 3600) / 60;
        oneint = oneint  - discount * 3600 - price * 60;

        System.out.println(discount + ":" + price + ":" + oneint);

    }
}