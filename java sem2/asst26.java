import java.util.Scanner;

public class asst26 {

    static void inputMat(int[][] matrix, Scanner sc){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i< rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.println("Enter element [" + i + "]["+j+"]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    static void displayMat(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i< rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.println(matrix[i][j]+"\t");
            }
            System.out.println();
        }       
    }

    static int[][] addMats(int[][] A, int[][] B){
        int rows = A.length;
        int cols = A[0].length;

        int[][] res = new int[rows][cols];

        for (int i = 0; i< rows; i++){
            for(int j = 0; j<cols; j++){
                res[i][j] = A[i][j] + B[i][j];
            }
        }
        return res; 
    }

    static int[][] transposeMat(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

         int[][] transpose = new int[cols][rows];

        for (int i = 0; i< rows; i++){
            for(int j = 0; j<cols; j++){
                transpose[i][j] = matrix[i][j];
            }
        }
        return transpose; 
    }

    static int diSum(int[][] matrix){
        int sum = 0;

        for(int i = 0; i<matrix.length;i++){
            sum += matrix[i][i];
        }
        return sum;
 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
    }
}