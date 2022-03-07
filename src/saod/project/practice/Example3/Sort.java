package saod.project.practice.Example3;

import java.util.Scanner;

public class Sort {

    private static int chetsravn = 0;
    private static int chetperest = 0;
    private static int choose = 1;


    public static void main(String[] args) {
        Scanner nas = new Scanner(System.in);

        do {

            System.out.print("---Input size of array: ");
            int LenghtMas = nas.nextInt();
            int[] Mas = new int[LenghtMas];
            int[] Mas2 = new int[LenghtMas];
            System.out.println();
            System.out.println("Press 1 to view all method Sorting");
            System.out.println("Press 2 to view Insert Sorting");
            System.out.println("Press 3 to view Choice Sorting");
            System.out.println("Press 4 for Exit");
            System.out.println();
            choose = nas.nextInt();
            fPush(LenghtMas, Mas);
            for (int i = 0; i < LenghtMas; i++){
                Mas2[i] = Mas[i];
            }
            switch (choose){
                case 1 -> {
                    System.out.println("\n------------This is Insert Sorting------------");
                    fChek(LenghtMas, Mas);
                    long start = System.nanoTime();
                    InsertSort(LenghtMas, Mas);
                    long finish = System.nanoTime();
                    long elapsed = finish - start;
                    System.out.println("Прошло времени, мс: " + (elapsed/1000000));
                    fChet();
                    System.out.println("------------End Insert Sorting------------\n\n");

                    System.out.println("\n------------This is Choice Sorting------------");
                    fChek(LenghtMas, Mas2);
                    long start2 = System.nanoTime();
                    ChoiceSort(LenghtMas, Mas2);
                    long finish2 = System.nanoTime();
                    long elapsed2 = finish2 - start2;
                    System.out.println("Прошло времени, мс: " + (elapsed2/1000000));
                    fChet();
                    System.out.println("------------End Choice Sorting------------\n\n");
                }
                case 2 -> {
                    System.out.println("\n------------This is Insert Sorting------------");
                    fChek(LenghtMas, Mas);
                    long start = System.nanoTime();
                    InsertSort(LenghtMas, Mas);
                    long finish = System.nanoTime();
                    long elapsed = finish - start;
                    System.out.println("Прошло времени, мс: " + (elapsed/1000000));
                    fChet();
                    System.out.println("------------End Insert Sorting------------\n\n");
                }
                case 3 -> {
                    System.out.println("\n------------This is Choise Sorting------------");
                    fChek(LenghtMas, Mas2);
                    long start2 = System.nanoTime();
                    ChoiceSort(LenghtMas, Mas2);
                    long finish2 = System.nanoTime();
                    long elapsed2 = finish2 - start2;
                    System.out.println("Прошло времени, мс: " + (elapsed2/1000000));
                    fChet();
                    System.out.println("------------End Choise Sorting------------\n\n");
                }
            }
            System.out.println("\nDo you want continue?");
            choose = nas.nextInt();
        } while (choose != 4);
    }


    public static void Push(int lenghtMas, int[] mas) {
        for (int i = 0; i < lenghtMas; i++) {
            mas[i] = (int) (Math.random() * 40000);
        }
    }


    public static void Chek(int lenghtMas, int[] mas) {
        for (int i = 0; i < lenghtMas; i++) {
            System.out.print(mas[i] + "  ");
        }
    }
    public static void ChekSort(int lenghtMas, int[] mas) {
        for (int i = 0; i < lenghtMas; i++) {
            System.out.print(mas[i] + "  ");
        }
    }


    public static void fChek(int lenghtMas, int[] mas){
        System.out.println("Your array\n");
        System.out.print("  ");
        Chek(lenghtMas,mas);
        System.out.println();
    }
    public static void fCheksort(int lenghtMas, int[] mas){
        System.out.println("Is Sorting Array\n");
        System.out.print("  ");
        ChekSort(lenghtMas,mas);
        System.out.println();

    }


    public static void fPush(int lenghtMas, int[] mas){
        System.out.println();
        Push(lenghtMas,mas);
        System.out.println();
    }


    public static void fChet(){
        System.out.println();
        System.out.print("The number of перестановок is equal to: " + chetperest);
        System.out.println();
        System.out.print("The number of сравнений is equal to: " + chetsravn + "\n");
        System.out.println();
        chetsravn = 0;
        chetperest = 0;
    }


    public static void InsertSort(int lenghtMas, int[] mas){

        for (int i = 1; i < lenghtMas; i++) {
            int vspom = mas[i];
            int j = i - 1;
            if ((j >= 0) && (vspom < mas[j])) {
            while ( (j >= 0) && (vspom < mas[j]) ) {
                    mas[j + 1] = mas[j];
                    j -= 1;
                    chetperest += 1;
                    chetsravn += 1;
                }
            }else {chetsravn += 1;}
            mas[j + 1] = vspom;
        }
        fCheksort(lenghtMas,mas);
    }


    public static void ChoiceSort(int lenghtMas, int[] mas){

        for (int i = 0; i <= (lenghtMas-1); i++) {
            int k = i;
            int vspom = mas[i];
            for (int j = i + 1; j < lenghtMas; j++) {
                if (mas[j] < vspom) {
                    k = j;
                    vspom = mas[j];
                    chetperest += 1;
                    chetsravn += 1;
                }else {chetsravn += 1;}
            }
            mas[k] = mas[i];
            mas[i] = vspom;
        }
        fCheksort(lenghtMas,mas);
    }
}
