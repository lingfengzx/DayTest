import java.math.BigDecimal;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class RegTest {

	public static void main(String args[]){
		System.out.println("1|eeeee|3333|324".split("\\|").length);
		System.out.println("102.157.3.343".matches("[0-9.]+"));
		System.out.println(new BigDecimal("-1"));
	}
}
