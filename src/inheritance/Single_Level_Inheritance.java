package inheritance;

public class Single_Level_Inheritance {

	public static void main(String[] args) {
		// Single level inheritance  with mother and daughter class
	
		Mother_Super_Class m = new Mother_Super_Class();
		m.look();
		
		
		Daugher_Child_Class D = new Daugher_Child_Class();
		 D.style();
		 D.look();
		 Mother_Super_Class.nature();
		 Daugher_Child_Class.talent();
		 Daugher_Child_Class.nature();
	}

}
