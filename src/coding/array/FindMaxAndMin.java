package coding.array;

public class FindMaxAndMin {
    public static int findMax(int[] a){
        int max = a[0];
        for (int each : a) {
            if (max<each) max=each;
        }
        return max;
    }
    public static int findMin(int[] a){
        int min=a[0];
        for (int each : a) {
            if (min>each)min=each;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {90,6,0,-9,22,-111,1,3,7,48,14,0};
        System.out.println("Max num : " + findMax(arr));
        System.out.println("Min num : " + findMin(arr));

    }
}
