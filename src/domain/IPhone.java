package domain;

public class IPhone extends CellPhone {
	public static final String BRAND = "애플", KIND = "아이폰";  // 상수라고 한다
	protected String data;
	
	public void setData() {
		this.data="문자했다";
	}
	public String getData() {
		return data;
	}
	public String toString() {
		// 홍길돌에게 010 번호로 애플제품 아이폰을 사용해서 이동가능한 상태로 안녕이라고 문자를 전송햇다. 
		super.setPortable(true);
		setData();
		return String.format("%s 에게 %s 번호로  %s %s 제품을  사용해서 %s한 상태로  %s라고   %s",
				super.getName(),
				super.getPhoneNum(),
				BRAND,
				KIND,
				super.getMove(),
				super.getCall(),
				getData());
	}
}
