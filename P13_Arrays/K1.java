//Arrays are passed by Reference in Java (The value of the array in the main fn changes when passed to another fn)
class K1 {
    public static void update(int k[], int c) {
        for (int i = 0; i < k.length; i++) {
            k[i] += 1;
            c = 10;
        }
    }

    public static void main(String[] args) {
        int k[] = { 12, 13, 14 };// value gets changed here (passed by reference)
        int c = 5;// value remains same (passed by value)
        update(k, c);
        System.out.println("New Values of Array--->");
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + " ");
        }
        System.out.println();
        System.out.println("The Variable value remains same, ie, " + c);
    }
}