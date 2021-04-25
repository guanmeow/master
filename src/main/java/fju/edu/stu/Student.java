package fju.edu.stu;

public abstract class Student implements Mailer {
    String id;
    String name;
    int english;
    int math;

    public Student() {
        super();
    }

    public Student(String id, String name, int english, int math) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print() {
        System.out.println(id + "\t" + name + "\t" + english + "\t" + math + "\t" + (english+math)/2 );
    }

    @Override
    public void mail() {
        System.out.print("your grade is ");
    }
}
