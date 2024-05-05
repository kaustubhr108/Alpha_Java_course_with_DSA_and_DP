public class DectoBin{
    public static void main(String[] args) {
        int pow=0, binNo=0,decNo=11;
        while(decNo>0)
        {   int rem=decNo%2;
            binNo+=rem*(Math.pow(10, pow));
            pow++;decNo/=2;
        }
        System.out.println("Converted no="+binNo);
    }
}