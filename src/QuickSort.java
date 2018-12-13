import java.util.Arrays;

public class QuickSort {

    private static void quickSort(int[] arr, int start, int end){
        if(start<end){
            int pivot = portion(arr, start, end);
            quickSort(arr, start,pivot-1);
            quickSort(arr, pivot+1, end);

        }
    }

    private  static int portion(int[] arr, int start, int end){
        int pivot = arr[end];
        int i=start-1;
        for (int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int tmp = arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[end] = temp;
        return i+1;
    }
    // Driver program
    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.quickSort(arr, 0, n-1);

        System.out.println("sorted array");
        Arrays.stream(arr).forEach(System.out::println);
    }
}
