package testProj;

public class Eul10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeCount = 1;
		int num = 2;
		boolean divis = false;
		long sum=2;
		while(num<2000000){
			num+=1;
			for (int i=2; i<=Math.ceil(Math.sqrt(num)); i++){
				if (!divis){
					if(num%i == 0){
						divis = true;
						//System.out.println("primecount: "+primeCount+"\nnum: "+num+"\ni: "+i+"\nDivisible");
					}
				}
				
			}
			if (!divis){
				primeCount++;
				//System.out.println("Prime Num: "+ num+"\nPrimecount: "+primeCount);
				sum += num;
				//System.out.println("Sum: "+ sum + "\nNum: "+num);
				
			}
			divis = false;
			
				
		}
		System.out.println("primecount: "+primeCount+"\nNum: "+num+"\nSum: "+sum);
	}

}
