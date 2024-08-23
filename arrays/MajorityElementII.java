package striversdesheet.arrays;


import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(cnt1==0 && ele2!=nums[i]){
                ele1=nums[i];
                cnt1=1;
            }
            else if(cnt2==0 && ele1!=nums[i]){
                ele2=nums[i];
                cnt2=1;
            }
            else if(nums[i]==ele1){
                cnt1++;
            }
            else if(nums[i]==ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int count1=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(ele1==nums[i]) count1++;
            if(ele2==nums[i]) count2++;
        }
        if(count1>n/3) list.add(ele1);
        if(count2>n/3) list.add(ele2);
        return list;

    }
}
