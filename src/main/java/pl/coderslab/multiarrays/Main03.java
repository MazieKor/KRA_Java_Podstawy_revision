package pl.coderslab.multiarrays;

public class Main03 {

    public static void main(String[] args) {
        int[][] task3Array = {{2, 3, 4, 6}, {12, 32, 12, 11}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};

//1st solution:
        int sum = 0;
        for (int i = 0; i < task3Array.length; i++) {
            for (int j = 0; j < task3Array[i].length; j++) {
                sum += task3Array[i][j];
            }
        }
        System.out.println("suma tablicy to " + sum);

//2nd solution:
        int sum2 = 0;
        for (int[] row : task3Array) {
            for (int element : row) {
                sum2 += element;
            }
        }
        System.out.println("2 sposób: suma tablicy to " + sum2);
    }
}