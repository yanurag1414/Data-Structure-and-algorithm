package Matrix;

public class RotateBy90 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void rotate(int[][] arr){
        int n =arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                swap(arr,i,j);
            }

        }
        for (int i = 0; i < n; i++) {
            int low = 0;
            int hingh = n-1;
            while (low<hingh){
                int temp = arr[low][i];
                arr[low][i] = arr[hingh][i];
                arr[hingh][i] = temp;
                low++;
                hingh--;
            }
        }
    }

    static void swap(int[][] arr,int i,int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}
