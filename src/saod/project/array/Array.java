package saod.project.array;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program counts sum elements in ever Stolb");
        System.out.println("Input kol-vo stolb ");
        int stol = sc.nextInt();
        System.out.println("Input kol-vo strok ");
        int str = sc.nextInt();
        int[][] mas= new int[str][stol];

        System.out.println();

        for (int i = 0; i<str; i ++){
            for (int j = 0; j<stol; j++ ){
                mas[i][j] = (int) (Math.random()*40-19);
                System.out.print(mas[i][j]+"  ");
            }
            System.out.println();
        }

        for (int j = 0; j<stol; j ++){
            int sum=0;
            for (int i = 0; i<str; i++ ){
              sum += mas[i][j];
            }
            System.out.println("sum "+(j+1)+" stolbza = "+sum);
            sum=0;
        }
    }
}
