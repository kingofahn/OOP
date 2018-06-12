package ui;

public class MainTest {

	public static void main(String[] args) {
		String accountNo = "";
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				accountNo += (int)(Math.random()*10)+"";
			}
			if(i==2){
				accountNo += "";
			}else{
				accountNo += "-";
			}
			
		}
		System.out.println(accountNo);

	}

}
