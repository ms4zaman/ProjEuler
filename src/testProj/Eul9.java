package testProj;

public class Eul9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		for (int a=1; a<=500; a++){
			for (int b=1; b<=500; b++){
				for(int c=1; c<=500; c++){
					if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c,2)){
						//System.out.println(a+"^2 + "+b+"^2"+" = "+c+"^2");
						if ((a + b + c) == 1000){
							System.out.println("\n\n THIS SET: a: "+a+" b: "+b+" c: "+c);
							System.out.println((a*b*c));
						}
					}
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("\nEnd Time: "+end+"\nTime Elapsed: "+(end-start));
		
	}

}
