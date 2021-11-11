package saod.project.project1;

public class Calculator1 {


    public static void main(String[] args) {
        for (int i = 2; i < 21; i++) {
            System.out.println("Factorial " + i + " = " + calc(i) + ". Or " + i+"*"+calc(i-1));
        }
    }
    public static long calc(long a){
        if (a == 1){return 1;}
        else {return a * calc(a-1);}
    }
}
