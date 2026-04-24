package odev37;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
        calcAverage();
    }

    public void addBulkExamNote(int matExam, int matVerbal, int fizikExam, int fizikVerbal, int kimyaExam, int kimyaVerbal) {
        if (matExam >= 0 && matExam <= 100) this.mat.examNote = matExam;
        if (matVerbal >= 0 && matVerbal <= 100) this.mat.verbalNote = matVerbal;

        if (fizikExam >= 0 && fizikExam <= 100) this.fizik.examNote = fizikExam;
        if (fizikVerbal >= 0 && fizikVerbal <= 100) this.fizik.verbalNote = fizikVerbal;

        if (kimyaExam >= 0 && kimyaExam <= 100) this.kimya.examNote = kimyaExam;
        if (kimyaVerbal >= 0 && kimyaVerbal <= 100) this.kimya.verbalNote = kimyaVerbal;
    }

    public void calcAverage() {
        double matNote = this.mat.calcNote();
        double fizikNote = this.fizik.calcNote();
        double kimyaNote = this.kimya.calcNote();
        this.average = (matNote + fizikNote + kimyaNote) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void isPass() {
        if (this.mat.examNote == 0 || this.mat.verbalNote == 0 ||
                this.fizik.examNote == 0 || this.fizik.verbalNote == 0 ||
                this.kimya.examNote == 0 || this.kimya.verbalNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu (Sınav) : " + this.mat.examNote);
        System.out.println("Matematik Sözlü Notu : " + this.mat.verbalNote);
        System.out.println("Matematik Ortalaması : " + this.mat.calcNote());
        System.out.println("Fizik Notu (Sınav) : " + this.fizik.examNote);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.verbalNote);
        System.out.println("Fizik Ortalaması : " + this.fizik.calcNote());
        System.out.println("Kimya Notu (Sınav) : " + this.kimya.examNote);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.verbalNote);
        System.out.println("Kimya Ortalaması : " + this.kimya.calcNote());
    }


}
