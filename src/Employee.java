public class Employee {

        public String name;
        public int id;
        public int age;
        public String position;
        public Department Dep ;




        public  Employee(){
            name="Ahmed Mohamed Ali";
            id=2;
            age=24;
            position="Data Engineer";


        }
        public Employee(String name,int id,int age, String position,Department d){
            this.name=name;
            this.id=id;
            this.age=age;
            this.position=position;
            this.Dep= d;


        }
        public void print_Employee(){
            System.out.println("Employee Name:"+ name);
            System.out.println("Id: "+ id);
            System.out.println("Age :"+ age);
            System.out.println("Position:"+ position);
            System.out.println("Department Name:"+ Dep.dept_name);

        }

    }

