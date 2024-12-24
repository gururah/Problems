// import java.util.Scanner;

public class Matrix90dRotation {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int len = matrix[0].length;
        System.out.println(len);
        System.out.println("Rotate the Matrix:");
        Rotate(matrix, len);
        display(matrix, len);
        System.out.println("Reverse the Matrix:");
        Reverse(matrix, len);
        display(matrix, len);
    }

    static int[][] Rotate(int matrix[][], int len) {
        int i, j, temp;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    static int[][] Reverse(int matrix[][], int len) {
        int i, temp;
        for (i = 0; i < len; i++) {
            len = 3;
            while (i < len) {
                temp = matrix[i][len - 1];
                matrix[i][len - 1] = matrix[i][i];
                matrix[i][i] = temp;
                len--;
                i++;
            }
        }
        return matrix;
    }

    static void display(int matrix[][], int len) {
        for (int k = 0; k < len; k++) {
            for (int l = 0; l < len; l++) {
                System.out.print(matrix[k][l] + " ");
            }
            System.out.println("");
        }
    }
}