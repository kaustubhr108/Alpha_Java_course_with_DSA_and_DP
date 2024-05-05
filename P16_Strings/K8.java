/* String Compresssion
   aaabbcccdd --->  a3b2c3d2
   aaaabbbdd  --->  a4b3d2
   abc        ---> abc but not a1b1c1 (De-Compression) */ 
public class K8 {
    
    public static String compress(String str) {
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            Integer count=1;//bec we need to append this to the string later, so its better to declare as an object here only
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1) {newStr+=count.toString();}
        }
        return newStr;
    }
    
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(compress(str));
    }
}