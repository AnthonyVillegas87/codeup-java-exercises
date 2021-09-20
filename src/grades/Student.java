package grades;

import java.util.ArrayList;

public class Student {
    private String name;
     ArrayList<Integer>grades;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String studentsName) {
        this.name = studentsName;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double gradeAv = 0;
        for(int i = 0; i < grades.size(); i++){
            gradeAv += grades.get(i);
        }
        return gradeAv/grades.size();

    }


    public static void main(String[] args) {

        Student myClass = new Student("Noah");
        myClass.addGrade(45);
        myClass.addGrade(60);
        myClass.addGrade(70);
        myClass.addGrade(75);
        myClass.addGrade(65);
        System.out.println(myClass.getGradeAverage());

    }



}
