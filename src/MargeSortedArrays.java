public class MargeSortedArrays {

    public static int[] merge(int[] firstArray, int[] secondArray)
    {
        int n1 = firstArray.length;
        int n2 = secondArray.length;

        int[] mergedArray = new int[n1+n2];

        int i = 0, j = 0, k = 0;
        while (i<n1 && j <n2)
        {
            if (firstArray[i] < secondArray[j]) {
                mergedArray[k] = firstArray[i];
                i++;
            }
            else{
                mergedArray[k] = secondArray[j];
                j++;
            }
            k++;

        }
        //store remaining elements
        while (i < n1) mergedArray[k++] = firstArray[i++];
        while (j < n2) mergedArray[k++] = secondArray[j++];

        return mergedArray;
    }
    public static void main (String[] args)
    {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {1, 2, 4, 6, 8};

        merge(arr1, arr2);

        System.out.println("Array after merging");
        for (int i=0; i < arr1.length+arr2.length; i++)
            System.out.print(merge(arr1, arr2)[i] + " ");
    }
}
