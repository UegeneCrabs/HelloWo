package saod.project.project2;
import java.sql.SQLOutput;
import java.util.Scanner;

public class XInN {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program counts X^N");
        System.out.println("Input X");
        int x = sc.nextInt();
        System.out.println("Input N");
        int n = sc.nextInt();
        System.out.println("X^N = "+calc(x,n));
    }

    public static int calc(int x,int n){
    if (n == 0) {return 1;}
    else {return x * calc(x,n-1);}
    }
}
