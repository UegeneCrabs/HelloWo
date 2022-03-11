package OOP.studentfore;


import OOP.studentThird.Automibile;
import OOP.studentThird.ExThirdAuto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOP.studentfore.AutomibileList Eugene = new AutomibileList("Компания Женька");
        int choose, izmenenie, chet,search;
        float count, znachenie;
        String chooseAuto,name, searchString;
        do {
            System.out.println("------------МЕНЮ-1-----------");
            System.out.println("1 - Добавить Автомобиль;");
            System.out.println("2 - Добавить расход топлива;");
            System.out.println("3 - Получить информацию об одном автомобиле;");
            System.out.println("4 - Получить информацию обо всех автомобилях;");
            System.out.println("5 - Получить сумму топлива всех авто;");
            System.out.println("6 - Выход.");
            chet = 1;

            chooseAuto = sc.next();

            switch (chooseAuto){

                case "1" -> {

                    System.out.print("Введите Гос номер автомобиля: ");
                    name = sc.next();
                    Eugene.AddAuto(name);
                    System.out.println("Успешно!");

                }
                case "2" -> {
                    System.out.print("Введите Гос номер автомобиля: ");
                    name = sc.next();
                    Eugene.FindAuto(name);
                    do {
                        System.out.println();
                        System.out.println("------------МЕНЮ-2------------");
                        System.out.println("1 - Добавить расход топлива;");
                        System.out.println("2 - Изменить расход топлива;");
                        System.out.println("3 - Изменить Гос. номер автомобиля");
                        System.out.println("4 - Общая информация;");
                        System.out.println("5 - Выход.");
                        System.out.println();
                        choose = sc.nextInt();


                        switch (choose) {

                            case 1 -> {
                                System.out.println();
                                System.out.println("Введите расход топлива для " + chet + " дня");
                                count = sc.nextFloat();
                                ExForeAuto.addRachod(count);
                                System.out.println();
                                chet++;
                            }

                            case 2 -> {
                                System.out.println();
                                System.out.println("Введите день, который хотите поменять от 1 до 7: ");
                                izmenenie = sc.nextInt();
                                System.out.println("Введите новое значение: ");
                                znachenie = sc.nextFloat();
                                ExForeAuto.setRachod(znachenie, izmenenie);
                                System.out.println();
                            }

                            case 3 -> {
                                System.out.println("Введите новый Гос.номер автомобиля");
                                searchString = sc.next();
                                ExForeAuto.setGosNumber(searchString);
                            }

                            case 4 -> System.out.println(ExForeAuto.getData());

                        }

                    }while (choose != 5) ;
                    System.out.println(Eugene.getAutoCount());
                }



            case "3" -> {
                System.out.print("\nВведите Гос.номер автомобиля: ");
                searchString = sc.next();
                System.out.println("\n" + Eugene.FindAuto(searchString));
            }

            case "4" -> System.out.println(Eugene.getDataCompany());


            case "5" ->{
                System.out.println("\nВсего потрачено всеми автомобилями:");
                System.out.println(Eugene.SumCompany());
            }

            }
        } while (!chooseAuto.equals("6"));
        System.out.println("Всегоо хорошееего!");
    }
}