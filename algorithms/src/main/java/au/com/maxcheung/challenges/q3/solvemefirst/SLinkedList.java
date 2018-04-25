package au.com.maxcheung.challenges.q3.solvemefirst;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class SLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    
    
    /*
     * Complete the distinct function below.
     */


    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
            throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList head = new SinglyLinkedList();

        int headCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int headItr = 0; headItr < headCount; headItr++) {
            int headItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            head.insertNode(headItem);
        }

        SinglyLinkedListNode res = distinct(head.head);

        printSinglyLinkedList(res, "\n", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    public static SinglyLinkedListNode distinct(SinglyLinkedListNode head) {
        Set<Integer> existVal = new HashSet<Integer>();
        
        int nodeData = head.data;
        SinglyLinkedList deduped = new SinglyLinkedList();
        while (head != null) {
            nodeData = head.data;
            // check duplicate
            if (existVal.contains(nodeData)) {
                
            } else {
                existVal.add(nodeData);
                deduped.insertNode(nodeData);
            }
            head = head.next;
        }
        
        return deduped.head;
    }
}
