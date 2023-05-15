public class Principallab {
    public static void main(String[] args) {
        LabClass lc01 = new LabClass(10);
        LabClass lc02 = new LabClass(5);

        Student s01 = new Student("Nome01","Id01");
        Student s02 = new Student("Nome02","Id02");
        Student s03 = new Student("Nome03","Id03");
        Student s04 = new Student("Nome04","Id04");
        Student s05 = new Student("Nome05","Id05");
        Student s06 = new Student("Nome06","Id06");
        Student s07 = new Student("Nome07","Id07");
        Student s08 = new Student("Nome08","Id08");
        Student s09 = new Student("Nome09","Id09");
        Student s10 = new Student("Nome10","Id10");

        lc01.setRoom("Laboratório 01");
        lc01.setInstructor("Professor");
        lc01.setTime("35T34");
        lc01.enrollStudent( s01 );
        lc01.enrollStudent( s02 );
        lc01.enrollStudent( s03 );
        lc01.enrollStudent( s04 );
        lc01.enrollStudent( s05 );
        lc01.enrollStudent( s06 );
        lc01.enrollStudent( s07 );
        lc01.enrollStudent( s08 );
        lc01.enrollStudent( s09 );
        lc01.enrollStudent( s10 );

        lc02.enrollStudent(new Student("Nome11","Id11"));
        lc02.enrollStudent(new Student("Nome12","Id12"));
        lc02.enrollStudent(new Student("Nome13","Id13"));
        lc02.enrollStudent(new Student("Nome14","Id14"));
        lc02.enrollStudent(new Student("Nome15","Id15"));

        lc01.printList();
        lc02.printList();

    }
}
