package OOP.studentThird;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Automibile Zheka = new Automibile("Компания Женька", 10);
        int chooseAuto,choose, num, izmenenie, chet,search;
        float count, znachenie;
        String name;
        do {
            System.out.println("------------МЕНЮ-1-----------");
            System.out.println("1 - Добавить Автомобиль;");
            System.out.println("2 - Получить информацию об одном автомобиле;");
            System.out.println("3 - Получить информацию обо всех автомобилях;");
            System.out.println("4 - Изменить значение топлива.");
            System.out.println("5 - Получить сумму топлива всех авто.");
            System.out.println("6 - Выход.");
            chet = 1;

            chooseAuto = sc.nextInt();

            switch (chooseAuto){
                case 1 ->{
                System.out.print("Введите Гос номер автомобиля: ");
                    name = sc.next();
                    ExThirdAuto Automobil = new ExThirdAuto(name);
                    Zheka.AddAuto(Automobil);
                    do {
                        System.out.println();
                        System.out.println("------------МЕНЮ-2------------");
                        System.out.println("1 - Добавить расход топлива;");
                        System.out.println("2 - Изменить расход топлива;");
                        System.out.println("3 - Общая информация;");
                        System.out.println("4 - Выход.");
                        System.out.println();
                        choose = sc.nextInt();


                        switch (choose) {
                            case 1 -> {
                                System.out.println();
                                System.out.println("Введите расход топлива для " + chet + " дня");
                                count = sc.nextFloat();
                                Automobil.addRachod(count);
                                System.out.println();
                                chet++;
                            }

                            case 2 -> {
                                System.out.println();
                                System.out.println("Введите день, который хотите поменять от 1 до 7: ");
                                izmenenie = sc.nextInt();
                                System.out.println("Введите новое значение: ");
                                znachenie = sc.nextFloat();
                                Automobil.setRachod(znachenie, izmenenie);
                                System.out.println();
                            }
                            case 3 -> {
                                System.out.println(Automobil.getData());
                            }
                        }
                    }while (choose != 4) ;

                    System.out.println(Zheka.getAutoCount());
                }
            case 2 -> {
                System.out.print("\nВведите индекс автомобиля: ");
                search = sc.nextInt();
                System.out.println("\n" + Zheka.SearchAuto(search));
            }
            case 3 -> {
                System.out.println(Zheka.getDataCompany());
            }
            case 4 -> {
                    float[] Massiv = new float[7];
                System.out.print("\nВведите индекс автомобиля: ");
                search = sc.nextInt();
                Massiv = Zheka.PoiskAuto(search);
                System.out.println();
                System.out.println("Введите день, который хотите поменять от 1 до 7: ");
                izmenenie = sc.nextInt();
                System.out.println("Введите новое значение: ");
                znachenie = sc.nextFloat();
                for (int i = 0; i < 7; i++){
                    if (i == izmenenie){Massiv[i] = znachenie;}
                }
                System.out.println("\nВыполнено");
            }
            case 5 ->{
                System.out.println("\nВсего потрачено всеми автомобилями:");
                System.out.println(Zheka.SumCompany());
            }
            }
        } while (chooseAuto != 6);
    }
}