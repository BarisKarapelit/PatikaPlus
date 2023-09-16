package Java101;

import java.util.Scanner;

public class ProgramToCalculateGradePointAverage {
    public static int mat, fizik, kimya, turkce, tarih, muzik;
    public static Scanner inp = new Scanner(System.in);
    public static DynamicCentering dynamicCentering = new DynamicCentering();

    public static void main(String[] args) {
        dynamicCentering.setCenteringPage("Not Ortalaması Hesaplama");
        mat =printCourseNameAndSetCourseVaule("Matematik");
        fizik=printCourseNameAndSetCourseVaule("Fizik");
        kimya= printCourseNameAndSetCourseVaule("Kimya");
        turkce=printCourseNameAndSetCourseVaule("Türkçe");
        tarih=printCourseNameAndSetCourseVaule("Tarih");
        muzik=printCourseNameAndSetCourseVaule("Müzik");
        int sum = mat+fizik+kimya+turkce+tarih+muzik;
        double result = sum/6.0;
        System.out.println("Ortalamanız"+result);
        System.out.println(result>=60.0?"Geçti":"Kaldı");
    }

    private static int printCourseNameAndSetCourseVaule(String courseName) {
        System.out.print(courseName+" Notunuz :");
        return inp.nextInt();
    }
}
