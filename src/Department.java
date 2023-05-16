import java.util.ArrayList;
import java.util.List;

public class Department {
    public String dept_name;
    List<Employee> employees=new ArrayList<>();



        public Department(){
            dept_name="Software Engineering";
            //List<Employee> employees = new ArrayList<>();


        }
        public  Department(String dept_name, List<Employee> employees){
            this.dept_name=dept_name;
            this.employees =employees;

        }
        public void print_Department_Data(){
            System.out.println("Department Name:"+ dept_name);
            for(Employee employee: employees) {
                employee.print_Employee();
            }
        }
        public void add_Employee(String name,int id,int age, String position,Department d){
            Employee emp = new Employee();
            emp.name=name;
            emp.id=id;
            emp.position=position;
            emp.Dep=d;
            employees.add(emp);
            System.out.println("Adding new Employee Successfully");
        }
        public void del_Employee(int index){
            employees.remove( index);
            System.out.println("Removing an Employee Successfully");
        }}


