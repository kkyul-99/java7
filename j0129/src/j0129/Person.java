package j0129;

public class Person {
	
	long id;
	String name;
	
	Person() {}
	Person(long id,String name) {
		this.id = id;
		this.name = name;
	}
	
	Person(Person p) {
		this.id = p.id;
		this.name = p.name;
	}
	
	@Override
	public String toString() {
		return String.format("%d,%s",id,name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((Person)obj).name) {
			return true;
		}
		return false;
	}

}
