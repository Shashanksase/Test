package practice;

public class DefaultConstructor {

	private int emplid;
	private String emplName;
	private int empAge;

	public int getEmplid() {
		return emplid;
	}

	public void setEmplid(int emplid) {
		this.emplid = emplid;
	}

	public String getEmplName() {
		return emplName;
	}

	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		DefaultConstructor t = new DefaultConstructor();
	}
}