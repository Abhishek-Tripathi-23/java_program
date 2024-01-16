package practiceQ;

public class maxsubarray {
	public static void main(String[] args) {
int[] arr = {2,4,5,1,3};
int k =3;
int n =arr.length;
int max= Integer.MIN_VALUE;


for(int i=0; i<=n-k; i++) {
	int sum =0;
    int t=1;
	sum = (sum + arr[i])*t;
	for(int j=i+1; j<i+k;j++) {
		t++;
		int x = arr[j]*t;
		sum =sum+x;
		if(max<sum) {
			max=sum;
		}
	}
}
System.out.println(max);
	}
}
