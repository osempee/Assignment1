public class Student {
    private String name;
    private int age;
    private String course;
    private String  department;
    private char grade;

    public Student(String name, int age, String course, String department, char grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.department = department;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getDepartment() {
        return department;
    }

    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
