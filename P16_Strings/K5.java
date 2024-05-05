public class K5 {
    public static void main(String[] args) {
        String fruits[]={"mangox","mangoy","mangoz","zbanana","Zbanana"};
        String large=fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if(large.compareTo(fruits[i])<0){
                large=fruits[i];
            }
        }
        System.out.println("Largest String Lexicographically:-"+large);
    }    
}
