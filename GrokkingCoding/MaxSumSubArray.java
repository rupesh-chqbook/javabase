package GrokkingCoding;

// Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
// Example 1:

// Input: [2, 1, 5, 1, 3, 2], k=3 
// Output: 9
// Explanation: Subarray with maximum sum is [5, 1, 3].
// Example 2:

// Input: [2, 3, 4, 1, 5], k=2 
// Output: 7
// Explanation: Subarray with maximum sum is [3, 4].

public class MaxSumSubArray {
    public static void main(String args[]){
        int arr[] = {12,5,3,40,5,6};
        int n =3;
        solution sl = new solution(n, arr);
        int vals = sl.findMaxVal();
        System.out.println("Value is "+ vals);
    }

}

class solution{

    int no;
    int[] nArr;
    solution(int k , int[] arr){
        this.no = k;
        this.nArr = arr;

    }

    public int findMaxVal(){

        int maxVal =0, subArraySum=0;
        int nLength = this.no;
        for(int i=0; i<nArr.length;i++){
            subArraySum =0;
            subArraySum = subArraySum+nArr[i];
            for(int j=i+1; j<nLength; j++){
                
                subArraySum = subArraySum+nArr[j];
               
            }
            if(maxVal<subArraySum){
                maxVal = subArraySum;
                subArraySum=0;
                
            }
         
            if(nLength==nArr.length)
            break;
            if(nLength<nArr.length)
                nLength++;
        }

        return maxVal;
    }
}