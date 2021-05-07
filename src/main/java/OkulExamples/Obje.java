package OkulExamples;

public class Obje {

	private String name;
	private String surname;
	private String IdNo;
	private String clas;
	private String Bdate;
	private String les;
	private String Not1;
	private String Not2;
	private String Notend;
	
	public Obje(String name, String surname, String idNo, String clas, String bdate, String les, String not1,
			String not2, String notend) {
		super();
		this.name = name;
		this.surname = surname;
		IdNo = idNo;
		this.clas = clas;
		Bdate = bdate;
		this.les = les;
		Not1 = not1;
		Not2 = not2;
		Notend = notend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdNo() {
		return IdNo;
	}

	public void setIdNo(String idNo) {
		IdNo = idNo;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getBdate() {
		return Bdate;
	}

	public void setBdate(String bdate) {
		Bdate = bdate;
	}

	public String getLes() {
		return les;
	}

	public void setLes(String les) {
		this.les = les;
	}

	public String getNot1() {
		return Not1;
	}

	public void setNot1(String not1) {
		Not1 = not1;
	}

	public String getNot2() {
		return Not2;
	}

	public void setNot2(String not2) {
		Not2 = not2;
	}

	public String getNotend() {
		return Notend;
	}

	public void setNotend(String notend) {
		Notend = notend;
	}

	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname + ", IdNo=" + IdNo + ", clas=" + clas + ", Bdate=" + Bdate
				+ ", les=" + les + ", Not1=" + Not1 + ", Not2=" + Not2 + ", Notend=" + Notend ;
	}
	
}
