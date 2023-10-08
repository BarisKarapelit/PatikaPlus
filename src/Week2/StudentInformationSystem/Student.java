package Week2.StudentInformationSystem;

public class Student {
    String name;
    int stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    Student(String name, int stuNo, String classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    void addBulkExamNote (int matNote, int fizikNote, int kimyaNote) {
        if (matNote >= 0 && matNote <= 100) {
            mat.note = matNote;
        }
        if (fizikNote >= 0 && fizikNote <= 100) {
            fizik.note = fizikNote;
        }
        if (kimyaNote >= 0 && kimyaNote <= 100) {
            kimya.note = kimyaNote;
        }
    }
    void printNote() {
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik Notu: " + this.mat.note);
        System.out.println("Fizik Notu: " + this.fizik.note);
        System.out.println("Kimya Notu: " + this.kimya.note);
    }
    void isPass(){
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3.0;
        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçti");
            this.isPass = true;
        }
        else {
            System.out.println("Sınıfta Kaldı");
            this.isPass = false;
        }
        printNote();
    }



}
