// leetcode:- https://leetcode.com/problems/unique-paths/description/

// solution-1 BruteForce  O(2^(m+n)

public int gridways(int i, int j,int m ,int n){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        int w1=gridways(i+1,j,m,n);
        int w2=gridways(i,j+1,m,n);
        return w1+w2;
    }
public int uniquePaths(int m, int n) {
      return gridways(0,0,m,n);
    }




// solution-2 optimal linear time complexity




public int uniquePaths(int m, int n) {
    // Calculate the combination (m+n-2) choose (m-1)
    // which is (m+n-2)! / ((m-1)! * (n-1)!)
    long result = 1;
    int N = m + n - 2;  // total steps
    int k = Math.min(m - 1, n - 1);  // choose the smaller to minimize calculations

    for (int i = 1; i <= k; i++) {
        result = result * (N - k + i) / i;
    }

    return (int) result;

}
