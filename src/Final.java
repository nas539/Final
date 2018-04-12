
public class Final {

	public static void arrayMystery(int[]a) {
		int[]a1={7};
		arrayMystery(a1);
		
		for (int i=1; i<a.length; i++){
			a[i]=i+a[i-1]-a[i];
		}

	}

}
