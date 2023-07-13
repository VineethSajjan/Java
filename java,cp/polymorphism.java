// Java Program for Method Overriding

// Class 1
// Helper class
class Parent {

	// Method of parent class
	void Print()
	{

		// Print statement
		System.out.println("parent class");
	}
    void find(){
        System.out.println("parent find");
    }
}

// Class 2
// Helper class
class subclass1 extends Parent {

	// Method
	void Print() { System.out.println("subclass1"); }
}

// Class 3
// Helper class
class subclass2 extends Parent {

	// Method
	void Print()
	{

		// Print statement
		System.out.println("subclass2");
	}
    void find(){
        System.out.println("subclass2 find");
    }
    void count(){
        System.out.println("subclass2 count");
    }
}
class vineeth{
    int i;
}

// Class 4
// Main class
class polymorphism {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of class 1
		Parent a;

        subclass1 b;
		// Now we will be calling print methods
		// inside main() method
        subclass2 c;

		a = new subclass1();
		a.Print();
        a= new Parent();
        a.Print();
		a = new subclass2();
		a.Print();
        //a.count(); //as parent as not count we cannot access using parent object we cand acess using chhild object;

        System.out.println("----------------------------------------------");
        b= new subclass1();
        b.Print();
        b.find();
        c = new subclass2();
        c.find();
        c.count();


        System.out.println("***********************************************");
        a=null;
        //a.print(); we made null so we cannot acess now
        c.find();
        c.count();

        System.out.println("...............................................");
        vineeth v = new vineeth();
        vineeth g = v;
        v.i=99;
        System.out.println(g.i);
        v.i=9;
        System.out.println(g.i);
        v = null;
        System.out.println(g.i);
	}
}
