package example.algdatastruct.lesson4;

import java.util.*;

public class StackQueue {
	
	static Random generator = new Random();
	
	public static void main(String[] args) {
		int testListSize = 10;
		int randomRange = 100;
		
		ArrayList<Integer> testList = new ArrayList<>();
		for (int i = 0; i < testListSize; i++) {
			testList.add(generator.nextInt(randomRange));
		}
		
//		Task4_1(testList);
//		Task4_2(testList);
//		Task4_3(testList);
//		Task4_4();
		Task4_5();
		
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
		MyStackImp myStack;
		
		time1 = System.nanoTime();
		// Инициализация стека.
		myStack = new MyStackImp(inputList);
		time2 = System.nanoTime();
		System.out.printf("Time for stack init: %d ns\n", (time2 - time1));
		
		System.out.println("Is empty = " + myStack.empty());
		
		time1 = System.nanoTime();
		// Замер времени операции peek().
		myStack.peek();
		time2 = System.nanoTime();
		System.out.printf("Time for peek(): %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		// Замер времени операции pop().
		myStack.pop();
		time2 = System.nanoTime();
		System.out.printf("Time for pop(): %d ns\n", (time2 - time1));
		
		while(!myStack.empty()) {
			System.out.println(myStack.pop());
		}
		
		time1 = System.nanoTime();
		// Замер времени операции push().
		myStack.push(18);
		time2 = System.nanoTime();
		System.out.printf("Time for push(): %d ns\n", (time2 - time1));
		
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
	private static void Task4_2(ArrayList inputList)   {
		long time1 = 0;
		long time2 = 0;
		
		time1 = System.nanoTime();
		// Замер времени инициализации очереди.
		MyQueueImp myQueue = new MyQueueImp(inputList);
		time2 = System.nanoTime();
		System.out.printf("Time for init of queue: %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		// Замер времени выполнения show().
		myQueue.show();
		time2 = System.nanoTime();
		System.out.printf("Time for show(): %d ns\n", (time2 - time1));
		
		System.out.println("Call to remove()");
		while(!myQueue.isEmpty())   {
			System.out.print("item = ");
			System.out.println(myQueue.remove());
		}
		
		time1 = System.nanoTime();
		// Замер времени операции add().
		myQueue.add(13);
		time2 = System.nanoTime();
		System.out.printf("Time for add(): %d ns\n", (time2 - time1));
		
		
		myQueue.add(2);
		myQueue.add(43);
		myQueue.add(8);
		
		System.out.println("Call to show().");
		myQueue.show();
		
	}
	
	/*
			Задание 4.3
		На основе данных объектного списка из задания 3.4 реализуйте простой дек
		и его базовые методы.
		Оцените время выполнения операций с помощью базового метода System.nanoTime().
	 */
	private static void Task4_3(ArrayList arrayList)   {
		long time1 = 0;
		long time2 = 0;
		
		time1 = System.nanoTime();
		
		// Замер времени инициализации.
		MyDequeImp myDeque = new MyDequeImp(arrayList);
		
		time2 = System.nanoTime();
		System.out.printf("Time for init: %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		myDeque.peekFirst();
		time2 = System.nanoTime();
		System.out.printf("Time for peekFirst(): %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		myDeque.peekLast();
		time2 = System.nanoTime();
		System.out.printf("Time for peekLast(): %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		myDeque.popFirst();
		time2 = System.nanoTime();
		System.out.printf("Time for popFirst(): %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		myDeque.popLast();
		time2 = System.nanoTime();
		System.out.printf("Time for popLast(): %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		myDeque.pushFirst(23);
		time2 = System.nanoTime();
		System.out.printf("Time for pushFirst(): %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		myDeque.pushLast(103);
		time2 = System.nanoTime();
		System.out.printf("Time for pushLast(): %d ns\n", (time2 - time1));
	}
	
	/*
			Задание 4.4
		Реализуйте приоритетную очередь на основе ссылочных типов данных,
		например, integer.
		Оцените время выполнения операций с помощью базового метода System.nanoTime().
	 */
	private static void Task4_4()   {
		long time1 = 0;
		long time2 = 0;
		int queueSize = 10;
		int randomRange = 100;
		
		time1 = System.nanoTime();
		
		// Замер времени инициализации.
		Queue priorMyQueueInterface = new PriorityQueue();
		
		time2 = System.nanoTime();
		System.out.printf("Time for init: %d ns\n", (time2 - time1));
		
		for (int i = 0; i < queueSize; i++) {
			priorMyQueueInterface.add(generator.nextInt(randomRange));
		}
		
		time1 = System.nanoTime();
		// Замер времени инициализации.
		priorMyQueueInterface.isEmpty();
		time2 = System.nanoTime();
		System.out.printf("Time for isEmpty(): %d ns\n", (time2 - time1));
		
		// Вывод на консоль содержимого очереди.
		while(!priorMyQueueInterface.isEmpty()) {
			System.out.printf("prior queue = %d\n", priorMyQueueInterface.poll());
		}
		
		
		time1 = System.nanoTime();
		priorMyQueueInterface.poll();
		time2 = System.nanoTime();
		System.out.printf("Time for poll(): %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		priorMyQueueInterface.add(2342);
		time2 = System.nanoTime();
		System.out.printf("Time for add(): %d ns\n", (time2 - time1));
	}
	
	/*
			Задание 4.5
		На основе данных из задания 4.1 и 4.2, реализуйте стек и
		очередь на базе связанного списка.
		Оцените время выполнения операций с помощью базового метода System.nanoTime().
	 */
	private static void Task4_5()   {
		long time1 = 0;
		long time2 = 0;
		
		int sizeLinkedList = 10;
		MyStackImpLL myStackImpLL = new MyStackImpLL();
		MyQueueImpLL myQueueImpLL = new MyQueueImpLL();
		
		// Заполнение очереди и стека (не знаю, какие данные можно взять для этого из 4.1, 4.2)))).
		for (int i = 0; i < sizeLinkedList; i++) {
			myStackImpLL.push(generator.nextInt(100));
			myQueueImpLL.add(generator.nextInt(100));
		}
		
		time1 = System.nanoTime();
		myStackImpLL.push(17);
		time2 = System.nanoTime();
		System.out.printf("Time for push(): %d ns\n", (time2 - time1));
		
		
		time1 = System.nanoTime();
		myQueueImpLL.add(18);
		time2 = System.nanoTime();
		System.out.printf("Time for add(): %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		myStackImpLL.pop();
		time2 = System.nanoTime();
		System.out.printf("Time for pop(): %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		myQueueImpLL.remove();
		time2 = System.nanoTime();
		System.out.printf("Time for remove(): %d ns\n", (time2 - time1));
		
		
		
	}
	
}
