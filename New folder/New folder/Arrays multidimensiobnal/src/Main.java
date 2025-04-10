import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[][] arr= new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
        //another way to represent arrays
        int[][] num= {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(num));
    }
}
