package day01;

public class School {

    public static void main(String[] args) {

        Students students = new Students();
        students.addHeight(176);
        students.addHeight(180);
        System.out.println(students.isHeightsIncreasing());
        students.addHeight((160));
        System.out.println(students.isHeightsIncreasing());
    }
}
