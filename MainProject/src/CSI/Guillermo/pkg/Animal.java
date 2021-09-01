package CSI.Guillermo.pkg;

public class Animal {

	//	Fields
    String name;
    int age;
    String scientificName;
    String taxonomy;
    //  Constructors
   	public Animal(String name,int age,String scientificname) {
   		this.name = name;
   		this.age = age;
   		this.scientificName = scientificname;
   	}
   	public Animal(String name,int age,String scientificname, taxonomy) {
   	   	this.name = name;
   	   	this.age = age;
   	   	this.scientificName = scientificname;
   	   	this.Taxonomy = taxonomy;
   	}
	//  Getters and Setters  
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public String getScientificName(){
        return scientificName;
    }
    public void setScientificName(String scientificName){
        this.scientificName = scientificName;
    }

    //Main Method
    public static void main(String[] args){
	Animal a = new Animal(); 
	a.setName("Blob fish");
	a.setAge(67);  
	a.setScientificName("Psychrolutes marcidus");

	System.out.println("Name: " + a.getName());
	System.out.println("Age: " + a.getAge());
	System.out.println("Scientific Name: " + a.getScientificName());

	Animal a2 = new Animal("Bearded dragon",9,"Pogona"); 

	
	System.out.println("Name: " + a2.getName());
	System.out.println("Age: " + a2.getAge());
	System.out.println("Scientific Name: " + a2.getScientificName());
	
	Animal a3 = new Animal(Fly,15 days,Diptera,Order); 
	
	
	System.out.println("Name: " + a3.getName());
	System.out.println("Age: " + a3.getAge());
	System.out.println("Scientific Name: " + a3.getScientificName());
	System.out.println("Taxonomy: " + a3.getTaxonomy());
	}

	}