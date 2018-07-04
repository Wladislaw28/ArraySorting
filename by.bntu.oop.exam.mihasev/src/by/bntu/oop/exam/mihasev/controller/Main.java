package by.bntu.oop.exam.mihasev.controller;

import by.bntu.oop.exam.mihasev.logic.Sort;
import by.bntu.oop.exam.mihasev.view.View;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        View.print("Введите размер массива");
        int n = sc.nextInt();
        int[] array = new int[n];

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10);
        }
        View.print("Начальный массив: " + Arrays.toString(array));

        int m, o;
        if ((n % 2) == 0) {
            m = n / 2;
            o = n / 2;
        } else {
            m = (n - 1) / 2;
            o = (n + 1) / 2;
        }

        int[] part1 = new int[o];
        int[] part2 = new int[m];

        int j = 0, k = 0;

        for (int i = 0; i < array.length; i++) {
            if ((i % 2) == 0) {
                part1[j] = array[i];
                j++;
            } else {
                part2[k] = array[i];
                k++;
            }
        }
        View.print("Четный массив: " + Arrays.toString(part2));
        View.print("Нечетный массив: " + Arrays.toString(part1));

        Sort.wane(part2);
        Sort.increase(part1);
        View.print("Четный массив по убыванию: " + Arrays.toString(part2));
        View.print("Нечетный массив по возрастанию: " + Arrays.toString(part1));

        Sort.sort(array);
        View.print("Сортировка ВСЕГО массива(первоначального): " + Arrays.toString(array));
    }
}
