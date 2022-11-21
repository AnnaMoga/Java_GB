package lesson_5_HW;

public class Person {
    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Person(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя пользователя: " + name + "; Должность: " + position + "; Возраст: " + age +
                "; Номер телефона: " + number + "; Почта: " + email + "; Зарплата: " + salary);
    }
}
