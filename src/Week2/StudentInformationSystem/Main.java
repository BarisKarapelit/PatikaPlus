package Week2.StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "0532 532 32 32", "MAT");
        Teacher t2 = new Teacher("Ahmet Hoca", "0532 532 32 32", "FZK");
        Teacher t3 = new Teacher("Kemal Hoca", "0532 532 32 32", "KMY");


        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "4A", mat, fizik, kimya);
        s1.addBulkExamNote (50, 60, 70);
        s1.isPass();

    }
}
