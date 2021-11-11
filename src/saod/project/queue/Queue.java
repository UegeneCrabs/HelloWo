package saod.project.queue;

import java.util.Scanner;

public class Queue {
    public static void main(String[] args){

        int first = 0, last = 0, dan = 0, chet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array");
        int dlina = sc.nextInt();
        int[] mas = new int[dlina];


        do {

            System.out.println();
            System.out.println("Press 1 to add 1 element in Stack");
            System.out.println("Press 2 to delete last element in Stack");
            System.out.println("Press 3 to check Stack");
            System.out.println("Press 4 to exit");
            System.out.println();
            chet = sc.nextInt();

            switch (chet) {
                case 1:
                    if (last <= (dlina-1) && dan <= (dlina-1)){
                        add(mas,last);
                        last++;
                        dan++;
                    }
                    else if (last >(dlina-1) && dan < dlina){
                            last = 0;
                            add(mas,last);
                            last++;
                            dan++;
                        }
                    else if (last > (dlina-1) && dan > (dlina-1)){
                        System.out.println("Array is full");
                    }
                    break;
                case 2:
                    if (first <= dlina){
                        System.out.println("Element pod nomerom "+(first+1)+" - "+mas[first]);
                        mas[first] = 0;
                    }
                    if (dan<1){
                        System.out.println("0 elements in array");
                    }
                    if (first > dlina){
                        first = 0;
                    }
                    else{
                    first++;}
                    dan--;

                    break;
                    case 3:
                        check(mas,first,dlina,last);
                    break;
            }

        } while (chet != 4);


    }

    private static void check(int[] mas, int first,int dlina,int last) {
        for (int i = 0;i<(dlina);i++){
            System.out.print(mas[i]);
            System.out.print("  ");
        }
        System.out.println();
        System.out.println(first + " - first");
        System.out.println(last + " - last");
        System.out.println();
    }

    public static int add(int[] mas,int last) {
        int x = (int) (Math.random() * 40);
        mas[last] = x;
        System.out.println("Elements add!");
        return mas[last];
    }
}
