	/**
	 * 
	 */
	package CSI.Guillermo.pkg;
	
	/**
	 * @author guillermoperez
	 *
	 */
	public class AnimalFarm {
	//	Fields
		static Animal[] animals;
	//Constructors
	
	
		/**
		 * @param args
		 */
		public static void main(String[] args) {
	
	//Main Method
			
	animals= new Animal[5];
	
	animals[0]= new Animal("Fly",15,"Diptera",new Taxonomy("Eukaryote","Animalia","Anthropoda","Insecta","Panorpida","Antilophora","Diptera","anthomyiid flies")); 
	
	animals[1]= new Animal("Bearded dragon",9,"Pogona",new Taxonomy("Eukaryote","Animalia","Chordata","Reptilia","Squamata","Agamidae","Pogona","Pogona vitticeps"));
			
	animals[2]= new Animal("Parrot",3,"Psittaciformes",new Taxonomy("Eukaryote","Animalia","Chordata","Psittaciformes","Psittaciformes","Psittacidae","Psittaciformes","Psittaciformes"));
	
	animals[3]= new Animal("Axolotl",9,"Ambystoma mexicanum",new Taxonomy("Eukaryote","Animalia","Chordata","Amphibia","Urodela","Ambystomatidae","Ambystoma","A. mexicanum"));
	
	animals[4]= new Animal("null",0,"null",new Taxonomy("null","null","null","null","null","null","null","null"));

	}
	
	}
