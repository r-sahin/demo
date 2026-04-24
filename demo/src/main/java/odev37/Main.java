package odev37;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT", 70, 30);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 80, 20);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 60, 40);

        Teacher t1 = new Teacher("Hoca 1", "90550000000", "MAT");
        Teacher t2 = new Teacher("Hoca 2", "90550000001", "FZK");
        Teacher t3 = new Teacher("Hoca 3", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Öğrenci 1", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 70,
                60, 90,
                40, 60);
        s1.isPass();

        System.out.println();


        Student s2 = new Student("Öğrenci 2", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 80,
                50,  70,
                40,  90);
        s2.isPass();

        System.out.println();

        Student s3 = new Student("Öğrenci 3", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,  30,
                20,  40,
                40,  50);
        s3.isPass();

    }
}
