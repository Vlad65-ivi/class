public class Main {
    public static void main(String[] args) {
        Group group1 = new Group(1);
        Group group2 = new Group(2);
        Group group3 = new Group(3);

        Student student1 = new Student("Иван","Зуев",19 );
        Student student2 = new Student("Мария","Салтыкова",20 );
        Student student3 = new Student("Алексей","Смирнов",20 );
        Student student4 = new Student("Виктория","Кальцева",20 );
        Student student5 = new Student("Назар","Бекназаров",21 );
        Student student6 = new Student("Алексей","Ушитский",20 );
        Student student7 = new Student("Сергей","Мартынов",20 );
        Student student8 = new Student("Левик","Левицкий",19 );
        Student student9 = new Student("Влад","Серов",25 );
        Student student10 = new Student("Вадим","Горшков",23 );

        group1.addstudent(student1);
        group1.addstudent(student2);
        group1.addstudent(student3);
        group1.addstudent(student4);

        group2.addstudent(student5);
        group2.addstudent(student6);
        group2.addstudent(student7);

        group3.addstudent(student8);
        group3.addstudent(student9);
        group3.addstudent(student10);

        group1.printStudents();
        group2.printStudents();
        group3.printStudents();
    }
}