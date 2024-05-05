//Some basic functions of Strings
public class K1 {
    public static void main(String[] args) {
        BasicFnsofStrings();
    }    
    public static void BasicFnsofStrings() {
        String FirstN="Kaustubh";
        String LastN="R Srivastav";
        String FullN=FirstN+" "+LastN;//Concatenation
        System.out.println("My name is "+FullN);
        System.out.println("5th Character of First Name is : "+FirstN.charAt(4));// use of charAt() fn
        //To print all LETTERS of a String:-
        System.out.println("All Letters of First Name are--->");
        for (int i = 0; i <FirstN.length(); i++) {
            System.out.println(FirstN.charAt(i));
        }
    }
}
