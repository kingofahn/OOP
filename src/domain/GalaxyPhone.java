package domain;

public class GalaxyPhone extends IPhone {
	public static final String BRAND = "삼성", KIND = "갤럭시노트폰";  // 상수라고 한다
	private String size;
	// 홍길돌에게 010 번호로 삼성제품 6인치 갤럭시노트폰을 사용해서 이동가능한 상태로 안녕이라고 카톡을 전송햇다. 
	public void setSize() {
		this.size = "6인치";
	}
	public String getSize() {
		return size;
	}
	public void setData() {
		super.data = "카톡했다";
	}
	public String toString() {
		super.setPortable(true);
		setSize();
		setData();
		return String.format("%s 에게 %s 번호로   %s %s %s 제품을  사용해서 %s한 상태로  %s라고   %s",
				super.getName(),
				super.getPhoneNum(),
				BRAND,
				size,
				KIND,
				super.getMove(),
				super.getCall(),
				super.getData()
				);
		}
}