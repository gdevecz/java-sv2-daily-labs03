package day02;

public class Mathematics {

    public boolean isDiagonalMatrix(int matrix[][]) {

        if (matrix.length != matrix[0].length) {
            return false;
        }
        for (int i = 0; i <= matrix.length; i ++) {
            for ( int j = 0; j <= matrix.length; j++) {
                if(i != j && matrix[i][j] != 0);
            }
        }
        return true;
    }

    public int[][] transposedMatrix(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    public boolean isTriangleMatrix(int matrix[][]) {
        if (matrix.length != matrix[0].length) {
            return false;
        }
        for (int i = 1; i <= matrix.length; i ++) {
            for ( int j = 0; j < i; j++) {
                if(matrix[i][j] != 0);
                return false;
            }
        }
        return true;
    }

    public boolean isPrime(int number) {

        if (number < 0) {
            number *= -1;
        }
        if (number == 2) {
            return true;
        }
        if (number <= 1 || number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number) / 2; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
