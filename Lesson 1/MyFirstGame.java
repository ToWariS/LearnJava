public class MyFirstGame {
    public static void main (String[] args) {
        int num;
        int i;
        int trueNum;
        System.out.println("Игра Угадай число \n");
        trueNum = 40;
        num = 20;
        i = 0;
        while (trueNum!=num) {
            i++;
            if (i == 2) {
                num = 60;
            } else if (i == 3) {
                num = 30;
            } else if (i == 4) {
                num = 45;
            } else if (i == 5)
                num = 40;

        if (trueNum > num){
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
        } else  if (trueNum < num){
            System.out.println("Число " + num + " больше того, что загадал компьютер");
        } else {
            System.out.println("Вы победили! число  " + num + " = " + trueNum );
        }
        }
    }
}