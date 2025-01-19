public class K1 {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.setTip(0.5);
    }
}

class Pen{
    String color;
    double tip;
    
    void setColor(String newColor){
        color=newColor;
    }

    void setTip(double newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercent(float phy,float chem,float maths){
        percentage=((phy+chem+maths)/3)*100;
    }
}