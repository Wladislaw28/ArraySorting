package by.bntu.oop.exam.mihasev.logic;

public class Sort {

    //сортировка(по основному заданию)
    //четные индексы - по убыванию
    //нечетные индексы - по возврастанию
    public static int[] sort(int[] array) {
        for (int min = 0; min < array.length - 1; min++) {
            for (int j = min + 1; j < array.length; j++) {
                if (j % 2 == 1 && min % 2 == 1 && array[min] < array[j]) {

                    int least = array[j];
                    array[j] = array[min];
                    array[min] = least;

                } else if (j % 2 == 0 && min % 2 == 0 && array[min] > array[j]) {

                    int least = array[j];
                    array[j] = array[min];
                    array[min] = least;

                }
            }

        }
        return array;
    }

    //сортировка убыванием
    public static int[] wane(int[] part2) {
        for (int min = 0; min < part2.length; min++) {
            for (int j = 0; j < part2.length - 1; j++) {
                if (part2[j] < part2[j + 1]) {
                    int temp = part2[j];
                    part2[j] = part2[j + 1];
                    part2[j + 1] = temp;
                }
            }
        }
        return part2;
    }

    //сортировка возрастанием
    public static int[] increase(int[] part1) {
        for (int i = 0; i < part1.length; i++) {
            for (int j = 0; j < part1.length - 1; j++) {
                if (part1[j] > part1[j + 1]) {
                    int temp = part1[j];
                    part1[j] = part1[j + 1];
                    part1[j + 1] = temp;
                }
            }
        }
        return part1;
    }
}
