//Remove Duplicates in a String using RECURSION {characters must range from 'a' to 'z'}
public class K14 {
    public static void main(String[] args) {
        String str="appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void removeDuplicates(String str,int idx, StringBuilder newStr,boolean map[]) {
        if(idx==str.length()){ //Base Case
            System.out.println("New String :- "+newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            //its duplicate, so call the next index then
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
}