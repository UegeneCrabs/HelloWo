package saod.project.practice.tree;

public class Node {

        private int key;
        private Node leftChild;
        private Node rightChild;

        public Node(int aKey) {
            rightChild = leftChild = null;
            key = aKey;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public int getKey() {
            return this.key;
        }

        public void setKey(int kTemp) {
        key = kTemp;
    }

        public void setLeftChild(Node temp) {
            leftChild = temp;
        }

        public void setRightChild(Node temp) {
            rightChild = temp;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + key +
                    ", leftChild=" + leftChild +
                    ", rightChild=" + rightChild +
                    '}';
    }
    }
