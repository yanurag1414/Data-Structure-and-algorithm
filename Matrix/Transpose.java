package Matrix;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        trans(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void trans(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                swap(arr,i,j);
            }
        }
    }
    static void swap(int[][] mat,int a,int b){
        int temp = mat[a][b];
        mat[a][b] = mat[b][a];
        mat[b][a] = temp;
    }
}
