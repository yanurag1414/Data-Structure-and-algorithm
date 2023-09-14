package Stack;


import static Stack.LargestRectAreas.largestArea;

public class maxRectangle {
    public static void main(String[] args) {
        int[][] arr = {
                {1,0,0,1},{1,1,0,0},{1,1,1,1},{1,1,1,1}
        };
        System.out.println(maxRectArea(arr,4,4));

    }
    static int maxRectArea(int[][] arr,int r,int c){
        int res = largestArea(arr[0],c);
        for (int i = 1; i <r ; i++) {
            for (int j = 0; j <c; j++) {
                if(arr[i][j]==1){
                    arr[i][j] += arr[i-1][j];
                }
            }
            res = Math.max(res,largestArea(arr[i],c));

        }
        return res;
    }
}
