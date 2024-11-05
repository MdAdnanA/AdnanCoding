public class FindMInInArray {

    public static void main(String[]args){

        int[] arr1 ={5,6,1,2,3,4};
        int[] arr2 ={1,2,3,4};
        int[] arr3 ={2,3,4,5,6};


        System.out.println(findMin(arr3));
    }

    public static int findMin(int[] arr){
        int low =0;
        int high = arr.length-1;
        if(arr[low]<=arr[high]){
            return arr[low];
        }
        while (low <= high) {
            int mid = low + (high-low)/2;
            if(mid>0&& arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            if (mid<arr.length-1&& arr [mid]>arr[mid +1]) {
                return arr[mid+1];
            }
            if(arr[mid]>arr[high]){
                low = mid+1;
            }else{
                high=mid-1;
            }

        }
        return -1;
    }
}

