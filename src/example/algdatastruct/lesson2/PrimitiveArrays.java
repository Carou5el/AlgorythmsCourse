package example.algdatastruct.lesson2;

public class PrimitiveArrays {
	int[] arr;
	
	/**
	 * Insertion sort.
	 */
	public void insertionSort(int[] array) {
		int in;
		for(int i = 1; i < array.length; i++)   {
			int buff = array[i];
			in = i;
			while(in > 0 && array[in - 1] >= buff) {
				array[in] = array[in - 1];
				--in;
			}
			array[in] = buff;
		}
	}
	
	/*
		Сортировка методом выбора.
		1. Начиная с 0-элемента ищем минимум.
		2. Найденный минимум меняем местами с 0-элементом.
		3. Повторяем 1, 2 для следующего элемента.
	 */
	
	/**
	 * Selected sort.
	 * @param array
	 */
	public void selectedSort(int[] array)   {
		for(int i = 0; i < array.length; i++)   {
			int min = i;
			for(int j = i + 1; j < array.length; j++)   {
				if(array[j] < array[min])   {
					min = j;
				}
			}
			swapM(array, i, min);
		}
	}
	
	public void bubbleSort(int[] array)    {
		for(int i = array.length - 1; i >= 1; i--)  {
			for(int j = 0; j < i; j++)  {
				if(array[j] > array[j + 1]) {
					swapM(array, j, j + 1);
				}
			}
		}
	}
	
	// Linear search.
	private int linearSearch(int[] arrayForSearch, int key)   {
		for (int i = 0; i < arrayForSearch.length; i++) {
			if(arrayForSearch[i] == key)    {
				return i;
			}
		}
		// In case that key isn't found.
		return -1;
	}
	
	// Binary search.
	private int binarySearch(int[] arr, int key)    {
		int firstIndex = 0;
		int lastIndex = arr.length - 1;
		
		while(firstIndex <= lastIndex)  {
			int middleIndex = (firstIndex + lastIndex) / 2;
			
			if(arr[middleIndex] == key) {
				return middleIndex;
			}
			else if(arr[middleIndex] < key)   {
				firstIndex = middleIndex + 1;
			}
			else if(arr[middleIndex] > key)   {
				lastIndex = middleIndex - 1;
			}
		}
		
		// In case that key isn't found.
		return -1;
	}
	
	public void swapM(int[] array, int first, int last)  {
		int temp = array[first];
		array[first] = array[last];
		array[last] = temp;
	}
}
