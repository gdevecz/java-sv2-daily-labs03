package day02;

public class MathematicsMain {

    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();

        System.out.println(mathematics.isPrime(7));
        System.out.println(mathematics.isPrime(-3));
        System.out.println(mathematics.isPrime(-8));
        System.out.println(mathematics.isPrime(3));
        System.out.println(mathematics.isPrime(8));


    }
}
