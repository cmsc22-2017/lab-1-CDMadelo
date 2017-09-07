
interface IMenu {}

class Soup implements IMenu {
	Info information;
	boolean isVegetarian;
	
	Soup(Info information, boolean isVegetarian) {
		this.information = information;
		this.isVegetarian = isVegetarian;
	}
}

class Salad implements IMenu {
	Info information;
	boolean isVegetarian;
	String dressing;
	
	Salad(Info information, boolean isVegetarian, String dressing) {
		this.information = information;
		this.isVegetarian = isVegetarian;
		this.dressing = dressing;
	}
}

class Sandwich implements IMenu {
	Info information;
	BreadFilling info;
	
	Sandwich(Info information, BreadFilling info) {
		this.information = information;
		this.info = info;
	}
}

class Info {
	String name;
	int price;
	
	Info(String name, int price){
	  this.name = name;
	  this.price = price;
	}
}

class BreadFilling {
	String kindOfBread;
	String firstFilling;
	String secondFilling;
	
	BreadFilling(String kindOfBread, String firstFilling, String secondFilling) {
	  this.kindOfBread = kindOfBread;
	  this.firstFilling = firstFilling;
	  this.secondFilling = secondFilling;
	}
}

class ExamplesMenu {
	ExamplesMenu () {}
	
	Info a = new Info("Batchoy", 10);
	IMenu batchoy = new Soup(a, false);
	
	Info b = new Info("Sotanghon", 25);
	IMenu sotanghon = new Soup(b, true);
	
	Info c = new Info("Macaroni Salad", 50);
	IMenu macaroni = new Salad(c, true, "mayonnaise");
	
	Info d = new Info("Caesar's Salad", 100);
	IMenu caesar = new Salad(d, true, "caesar");
	
	Info e = new Info("Ham and cheese overload", 30);
	BreadFilling ee = new BreadFilling("Ham and cheese", "ham", "cheese");
	IMenu eee = new Sandwich(e, ee);
	
	Info f = new Info("PB & J", 45);
	BreadFilling ff = new BreadFilling("Peanut butter and Jelly", "peanut butter", "jelly");
	IMenu fff = new Sandwich(f, ff);
	
}

