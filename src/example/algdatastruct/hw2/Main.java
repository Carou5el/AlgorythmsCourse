package example.algdatastruct.hw2;

import javax.naming.SizeLimitExceededException;
import java.util.Arrays;
import java.util.Random;

public class Main {
	private static final int SIZE_OF_ARRAY = 100;
	
	public static void main(String[] args) {
		/*
			Задание 2.1
		На основе программного кода из домашнего задания №1 реализуйте
		массив на основе существующих примитивных или ссылочных типов
		данных.
		Выполните обращение к массиву и базовые операции класса Arrays.
		Оценить выполненные методы с помощью базового класса
		System.nanoTime().
		*/
		Task2_1(fillArrayRandomly(new int[SIZE_OF_ARRAY]));
		
		/*
			Задание 2.1
		На основе программного кода из домашнего задания №1 реализуйте
		массив на основе существующих примитивных или ссылочных типов
		данных.
		Выполните обращение к массиву и базовые операции класса Arrays.
		Оценить выполненные методы с помощью базового класса
		System.nanoTime().
		*/
		
	}
	
	
	private static void Task2_1(int[] testArray) {
		long time1;
		long time2;
		int searchKey = 13;
		
		
		System.out.printf("\t\tTask 2.1.\t");
		System.out.printf("Basic operations with class 'Arrays'.\n");
		
		time1 = System.nanoTime();
		int[] partedArray1 = Arrays.copyOf(testArray, 10);
		time2 = System.nanoTime();
		System.out.printf("Time for copying of int array: %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		int[] partedArray2 = Arrays.copyOfRange(testArray, 2, 750);
		time2 = System.nanoTime();
		System.out.printf("Time for range copying of int array: %d ns\n", (time2 - time1));
		
		time1 = System.nanoTime();
		int restultOfBinarySearch = Arrays.binarySearch(partedArray1, searchKey);
		time2 = System.nanoTime();
		System.out.printf("Time for range copying of int array: %d ns\n", (time2 - time1));
		
		
		System.out.println();
	}
	
	/**
	 Заполнение массива случайными числами.
	 @param arrayToFill - заполняемый массив.
	 */
	private static int[] fillArrayRandomly(int[] arrayToFill)	{
		int RANDOM_RANGE = 1000;
		Random generator = new Random();
		
		int[] resultArray = Arrays.copyOf(arrayToFill, arrayToFill.length);
		
		for(int i = 0; i < resultArray.length; i++)	{
			resultArray[i] = generator.nextInt(RANDOM_RANGE);
		}
		
		return resultArray;
	}
	
}
