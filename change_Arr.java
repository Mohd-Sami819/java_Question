package Java_with_dsa.BackTracking;

public class ChangeArr {

    public static void changeArr(int arr[], int i, int val){
        // Base Case
        if (i==arr.length){
            printArr(arr);
            return;
        }
        // Recursion

        arr[i] = val;
        changeArr(arr,i+1,val+1); // recursion
        arr[i] = arr[i]-2;  // BackTracking
    }

    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        changeArr(arr,0,1);
        printArr(arr);
    }
}
