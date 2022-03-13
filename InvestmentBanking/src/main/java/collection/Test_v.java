package collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Test_v {
	public static void main(String[] args) {

		Vector v = new Vector();

		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
		System.out.println(v.size());

		// Add element
		v.add("abc");
		v.add(20);
		v.add('C');
		v.add(null);
		v.add("abc");

		System.out.println(v.size());
		System.out.println("Perform opration on Elements");

		// To print on single line
		System.out.println(v);
		System.out.println(v.indexOf("abc"));
		System.out.println(v.get(3));
		System.out.println(v.lastIndexOf("abc"));
		System.out.println(v.contains('X'));
		v.add(3, "xyz");
		System.out.println(v);
		v.add(3, "sssss");
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		
		System.out.println("-----reading vector -------");
		// to print elen=ment on next line
		Enumeration enm = v.elements();
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}

		Collections.reverse(v);

		System.out.println("-----reading vector after reverse-------");
		Enumeration enm1 = v.elements();
		while (enm1.hasMoreElements()) {
			System.out.println(enm1.nextElement());
		}

	}

}
