package ru.vsu.sc.tretyakov_d_s;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        MyBubbleSort sort = new MyBubbleSort();

        Integer[] array = {40, 30, 20, 10, 50, 60, 70, 80, 90, 100};
        sort.sort(array, 1, 5, true);
        System.out.println(Arrays.toString(array));

        String[] array2 = {"Здраствуйте", "Евгений", "можно", "пожалуйста", "35 баллов?", "за задачу",};
        sort.sort(array2, 3, 6, false);
        System.out.println(Arrays.toString(array2));
    }
}
