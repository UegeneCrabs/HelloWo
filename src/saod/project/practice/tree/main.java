package saod.project.practice.tree;

import java.util.Scanner;

public class main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int ch, key;

            System.out.print("Введите ключ корневой вершины: ");
            key = sc.nextInt();
            tree tree = new tree(key);

            do {
                System.out.println();
                System.out.println("----------МЕНЮ----------");
                System.out.println("1 - Добавить новый узел;");
                System.out.println("2 - Удалить узел;");
                System.out.println("3 - Вывести дерево;");
                System.out.println("4 - Выход.");
                System.out.println();
                ch = sc.nextInt();

                switch (ch) {
                    case 1 -> {
                        System.out.print("\nВведите ключ вершины: ");
                        key = sc.nextInt();
                        tree.addNode(tree.getRoot(), key);
                    }

                    case 2 -> {
                        System.out.print("\nВведите ключ удаляемой вершины: ");
                        key = sc.nextInt();
                        tree.delNode(key);
                    }

                    case 3 -> {
                        System.out.println("\n");
                        System.out.println("Правая сторона дерева");
                        tree.printTree(tree.getRoot(), 0);
                        System.out.println("Левая сторона дерева");
                        System.out.print("\n\nПрямой обход: ");
                        tree.straight(tree.getRoot());
                        System.out.print("\nОбратный обход: ");
                        tree.reverse(tree.getRoot());
                        System.out.print("\nСимметричный обход: ");
                        tree.symmetry(tree.getRoot());
                        System.out.println("\n");
                    }
                }
            } while (ch != 4);
        }
    }