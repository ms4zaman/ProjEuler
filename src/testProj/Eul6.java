package testProj;

public class Eul6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum1to100 = (100*(1+100))/2;
		double sqofsum = sum1to100*sum1to100;
		System.out.println(sum1to100+"\n"+sqofsum);
		double sum = 0;
		for (int i=1; i<=100; i++){
			sum+= (i*i);
			System.out.println(sum);
		}
		double diff = Math.abs((sum - sqofsum));
		System.out.println("Sum 1 to 100: "+sum1to100+"\nSq of Sum: " + sqofsum+"\nSum of Sqs: "+sum+"\nDiff: "+diff );
		
		
	}

}
