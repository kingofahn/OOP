package domain;

/**
 * 로또볼 추첨 1~45까지 랜덤 숫자 볼갯수는 총 6개 출력은[5,23,23,40,19,22]
 * 
 * 얼마치를 구입하십니까? 5200 
 * 5 7 14 25 29 43 
 * 3 24 33 37 39 43 
 * 7 12 26 28 30 34 
 * 5 6 7 8 20 31 6 8 20 27 38 43
 */

public class Lotto {
	int ball1, ball2, ball3, ball4, ball5, ball6, money, count;
	String result;
//	int[] balls = new int[6];

//	public void setBalls() {
//		for (int i = 0; i < 6; i++) {
//			balls[i] = ((int) (Math.random() * 45) + 1);
//		}
//	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setCount() {
		count = money / 1000;
	}

//	public int[] getBalls() {
//		return balls;
//	}

	public int getMoney() {
		return money;
	}

	public int getCount() {
		return count;
	}


	 public void setBall1() {
	 ball1=(int)(Math.random()*45)+1;
	 }
	 public void setBall2() {
	 ball2=(int)(Math.random()*45)+1;
	 }
	 public void setBall3() {
	 ball3=(int)(Math.random()*45)+1;
	 }
	 public void setBall4() {
	 ball4=(int)(Math.random()*45)+1;
	 }
	 public void setBall5() {
	 ball5=(int)(Math.random()*45)+1;
	 }
	 public void setBall6() {
	 ball6=(int)(Math.random()*45)+1;
	 }

	
	
	 public int getBall1() {
	 return ball1;
	 }
	 public int getBall2() {
	 return ball2;
	 }
	 public int getBall3() {
	 return ball3;
	 }
	 public int getBall4() {
	 return ball4;
	 }
	 public int getBall5() {
	 return ball5;
	 }
	 public int getBall6() {
	 return ball6;
	 }
	 
	public String toString() {
		return String.format("%d %d %d %d %d %d",ball1,ball2,ball3,ball4,ball5,ball6);
	
	}
	

}