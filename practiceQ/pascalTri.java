package practiceQ;

import java.util.ArrayList;
import java.util.List;

public class pascalTri {
	
    public static int nCr(int r, int c) {
    	int res =1;
    	
    	for(int i=0; i<c; i++) {
    	res = res*(r-i);
    	res = res/(i+1);
    	}
    	return res;
    }

	public static List<List<Integer>> pascalTriangle(int n) {
		List<List<Integer>> temp = new ArrayList<>();
		
		for(int i=1; i<n; i++) {
			List<Integer> tl = new ArrayList<>();
			for(int j=1; j<=i; j++) {
				tl.add(nCr(i-1,j-1));
			}
			temp.add(tl);
		}
		return temp;
	}
	
	public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
}
}