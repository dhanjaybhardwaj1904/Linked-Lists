package linkedList2L;

import java.util.Scanner;

public class LinkedList {
	public static void printList(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null;
		int data = s.nextInt();
		while (data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if (head == null) {
				head = newNode;
			}
			else {
				Node<Integer> temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			data = s.nextInt();
		}
		printList(head);
		printList(head);
	}
}