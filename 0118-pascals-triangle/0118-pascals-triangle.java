class Solution {

    public List<Integer> Rows(int r) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col = 1;col<r;col++) {
            ans = ans * (r-col);
            ans = ans/col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mat = new ArrayList<>();
        for(int row=1;row<=numRows;row++) 
        {
            mat.add(Rows(row));
        }
    return mat;
    }
}