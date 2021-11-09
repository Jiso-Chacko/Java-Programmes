
public class Sample extends Hello {

	void OnText(String text) {
		
		System.out.println(text);
	}
	
	Sample(){
		
		Textscanner ts=new Textscanner(this);
		ts.scan();
	}
	
	public static void main(String[] args) {
		Sample s=new Sample();
	}
}
