import java.util.ArrayList;

public class Group {
    int number;
    ArrayList<Student> students;

    public Group(int number){
        this.number = number;
        students = new ArrayList<>();
    }

    public void addstudent(Student student){
        if(students.size() == 20) return;

        students.add(student);
        System.out.println("Студент " + student.getName() + " " + student.getSurname() + " присоединился к группе " + number);
    }

    public void printStudents(){
        System.out.println("Студенты в группе" + number + ":");
        for(Student student : students){
            System.out.println(student.getName() + " " + student.getSurname() + " Возраст: " + student.getAge());
        }
    }





}
