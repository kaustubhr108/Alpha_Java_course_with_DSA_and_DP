public class BintoDec {
    public static void main(String[] args) {
        int binNo=111;
        int pow=0;int decNo=0;
        while(binNo>0)
        {
            int ld=binNo%10;
            decNo+=ld*(Math.pow(2, pow));
            pow++;
            binNo/=10;
        }
        System.out.println("Converted No="+decNo);
        
    }
}
