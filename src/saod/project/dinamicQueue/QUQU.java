package saod.project.dinamicQueue;
import java.util.Scanner;
public class QUQU {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int FIRST = 0, LAST = 0, choose, count = 0;
            Integer[] mas = new Integer[4];

            do {
                System.out.println();
                System.out.println("1 - Add element in queue;");
                System.out.println("2 - Check the queue;");
                System.out.println("3 - Delete element from queue;");
                System.out.println("4 - Exit.");
                choose = sc.nextInt();

                switch (choose) {
                    case 1:
                        if (count > 3) {
                            System.out.println("Queue is full!");
                        }
                        else {
                            mas[LAST] = (int) (Math.random() * 10);
                            System.out.print("Done!");
                            LAST++;
                            if (LAST > 3) LAST = 0;
                            count++;
                        }
                        break;

                    case 2:

                        for (int i = 0; i < 4; i++) {
                            System.out.print("[" + mas[i] + "]");
                        }
                        System.out.println();
                        System.out.println("The first element - " + FIRST);
                        System.out.println("The last element - " + LAST);
                        break;

                    case 3:
                        if (count == 0) System.out.println("Queue is already empty!");
                        else {
                            mas[FIRST] = null;
                            FIRST++;
                            if (FIRST == 4) FIRST = 0;
                            count--;
                            System.out.print("Done!");
                        }
                        break;
                }

            } while (choose != 4);
        }

    }
