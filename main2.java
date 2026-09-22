import java.util.Random;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        Random ran = new Random();
        Scanner in = new Scanner(System.in);

        int number = ran.nextInt(100);
        int attempts = 0;


        System.out.println("Введите число от 1 до 100");

        while (attempts < 10) {

            int pop = in.nextInt();
            if (pop < 1 || pop > 100) {
                System.out.println("число должно быть в диапозоне от 1 до 100");
            }

            attempts++;

            if (pop < number){
                System.out.println("мое число больше");
            }
            else if(pop > number){
                System.out.println("мое число меньше");
            }
            else {
                System.out.println("УРАААА ВЫ УГАДАЛИ AAAAAAAAA");
                System.out.println("вы угадали за " + attempts + " попыток");
            }
    }
        System.out.println("вы исчперапали все попытки. Загаданное число было: " + number);
}
}
