package testProj;

public class Ifcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b = "?";
		//String ;
		if (!b.isEmpty()){
			System.out.println("empty check passed");
			if (!b.equalsIgnoreCase("?")){
				System.out.println("? check passed");
			}
		}
		
		int temp = 3/2;
		System.out.println(temp);
	}

}
