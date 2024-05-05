public class CallValRef {

    public static void CallByVal(int a,int b){
        
        //swap
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    
}
/*Java has no concept of Call by Reference*/