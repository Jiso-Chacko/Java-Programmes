
public class Textscanner {
	
	Hello obj;
	
	public Textscanner(Hello obj) {
		
		this.obj=obj;
	}

	void scan() {
		
		String text="Scanned Text";
		obj.OnText(text);
	}
}
