package ru.goluzov.se;

public class Example2 {
    public static void main(String[] args) {

        //  Задание 1
//  Задать целочисленный массив, состоящий из элементов 0 и 1.
//  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//  С помощью цикла и условия заменить 0 на 1, 1 на 0;
        public static int[] invertArray ( int[] array){
            int arrayLength = array.length;
            for (int i = 0; i < arrayLength; i++) {
                array[i] = (array[i] > 0) ? 0 : 1;
            }
            return;
        }

        //  Задание 2.
//  Задать пустой целочисленный массив размером 8.
//  С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        public static int[] fillArray ( int[] array){
            int length = array.length;
            for (int i = 0; i < length; i++) {
                array[i] = i * 3;
            }
            return;
        }

        //   Задание 3.
//   Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//   пройти по нему циклом, и числа меньшие 6 умножить на 2;
        public static int[] multiplyLess6 ( int[] array){
            int length = array.length;
            int tmp;
            for (int i = 0; i < length; i++) {
                tmp = array[i];
                array[i] = tmp < 6 ? tmp * 2 : tmp;
            }
            return;
        }
        //    Задание 4.
//    Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//    одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        public static int[][] fillDiagonalArray ( int[][] array){
            int length = array.length;
            int firstItem;
            int lastItem;
            int firstArray;
            int lastArray;
            for (int i = 0; i < length; i++) {
                firstItem = i;
                lastItem = length - i - 1;
                firstArray = array[i][firstItem];
                lastArray = array[i][lastItem];
                if (firstArray != 1 && lastArray != 1) {
                    array[i][firstItem] = 1;
                    array[i][lastItem] = 1;
                }
            }
            return;
        }
    }
}
