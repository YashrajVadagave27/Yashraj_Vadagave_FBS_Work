package p1;

//interface Mall ////for abstract class
//{
//    void discount(); 
//}

//class FashionMall implements Mall {
//
//    @Override
//    public void discount() {
//        System.out.println("30% discount in FashionMall");
//    }
//}

abstract class Mall //for abstract class
{
	abstract void discount();
}

class FashionMall extends Mall {

    @Override
    public void discount() {
    	System.out.println("Inside Sub-Class FashionMall");
        System.out.println("30% discount in FashionMall");
    }
}

public class Test {
    public static void main(String[] args) {

        // Upcasting
        Mall m1 = new FashionMall();
        m1.discount();

        Mall m2 = new FashionMall();
        m2.discount();

        // Anonymous Inner Class
        Mall m3 =new Mall() {
            @Override
            public void discount() {
            	System.out.println("Inside Abstract/Interface Mall");
                System.out.println("50% discount!");
            }
        };
        m3.discount();
    }
}
