public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void introduce() {
        System.out.println("Hi, I am " + name + ", age " + age + ", grade " + grade + ".");
    }
}