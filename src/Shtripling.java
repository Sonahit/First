import java.util.Random;
import java.lang.StringBuilder;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;




class A {
	public static String reverse(String string) {
		
		String temp = "";
		for(int i = string.length() - 1; i > -1; i--) {
			temp = temp + string.charAt(i);
		}
		
	   return temp;
	}
	 public static boolean isPalindromeIgnoreCase(String string) {
			
			String temp = "";
			temp = reverse(string);
			if (temp.equalsIgnoreCase(string)) return true;
			return false;
	 }
	 public static String getLongestPalindromeIgnoreCase(String[] strings) {
		
	     int max = 0;
	     String maxs = "";
		 for(int i = 0; i < strings.length ; i++) {
		   if(max < strings[i].length() - 1) {
				 if (isPalindromeIgnoreCase(strings[i]) == true) {
					   maxs = strings[i];
					   max = strings[i].length();
				 };
		   }
	     }
	 return maxs;
	 }
	 public static boolean hasSameSubstring(String string1, String string2, int index, int length) {
		 String check = "";
			String less = "";
			if(string1.length() >= string2.length()) {
				check = string1;
				less = string2;
				if(length+index  > string2.length() ) {
					return false;
							
				}
			}
			else {
				check = string2;
				less = string1;
				if(length+index > string1.length() ) {
					return false;
							
				}

			}
            	 if(check.substring(index, length).equals(less.substring(index, length))) {
            		 return true;
            	 }
          return false;
	 
	 }
	public boolean SamePrefix (String text, String text1, String prefix) {
		
		return text.startsWith(prefix) & text1.startsWith(prefix);
	}
	
	 public static StringBuilder removeCharacters(String string, int[] positions) {
			
		 StringBuilder strb = new StringBuilder(string);
		 
         for(int i = positions.length - 1; i > -1 ; i--) {
        	if (strb.equals("")) break;
        	 strb.delete(i , i);

         }

		   return strb;
	 }
	
	 public static String makeCsvStringFromDoubles(double[] array) {
			String  str = "";
			String temp0 = String.format("%.2f", array[0]);
	    	 temp0 = temp0.replaceAll(",", ".");
	    	 str = temp0;
		     for(int i = 1; i < array.length; i++) {
                 String temp ="";
		    	 temp = String.format("%.2f", array[i]);
		    	 temp = temp.replaceAll(",", ".");
		    	 str = str + "," + temp;
		     }
			 return str;
	 }
	 public static StringBuilder insertCharacters(String string, int[] positions, char[] characters) {
    	 int temp = 0;
		 StringBuilder strb = new StringBuilder(string);
		 
         for(int i = positions.length - 1; i > -1 ; i--) {
        	 strb.insert(positions[i], characters[i]);
         }

		   return strb;
	 }
	 
	 public static boolean isSameLastStringPosition(String string1, String string2, String str) {
			String check = "";
			String less = "";
			if(string1.length() >= string2.length()) {
				check = string1;
				less = string2;

			}
			else {
				check = string2;
				less = string1;
			}
        for(int i = 0; i < check.length() - str.length() + 1  ; i++) {
        	if(check.substring(i, i + str.length()).equals(str))
               return check.substring(i, i + str.length()).equals(less.substring(i, i + str.length()));
        }
	    return false;

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
		if     (  (density.compareTo(density.min(min)) == 1 
				|| density.compareTo(density.min(min)) == 0)
				&& (density.compareTo(density.max(max)) == -1 
				|| density.compareTo(density.max(max)) == 0) ) return density;
		return null;
	}
	public static Integer find(double[] array, double value, double eps) {
		for(int i = 0; i < array.length; i++) {
			if(Math.abs(array[i] - value) < eps) {
				return i;
			}
		}
		return null;
	}
	
}

public class Shtripling {
	public static void main(String[] args) {
 /*      String text[] = {"Level", "test", "Racecar", "RaceCar !"};
       String text1 = "65432123456";
       A test = new A();
       System.out.println(test.getLongestPalindromeIgnoreCase(text));*/
		A test = new A();
        String first = "Hello";
        String second = "Hell";
        String third = "Helloween";
		System.out.println(test.hasSameSubstring(first, third, 2, 3));
  /*     A text = new A();
       String text1 = "Hello";
       String text2 = "Hell";
       System.out.println(text.hasSameSubstring(text1, text2, 0, 5));*/
/*	A test = new A();
		double [] a = {100.11,200.011,300,400.400};
		System.out.println(test.makeCsvStringFromDoubles(a));*/
/*	   A test = new A();
	   BigDecimal dod = new BigDecimal (20E14);
	   BigDecimal dode = new BigDecimal (20E10);
	   BigDecimal min = new BigDecimal (9999);
	   BigDecimal max = new BigDecimal (10000);
	  System.out.println(test.isPalindrome(text));
	  System.out.println(test.SamePrefix(text, text1 , "1234321"));
	  System.out.println(test.density(dod, dode , min, max));
		A test = new A();
		   BigInteger [] dod = new BigInteger[]{
                   new BigInteger("0"),
                   new BigInteger("22222222222222222222222222222222222"),
                   new BigInteger("4444444444444444444444444444444444444444444444444444"),
                   new BigInteger("6666666666666666666666666666666666666666666666666666666666666666666666666666666"),
                   new BigInteger("8888888888888888888888888888888888888888888888888888888888888888888888888"),
           new BigInteger("999999999999999999999999999999999999999999999999999999999999999999999999999")};
		   
		   BigInteger dode = new BigInteger ("999999999999999999999999999999999999999999999999999999999999999999999999999");
       System.out.print(test.find(new double[]{0, 2, 4, 6, 8}, 8, 1E-4));*/
	}
}