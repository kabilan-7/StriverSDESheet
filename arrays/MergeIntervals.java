package striversdesheet.arrays;
import java.util.*;
public class MergeIntervals {
    public int[][] merge(int[][] arr) {
        int n=arr.length;
        Arrays.sort(arr,new Comparator<>(){
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            //if the current interval is not belongd to last interval
            if(ans.isEmpty() || arr[i][0]>ans.get(ans.size()-1)[1]){
                ans.add(new int[]{arr[i][0],arr[i][1]});
            }
            //if current interval is belongs to last interval
            else{
                ans.get(ans.size()-1)[1]=
                        Math.max(ans.get(ans.size()-1)[1],arr[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()-1][]);
    }
}
