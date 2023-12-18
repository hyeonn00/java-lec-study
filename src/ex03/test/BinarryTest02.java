package ex03.test;

public class BinarryTest02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        final int target = 16;
        int N = arr.length;
        int start = 0;
        int end = N-1;

        int count = 0;

        for (int i = 0; i < N; i++) {
            count ++;
            int mid = start + (end-start)/2;
            if (arr[mid]==target){
                System.out.printf("target 값은 %d번지에 있습니다.\n", mid);
                break;
            }else if (arr[mid]<target){
                start = mid + 1;
            }else if (arr[mid]>target){
                end = mid - 1;
            }
        }
        System.out.printf("%d번만에 찾았습니다. ", count);


    }
}
