package striversdesheet.arrays;

public class FindDuplicateNumber {
    public int findDuplicate(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[correct]!=arr[i]){
                    swap(arr,i,correct);
                }else return arr[i];
            }else i++;
        }
        return -1;
    }
    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
