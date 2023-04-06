package com.bridgelabz.stacksandqueues;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksAndQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		queue.add(56);
		queue.add(30);
		queue.add(70);

		System.out.println("The Queue elements are : " + queue);
		System.out.println("The Peek element is :" + queue.peek());

	}

}