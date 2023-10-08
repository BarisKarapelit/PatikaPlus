package Week2.StudentInformationSystem;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;

    }

    void printTeacher() {
        this.teacher.print();
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }

    }
}
