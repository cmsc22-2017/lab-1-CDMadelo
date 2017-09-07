

class Person {
	String name;
  int age;
  String gender;
  Address address;
  
  Person(String name, int age, String gender, Address address) {
  	this.name = name;
  	this.age = age;
  	this.gender = gender;
  	this.address = address;
  }
}

class Address {
	String city; 
	String state;
	
	Address(String city, String state) {
		this.city = city;
		this.state = state;
	}
}

class ExamplesPersons {
	ExamplesPersons() {}
	
	Address aa = new Address("Warwick", "RI");
	Person a = new Person("Tim", 20, "M", aa);
	
	Address bb = new Address("Boston", "MA");
	Person b = new Person("Pat", 19, "F", bb);
	
	Address cc = new Address("Boston", "MA");
	Person c = new Person("Kim", 17, "F", cc);
	
	Address dd = new Address("Nashua", "NH");
	Person d = new Person("Dan", 22, "M", dd);
	
	Address ee = new Address("Tacloban", "PH");
	Person e = new Person("Dexter", 20, "M", ee);
	
	Address ff = new Address("Los Angeles", "CA");
	Person f = new Person("Miley", 12, "F", ff);
}


