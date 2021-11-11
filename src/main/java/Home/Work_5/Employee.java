package Home.Work_5;


public class Employee {
    private String fullName;
    private  String position;
    private  String email;
    private  String telephone;
    private  int salary;
    private  int age;

    public Employee(String fullName, String position, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.telephone = telephone;
        this.age = age;

    }

    public  void printPerson() {
        System.out.printf("\nFull Name: %s \n Position: %s \n Email: %s\n Telephone: %s\n Salary: %d \n Age: %d",
                fullName,
                position,
                email,
                telephone,
                salary,
                age);
    }


    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] =new Employee("Венидикт Петрович Жмых","Junior developer","jk@mial.ru","89251234565",1500,23);
        persArray[1] =new Employee("Павел Андреевич Мутатор","Middle developer","vip_kaka@mial.ru","8991424565",2000,41);
        persArray[2] =new Employee("Пётр Андреевич Мат","Middle developer","mat@mial.ru","89351234265",2000,31);
        persArray[3] =new Employee("Давлат Кринжрович Кодов","Architect","godcod@mial.ru","8924666666",3000,55);
        persArray[4] =new Employee("Тимофей Сергеевич Кряк","Уборщик","looms@mial.ru","89251234565",500,18);
        for (int i=0; i < persArray.length; i++){
            if (persArray[i].age > 40) persArray[i].printPerson();
        }

    }

}


