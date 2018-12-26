
import java.lang.StringBuilder;
import java.math.BigDecimal;

import java.lang.String;



class A {
	public static String reverse(String string) {
		
		String temp = "";
		for(int i = string.length() - 1; i > -1; i--) {
			temp = temp + string.charAt(i);
		}
		
	   return temp;
	}
	 
	
	public String [] reverseLineOrder(String lines []) {
	     if(lines != null) {
	    	 int start = 0;
	    	 int end = lines.length - 1;
             while(start < end) {
            	 String temp = lines[start];
            	 lines[start] = lines[end];
            	 lines[end] = temp;  	 
            	 start++;
            	 end--;
	     }
             }
	     return lines;
		}
	
	public String [] setLine(int index, String line, String [] lines) {
		if(lines != null) {
			lines[index] = line;
		}
		for(String i: lines) {
		System.out.println(i);
		}
		return lines;
	}
	public String[] duplicateLines(String [] lines) {
	if(lines != null) {
	    String [] temp = lines;
	    temp = new String [temp.length * 2];
	    int j = 1;
	    int k = 0;
	    for(int i = 0; i < lines.length; i++) {
		    System.out.println(lines[i]);
		    temp[k] = lines[i];
	    	temp[j] = lines[i];
		    System.out.println(temp[j]);
	    	j = j + 2;
	    	k = k +2;
	    	if(j > temp.length) break;
	    }
	    for(int i = 0; i < temp.length; i++) {
	    	System.out.print(i+" = " + temp[i]+ "\t");
	    }
	    System.out.println();
	    for(int i = 0; i < lines.length; i++) {
	    	System.out.print(i+" = " + lines[i]+ "\t");
	    }
	    System.out.println();
	    lines = temp.clone();
	    for(int i = 0; i < lines.length; i++) {
	    	System.out.print(i+" = " + lines[i]+ "\t");
	    }
	    
	}
    return lines;
	}
	
	
	public String getLine(int index, String []lines) {
		    if (index > lines.length - 1) return null;
		    return lines[index];
		
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
	 
	 public static String getCommonPrefix(String string1, String string2) {
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
			String temp = "";
               for(int i = 0; i < less.length(); i++ ) {
            	   if(check.charAt(i) == less.charAt(i))
            		   temp = temp + check.charAt(i); 
               }
        if(temp.equals(less.substring(0, temp.length())) ) return temp;
        return temp;
         
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
		 
         for(int i = positions.length-1; i > -1 ; i--) {
        	if (strb.equals("")) break;
        	 strb.deleteCharAt(positions[i]);

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
	 
	 public static boolean isEqualAfterTrimming(String string1, String string2) {
			System.out.println("String1 = " + string1);
		    string1 = string1.trim();
		    System.out.println("String1 = " + string1);
		    System.out.println("String2 = " + string2);
		    string2 = string2.trim();
		    System.out.println("String2 = " + string2);
		    return string1.equals(string2);
		 }
	 
	 
		public static boolean isSameLastCharPosition(String string1, String string2, char character) {
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
	    for(int i = 0; i < check.length() ; i++) {
	    	if(check.charAt(i) == character) {
	    		return check.charAt(i) == less.charAt(i);
	    	}
	    }
	    return false;

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
		String [] lines = {"line1", "line2", "line3"};
		System.out.println(test.getLine(3, lines));
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
