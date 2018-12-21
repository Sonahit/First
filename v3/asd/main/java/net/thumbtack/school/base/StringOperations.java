package net.thumbtack.school.base;

import java.util.Arrays;
import java.lang.StringBuilder;
import java.text.DecimalFormat;
public class StringOperations {
	public static int getSummaryLength(String[] strings) {
		int sum = 0;
		for(String i: strings) {
			sum += i.length();
		}
		return sum;
	}
	public static String getFirstAndLastLetterString(String string) {
		String substring = "";
		substring = substring + string.charAt(0) + string.charAt(string.length()-1);
		return substring;
				
	}
	 public static boolean isSameCharAtPosition(String string1, String string2, int index) {
		 
		 return string1.charAt(index) == string2.charAt(index);
	 }
	public static boolean isSameFirstCharPosition(String string1, String string2, char character) {
	       
         for(int i = 0; i < string1.length() - 1 ; i++ ) {
	        	if( character == string1.charAt(i)) {
	        		if(string1.charAt(i) == string2.charAt(i)) {
	        			return true;
	        		}
	        		else return false;
	        	}
	        	if( character == string2.charAt(i)) {
	        		if(string1.charAt(i) == string2.charAt(i)) {
	        			return true;
	        		}
	        		else return false;
	        	}
         }
         
	    return false; 
	
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

	public static boolean isSameFirstStringPosition(String string1, String string2, String str) {
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
	public static boolean isEqual(String string1, String string2) {

		return string1.equals(string2);
	}
	public static boolean isEqualIgnoreCase(String string1, String string2) {
		
	   return string1.equalsIgnoreCase(string2);
	} 
	public static boolean isLess(String string1, String string2) {
		if (string1.compareTo(string2) < 0) return true;
		return false;
	} 
	 public static boolean isLessIgnoreCase(String string1, String string2) {
		 
		 if (string1.compareToIgnoreCase(string2) < 0) return true;
			return false;
	 }
	 public static String concat(String string1, String string2) {
	
		 return string1.concat(string2);
	}
	 public static boolean isSamePrefix(String string1, String string2, String prefix) {
		 
		 
		 return string1.startsWith(prefix) && string2.startsWith(prefix);
	}
	 public static boolean isSameSuffix(String string1, String string2, String suffix) {
		 
		 return string1.endsWith(suffix) && string2.endsWith(suffix);
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
        return "";
         
	 }
	public static String reverse(String string) {
		
		String temp = "";
		for(int i = string.length() - 1; i > -1; i--) {
			temp = temp + string.charAt(i);
		}
		
	   return temp;
	}
	public static boolean isPalindrome(String string) {
		String temp = "";
		temp = reverse(string);
		if (temp.equals(string)) return true;
		return false;
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
			if(string1.length() > string2.length()) {
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
	 public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1, String string2, char replaceInStr2, char replaceByInStr2) {
		
	       string1 = string1.replace(replaceInStr1, replaceByInStr1);
	       string2 = string2.replace(replaceInStr2, replaceByInStr2);
	       return string1.equals(string2);
	 }
	 public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1, String string2, String replaceInStr2, String replaceByInStr2) {
	 
	       string1 = string1.replaceAll(replaceInStr1, replaceByInStr1);
	       string2 = string2.replaceAll(replaceInStr2, replaceByInStr2);
	       return string1.equals(string2);
	 }
	 public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string) {
		
	    String str = "";
	    str = string.replaceAll("\\s+", "");
	    return isPalindromeIgnoreCase(str);
	 }
	 public static boolean isEqualAfterTrimming(String string1, String string2) {
		
	    string1 = string1.trim();
	    string2 = string2.trim();
	    return string1.equals(string2);
	 }
	 
	 public static String makeCsvStringFromInts(int[] array) {
			if( array.length >= 1) {
				String str = String.valueOf(""+array[0]);
			     for(int i = 1; i < array.length; i++) {
			    	 str = str + "," + String.valueOf(array[i]);
			     }
				 return str;
				}
				return "";
			 }
	
	 public static String makeCsvStringFromDoubles(double[] array) {
			String  str = "";
			if( array.length >= 1) {
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
			 return str;
	 }
	 
	 public static StringBuilder makeCsvStringBuilderFromInts(int[] array) {
		 StringBuilder strb = new StringBuilder("");
			if( array.length >= 1) {
			StringBuilder strbc = new StringBuilder(""+array[0]);
			for(int i = 1; i < array.length; i++) {
				strbc.append("," + array[i]);
			}
			    return strbc;
         }
         return strb;
	 }
	 public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array) {
		 StringBuilder strb = new StringBuilder("");
		 if( array.length >= 1) {
			String str = String.format("%.2f", array[0]);
			StringBuilder strbc = new StringBuilder(""+str);
			for(int i = 1; i < array.length; i++) {
				str = String.format("%.2f", array[i]);
				strbc.append(","+str);
			}
			return strbc;
		 }
			    return strb;
	 }
	 
	 public static StringBuilder removeCharacters(String string, int[] positions) {
			
		 StringBuilder strb = new StringBuilder(string);
		 
         for(int i = positions.length-1; i > -1 ; i--) {
        	if (strb.equals("")) break;
        	 strb.deleteCharAt(positions[i]);

         }

		   return strb;
	 }
		 
	 public static StringBuilder insertCharacters(String string, int[] positions, char[] characters) {
	  
		 StringBuilder strb = new StringBuilder(string);
		 
         for(int i = positions.length - 1; i > -1 ; i--) {
        	 strb.insert(positions[i], characters[i]);
         }

		   return strb;
	 }
	 
}
