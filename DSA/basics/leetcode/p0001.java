package basics.leetcode;
// https://leetcode.com/problems/richest-customer-wealth/description/



public class p0001 {
    public static void main(String[] args){
        int[][] data = Utility.get2DArray();
        int max = maxWealth(data);
        System.out.print("\n max wealth is : " + max);
    }

    static int  maxWealth(int[][] array){
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < array.length ; person++) {
            int sum = 0;
            for (int account = 0; account < array[person].length ; account++) {
                sum  = sum + array[person][account];
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}
