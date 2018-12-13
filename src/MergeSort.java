import java.util.Arrays;

public class MergeSort {

    private static void mergeSort(int[] arr, int start, int end) {
       if(start<end){
           int middle = (start+end)/2;
           mergeSort(arr, start, middle);
           mergeSort(arr, middle+1, end);
           merge(arr,start,middle,end);
       }
    }
    private static void merge(int[] arr, int start, int middle, int end){
        int n1= middle-start+1;
        int n2=end-middle;

        int before[] = new int[n1];
        int after[] = new int[n2];

        for (int i=0;i<n1;i++) before[i]=arr[start+i];
        for (int i=0;i<n2;i++) after[i]=arr[middle+1+i];

        int i=0;
        int j=0;
        int k=start;

        while (i<n1 && j<n2){
            if(before[i]<=after[j]){
                arr[k]=before[i];
                i++;
            }else {
                arr[k]=after[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k]=before[i];
            i++;k++;
        }
        while (j<n2){
            arr[k]=after[j];
            j++;k++;
        }
    }
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");

        mergeSort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        Arrays.stream(arr).forEach(System.out::println);
    }

}
