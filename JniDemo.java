

public class JniDemo{

	static{
		System.loadLibrary("native");
	}

	public native String hello(String args);

	public static void main(String args[]){
		JniDemo jniDemo = new JniDemo();
		String jStr = "this is java";
		String cStr = null;
		cStr = jniDemo.hello(jStr);
		if(cStr != null){
			System.out.println(cStr);
		} else {
			System.out.println("发生错误 null");
		}
			
	}

}

