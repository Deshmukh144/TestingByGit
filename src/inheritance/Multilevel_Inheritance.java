package inheritance;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// Multilevel inheritance from Mother, Daughter ,& Grand Daughter class
		
		Mother_Super_Class m= new Mother_Super_Class();
		Daugher_Child_Class d=new Daugher_Child_Class();
		Grand_Daughter_class g=new Grand_Daughter_class();
		
		m.look();
		d.look();
		d.style();
		g.beautiful();
		g.look();
		g.style();
		
		Mother_Super_Class.nature();
		Daugher_Child_Class.talent();
		Daugher_Child_Class.nature();
		Grand_Daughter_class.nature();
		Grand_Daughter_class.talent();
		Grand_Daughter_class.speed();

	}

}
