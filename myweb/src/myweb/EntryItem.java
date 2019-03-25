package myweb;

public class EntryItem {

	private String mid;
	private String nam;
	private String birth;
	private int sex;

	public EntryItem(String mid, String nam, String birth, int sex) {
		this.mid = mid;
		this.nam = nam;
		this.birth = birth;
		this.sex = sex;
	}

	public String getMid() {
		return mid;
	}

	public String getNam() {
		return nam;
	}

	public String getBirth() {
		if (birth == null) {
			return "";
		}

		return birth;
	}

	public String getSex() {
		switch (sex) {
		case 0:
			return "男";
		case 1:
			return "女";
		default:
			return "その他";
		}
	}

}
