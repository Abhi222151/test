package test;

import java.util.HashMap;
import java.util.Map;

/*class One {
	
	public void m1() {
		System.out.println("m1");
	}
}
class Two extends One{
	
	public void m1() {
		System.out.println("m2");
	}
}

class Three extends One{
	
	public void m1() {
		System.out.println("m3");
	}
}
*/
public class InheritanceTest {

	public static void main(String[] args) {
		/*
		 * Two t = new Two(); t.m1(); t.m2();
		 * 
		 * One t1 = new Two(); t1.m1();
		 */
		
		/*
		 * One o = new Two(); o.m1();
		 */
		
		HashMap<Integer, String> hm
        = new HashMap<Integer, String>();

    hm.put(1, "Geeks");
    hm.put(2, "For");
    hm.put(1, "Book");
    
    System.out.println(hm.get(2));
    
    // Traversing thorugh a map
    
    for (Map.Entry<Integer, String> e : hm.entrySet())
        System.out.println(e.getKey() + " " + e.getValue());   

	}

}
