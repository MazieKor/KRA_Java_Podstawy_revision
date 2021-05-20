package pl.coderslab.multiarrays;

public class Main04 {

    public static void main(String[] args) {

//2 solutions:
        int[][] task4Array = {{2, 3, 4, 6}, {12, 32, 12, 11}, {3, 2, 1, 4}, {5, 1, 6, 7}};

//1st solution:
        int sum = 0;
        for (int i = 0; i < task4Array.length; i++) {
            for (int j = 0; j < task4Array[i].length; j++) {
                if (i == j) {
                    sum += task4Array[i][j];
                    break;
                }
            }
        }
        System.out.println("Slad macierzy to: " + sum);

//2nd solution:
        int sum2 = 0;
        int counter = 0;
        for(int[] row : task4Array){
            int counter2 = 0;
            for(int value : row){
                if(counter==counter2){
                    sum2 = sum2 + value;
                    break;
                }
            counter2++;
            }
        counter++;
        }
        System.out.print("2 sposob: Slad macierzy to: " + sum2);
    }
}