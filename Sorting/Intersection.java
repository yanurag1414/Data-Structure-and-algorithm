package Sorting;

public class Intersection {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,2};
        int[] b = {1,1,2,2,3,3};
        intersectionOfArrays(a,b);

    }

    static void intersectionOfArrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.print(a[i]+" ");
                i++;
                j++;

            }

        }
    }
}
