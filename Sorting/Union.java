package Sorting;

public class Union {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4};
        int[] b = {2,3,4,4,5};
        unionOfArray(a,b);

    }
    static void unionOfArray(int[] a,int[] b){
        int n1 = a.length;;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        while (i<n1 && j<n2){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if (j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else if (a[i]>b[j]) {
                System.out.print(b[j]+" ");
            }
            else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while (i<n1){
            if(i==0 || a[i] != a[i-1]) {
                System.out.print(a[i] + " ");
                i++;
            }
        }
        while (j<n2){
            if(j==0 || b[j] != b[j-1]) {
                System.out.print(b[j] + " ");
                j++;
            }

        }


    }
}
