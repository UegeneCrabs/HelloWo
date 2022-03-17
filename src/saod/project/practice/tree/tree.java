package saod.project.practice.tree;

public class tree {

    private Node rootNode;
    private boolean isLeftChild;

    public tree(int tKey) { // создание деревеа с уже имеющейся вершиной
        rootNode = new Node(tKey);
    }

    public Node getRoot() {
        return rootNode;
    }

    public Node search(int tKey) {
        Node currentNode = rootNode;
        while (currentNode != null) {
            if (tKey == currentNode.getKey()) {
                return currentNode;
            } else {
                if (tKey < currentNode.getKey()) {
                    currentNode = currentNode.getLeftChild();
                } else {
                    currentNode = currentNode.getRightChild();
                }
            }
        }
        return null;
    }

    public Node searchParent(int tKey) {
        Node currentNode = rootNode;
        Node parent = rootNode;
        if (tKey == rootNode.getKey()) {
            return null;
        } else {
            while (currentNode.getKey() != tKey) {
                if (tKey == currentNode.getKey()) {
                    return parent;
                } else {
                    if (tKey < currentNode.getKey()) {
                        isLeftChild = true;
                        parent = currentNode;
                        currentNode = currentNode.getLeftChild();
                    } else {
                        isLeftChild = false;
                        parent = currentNode;
                        currentNode = currentNode.getRightChild();
                    }
                }
            }
        }
        return parent;
    }

    public void addNode(Node currentNode, int tKey) {
        if (rootNode == null) {
            new tree(tKey);
        } else {
            if (tKey < currentNode.getKey()) {
                if (currentNode.getLeftChild() != null) {
                    addNode(currentNode.getLeftChild(), tKey);
                } else currentNode.setLeftChild(new Node(tKey));
            } else {
                if (tKey > currentNode.getKey()) {
                    if (currentNode.getRightChild() != null) {
                        addNode(currentNode.getRightChild(), tKey);
                    } else currentNode.setRightChild(new Node(tKey));
                }
            }
        }
    }

    public void delNode(int tKey) {
        Node curr = search(tKey);
        Node parent = searchParent(tKey);
        if ((curr.getLeftChild() == null) && (curr.getRightChild() == null)) {
            if (curr == rootNode) {
                rootNode = null;
            } else {
                if (isLeftChild) {
                    parent.setLeftChild(null);
                } else {
                    parent.setRightChild(null);
                }
            }
        }
        if (curr.getRightChild() == null) {
            if (curr == rootNode) {
                rootNode = curr.getLeftChild();
            } else {
                if (isLeftChild) {
                    parent.setLeftChild(curr.getLeftChild());
                } else {
                    parent.setRightChild(curr.getLeftChild());
                }
            }
        }
        if (curr.getLeftChild() == null) {
            if (curr == rootNode) {
                rootNode = curr.getRightChild();
            } else {
                if (isLeftChild) {
                    parent.setLeftChild(curr.getRightChild());
                } else {
                    parent.setRightChild(curr.getRightChild());
                }
            }
        }
        if ((curr.getLeftChild() != null) && (curr.getRightChild() != null)) {
            Node heir = getHeir(curr);
            Node parentForHair = searchParent(heir.getKey());
            if (heir.getLeftChild() != null) {
                parentForHair.setRightChild(heir.getLeftChild());
                curr.setKey(heir.getKey());
            } else {
                curr.setKey(heir.getKey());
                parentForHair.setRightChild(null);
            }
        }
    }

    private Node getHeir(Node node) {
        Node heir = node;
        Node curr = node.getLeftChild();
        while (curr != null) {
            heir = curr;
            curr = curr.getRightChild();
        }

        return heir;
    }

    public void printTree(Node temp, int space) {
        if (temp == null) {
            return;
        }
        int count = 5;
        space += count;
        printTree(temp.getRightChild(), space);
        System.out.print("");
        for (int i = count; i < space; i++) {
            System.out.print(" ");
        }
        System.out.print(temp.getKey() + "\n");
        printTree(temp.getLeftChild(), space);
    }

    public void straight(Node temp) {
        if (temp != null) {
            System.out.print(temp.getKey() + " ");
            straight(temp.getLeftChild());
            straight(temp.getRightChild());
        }
    }


    public void symmetry(Node temp) {
        if (temp != null) {
            symmetry(temp.getLeftChild());
            System.out.print(temp.getKey() + " ");
            symmetry(temp.getRightChild());
        }
    }

    public void reverse (Node temp) {
        if (temp != null) {
            reverse (temp.getLeftChild());
            reverse (temp.getRightChild());
            System.out.print(temp.getKey() + " ");
        }
    }
}

