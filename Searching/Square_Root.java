package Searching;

public class Square_Root {
    public static void main(String[] args) {
        System.out.println(sqrt(9));

    }
    static int sqrt(int num){
        int s = 1;
        int end = num;
        int ans = -1;
        while (s<=end){
            int mid = s+(s+end)%2;
            int msqre = mid*mid;
            if(msqre == num){
                return mid;
            } else if (msqre>num) {
                end = mid-1;
            }
            else {

                s = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
