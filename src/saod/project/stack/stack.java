package saod.project.stack;

import java.util.Scanner;

public class stack {

    public static void main(String[] args) {
        Scanner nas = new Scanner(System.in);

        System.out.print("Input size of array: ");
        int str = nas.nextInt();
        int[] mas = new int[str];

        int sp = 0;

        int y = 1;
        do {

            System.out.println();
            System.out.println("Press 1 to add 1 element in Stack");
            System.out.println("Press 2  to delete last element in Stack");
            System.out.println("Press 3 to check Stack");
            System.out.println();
            int chet = nas.nextInt();


            switch (chet) {
                case 1:
                    if (sp >= str){
                        System.out.println("net mesta");
                        System.out.println();
                    }
                    else {Push(sp,mas);
                    sp++;}
                    break;

                case 2:
                    del(mas,sp);
                    sp-=1;
                    break;

                case 3:
                    check(sp, mas);
                    break;
            }
            System.out.println("do you want continue?");
            y = nas.nextInt();
        } while(y !=0);
    }


    public static int Push(int sp,int[] mas){
        int x = (int) (Math.random() * 40);
        mas[sp] = x;
        System.out.println("Elements add!");
        return mas[sp];
    }


    private static void del(int[] mas, int sp) {
        if (sp>0){
        System.out.println("element pod nomerom "+sp+" - "+mas[sp-1]);
        }
        else{ System.out.println("sp<0"); }
    }


    public static void check(int sp,int[] mas){
        for (int i = 0;i<(sp);i++){
            System.out.print("  "+mas[i]);
        }
        System.out.println();
    }


}