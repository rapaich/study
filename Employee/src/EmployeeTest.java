public class EmployeeTest {

    public static void main(String[] args) {
        /*
         * Создадим 2 объекта при помощи конструктора
         */
        Employee empOne = new Employee("Ребров Олег");
        Employee empTwo = new Employee("Гришечкин Лаврений");
        /*
         * Вызов методов для каждого объекта
         */
        empOne.empAge(40);
        empOne.empPosition("Монтажник Разбегаево-Райккузи");
        empOne.empSalary(30000.00);
        empOne.printEmployeeInfo();

        empTwo.empAge(35);
        empTwo.empPosition("Монтажник всех направлений");
        empTwo.empSalary(40000);
        empTwo.printEmployeeInfo();
    }
}
