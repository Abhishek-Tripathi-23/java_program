package practiceQ;

public class bishopBhai {
   public static void main (String[] args) {
	 int n = 5;
	 int m = 7;
	 int[][] chess = new int[n][m];
	 int[][] vis = new int[n][m];
	 int maxcount =0;
	 int maxi =movesOfBishop(chess, 0,0,maxcount,0,vis,n,m);
	 System.out.println(maxi);
   }
   public static int movesOfBishop(int[][] chess, int row, int col,int maxcount,int count,int[][] vis, int n, int m) {
	   if(row<0 || col<0 || row>=n || col>=m || vis[row][col]==1) {
		   return maxcount;
	   }
	   if(count>maxcount) {
		   maxcount=count;
	   }
	   vis[row][col]=1;
	   maxcount=movesOfBishop(chess, row+1, col+1, maxcount,count+1,vis,n,m);
	   maxcount=movesOfBishop(chess, row+1, col-1, maxcount,count+1,vis,n,m);
	   maxcount =movesOfBishop(chess, row-1, col+1, maxcount,count+1,vis,n,m);
	   maxcount=movesOfBishop(chess, row-1, col-1, maxcount,count+1,vis,n,m);
	   vis[row][col]=0;
	   //System.out.println(maxcount);
	   return maxcount;
   }
   
}
