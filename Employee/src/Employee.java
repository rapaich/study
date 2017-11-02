public class Employee {
    String name;
    int age;
    String position;
    double salary;
    /**
     * Это конструктор класса Employee
     */
    public Employee (String name) {
        this.name = name;
    }
    /**
     * Присвоение возраста работника переменной age
     */
    public void empAge(int empAge) {
        age = empAge;
    }
    /**
     * Присвоение должности работника переменной position
     */
    public void empPosition(String empPosition) {
        position = empPosition;
    }
    /*
     * Присвоение зарплаты переменной salary
     */
    public void empSalary(double empSalary) {
        salary = empSalary;
    }
    /*
     * Вывод информации о сотрудниках
     */
    public void printEmployeeInfo() {
        System.out.println("Имя сотрудника: " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Должность: " + position);
        System.out.println("Зарплата: " + salary + " рублей");
    }
}
