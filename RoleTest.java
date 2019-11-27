
public class RoleTest {
	public static void main(String[] args) {
		Role role1 = new Role();
		Role role2 = new Role("CEO");
		Role role3 = new Role("CTO", "Data Center", 3000000.00);
		Role role4 = new Role();
	
		
		System.out.println(role1);
		System.out.println(role2);
		System.out.println(role3);
		System.out.println(role4);
		
	}
}
