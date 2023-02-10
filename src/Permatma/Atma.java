package Permatma;

public class Atma {

	public static void main(String[] args) {
		// §यमलोक§:सबको यहीसे जाना औऱ यही पर आना होता है |
		String guard="KAWACH";
		int kundal=2;
		String vehicle= "Reda";
		Atma Karma=new Atma();
		Karma.karna(guard, kundal);
		Karma.arjun();
		Karma.yudhhisthir();
		Karma.Yamraj(vehicle);
		//............................................
		//अब इनका karma चित्रगुप्तजीके projector(Console) पर  show करेंगे
		//...................................................
		
		/* karna aur arjun dono ne return kuch bhi nhi laya isliye unka karma null dekhkar Gupta ji ne unhe SWARG bhej diya.
		System.out.println(Karma.karna(guard,kundal));
		System.out.println(Karma.arjun());
		*/
		
		System.out.println(Karma.yudhhisthir());
		System.out.println(Karma.Yamraj(vehicle)+" praan lekar aye.");
		
	}
	//§धरती§...........................................................................
	 void karna(String guard, int kundal) //no  return type  with args
	 {//Birth
		 System.out.println(guard+" aur "+kundal+" kundal yahipar rakhe. return kuch bhi leke nhi gaye,jo ki wo do chije janm sehi sath lekar aye the.");
	 }//Death
	 void arjun() //no return type without args
	 {//Birth
		 System.out.println("Arjun Kuch saath lekar aye bhi nhi the aur kuch saath lekar bhi nhi gaye.Issi dharti par Niswarth Karma kiya.");
	 }//Death
	 String yudhhisthir() //return type with  no args
	 {//Birth
		 String body="Dharmaraj Yudhhisthir kuch leke nhi aye the parantu ve apne body ke saath Yamlok gaye the.";
		 return body;
	 }//Death
	 int Yamraj(String reda) //return type with args
	 {
		 int praan=5;
		 return praan;
	 }
	 
	 

}
