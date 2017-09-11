
interface IAT {}

class Person implements IAT {
	IAT mama;
	IAT papa;
	String name;
	
	Person(IAT mama, IAT papa, String name) {
		this.mama = mama;
		this.papa = papa;
		this.name = name;
	}
}

class Unknown implements IAT {
	Unknown() {}
}

class ExamplesIAT {
	ExamplesIAT() {}
	
	IAT unknown = new Unknown();
	IAT mom = new Person(unknown, unknown, "Meding");
	IAT dad = new Person(unknown, unknown, "Cesar");
	IAT mommy = new Person(mom, dad, "Dolores");
	IAT daddy = new Person(unknown, unknown, "Nonito Sr.");
	IAT tatay = new Person(unknown, unknown, "Bonifacio");
	IAT nanay = new Person(unknown, unknown, "Francesca");
	IAT ma = new Person(mommy, daddy, "Darsy");
	IAT pa = new Person(nanay, tatay, "Rowel");
	IAT me = new Person(ma, pa, "Candace");
}
