package au.com.maxcheung.challenges.q3.solvemefirst;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

import au.com.maxcheung.challenges.q3.solvemefirst.SLinkedList.SinglyLinkedList;
import au.com.maxcheung.challenges.q3.solvemefirst.SLinkedList.SinglyLinkedListNode;

public class SinglyLinkedListTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSolveMeFirst() throws Exception {
        SinglyLinkedList head = new SinglyLinkedList();
        head.insertNode(1);
        head.insertNode(2);
        head.insertNode(2);
        head.insertNode(3);

        printNode("Result:\n", head.head);
        SinglyLinkedListNode res = SLinkedList.distinct(head.head);
        printNode("Description Result:\n", res);
    }

    private void printNode(String description, SinglyLinkedListNode node) throws IOException {
        StringWriter sw = new StringWriter();
        BufferedWriter stringWriter = new BufferedWriter(sw);
        SLinkedList.printSinglyLinkedList(node, "\n", stringWriter);
        stringWriter.flush();
        StringBuffer sb = sw.getBuffer();
        System.out.println(description + sb);

    }

}
