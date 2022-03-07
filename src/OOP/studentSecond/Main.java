package OOP.studentSecond;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose, num, izmenenie; int chet = 1;
        float count, znachenie;
        String name;

        System.out.print("Введите Гос номер автомобиля: ");
        name = sc.next();
        ExSecondAuto Auto = new ExSecondAuto(name);
        do {
            System.out.println();
            System.out.println("------------МЕНЮ------------");
            System.out.println("1 - Добавить расход топлива;");
            System.out.println("2 - Изменить расход топлива;");
            System.out.println("3 - Вывести Гос номер;");
            System.out.println("4 - Суммарное количество потраченного топлива;");
            System.out.println("5 - Общая информация;");
            System.out.println("6 - Выход.");
            System.out.println();
            choose = sc.nextInt();

            resume:
            switch (choose) {
                case 1 -> {
                    System.out.println();
                    System.out.println("Введите расход топлива для " + chet + " дня");
                    count = sc.nextFloat();
                    Auto.addRachod(count);
                    System.out.println();
                    chet++;
                }

                case 2 -> {
                    System.out.println();
                    System.out.println("Введите день, который хотите поменять от 1 до 7: ");
                    izmenenie = sc.nextInt();
                    System.out.println("Введите новое значение: ");
                    znachenie = sc.nextFloat();
                    Auto.setRachod(znachenie, izmenenie);
                    System.out.println();
                }

                case 3 -> {
                    System.out.println();
                    System.out.println("Гос номер: " + Auto.getGosNumber());
                    System.out.println();
                }

                case 4 -> {

                    System.out.println();

                    System.out.println("Всего потрачено: ");
                    System.out.println(Auto.setSumSold());
                    System.out.println();
                }


                case 5 -> {


                    System.out.println("\nГос номер: " + Auto.getGosNumber());
                    System.out.println("использование топлива по дням: " + Arrays.toString(Auto.getDate()));
                    System.out.println("Суммарное количество потраченного топлива за "+(chet-1)+" дня: " + Auto.setSumSold());
                }
            }
        }while (choose != 6) ;

    }

    }