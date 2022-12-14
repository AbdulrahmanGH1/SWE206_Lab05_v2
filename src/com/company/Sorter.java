package com.company;

public class Sorter {

    public static void main(String[] args) {
	// write your code here
        System.out.println("TEST2");
    }

    //Insertion Sort
    public void insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }}

    void selectionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


    public void sort(int[] array){
        selectionSort(array);
    }


    //edited after the conflict
    public void sortAttempt2A(int[] array){
        selectionSort(array);
    }

    public void sortAttempt2B(int[] array){
        //team member A pulled the initial sort mehtod by accedent
        // without following the intended sequence, this is a second attempt
        insertionSort(array);
    }
}
