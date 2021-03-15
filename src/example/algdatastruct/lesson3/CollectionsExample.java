package example.algdatastruct.lesson3;

/*
		
	
		
		
		
		Задание 3.5
	Реализуйте итератор на основе связанных списков из задания 3.4 и
	выполните базовые операции итератора.
	Оцените время выполнения операций с помощью базового метода System.nanoTime()

 */

import java.util.*;

public class CollectionsExample {
	static final int TEST_ARRAY_SIZE = 100;
	static Random generator = new Random();
	
	static int[] testArray = new int[TEST_ARRAY_SIZE];
	
	public static void main(String[] args) {
		fillArrayRandomly(testArray);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		// Формирование ArrayList'а.
		for(int d : testArray)  {
			arrayList.add(d);
		}
		
		Task3_4(arrayList);
		
	}
	
	
	/**
	 Заполнение массива случайными числами.
	 @param array - заполняемый массив.
	 */
	public static void fillArrayRandomly(int[] array)	{
		int randomRange = 100;
		
//		int[] resultArray = Arrays.copyOf(array, array.length);
		
		for(int i = 0; i < array.length; i++)	{
			array[i] = generator.nextInt(randomRange);
		}
		
	}
	
	/*
		Задание 3.1
	На основе массива из домашнего задания 2.1 реализуйте простой список и коллекцию.
	Оцените время выполнения преобразования.
	 */
	public static void Task3_1(int[] array)   {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		long time1;
		long time2;
		
		time1 = System.nanoTime();
		
		// Формирование ArrayList'а.
		for(int d : array)  {
			arrayList.add(d);
		}
		
		time2 = System.nanoTime();
		System.out.printf("Time for ArrayList create: %d ns\n", (time2 - time1));
	}
	
	/*
		Задание 3.2
	На основе списка из задания 3.1 реализуйте основные методы добавления,
	удаления и получения объекта или элемента из списка.
	Оценить выполненные методы с помощью базового класса System.nanoTime().
	 */
	public static void Task3_2(ArrayList arrayList)  {
		long time1;
		long time2;
		
		Integer numForAdding = generator.nextInt();
		Integer numForTake;
		Integer indexForTake = generator.nextInt(arrayList.size());
		
		time1 = System.nanoTime();
		arrayList.add(numForAdding);
		time2 = System.nanoTime();
		System.out.printf("Time for add new element in ArrayList: %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		numForTake = (Integer) arrayList.get(indexForTake);
		time2 = System.nanoTime();
		System.out.printf("Time for take an element from ArrayList: %d ns\n", (time2 - time1));
		System.out.printf("array[%d] = %d\n", indexForTake, numForTake);
		
		int sizeBefore = arrayList.size();
		
		time1 = System.nanoTime();
		arrayList.remove(indexForTake);
		time2 = System.nanoTime();
		
		int sizeAfter = arrayList.size();
		System.out.printf("Time for remove an element from ArrayList: %d ns\n", (time2 - time1));
		System.out.printf("Size of ArrayList before removing: %d\n", sizeBefore);
		System.out.printf("Size of ArrayList after removing: %d\n", sizeAfter);
	}
	
	/*
		Задание 3.3
	Реализуйте простой односвязный список и его базовые методы.
	 */
	class simpleLink<T>   {
		private T link;
		private simpleLink<T> next;
		
		public simpleLink(T link) {
			this.link = link;
		}
		
		public simpleLink<T> getNext()    {
			return this.next;
		}
		
		public void setNext(simpleLink<T> next)   {
			this.next = next;
		}
		
		public T getValue() {
			return this.link;
		}
	}
	
	class simpleLinkedList<T>   {
		private simpleLink<T> first;
		
		public simpleLinkedList()   {
			first = null;
		}
		
		public boolean isEmpty()    {
			return (first == null);
		}
		
		public void insert(T link)  {
			simpleLink<T> l = new simpleLink<>(link);
			l.setNext(first);
			this.first = l;
		}
		
		public simpleLink<T> delete()   {
			simpleLink<T> temp = first;
			first = first.getNext();
			return temp;
		}
		
		public void display()   {
			simpleLink<T> current = first;
			while(current != null)  {
				System.out.println(current.getValue());
				current = current.getNext();
			}
		}
		
		public T find(T searchNode) {
			simpleLink<T> findNode = new simpleLink<>(searchNode);
			simpleLink<T> current = first;
			while(current != null) {
				if(current.getValue().equals(findNode.getValue()))  {
					return findNode.getValue();
				}
				current = current.getNext();
			}
			return null;
		}
	}
	
	/*
		Задание 3.4
	На основе списка из задания 3.1 реализуйте простой двусторонний список и его базовые методы.
	Реализуйте список заполненный объектами из вашего класса из задания 1.3
	 */
	public static void Task3_4(List list)    {
		LinkedList<Integer> ll = new LinkedList<>(list);
		
		// Базовые методы.
		int sizeOfLinkedList = ll.size();
		ll.add(generator.nextInt());
		for(Integer d : ll) {
			System.out.println("d = " + d);
		}
	}
	
	
	
}
