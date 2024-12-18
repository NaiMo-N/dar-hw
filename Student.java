    public class Student {
    String name;
    int id;
    int yearOfStudy;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public void addYear() {
        yearOfStudy++;
    }

    public static void main(String[] args) {
        Student s = new Student("Nurasyl", 0517);
        System.out.println("Name: " + s.getName());
        System.out.println("Id: " + s.getId());
        System.out.println("Year of study: " + s.getYearOfStudy());

        s.addYear();
        System.out.println("After adding year: " + s.getYearOfStudy());

    }
}
