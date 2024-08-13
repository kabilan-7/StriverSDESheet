package striversdesheet.arrays;
class NextPerm {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0);
        }else{
            for(int i=n-1;i>=0;i--){
                if(arr[i]>arr[index]){
                    swap(arr,i,index);
                    break;
                }
            }
            reverse(arr,index+1);
        }
    }
    void reverse(int arr[],int i){
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}

public class NextPermutation {
    public static void main(String[] args) {
       NextPerm nextPerm = new NextPerm();
       int arr[]={1,2,3};
       nextPerm.nextPermutation(arr);
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
