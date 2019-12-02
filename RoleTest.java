
public class RoleTest {
	public static void main(String[] args) {
		Role role1 = new Role();
		Role role2 = new Role("CEO");
		Role role3 = new Role("CTO", "Data Center", 3000000.00);
		Role role4 = new Role();
	
		/*
		System.out.println(role1);
		System.out.println(role2);
		System.out.println(role3);
		System.out.println(role4);
		*/
		
		//Array
		Role [] roles= new Role[4];
		roles[0] = role1;
		roles[1] = role2;
		roles[2] = role3;
		roles[3] = role4;
		
		
		//Array using {}
		Role [] roles2= {role1, role2, role3, role4};
		
		//Print all elements in the array 
		for (int i=0; i<roles.length; i++) {
			System.out.println(roles[i]);
		}
		System.out.println("\n_________________________________\n");
		//For each 
		for (Role r: roles) {
			System.out.println(r);
		}
		System.out.println("\n_________________________________\n");
		//change value instance variable name  to all elements 
		for (int i=0; i<roles.length; i++) {
			roles[i].setName("Chair " +i);
		}
		//print array
		for (int i=0; i<roles.length; i++) {
			System.out.println(roles[i]);
		}
		
		//System.out.println("Role name:"+ role1.getName());
		//System.out.println("Role name:"+ roles2[0].getName());
	
		
	}
}
