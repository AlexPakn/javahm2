package com.something.hm2.MathPart67;

public class Array implements IMath, ISort {

    private int[] array;

    public Array() {
        this.array = new int[0];
    }
    public Array(int[] array) {
        this.array = array;
    }

    @Override
    public void SortAsc() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        showArray();
    }

    @Override
    public void SortDesc() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        showArray();
    }

    @Override
    public int Max(int a, int b) {
        return (a > b) ? a : b;
    }

    @Override
    public int Min(int a, int b) {
        return (a < b) ? a : b;
    }

    @Override
    public float Avg(int a, int b) {
        return (a + b) / 2f;
    }

    public void IAMARRAYFRNOCAP() {
        System.out.println("I AM ARRAY");
    }

    public void showArray() {
        System.out.println("Array contents:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}