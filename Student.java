class Student {
    String name;
    String surname;
    String address;
    int id;

    public Student(String name, String surname, String address, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString() {
        return "name:" + name + " surname:" + surname + " address:" + address + " id:" + id;
    }

    public static void main(String[] args) {
        Student obj = new Student("Алиса", "Смит", "Коктем-2", 24);
        Student obj2 = new Student("Азамат", "Иванов", "Алмалы", 25);
        Student obj3 = new Student("Кристина", "Петрова", "Самал-1", 26);

        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
