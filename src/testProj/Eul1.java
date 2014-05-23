package testProj;

public class Eul1 {

	public static void main(String[] args) {
		int sum=0,mult;
		for( mult=1;mult<1000;mult++){
			if(mult%3==0 || mult%5==0){
				 sum +=mult;
				 }
			}
		System.out.println(sum);
	}

}
