package saod.project.sort;

import java.util.Scanner;

public class TreeSort {


    private static int chetsravn = 0;
    private static int chetperest = 0;


    public static void main(String[] args) {
        Scanner nas = new Scanner(System.in);

        System.out.print("---Input size of array: ");
        int str = nas.nextInt();






        int y = 1;
        do {
            int[] mas = new int[]{42,7,15};
            chetperest = 0;
            chetsravn = 0;
            System.out.println();
            System.out.println("Press 1 to Bubble Sorting");
            System.out.println("Press 2 to Insert Sorting");
            System.out.println("Press 3 to Choice Sorting");
            System.out.println("Press 4 for Exit");
            System.out.println();
            int chet = nas.nextInt();


            switch (chet) {
                case 1:
                //fPush(str,mas);
                fChek(str,mas);
                BubbleSort1(str,mas);
                fChet();
                    break;
                case 2:
                    //fPush(str,mas);
                    fChek(str,mas);
                    InsertSort(str,mas);
                    fChet();
                    break;
                case 3:
                    //fPush(str,mas);
                    fChek(str,mas);
                    ChoiseSort(str,mas);
                    fChet();
                    break;
                case 4:
                    fChek(str,mas);
                    QuickSort(0,5,str,mas);
                    fChek(str,mas);
                    //fChet();
                    break;

            }

            System.out.println();
            System.out.println("do you want continue?");
            y = nas.nextInt();


        } while (y != 5);




    }

    public static int[] Push(int str, int[] mas) {
        for (int i = 0; i < str; i++) {
            mas[i] = (int) (Math.random() * 40);
        }
        System.out.println("---Well done---");
        return mas;
    }

    public static void Chek(int str, int[] mas) {
        for (int i = 0; i < str; i++) {
            System.out.print(mas[i] + " ");
        }
    }


    public static int[] BubbleSort(int str, int[] mas) {  // этот метод так-же рабочий, но немного другой проход.
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < mas.length; i++) {
                chetsravn += 1;
                if (mas[i] < mas[i - 1]) {
                    int vspom = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = vspom;
                    chetperest += 1;
                    isSorted = false;
                }
            }
        }
        fChek(str,mas);
        return mas;
    }


    public static int[] BubbleSort1(int str, int[] mas) {
            for (int i = 1; i < str; i++) {
                for (int j = i; j >= 1; j--) {
                    chetsravn += 1;
                    if (mas[j] < mas[j - 1]) {
                        int vspom = mas[j];
                        mas[j] = mas[j - 1];
                        mas[j - 1] = vspom;
                        chetperest += 1;
                    }
                }
            }
        fChek(str,mas);
        return mas;
    }


    public static int[] InsertSort(int str, int[] mas){
        for (int i = 1; i < str; i++) {

            int vspom = mas[i];
            int j = i - 1;
            while ( (j >= 0) && (vspom < mas[j]) ) {
                mas[j + 1] = mas[j];
                j -= 1;
                chetperest += 1;
            }
            mas[j + 1] = vspom;
            chetsravn += 1;
        }
        fChek(str,mas);
        return mas;
    }


    public static int[] ChoiseSort(int str, int[] mas){
        for (int i = 0; i <= str-1; i++) {
            int k = i;
            int vspom = mas[i];
            for (int j = i + 1; j < str; j++) {
                if (mas[j] < vspom) {
                    k = j;
                    vspom = mas[j];
                    chetperest += 1;
                }
                chetsravn += 1;
            }
            mas[k] = mas[i];
            mas[i] = vspom;

        }
        fChek(str,mas);
        return mas;
    }

    public static int[] QuickSort(int left, int right,int str,int[] mas){
        int i,j,sred,temp;
        i = left;
        j = right;
        sred = mas[(left+right) / 2];
        while (i <= j){
            if (i <= j){
            while (mas[i] < sred) {
                i += 1;
            }
            while (mas[j] > sred)
            {
                j -= 1;
            }
            if (i <= j) {
                temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
                i += 1;
                j -= 1;
            }
            chetsravn += 1;
            chetperest += 1;
            }
            else{chetsravn += 1;}
        }

        if ( left < j ) {QuickSort(left,j,str,mas);}
        if (i < right ) {QuickSort(i,right,str,mas);}

        return mas;
    }

    public static void fChek(int str, int[] mas){
        System.out.println();
        System.out.println("---Your array---");
        System.out.print("  ");
        Chek(str,mas);
        System.out.println();

    }


    public static void fPush(int str, int[] mas){
        System.out.println();
        Push(str,mas);
        System.out.println();
    }


    public static void fChet(){
        System.out.println();
        System.out.print("---The number of permutations is equal to: " + chetperest);
        System.out.println();
        System.out.print("---The number of comparisons is equal to: " + chetsravn);
        System.out.println();
    }


}




