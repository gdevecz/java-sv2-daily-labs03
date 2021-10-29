package Day05;

public class JournalMain {

    public static void main(String[] args) {

        Journal journal = new Journal();

        System.out.println(journal.addStudent("kovacs"));
        System.out.println(journal.addStudent("kovacs istván"));
        System.out.println(journal.addStudent("kovacs elemér"));


        System.out.println(journal.students.size());

    }
}
