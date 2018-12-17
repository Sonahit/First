package net.thumbtack.school.base;

import java.util.Arrays;
import java.lang.StringBuilder;
public class StringOperations {
	public static int getSummaryLength(String[] strings) {
		//Возвращает суммарную длину строк, заданных массивом strings. 
		int sum = 0;
		for(String i: strings) {
			sum += i.length();
		}
		return sum;
	}
	public static String getFirstAndLastLetterString(String string) {
		//	Возвращает двухсимвольную строку, состоящую из начального и конечного символов заданной строки.
		String substring = "";
		substring = substring + string.charAt(0) + string.charAt(string.length());
		return substring;
				
	}
	 public static boolean isSameCharAtPosition(String string1, String string2, int index) {
			//	Возвращает true, если обе строки в позиции index содержат один и тот же символ, иначе false.
		 
		 return string1.charAt(index) == string2.charAt(index);
	 }
	public static boolean isSameFirstCharPosition(String string1, String string2, char character) {
			//Возвращает true, если в обеих строках первый встреченный символ character находится в одной и той же позиции. Просмотр строк ведется от начала.
	       
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
		//Возвращает true, если в обеих строках первый встреченный символ character находится в одной и той же позиции. Просмотр строк ведется от конца.
        for(int i = string1.length(); i <-1 ; i-- ) {
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
	public static boolean isSameFirstStringPosition(String string1, String string2, String str) {
		//Возвращает true, если в обеих строках первая встреченная подстрока str начинается в одной и той же позиции. Просмотр строк ведется от начала.
        for(int i = 0; i < string1.length() - 1 ; i++ ) {
        	if (str.length() + i > string1.length()) break;
        	if(str.equals(string1.substring(i,(str.length())))) {
        		if(string1.charAt(i) == string2.charAt(i)) {
        			return true;
        		}
        		else return false;
        	}
        	if( str.equals(string2)) {
        		if(string1.charAt(i) == string2.charAt(i)) {
        			return true;
        		}
        		else return false;
        	}
     }
     
    return false; 

	}
	public static boolean isSameLastStringPosition(String string1, String string2, String str) {
		//Возвращает true, если в обеих строках первая встреченная подстрока str начинается в одной и той же позиции. Просмотр строк ведется от конца.
        for(int i = string1.length() ; i <-1 ; i-- ) {
        	if (i - str.length() < 0) break;
        	if(str.equals(string1)) {
        		
        		if(string1.charAt(i) == string2.charAt(i)) {
        			return true;
        		}
        		else return false;
        	}
        	if( str.equals(string2)) {
        		if(string1.charAt(i) == string2.charAt(i)) {
        			return true;
        		}
        		else return false;
        	}
     }
     
    return false; 

	}
	public static boolean isEqual(String string1, String string2) {
		//Возвращает true, если строки равны.
		return string1.equals(string2);
	}
	public static boolean isEqualIgnoreCase(String string1, String string2) {
		//Возвращает true, если строки равны без учета регистра (например, строки “abc” и “aBC” в этом смысле равны).
	   return string1.equalsIgnoreCase(string2);
	} 
	public static boolean isLess(String string1, String string2) {
		//Возвращает true, если строка string1 меньше строки string2.
		return string1.length() < string2.length();
	} 
	 public static boolean isLessIgnoreCase(String string1, String string2) {
		 //Возвращает true, если строка string1 меньше строки string2 без учета регистра (например, строка “abc” меньше строки “ABCd” в этом смысле). 
		 return string1.length() < string2.length();
	 }
	 public static String concat(String string1, String string2) {
		 //Возвращает строку, полученную путем сцепления двух строк.
		 String sum = "";
		 sum = string1.concat(string2);
		 return sum;
	}
	 public static boolean isSamePrefix(String string1, String string2, String prefix) {
		 //Возвращает true, если обе строки string1 и string2 начинаются с одной и той же подстроки prefix.
		 
		 return string1.startsWith(prefix) && string2.startsWith(prefix);
	}
	 public static boolean isSameSuffix(String string1, String string2, String suffix) {
		 //Возвращает true, если обе строки string1 и string2 заканчиваются одной и той же подстрокой suffix.
		 return string1.endsWith(suffix) && string1.endsWith(suffix);
	 }
	 public static String getCommonPrefix(String string1, String string2) {
		 //Возвращает самое длинное общее “начало” двух строк. Если у строк нет общего начала, возвращает пустую строку.
		 String temp1 = "";
		 String temp2 = "";
		 char probel = ' ';
		 int i = 0;
         while(string1.charAt(i) != probel) {
        	 temp1 = temp1 + string1.charAt(i);
        	 i++;
         }
         i = 0;
         while(string2.charAt(i) != probel) {
        	 temp1 = temp1 + string1.charAt(i);
        	 i++;
         }
         
         if(temp1.equals(temp2)) return temp1;
         return "";
         
	 }
	public static String reverse(String string) {
		//Возвращает перевернутую строку.
		String temp = "";
		for(int i = string.length(); i < -1; i++) {
			temp = "" + string.charAt(i);
		}
		
	   return temp;
	}
	public static boolean isPalindrome(String string) {
		//Возвращает true, если строка является палиндромом, то есть читается слева направо так же, как и справа налево. 
		//Возвращает перевернутую строку.
		String temp = "";
		for(int i = string.length(); i < -1; i++) {
			temp = "" + string.charAt(i);
		}
		if (temp.equals(string)) return true;
		return false;
	}
	 public static boolean isPalindromeIgnoreCase(String string) {
		//Возвращает true, если строка является палиндромом, то есть читается слева направо так же, как и справа налево, без учета регистра.
			String temp = "";
			for(int i = string.length(); i < -1; i++) {
				temp = "" + string.charAt(i);
			}
			if (temp.equalsIgnoreCase(string)) return true;
			return false;
	 }
	 public static String getLongestPalindromeIgnoreCase(String[] strings) {
		//Возвращает самый длинный палиндром (без учета регистра) из массива заданных строк. Если в массиве нет палиндромов, возвращает пустую строку.
	     int max = 0;
	     String maxs = "";
		 for(int i = 0; i < strings.length - 1 ; i++) {
		   if(max < strings[i].length() - 1 ) {
			   maxs = strings[i];
		   }
	     }
		 if (isPalindromeIgnoreCase(maxs) == true) {
			 return maxs;
		 };
	 return "";
	 }
	 public static boolean hasSameSubstring(String string1, String string2, int index, int length) {
		//Возвращает true, если обе строки содержат один и тот же фрагмент длиной length, начиная с позиции index.
	 return string1.substring(index, length).equals(string2.substring(index, length));
	 
	 }
	 public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1, String string2, char replaceInStr2, char replaceByInStr2) {
		//Возвращает true, если после замены в string1 всех вхождений replaceInStr1 на replaceByInStr1 и замены в string2 всех вхождений replaceInStr2 на replaceByInStr2 полученные строки равны.
	       string1 = string1.replace(replaceInStr1, replaceByInStr1);
	       string2 = string2.replace(replaceInStr2, replaceByInStr2);
	       return string1.equals(string2);
	 }
	 public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1, String string2, String replaceInStr2, String replaceByInStr2) {
	 //Возвращает true, если после замены в string1 всех вхождений строки replceInStr1 на replaceByInStr1 и замены в string2 всех вхождений replceInStr2 на replaceByInStr2 полученные строки равны.
	       string1 = string1.replaceAll(replaceInStr1, replaceByInStr1);
	       string2 = string2.replaceAll(replaceInStr2, replaceByInStr2);
	       return string1.equals(string2);
	 }
	 public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string) {
		//Возвращает true, если строка после выбрасывания из нее всех пробелов является палиндромом, без учета регистра.
	    String str = "";
	    str = string.replaceAll("\\s+", "");
	    return isPalindromeIgnoreCase(str);
	 }
	 public static boolean isEqualAfterTrimming(String string1, String string2) {
		//Возвращает true, если две строки равны, если не принимать во внимание все пробелы в начале и конце каждой строки.
	    string1 = string1.replaceAll("\\s+", "");
	    string2 = string2.replaceAll("\\s+", "");
	    return string1.equals(string2);
	 }
	 public static String makeCsvStringFromInts(int[] array) {
		//Для заданного массива целых чисел создает текстовую строку, в которой числа разделены знаком “запятая” (т.н. формат CSV - comma separated values). Для пустого массива возвращается пустая строка.
	     String str = array.toString(); 
	     str = Arrays.toString(array);
	     str = str.substring(1, str.length()-1);
		 return str;
	 }
	 public static String makeCsvStringFromDoubles(double[] array) {
		//Для заданного массива вещественных чисел создает текстовую строку, в которой числа разделены знаком “запятая”, причем каждое число записывается с двумя знаками после точки. Для пустого массива возвращается пустая строка.
		 String str = "";
		    for( double i: array) {
		        str = str + String.format("%.2f", i) + " ";
		    }
		    str = str.replaceAll("[,]", ".");
		    str = str.replaceAll("\\s\\b", ",");
		    return str;
	 }
	 public static StringBuilder makeCsvStringBuilderFromInts(int[] array) {
		//	То же, что и в упражнении 25, но возвращает StringBuilder.
	     String str = array.toString(); 
	     str = Arrays.toString(array);
	     str = str.substring(1, str.length()-1);
	     StringBuilder strb = new StringBuilder(str);
		 return strb;
	 }
	 public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array) {
			//То же, что и в упражнении 26, но возвращает StringBuilder.
		 String str = "";
		    for( double i: array) {
		        str = str + String.format("%.2f", i) + " ";
		    }
		    str = str.replaceAll("[,]", ".");
		    str = str.replaceAll("\\s\\b", ",");
	     StringBuilder strb = new StringBuilder(str);
		 return strb;
	 }
	 public static StringBuilder removeCharacters(String string, int[] positions) {
		/*Удаляет из строки символы, номера которых заданы в массиве positions. 
		 *Предполагается, что будут передаваться только допустимые номера, 
		 *упорядоченные по возрастанию. Номера позиций для удаления указаны для исходной строки.
		 *Возвращает полученный в результате StringBuilder.
		 */
		    String left, right;
		     for(int i : positions) {
		        left = string.substring(0, i);
		        right = string.substring(i+1, string.length());
		        string = left + right;
        	    }
          StringBuilder strb = new StringBuilder(string);
 		  return strb;
          }
		 
	 public static StringBuilder insertCharacters(String string, int[] positions, char[] characters) {
		/*Вставляет в строку символы. Массивы positions и characters имеют одинаковую длину. 
		 *В позицию positions[i] в исходной строке string вставляется символ characters[i]. 
		 *Если в массиве positions один и тот же номер позиции повторяется несколько раз, это значит, 
		 *что в указанную позицию вставляется несколько символов, в том порядке, 
		 *в котором они перечислены в массиве characters. 
		 *Предполагается, что будут передаваться только допустимые номера, упорядоченные по неубыванию.  
		 *Возвращает полученный в результате StringBuilder. 
		 */
		 String str = "";
		 
		 
		 StringBuilder strb = new StringBuilder(str);
		 return strb;
	 }
}
