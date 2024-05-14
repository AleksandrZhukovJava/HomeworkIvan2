import exception.VanyaPrivetException;

public class Main {
    public static void main(String[] args) {
    int[][] a = {{5, 6, 7, 8}, {1, 2, 3}, {12, 3, 4, 5, 6}, {2, 5, 6, 8}, {99, 1}};
    }

    private static void print(){
        //распечатать массив
    }

    private static void print2(){
        //распечатать массив но внутренние массивы задом наперед
    }

    private static void print4(){
        //распечатать массив задом наперед но только внешний
    }

    private static void sort(){
        //отсортировать все массивы внутри
    }

    private static void sort2(){
        //отсортировать каждый второй массив внутри
    }

    private static void newArray(int a, int b){
        int[][] newArray = new int[a][b];

        //заполнить массив числами по порядку
    }

    private static void newArray2(int a, int b){
        int[][] newArray = new int[a][b];

        //заполнить массив числами в квадрате
    }

    private static void newArray3(int a, int b){
        int[][] newArray = new int[a][b];

        //заполнить только каждый второй массив
    }

    private static void newArray4(int a, int b){
        if (a % 2 == 0 || b % 2 == 0){
            throw new VanyaPrivetException();
        }
        int[][] newArray = new int[a][b];

       //заполнить массив в виде плюса плюсиками

    }
}
