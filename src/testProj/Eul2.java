package testProj;

public class Eul2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 2;
		int num3 = num1 + num2;
		int numSum = 2;
		
		while (num3 < 4000000){
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
			if (num3%2 ==0){
				numSum += num3;
				System.out.println("Fibb sum num: "+num3);
			}
		}
		System.out.println(numSum);
		
		
		
	}

}
