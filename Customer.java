package Lab9;

public class Customer {
	private String name;
	private boolean member;
	private String memberType;
	
	public Customer(String name) {
	this.name = name;
	}
	
	public String getMemberType() {
	return memberType;
	}
	
	public void setMemberType(String memberType) {
	this.memberType = memberType;
	}
	
	public String getName() {
	return name;
	}
	
	public boolean isMember() {
	return member;
	}

	@Override
	public String toString() {
	return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}


	}

