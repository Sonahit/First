import java.util.Random;
import java.lang.StringBuilder;
import java.math.BigDecimal;




class A {
	
	
	public boolean isPalindrome (String text){
	    String test = "";
	    for(int i = text.length() - 1; i > -1; i--) {
          test = test + text.charAt(i);
	    }
	return test.equals(text);
	
    }
		
	public boolean SamePrefix (String text, String text1, String prefix) {
		
		return text.startsWith(prefix) & text1.startsWith(prefix);
	}
	public BigDecimal density (BigDecimal weight, BigDecimal volume, BigDecimal min, BigDecimal max) {
		BigDecimal density = weight.divide(volume);
		System.out.println("density " + density);
		System.out.println("volume " + volume);
		System.out.println("weight " + weight);
		System.out.println("min " + min);
		System.out.println("max " + max);
		System.out.println("density.min(min) " + density.min(min));
		System.out.println("density.max(max) " + density.max(max));
		System.out.println("density.compareTo(density.min(min)) " + density.compareTo(density.min(min)));
		System.out.println("density.compareTo(density.max(max)) " + density.compareTo(density.max(max)) );
		if(       (density.compareTo(density.min(min)) == 1
				|| density.compareTo(density.min(min)) == 0)
				&& (density.compareTo(density.max(max)) == -1 
				|| density.compareTo(density.max(max)) == 0) ) return density;
		return null;
	}
}

public class Shtripling {
	public static void main(String[] args) {
       String text = "1234321 323232";
       String text1 = "1234321 12 12 12";
	   A test = new A();
	   BigDecimal dod = new BigDecimal (20E14);
	   BigDecimal dode = new BigDecimal (20E10);
	   BigDecimal min = new BigDecimal (9999);
	   BigDecimal max = new BigDecimal (10000);
	  System.out.println(test.isPalindrome(text));
	  System.out.println(test.SamePrefix(text, text1 , "1234321"));
	  System.out.println(test.density(dod, dode , min, max));
		
	}
}
