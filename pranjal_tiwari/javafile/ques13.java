// package pranjal_tiwari.javafile;
import java.util.Scanner;

class Student {
    String name;
    long rollNo;

    void getData(String name, long rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Exam extends Student {
    int exam_marks;

    void getData(String name, long rollNo, int exam_marks) {
        super.getData(name, rollNo);
        this.exam_marks = exam_marks;
    }
}

interface Sports {
    int marks = 10;
}

class Result extends Exam implements Sports {
    int resultExam() {
        return marks + exam_marks;
    }

    void getData(String Name, long rollNo, int Exam_Marks) {
        super.getData(name, rollNo, exam_marks);
    }

}

public class ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result res = new Result();
        String name = sc.next();
        int rollNo = sc.nextInt();
        int exam_marks = sc.nextInt();       
        res.getData(name, rollNo, exam_marks);
        System.out.println(res.resultExam());
        sc.close();
    }
}


