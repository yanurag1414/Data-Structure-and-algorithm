class Solution {
    public static void main(String[] args) {
        
    }
    public int minMovesToSeat(int[] seats, int[] students) {
        int csum=0;
        int ssum=0;
        for(int i=0;i<seats.length;i++){
            csum=seats[i];
        }for(int j=0;j<students.length;j++){
            ssum+=students[j];
        }
        return Math.abs(csum-ssum);
    }
}