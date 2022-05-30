//	Q1) Explain the difference between IS-A and Has-A relationship with the 
//		help of an example and explain about access modifiers and their 
//		accessibility?
//
//  Answer.
//
//  IS-A relationship can be achieved by creating an object in extended class 
//  (i.e Child class). This process can only be achieved by the process of
//  inheritance.That means on inheriting any class from super class 
//	establishes a (IS-A) relationship.
//
//  For E.g.
//	class A{
//  	System.out.println("In to the A class");
//  }
//  class B Extends A{
//		System.out.println("In to the B class");
//	}
//
//  From the above example following things can be concluded:-
//	As Class B extends A, it means B has inherited all the properties
//	of Class A.
//
//
//	HAS-A relationship can be achieved by creating an object in any class. This
//	process can only be achieved by composition. It means a particular property
//  is composed in the class. 
//	
//  For E.g.
//	class Car{
// 	private Engine engine;
//	}
//
//	class Engine{
//	int engineno;
//  }
//
//	From the above example following things can be concluded:-
// 	Here we can say that Car has-a Engine, because Engine is composed inside
//  the Car class.
//
//  There are four types of Java access Modifiers:-
//	1.Private: Access level is only within the class can not be accessed 
//			   outside the class.
//	2.Default: Access level is only within the package. If you don't specify any 
//			   level,it will be Default.
//	3.Protected: Access level is within the package and outside the package 
//			   through child class.
//	4.Public: Access level is everywhere. it can be accessed within the class,
//			  outside the class, within the package, outside the package.