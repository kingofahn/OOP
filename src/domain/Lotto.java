package domain;

/**
 * 로또볼 추첨 1~45까지 랜덤 숫자 볼갯수는 총 6개 출력은[5,23,23,40,19,22]
 * 
 * 얼마치를 구입하십니까? 5200 5 7 14 25 29 43 3 24 33 37 39 43 7 12 26 28 30 34 5 6 7 8
 * 20 31 6 8 20 27 38 43
 */

public class Lotto {
	int price, count;
	String result;
	int[][] randoms = new int[20][6];
	int [][] arr3 = new int[20][6];

	public void setPrice(int price) {
		this.price = price;
	}
	public void setCount() {
		count = price / 1000;
	}
	public void setRandoms() {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < 6; j++) {
				randoms[i][j] = (int) (Math.random() * 45) + 1;
			}
		}
	}
//		for (int i = 0; i < count; i++) {
//			for (int j = 0; j < 6; j++) {
//				for (int k = 0; k < 6; k++) {
//						if (randoms[i][j] == randoms[i][k]) {
//							randoms[i][j] = (int) (Math.random() * 45) + 1;
//					}
//				}
//			}
//		}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	public int[][] getRandoms() {
		return randoms;
	}
//	public String toString() {
//		String output3="";
//		arr3=randoms;
//		for(int i=0; i<count; i++) {
//			for(int j=0; j<6; j++) {
//				output3 += arr3[i][j] +"     ";
//			}
//			output3 += "\n";
//		}
//		return output3;
//	}
	
}