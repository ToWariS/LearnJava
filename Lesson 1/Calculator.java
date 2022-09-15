public class Calculator {

    public static void main(String args[]) {
        int a = 0;
        int b = 0;
        char sign;
        int result = 0;
        System.out.println("Итоговое задание Калькулятор\n");
        a = 2;
        b = 10;
        sign = '^';
        if(sign == '+'){
            result = a + b;
        } else  if(sign == '-' ){
            result = a - b;
        } else  if(sign == '*' ){
            result = a * b;
        } else  if(sign == '/' ){
            result = a / b;
        } else  if(sign == '^' ){
            result = 1;
            for ( int i = 1 ; i <= b ; i++){
                result *= a;
            }
        } else  if(sign == '%' ){
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);

    }
}