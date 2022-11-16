package top.yxtong.java.basic.array;
/**
 * @description:二维数组的打印、求最小值、转置
 * @author:yxtong
 * @date:2022-11-16
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] array= {{1,2,3},{4,5,6}};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }System.out.print("\n");
        }
        output(array);
        trans(array);
    }
    public static void output(int[][]a){
        int min=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if (min > a[i][j]) {
                    min=a[i][j];

                }
            }
        }System.out.println("最小值："+min);

    }
    public static int[][] trans(int[][]a){
        int [][] b= new int[a[0].length][a.length];
        for(int i =0;i<a[0].length;i++){
            for(int j =0;j<a.length;j++){
                b[i][j]=a[j][i];
                System.out.print(b[i][j]+" ");

            }System.out.print("\n");
        }

        return b;
    }
}
