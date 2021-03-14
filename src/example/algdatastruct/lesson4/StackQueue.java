package example.algdatastruct.lesson4;

import java.util.ArrayList;
import java.util.Random;

public class StackQueue {
	static Random generator = new Random();
	
	public static void main(String[] args) {
		/*
		
		
		Задание 4.3
		На основе данных объектного списка из задания 3.4 реализуйте простой дек
		и его базовые методы.
		Оцените время выполнения операций с помощью базового метода System.nanoTime().
		
		Задание 4.4
		Реализуйте приоритетную очередь на основе ссылочных типов данных,
		например, integer.
		Оцените время выполнения операций с помощью базового метода System.nanoTime().
		
		Задание 4.5
		На основе данных из задания 4.1 и 4.2, реализуйте стек и
		очередь на базе связанного списка.
		Оцените время выполнения операций с помощью базового метода System.nanoTime().
		 */
		int testListSize = 100;
		int randomRange = 100;
		
		ArrayList<Integer> testList = new ArrayList<>();
		for (int i = 0; i < testListSize; i++) {
			testList.add(generator.nextInt(randomRange));
		}
		
		Task4_1(testList);
		
		
		
		
	}
	
	/*
			Задание 4.1
		На основе данных объектного списка из задания 3.4 реализуйте простой стек
		и его базовые методы.
		Оцените время выполнения операций с помощью базового метода System.nanoTime().
	 */
	private static void Task4_1(ArrayList inputList)  {
		long time1 = 0;
		long time2 = 0;
		
		time1 = System.nanoTime();
		// Инициализация стека.
		MyStack myStack = new MyStack(inputList);
		time2 = System.nanoTime() - time1;
		System.out.printf("Time for stack init: %d ns\n", time2);
		
		System.out.println("Is empty = " + myStack.empty());
		
		time1 = System.nanoTime();
		// Замер времени операции peek().
		myStack.peek();
		time2 = System.nanoTime() - time1;
		System.out.printf("Time for peek(): %d ns\n", time2);
		
		time1 = System.nanoTime();
		// Замер времени операции pop().
		myStack.pop();
		time2 = System.nanoTime() - time1;
		System.out.printf("Time for pop(): %d ns\n", time2);
		
		while(!myStack.empty()) {
			System.out.println(myStack.pop());
		}
		
		time1 = System.nanoTime();
		// Замер времени операции push().
		myStack.push(18);
		time2 = System.nanoTime() - time1;
		System.out.printf("Time for push(): %d ns\n", time2);
		
		// Просмотр вершины стека.
		// Удостоверяемся, что добавление элемента сработало.
		System.out.printf("Look at the top stack.\t");
		System.out.println(myStack.peek());
	}
	
	/*
			Задание 4.2
		На основе данных объектного списка из задания 3.4 реализуйте простую очередь
		и его базовые методы.
		Реализуйте вспомогательные методы.
		Оцените время выполнения операций с помощью базового метода System.nanoTime().
	 */
	private static void Task4_2()   {
	
	}
	
}
