package collections;

public class Associates {

	public Associates() {

	}

	 String name;
	 int id;
	 String deptName;

	public Associates(String name, int id, String deptName) {
		super();
		this.name = name;
		this.id = id;
		this.deptName = deptName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Associates [name=" + name + ", id=" + id + ", deptName=" + deptName + "]";
	}

}
