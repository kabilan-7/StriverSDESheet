package striversdesheet.arrays;
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int row[]=new int[m];
        int col[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0) {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]==1 || col[j]==1) matrix[i][j]=0;
            }
        }
    }
}
public class SetMatrixZero {
    public static void main(String[] args) {
       FindDuplicateNumber s=new FindDuplicateNumber();
       int matrix[][]={{1,0,1},{1,1,1},{1,2,1}};
       s.setZeroes(matrix);

    }
}
