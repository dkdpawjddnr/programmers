import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int AN = sc.nextInt();
        int AM = sc.nextInt();
        int[][] A = readMatrix(sc, AN, AM);
        
        int BM = sc.nextInt();
        int BK = sc.nextInt();
        int[][] B = readMatrix(sc, BM, BK);
        
        int[][] result = multiplyMatrices(A, B);
        
        printMatrix(result);
    }
    
    private static int[][] readMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    
    private static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int AN = A.length;
        int AM = A[0].length;
        int BM = B.length;
        int BK = B[0].length;
        
        int[][] result = new int[AN][BK];
        
        for (int i = 0; i < AN; i++) {
            for (int j = 0; j < BK; j++) {
                for (int k = 0; k < AM; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        return result;
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}