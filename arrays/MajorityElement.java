package striversdesheet.arrays;


public class MajorityElement {
    public int majorityElement(int[] arr) {
        //optimal approach is to use moore's voting algorithm
        int count=0,ele=0;
        int anscount=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(count==0){
                ele=arr[i];
                count=1;
            }
            else if(arr[i]==ele) count++;
            else count--;
        }
        for(int i=0;i<n;i++){
            if(ele==arr[i]) anscount++;
        }
        if(anscount>(n/2)) return ele;
        return -1;
    }
}
