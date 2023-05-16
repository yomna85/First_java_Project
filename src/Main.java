import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Employee> employees_Dept1 =new ArrayList<>();
        List<Employee> employees_Dept2 =new ArrayList<>();
        Department a = new Department("Software Engineering Department",employees_Dept1);
        Department b = new Department("Big Data Department ",employees_Dept2);
        employees_Dept1.add(new Employee("Yomna Mohamed", 1,24,"Software Engineer",a));
        employees_Dept1.add(new Employee("Mohamed Aly", 2, 30, "Algorithm Engineer",a));
        employees_Dept2.add(new Employee("Asmaa salah", 3, 28, " Big Data Engineer", b));
        employees_Dept2.add(new Employee("Sara Ahmed", 4, 22, "Data engineer", b));
       // a.print_Department_Data();


        a.add_Employee("john",10,40,"dotnet developer",a);
        for(Employee employee: employees_Dept1) {
            employee.print_Employee();
        }
        
        a.del_Employee(2);
        for(Employee employee: employees_Dept1) {
            employee.print_Employee();
        }
        }
    }
