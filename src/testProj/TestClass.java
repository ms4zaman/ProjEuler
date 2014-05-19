package testProj;

import java.io.*;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b1 = new StringBuffer();
		StringBuffer b2 = new StringBuffer();
		StringBuffer b3 = new StringBuffer();
		String str = "starting str";
		String strtwo = "starting double str";
		String str3 = "strating new str";
		
		
		long start = System.currentTimeMillis();
		System.out.println("\nStarting Time for string concat: "+start);
		for (int i = 0; i<10000; i++){
			str = str + "new append";
		}
		long endstr = System.currentTimeMillis();
		long dif1 = (endstr-start);
		System.out.println("Ending time for string concat: "+endstr+"\nTotal time diff: "
				+dif1);
		
		
		
		b1.append("Starting strbuf");
		long startbuf = System.currentTimeMillis();
		System.out.println("\nStarting Time for stringbuf 1-append: "+startbuf);
		for (int j = 0; j<10000; j++){
			b1.append("new append");
		}
		long endbuf = System.currentTimeMillis();
		long dif2 = (endbuf-startbuf);
		System.out.println("Ending time for stringbuf 1-append: "+endbuf+"\nTotal time diff: "
				+dif2);
		
		
		long str2 = System.currentTimeMillis();
		System.out.println("\nStarting Time for multi-string concat: "+str2);
		for (int i = 0; i<10000; i++){
			strtwo = strtwo + "new append" + "second append" + "third append";
		}
		long endstr2 = System.currentTimeMillis();
		long dif3 = (endstr2-str2);
		System.out.println("Ending time for multi-string concat: "+endstr2+"\nTotal time diff: "
				+dif3);
		
		
				
		b2.append("Starting double append string");
		long startbuf2 = System.currentTimeMillis();
		System.out.println("\nStarting Time for stringbuf long-append: "+startbuf2);
		for (int k = 0; k<10000; k++){
			b2.append("new append" + "second append" + "third append");
		}
		long endbuf2 = System.currentTimeMillis();
		long dif4 = (endbuf2-startbuf2);
		System.out.println("Ending time for stringbuf long-append: "+endbuf2+"\nTotal time diff: "
				+dif4);
		
		
		
		long strr3 = System.currentTimeMillis();
		System.out.println("\nStarting Time for multiple diff string concat: "+strr3);
		for (int i = 0; i<10000; i++){
			str3 = str3 + "new append";
			str3 = str3 + "second append";
			str3 = str3 + "third append";
		}
		long endstr3 = System.currentTimeMillis();
		long dif5 = (endstr3-strr3);
		System.out.println("Ending time for multiple diff string concat: "+endstr3+"\nTotal time diff: "
				+dif5);
		
		
		
		b3.append("starting multi append string");
		long strbufmul = System.currentTimeMillis();
		System.out.println("\nStarting Time for stringbuf multi-append: "+strbufmul);
		for (int k = 0; k<10000; k++){
			b3.append("new append");
			b3.append("second append");
			b3.append("third append");
		}
		long endbuf3 = System.currentTimeMillis();
		long dif6 = (endbuf3-strbufmul);
		System.out.println("Ending time for stringbuf multi-append: "+endbuf3+"\nTotal time diff: "
				+dif6);
		
	}

}
