package net.thumbtack.school.base;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberOperations {
	public static Integer find(int[] array, int value) {
	for(int i = 0; i < array.length; i++) {
		if(value == array[i]) {
			return i;
		}
	}
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
	
	
	
	
	public static Double calculateDensity(double weight, double volume, double min, double max) {
	  double density = 0;
	  density = weight / volume;
	  if(density <= max & density >= min) return density;
	  return null;
	}
	
	
	
	public static Integer find(BigInteger[] array, BigInteger value) {
		Integer d;
		for(int i = 0; i < array.length; i++) {
			if(value.equals(array[i])) {
				return i;
			}
		}
		return null; 
	
	}

	public static BigDecimal calculateDensity(BigDecimal weight, BigDecimal volume, BigDecimal min, BigDecimal max) {
		  BigDecimal density;
		  density = weight.divide(volume);
		  if( (   density.compareTo(max) == -1 
	          || density.compareTo(max) == 0 )
		      &&
              ( density.compareTo(min) == 1
		      || density.compareTo(min) == 0) ) return density;
		  return null;
	
	}
}
