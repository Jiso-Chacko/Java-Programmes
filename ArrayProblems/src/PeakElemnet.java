
public class PeakElemnet {
	
	public static void main(String[] args) {
		
		int[] arr= {1,5,8,7,9,2,3};
		
		int peak = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					peak=arr[i];
				}	
			}	
		}
		System.out.println(peak);
		
	}

}
