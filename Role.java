
public class Role {
	//Attributes
	private String name;
	private String department;
	private int id;
	private double anualSalary;
	
	private static int numRoles;
	
	
	//Constructors
	public Role() {
		this.name="CompanyName";
		this.department ="";
		this.id=++this.numRoles;
		this.anualSalary=1000000.00;
		
	}
	public Role(String name, String department, double anualSalary) {
		this.name = name;
		this.department = department;
		this.id=++this.numRoles;
		this.anualSalary = anualSalary;
	}
	public Role(String name) {
		this.name=name;
		this.department="DepartmentName";
		this.id=++this.numRoles;
		this.anualSalary=1000.0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAnualSalary() {
		return anualSalary;
	}
	public void setAnualSalary(double anualSalary) {
		this.anualSalary = anualSalary;
	}
	
	public boolean equals(Object otherObject) {
		if (this == otherObject)
			return true;
		if (otherObject instanceof Role ) {
			Role otherRole= (Role)otherObject;
			if (this.name.equals(otherRole.name)) {
				if(this.department.equals(otherRole.department)) {
					if(this.id == otherRole.id) {
						if((this.anualSalary -otherRole.anualSalary)<0.0001) {
							return true;
						}
					}
				}
					
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Role: name :" + getName()+ ", department:" 
				+ getDepartment() + ", id:" + getId() 
				+ ", anualSalary:" + getAnualSalary() ;
	}
	
	
	

	
}
