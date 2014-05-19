package testProj;

public class Eul1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * My Solution 
		 */
		boolean numAr [] = new boolean[1000]; 
		int sum3=0;
		int val3=0;
		int val5=0;
		int sum5=0;
		for (int i=1; i<=333; i++){
			val3 = i*3;
			if(!numAr[val3]){
				sum3 += val3;
				numAr[val3]=true;
				System.out.println("Value of Three-Mul: "+val3);
			}
			
		}
		for (int j=1; j<=199; j++){
			val5 = j*5;
			if(!numAr[val5]){
				sum5 += val5;
				numAr[val5]=true;
				System.out.println("Value of Five-Mul: "+val5);				
			}
		}
		System.out.println("Sum 3: "+sum3+"\nSum5: "+sum5+"\nTotal: "+(sum3+sum5));
		
		
		/*
		 * 
		 * Proper Solution
		 */
		int sum=0,mult;
		for( mult=1;mult<1000;mult++){
			if(mult%3==0 || mult%5==0){
				 sum +=mult;
				 }
			}
		System.out.println(sum);
	}

}
