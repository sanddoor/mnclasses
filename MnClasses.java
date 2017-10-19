import java.util.HashMap;
import java.util.Map;

public class MnClasses {
	private static Map<String, Double> res = new HashMap<String, Double>();

	public static double F(int k, int m, int n) {
		Double r = 0.0;
		if (k==0) r = 0.0;
		else if (m==1&&n==1) r = 1.0;
		else if (m<1 || n<1) r = 0.0;
		else if (n>k) r = 0.0;
		else if (m<n) r = 0.0;
		else {
			r = res.get(k+","+m+","+n);
			if (r!=null) return r;
			r = ((double)n/k)*F(k, m-1, n) + ((double)(k-n+1)/k)*F(k, m-1, n-1);
			res.put(k+","+m+","+n, r);
		}
		return r;
	}
	public static void main(String[] args) {
		System.out.println(F(56,56,56));
		//System.out.println(C(6,3));
	}

}
