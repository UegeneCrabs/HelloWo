package saod.project.practice.Example4;

import java.util.Scanner;

public class QuickSort {

    private static int chetsravn = 0;
    private static int chetperest = 0;


    public static void main(String[] args) {
        Scanner nas = new Scanner(System.in);

        int choice;
        do {
            chetperest = 0;
            chetsravn = 0;

            System.out.print("---Input size of array: ");
            int str = nas.nextInt();
            int[] mas = new int[str];



            System.out.println("----MENU----");
            System.out.println("1 - Quick Sorting;");
            System.out.println("2 - Exit.");
            int chet = nas.nextInt();

            if (chet == 1){
                    System.out.println("\n------------This is Quick Sorting------------");
                    fPush(str,mas);
                    fChek(str,mas);
                    long start = System.nanoTime();
                    QuickSort(0,(str-1),mas);
                    long finish = System.nanoTime();
                    long elapsed = finish - start;
                    fCheksort(str,mas);
                    fChet();
                    System.out.println("Прошло времени, мс: " + elapsed/1000000);
                    System.out.println("------------End Insert Sorting------------\n\n");
                }



            System.out.println();
            System.out.println("\nDo you want continue?");
            choice = nas.nextInt();
        }while (choice != 2);

    }


    public static void Push(int str, int[] mas) {
        for (int i = 0; i < str; i++) {
            mas[i] = (int) (Math.random() * 4000);
        }

    }


    public static void Chek(int str, int[] mas) {
        for (int i = 0; i < str; i++) {
            System.out.print(mas[i] + "  ");
        }
    }
    public static void ChekSort(int str, int[] mas) {
        for (int i = 0; i < str; i++) {
            System.out.print(mas[i] + "  ");
        }
    }


    public static void fChek(int str, int[] mas){
        System.out.println();
        System.out.println("---Your array---");
        System.out.print("  ");
        Chek(str,mas);
        System.out.println();

    }
    public static void fCheksort(int str, int[] mas){
        System.out.println("Is Sorting Array\n");
        System.out.print("  ");
        ChekSort(str,mas);
        System.out.println();

    }


    public static void fPush(int str, int[] mas){
        Push(str,mas);
    }


    public static void fChet(){
        System.out.println();
        System.out.print("---The number of permutations is equal to: " + chetperest);
        System.out.println();
        System.out.print("---The number of comparisons is equal to: " + chetsravn);
        System.out.println();
        chetsravn = 0;
        chetperest = 0;
    }


    public static void QuickSort(int left, int right,int[] mas){
        int i,j,sred,temp;
        i = left;
        j = right;
        sred = mas[(left+right) / 2];
        while (i <= j){
                while (mas[i] < sred) {
                    i += 1;
                    chetsravn += 1;
                }
                while (mas[j] > sred)
                {
                    j -= 1;
                    chetsravn += 1;
                }
                if (i <= j) {
                    temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                    i += 1;
                    j -= 1;
                    chetperest += 1;
                }
        }
        if ( left < j ) {QuickSort(left,j,mas);}
        if (i < right ) {QuickSort(i,right,mas);}
    }



}
