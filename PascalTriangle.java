package striversdesheet;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRows(i));
        }
        return ans;
    }
    List<Integer> generateRows(int row){
        int res=1;
        List<Integer> list=new ArrayList<>();
        list.add(1);
        for(int i=1;i<row;i++){
            res=res*(row-i);
            res/=i;
            list.add(res);
        }
        return list;
    }
}
