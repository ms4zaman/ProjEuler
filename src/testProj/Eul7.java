package testProj;

public class Eul7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeCount = 1;
		int num = 1;
		boolean divis = false;
		while(primeCount<10001){
			num+=2;
			for (int i=2; i<=(num-1); i++){
				if (!divis){
					if(num%i == 0){
						divis = true;
						System.out.println("primecount: "+primeCount+"\nnum: "+num+"\ni: "+i+"\nDivisible");
					}
				}
				
			}
			if (!divis){
				primeCount++;
				System.out.println("Prime Num: "+ num+"\nPrimecount: "+primeCount);
			}
			divis = false;
			
				
		}
		System.out.println("primecount: "+primeCount+"\nNum: "+num);
	}

}
