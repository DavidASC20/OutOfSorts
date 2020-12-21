public class Sorts{
    /**Bubble sort of an int array. 
    *Upon completion, the elements of the array will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void bubbleSort(int[] data) { 
        int len = data.length; 
        for (int i = 0; i < len - 1; i++) 
            for (int j = 0; j < len - i - 1; j++) 
                if (data[j] > data[j + 1]) { 
                    int temp = data[j]; 
                    data[j] = data[j + 1]; 
                    data[j+1] = temp; 
                } 
    } 

    public static void selectionSort(int[] data){
        int n = data.length;
        for (int i = 0; i < n-1; i++){ 
            int minimum = i;
            for (int j = i+1; j < n; j++){
                if (data[j] < data[minimum])
                    minimum = j;
            }
            int temp = data[minimum];
            data[minimum] = data[i];
            data[i] = temp;
        }
    }

    public static void insertionSort(int[] data){
        { 
            int n = data.length; 
            for (int i = 1; i < n; ++i) { 
                int temp = data[i]; 
                int j = i - 1; 
                while (j >= 0 && data[j] > temp) { 
                    data[j + 1] = data[j]; 
                    j = j - 1; 
                } 
                data[j + 1] = temp; 
            } 
        } 
    }

}