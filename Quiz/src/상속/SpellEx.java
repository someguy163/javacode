package 상속;

import java.util.Iterator;

public class SpellEx extends Spell{



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spell mage[] = new Spell[3];
		mage[0]= new Fire();
		mage[1]= new Light();
		mage[2]= new Ice();
		
		for(int i=0; i<3; i++) {
			System.out.println(mage[i].casting());
		}
	}

}
class Spell{
	public String casting() {
		return "주문을 외운다";
	}
	
}
class Fire extends Spell{
	public String casting() {
		return "화염 " +super.casting();
	}
}
class Ice extends Spell{
	public String casting() {
		return "얼음 "+super.casting();
	}
}
class Light extends Spell{
	public String casting() {
		return "빛 "+super.casting();
	}
}
