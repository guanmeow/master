package fju.edu.stu;

public class GraduateStudent extends Student implements Mailer{
    int theory ;
    public GraduateStudent(String id, String name, int english, int math, int theory) {
        super(id,name,english,math);
        this.theory = theory;
    }

    @Override
    public void mail() {
        System.out.print("your grade is ");
    }

    @Override
    public void print() {
        System.out.println(id + "\t" + name + "\t" + english + "\t" + math + "\t" + theory + "\t" + (english+math+theory)/3 );
    }
}
