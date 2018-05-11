import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
    private String firstname;
    private String lastname;
    private int age;
    private int salary;
    private String gender;

    public Employee(String firstname, String lastname, int age, int salary, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return age == employee.age &&
//                salary == employee.salary &&
//                Objects.equals(firstname, employee.firstname) &&
//                Objects.equals(lastname, employee.lastname);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(firstname, lastname, age, salary);
//    }
}
