package inheritance;

public class Hierarchical_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mother_Super_Class m= new Mother_Super_Class();
		Daugher_Child_Class d= new Daugher_Child_Class();
		Son_Child_Class s =new Son_Child_Class();
		
		m.look();
		d.look();
		d.style();
		s.look();
		s.bike();
		Mother_Super_Class.nature();
		Daugher_Child_Class.talent();
		Daugher_Child_Class.nature();
		Son_Child_Class.mobile();
		Son_Child_Class.nature();
	}

}
