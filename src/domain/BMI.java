package domain;

public class BMI {
	String name,result="";   
	double height,weight; // init 하면 나중에 버그 생긴다. declaration 까지만 해야한다.
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setResult() {
		double BMIResult= weight/((height*height)/10000);
		if(BMIResult >= 35){
			result = "3단계 비만";
		} else if(BMIResult >= 30){
			result = "2단계 비만";
		} else if(BMIResult >= 25){
			result = "1단계 비만";
		} else if(BMIResult >= 23){
			result = "비만 전단계";
		} else if(BMIResult >= 18.5){
			result = "정상";
		} else{
			result = "저체중";
		}
	}
	
	public String getName(){
		return name;
	}
	public String getResult() {
		return result;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return String.format(" %s | %fcm | %fkg | %s",name,height,weight,result);
	}
}
