//Default and Parameterized Constructors
public class K3 {
    public static void main(String args[]){
        Student s1=new Student();
        System.out.println(s1.name);
        Student s2=new Student("Slayer");
        System.out.println(s2.name);
    }
}



class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Default Parameterized C-Tor is called");
        this.name="King";
    }

    Student(String name){
        System.out.println("Parameterized C-Tor is called");
        this.name=name;
    }
}