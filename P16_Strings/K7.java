/* Convert first letter of each word to UPPERCASE
   hi, i am kaustubh ---->  Hi, I Am Kaustubh */
public class K7 {

    public static String toUpperCase(String str) {
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i <str.length(); i++) {
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                ch=Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else sb.append(str.charAt(i));
        }
       return sb.toString();
    }
    
    public static void main(String[] args) {
        String s1="hi, i am kaustubh";
        System.out.println((toUpperCase(s1)));
        }
    }    
