package lesson_5_HW;

public class Main {
    public static void main(String[] args) {
        Person[] employee = new Person[5];
        employee[0] = new Person("Ivanov Ivan", "Java Developer", "java1@mail.ru", "89279111", 37000, 45);
        employee[1] = new Person("Petrov Petr", "Teamlead QA", "teamdlead@mail.ru", "89279222", 39000, 44);
        employee[2] = new Person("Morozov Kirill", "QA-Engineer", "qa1@mail.ru", "89279333", 38000, 35);
        employee[3] = new Person("Danilov Nik", "Java Developer", "java2@mail.ru", "89279344", 38000, 35);
        employee[4] = new Person("Dmitriev Dima", "QA-Engineer", "qa2@mail.ru", "89279555", 38000, 28);

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() > 40) {
                employee[i].info();
            }
        }
    }
}