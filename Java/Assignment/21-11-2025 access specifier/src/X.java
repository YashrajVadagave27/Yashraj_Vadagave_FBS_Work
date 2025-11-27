package p2;
import p1.*;

class X{
	void myfunX() {
		p1.A ref;
		ref = new p1.A();
		//ef.myfunA();
	}
}

class Y extends p1.A{
	void myfunY() {
		//p1.A ref;
		//ref = new p1.A();
		//ref.myfunA();//direct object
		super.myfunA();//inheritance
		this.myfunA();
	}
}