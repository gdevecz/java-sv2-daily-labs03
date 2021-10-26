package day02;

import java.util.Arrays;

public class MathematicsMain {

    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();

        int number = 13;
        System.out.println("Is " + number + " prime? " + mathematics.isPrime(number));
        number = 0;
        System.out.println("Is " + number + " prime? " + mathematics.isPrime(number));
        number = 1;
        System.out.println("Is " + number + " prime? " + mathematics.isPrime(number));
        number = -1;
        System.out.println("Is " + number + " prime? " + mathematics.isPrime(number));
        number = -2;
        System.out.println("Is " + number + " prime? " + mathematics.isPrime(number));
        number = 5;
        System.out.println("Is " + number + " prime? " + mathematics.isPrime(number));
        number = 33;
        System.out.println("Is " + number + " prime? " + mathematics.isPrime(number));
        number = -33;
        System.out.println("Is " + number + " prime? " + mathematics.isPrime(number));

        System.out.println("mátrix:");
        int[][] testMatrix = {{1,2,3},{2,3,4},{3,4,5}};
        System.out.println(Arrays.deepToString(testMatrix));
        System.out.println("The matrix is triangular matrix: " + mathematics.isTriangularMatrix(testMatrix));
        System.out.println("The matrix is diagonal matrix: " + mathematics.isDiagonalMatrix(testMatrix));
        testMatrix = new int[][]{{1,2,3},{0,3,4},{0,0,5}};
        System.out.println(Arrays.deepToString(testMatrix));
        System.out.println("The matrix is triangular matrix: " + mathematics.isTriangularMatrix(testMatrix));
        System.out.println("The matrix is diagonal matrix: " + mathematics.isDiagonalMatrix(testMatrix));
        testMatrix = new int[][]{{1,0,0},{0,3,0},{0,0,5}};
        System.out.println(Arrays.deepToString(testMatrix));
        System.out.println("The matrix is triangular matrix: " + mathematics.isTriangularMatrix(testMatrix));
        System.out.println("The matrix is diagonal matrix: " + mathematics.isDiagonalMatrix(testMatrix));
    }
}
