//Trapping Rainwater Program
public class K9 {
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int lmb[] = new int[height.length]; // left max boundaries [AUXILIARY ARRAY]
        int rmb[] = new int[height.length]; // right max boundaries [AUXILIARY ARRAY]

        // calculation of left max boundaries
        lmb[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            lmb[i] = Math.max(height[i], lmb[i - 1]);
        }
        // calculation of right max boundaries
        rmb[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rmb[i] = Math.max(height[i], rmb[i + 1]);
        }
        /*
         * Water Level=MIN(lmb,rmb)
         * Trapped Water=(Water Level-height)*width
         */
        int TrappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int WtrLvl = Math.min(lmb[i], rmb[i]);
            TrappedWater += WtrLvl - height[i];
        }
        System.out.println("Total Water Trapped=" + TrappedWater);
    }
}
