package net.thumbtack.school.base;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberOperations {
	public static Integer find(int[] array, int value) {
	//Ищет в массиве array первый элемент, значение которого равно value. Если такое значение найдено, возвращает его позицию в массиве array, в противном случае возвращает null.
	for(int i = 0; i < array.length; i++) {
		if(value == array[i]) {
			return i;
		}
	}
	return null;
    }
	public static Integer find(double[] array, double value, double eps) {
	//Ищет в массиве array первый элемент, значение которого по модулю не отличается от value более чем на eps. Если такое значение найдено, возвращает его позицию в массиве array, в противном случае возвращает null.
		for(int i = 0; i < array.length; i++) {
			if((Math.abs(value) + eps) == Math.abs(array[i])) {
				return i;
			}
			if((Math.abs(value) - eps) == Math.abs(array[i])) {
				return i;
			}
		}
		return null;
	
	}
	public static Double calculateDensity(double weight, double volume, double min, double max) {
	//Вычисляет плотность вещества по формуле weight / volume. Если получившееся значение не превышает max и не меньше min, возвращает полученное значение, в противном случае возвращает null.
	  double density = 0;
	  density = weight / volume;
	  if(density < max & density > min) return density;
	  return null;
	}
	public static Integer find(BigInteger[] array, BigInteger value) {
	//Ищет в массиве array первый элемент, значение которого равно value. Если такое значение найдено, возвращает его позицию в массиве array, в противном случае возвращает null.
		Integer d;
		for(int i = 0; i < array.length; i++) {
			if(value == BigInteger.valueOf(i)) {
			    d = value.intValue();
				return d;
			}
		}
		return null; 
	
	}

	public static BigDecimal calculateDensity(BigDecimal weight, BigDecimal volume, BigDecimal min, BigDecimal max) {
		  BigDecimal density;
		  density = weight.divide(volume);
		  if((density.compareTo(density.max(max)) & density.compareTo(density.min(min))) == density.floatValue()) return density;
		  return null;
	
	}
}
