package ru.vsu.sc.tretyakov_d_s;

public class MyBubbleSort {

    public <T extends Comparable<T>> void sort(T[] data, int from, int to, boolean isRising) {

        if(from < 1) from = 1;

        if(to > data.length) to = data.length;

        for (int i = from; i < to; i++) {
            for (int j = to - 1; j >= i; j--) {
                if (compare(data[j - 1], data[j]) > 0 && isRising) {  // data[j - 1] > data[j]
                    swap(data, j);
                }
                if (compare(data[j], data[j-1]) > 0 && !isRising) {  // data[j - 1] < data[j]
                    swap(data, j);
                }
            }
        }
    }

    public <T extends Comparable<T>> int compare(T a, T b) {
        return a.compareTo(b);
    }

    public <T extends Comparable<T>> void swap(T[] data, int j) {
        T tmp = data[j - 1];
        data[j - 1] = data[j];
        data[j] = tmp;
    }

}
