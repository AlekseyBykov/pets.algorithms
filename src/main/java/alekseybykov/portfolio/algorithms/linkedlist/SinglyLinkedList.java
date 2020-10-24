package alekseybykov.portfolio.algorithms.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Aleksey Bykov
 * @since 20.04.2020
 */
public class SinglyLinkedList {

	private Node head;
	private class Node {
		int data;
		Node nextNode;

		Node(int d) {
			data = d;
			nextNode = null;
		}
	}

	public SinglyLinkedList(int[] data) {
		for (int i = 0; i < data.length; i++) {
			addElementAtEnd(data[i]);
		}
	}

	private void addElementAtEnd(int data) {
		Node node;
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
			return;
		}

		node = head;
		while (node.nextNode != null) {
			node = node.nextNode;
		}
		node.nextNode = temp;
	}

	public List<Integer> getAllNodesData() {
		Node node;
		if (head == null) {
			return Collections.emptyList();
		}

		List<Integer> list = new ArrayList<>();

		node = head;
		while (node != null) {
			list.add(node.data);
			node = node.nextNode;
		}
		return list;
	}

	public int getNumberOfNodes() {
		int counter = 0;
		Node node = head;
		while (node != null) {
			counter++;
			node = node.nextNode;
		}

		return counter;
	}

	public boolean isElementExists(Integer data) {
		if (data == null) {
			return false;
		}

		Node node = head;
		while (node != null) {
			if (data == node.data) {
				return true;
			}
			node = node.nextNode;
		}

		return false;
	}
}
