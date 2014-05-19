package testProj;

public class Eul4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int palLarge = 0;
		
		long start = System.currentTimeMillis();
		System.out.println("Starting:\n----------------------------------------------------------------------------------------------------------------------------------"
				+ "\nStart Time: "+start);
		for (int i=100; i<=999; i++){
			for(int j = 100; j<=999; j++){
				int temp = i*j;
				//System.out.println("temp: "+temp);
				String tempSt = String.valueOf(temp);
				//System.out.println("temp-Str: "+tempSt);
				String revTemp = rev(tempSt);
				//System.out.println("rev-St: " + revTemp);
				if (tempSt.equalsIgnoreCase(revTemp) && temp > palLarge){
					System.out.println("num: "+temp+"\nStr-Num: "+tempSt+"\nRev-Str: "+revTemp+"\nPal: "+palLarge);
					palLarge = temp;
					System.out.println("New Pal: "+temp);
				}
			}
		}
		System.out.println("\n\nLargest Palindrome is:  "+palLarge);
		long end = System.currentTimeMillis();
		System.out.println("\nEnd Time: "+end+"\nTime Elapsed: "+(end-start));
	}
	
	private static String rev(String s){
		//System.out.println("In Rev Method");
		int length = s.length();
		//System.out.println("length: "+length);
		StringBuffer retBuf = new StringBuffer();
		String ret;
		//int lp = 0;
		for (int i=length-1; i>=0; i--){
			char a = s.charAt(i);
			//System.out.println("char ("+i+"): "+a); 
			retBuf.append(a);
			//System.out.println("Buffer: "+retBuf.toString());
		}
		ret = retBuf.toString();
		//System.out.println("Leaving Rev Method");
		return ret;
	}

}
