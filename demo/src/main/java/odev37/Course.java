package odev37;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int verbalNote;
    int examPercent;
    int verbalPercent;

    public Course(String name, String code, String prefix, int exaöPercent,int verbalPercent )
    {
        this.name=name;
        this.code = code;
        this.prefix = prefix;
        this.examNote=0;
        this.verbalNote = 0;
        this.examPercent=exaöPercent;
        this.verbalPercent=verbalPercent;
    }

    public double calcNote()
    {
        return (this.examNote* this.examPercent + this.verbalNote* this.verbalPercent) /100.0;
    }

    public void addTeacher(Teacher t)
    {
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("İşlem başarılı!");
        }
        else{
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher()
    {
        if(courseTeacher !=null)
        {
            System.out.println(this.name + " dersinin akademisyeni : " + courseTeacher.name);
        }
        else{
            System.out.println(this.name + " dersine akademisyen atanmamıştır.");
        }
    }

}
