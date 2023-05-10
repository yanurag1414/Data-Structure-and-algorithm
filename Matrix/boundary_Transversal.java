package Matrix;

public class boundary_Transversal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        boundary(arr);
    }
    static void boundary(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            if(i <= arr.length-1 && i != 0){
                System.out.print(arr[i][arr[i].length-1]+" ");
            }else{
                for (int j = arr[i].length-1; j >= 0; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }

        }
    }
}
