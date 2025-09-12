import java.util.Arrays;

public class MedianOfShortedArray {
    public static void main(String[] Args){

        int[] arr1 ={2,3,5,8,9,5,9,30};
        int[] arr2 ={12,10,14,16,18,66,90,8,28};
        double median = medianOfSortedArray(arr1,arr2);
        System.out.println("The median is :" +median);

    }

    public static double medianOfSortedArray(int[] arr1,int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] mergedArray = new int[n1+n2];



        int i = 0,j = 0, k = 0;
        while(i<n1 && j<n2){
            if (arr1[i]<arr2[j]) {
                mergedArray[k++] = arr1[i++];
            }else{
                mergedArray[k++] = arr2[j++];
            }
        }


        while(i<n1){
            mergedArray[k++]=arr1[i++];
        }
        while(j<n2){
            mergedArray[k++]=arr2[j++];
        }
        Arrays.sort(mergedArray);


        int totalLength = mergedArray.length;

        if(totalLength%2==0){
            return (mergedArray[totalLength/2 -1] + mergedArray[totalLength/2])/2.0;
        }else {
            return mergedArray[totalLength/2];
        }

    }
}
====================================================================
another approch
class Solution {
  public static void main(String[] args) {
    int [] num1={2,1,4};
    int [] num2={5,3,6};


   
    System.out.println(med(num1, num2));
  }

  public static int med(int[] num1, int[] num2){
    int n1= num1.length;
    int n2= num2.length;
    int i=0,j=0,k=0;
    int[] mrgdArr=new int[n1+n2];
    int mid=0;

     while(i<n1 && j<n2){
            if (num1[i]<num2[j]) {
                mrgdArr[k++] = num1[i++];
            }else{
                mrgdArr[k++] = num2[j++];
            }
        }

    while(i<n1){
      mrgdArr[k++]=num1[i++];
    }

    while(j<n2){
      mrgdArr[k++]=num2[j++];
    }

    Arrays.sort(mrgdArr);
   // System.out.println(mrgdArr+"mearged");
    int tlnt=mrgdArr.length;
    if(tlnt%2==0){
      mid=mrgdArr[tlnt/2];
    }else{
      mid = mrgdArr[(tlnt-1)/2];
    }
    return mid;
  } 
}


