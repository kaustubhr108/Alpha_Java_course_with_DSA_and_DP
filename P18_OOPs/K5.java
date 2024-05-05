//Shallow and Deep Copy
public class K5 {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="KingSlayer";
        s1.roll=82;
        s1.password="abcde123@";
        s1.marks[0]=80;
        s1.marks[1]=90;
        s1.marks[2]=100;

        Student s2=new Student(s1);//copy
        s1.marks[2]=75;
        s2.password="xyz";//assigning new password

        for (int i = 0; i < 3; i++) {
                System.out.println(s2.marks[i]);
        }
}
}


class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student(){
        marks=new int[3];
        System.out.println("Ctor is called");
    }

    // Student(Student s1){ //Shallow Copy Ctor
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    //     System.out.println("Copy Ctor Called");
    // }
    Student (Student s1){
             marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }

}
