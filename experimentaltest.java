
public class experimentaltest 
{
  public static void main(String[] args)
  {
  
    
	  	  
Soldierab sab = new SingletonFactory();
Gunner gun  = sab.speak();
	    for (int i = 0; i < 1000; i++) {
	      if (sab.speak() != gun) {
	        System.out.println("Error , second instance of the same object created");
	      }
	      
	    }
	   
	    	  System.out.println("There is no second object creation");
	  }

  }



//interface


interface Soldierab {
	 Gunner speak();


}

