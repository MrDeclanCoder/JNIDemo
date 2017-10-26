

public class JniDemo{

	static{
		System.loadLibrary("native");
	}

	public native int[] hello(int[] args);

	public static void main(String args[]){
		JniDemo jniDemo = new JniDemo();
		int[] a = {1,2,3};
		int[] b = null;
		
		b = jniDemo.hello(a);
		for(int i = 0; i < b.length; i++){
			System.out.println(b[i]);
		}
	}

}

