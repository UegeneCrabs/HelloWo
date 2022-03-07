package list;


import java.util.Scanner;
public class List {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner af = new Scanner(System.in);
        int  choose, chooseaf, sp = 0, wh_el, del, count;
        Integer[] mas = new Integer[4];

        do {
            System.out.println();
            System.out.println("1 - Add element in list;");
            System.out.println("2 - Check the list;");
            System.out.println("3 - Delete element from list;");
            System.out.println("4 - Exit.");
            System.out.print("              ? - ");
            choose = sc.nextInt();
            if ((choose < 1) || (choose > 4)) {
                System.out.println();
                System.out.println("No such action exists!");
                continue;
            }

            switch (choose) {
                case 1:
                    count  = 0;
                    if (sp == 3) {
                        System.out.println("List if full!");
                        break;
                    }
                    for (int i = 0; i <= 3; i++) if (mas[i] == null) count++;
                    if (count == 4) {
                        mas[0] = (int)(Math.random()*10);
                        System.out.println();
                        System.out.println("      Done!");
                        break;
                    }

                    System.out.print("Add after (1) or before (2) the item? - ");
                    chooseaf = af.nextInt();
                    while ((chooseaf != 2) && (chooseaf != 1)) {
                        System.out.println();
                        System.out.println("No such action exists!");
                        System.out.println();
                        System.out.print("Add after (1) or before (2) the item? - ");
                        chooseaf = af.nextInt();
                        System.out.println();
                    }
                    System.out.print("What element? - ");
                    wh_el = sc.nextInt();


                    count = 0;
                    for (int i = 0; i <= 3; i++) {
                        if ((mas[i] == null) || (mas[i] != wh_el)) {
                            count++;
                            continue;
                        }
                        else if (chooseaf == 1) {
                            for (int j = sp; j > i; j--) mas[j + 1] = mas[j];
                            sp++;
                            mas[i + 1] = (int)(Math.random()*10);
                            System.out.println();
                            System.out.println("      Done!");
                            break;
                        } else {
                            if (mas[i] == wh_el) {
                                for (int j = sp; j >= i; j--) mas[j + 1] = mas[j];
                                sp++;
                                mas[i] = (int) (Math.random() * 10);
                                System.out.println();
                                System.out.println("      Done!");
                                break;
                            }
                        }
                    }
                    if (count == 4) {System.out.println();System.out.println("No such element exists!");}
                    break;

                case 2:
                    for (int i = 0; i <= 3; i++) {
                        System.out.print("[" + mas[i] + "]");
                    }
                    break;

                case 3:
                    count = 0;
                    for (int i = 0; i <= 3; i++) if (mas[i] == null) count++;
                    if (count == 4) {
                        System.out.println();
                        System.out.println("List is empty!");
                        break;
                    }

                    System.out.println();
                    System.out.print("Which element should I delete? - ");
                    del = sc.nextInt();
                    System.out.println();

                    count = 0;
                    for (int i = 0; i <= 3; i++) {
                        if ((mas[i] == null) || (mas[i] != del)) {
                            count++;
                            continue;
                        }
                        else {
                            if (mas[i] == del) {
                                if (sp == 0) {
                                    mas[sp] = null;
                                    System.out.println();
                                    System.out.println("      Done!");
                                    break;
                                }
                                for (int j = i + 1; j <= sp; j++) mas[j - 1] = mas[j];
                                mas[sp] = null;
                                sp--;
                                System.out.println();
                                System.out.println("      Done!");
                                break;
                            }
                        }
                    }
                    if (count == 4) {System.out.println();System.out.println("No such element exists!");}
                    break;
            }

        } while (choose != 4);
        System.out.println();
        System.out.println("      See ya!");
    }
}
