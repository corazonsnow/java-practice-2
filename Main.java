import java.util.ArrayList;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println("1 - добавить элемент");
        System.out.println("2 - удалить элемент");

        int choise = in.nextInt();

        int number2 = 0;
        if (choise == 1) {
            System.out.println("Введите число: ");
            int number = in.nextInt();
            list.add(number);
        } else if (choise == 2) {
            System.out.println("Введите инедкс числа которое хотите удалить: ");
            number2 = in.nextInt();
            list.remove(number2);
            System.out.println(list);
        }
        if (number2 < 0) {
            System.out.println("индекс не может быть меньше 0 ");
        } else if (number2 < 4) {
            list.remove(number2);
            System.out.println(list);
        } else {
            System.out.println("введите верно");
        }


    }
    }

