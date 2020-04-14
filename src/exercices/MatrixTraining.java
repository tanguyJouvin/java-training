import java.util.ArrayList;
import java.util.List;

public class MatrixTraining {

    /**
     * @param lines   height of the matrix, eg: 3
     * @param columns width of the matrix, eg: 2
     * @return an empty int matrix of lines and columns size,
     * eg: {{0, 0}, {0, 0}, {0, 0}}
     */
    public int[][] emptyIntMatrix(int lines, int columns) {
        int [][] arr = new int[lines][columns];
        return arr;
    }

    /**
     * @param lines   height of the matrix, eg: 2
     * @param columns width of the matrix, eg: 3
     * @return an empty string matrix of lines and columns size,
     * eg: {{null, null, null}, {null, null, null}}
     */
    public String[][] emptyStringMatrix(int lines, int columns) {
        String [][] arr = new String[lines][columns];
        return arr;
    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return an int matrix with a, b and c arrays
     */
    public int[][] intMatrix(int[] a, int[] b, int[] c) {
        int[][] result = new int[a.length + b.length][];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        int[][] result1 = new int[result.length + c.length][];
        System.arraycopy(result, 0, result, 0, result.length);
        System.arraycopy(c, 0, result, result.length, c.length);
        return result1;
    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return a String matrix with a, b and c arrays
     */
    public String[][] stringMatrix(String[] a, String[] b, String[] c) {
        String[][] result = new String[a.length + b.length][];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        String[][] result1 = new String[result.length + c.length][];
        System.arraycopy(result, 0, result, 0, result.length);
        System.arraycopy(c, 0, result, result.length, c.length);
        return result1;
    }

    /**
     * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix lines, eg: 3
     */
    public int height(int[][] matrix) {
                return matrix.length;
    }

    /**
     * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix columns, eg: 2
     */
    public int width(int[][] matrix) {

        return matrix[0].length;
    }

    /**
     * @param matrix, eg: {{3, 4, 5}, {6, 7, 8}}
     * @param line,   eg: 1
     * @param column, eg: 0
     * @return value in matrix at line and column, eg: 6
     */
    public int valueAtPosition(int[][] matrix, int line, int column) {

        return matrix[line][column];
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {8, 5, 6}}
     * @param value,  eg: 4
     * @param line,   eg: 1
     * @param column, eg: 0
     * @return the matrix with the value replaced at line and column,
     * eg: {{1, 2, 3}, {4, 5, 6}}
     */
    public int[][] replace(int[][] matrix, int value, int line, int column) {
        matrix[line][column] = value;
        return matrix;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @return sum of matrix values, eg: 21
     */
    public int sum(int[][] matrix) {
        int perTotal = 0;
        // top and bottom row
        for (int i = 0; i < matrix[0].length; i++)
            perTotal += matrix[0][i] + matrix[matrix[0].length-1][i];
        // left and right column
        for (int j = 1; j < matrix.length-1; j++)
            perTotal += matrix[j][0] + matrix[j][matrix[0].length-1];
        return perTotal;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @param search, eg: 5
     * @return if matrix contains searched value, eg: true
     */
    public boolean contains(int[][] matrix, int search) {
       for( int i = 0; i < matrix.length; i++){
           for( int j = 0; j < matrix.length; j++){
               int value = matrix[i][j];
               if(search == value){
                   return true;
               }
           }
       }
        return false;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @return how many even numbers are in matrix, eg: 3
     */
    public int countEvens(int[][] matrix) {
        int count = 0;
        for( int i = 0; i < matrix.length; i++){
            for( int j = 0; j < matrix.length; j++){
                int value = matrix[i][j];
                if(value % 2 == 0){
                   count += 1;
                }
            }
        }
         return count;
    }

    /**
     * @param matrix, eg: {{'d', 'b', 'a'}, {'a', 'd', 'a'}}
     * @param search, eg: 'a'
     * @return the number of character occurrences in matrix, eg: 3
     */
    public int occurrences(char[][] matrix, char search) {
        int count = 0;
        for( int i = 0; i < matrix.length + 1; i++){
            for( int j = 0; j < matrix.length; j++){
                int value = matrix[i][j];
                if(value  == search){
                   count += 1;
                }
            }
        }
         return count;
    }
}
