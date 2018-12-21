package net.thumbtack.school.introduction;

public class FirstSteps {

   	
	public int sum (int x, int y) {
		return x + y;
	}
	
	public int mul (int x, int y) {
		return x * y;
	}
	
	public int div (int x, int y) {
		return x / y;
	}
	
	public int mod (int x, int y) {
		return x % y;
	}
	
	public boolean isEqual (int x, int y) {
		return x == y;
	}
	
	public boolean isGreater (int x, int y) {
		return x > y;
	}
	
	public boolean isInsideRect (int xLeft, int yTop , int xRight, int yBottom , int x, int y) {
		return ( (x >= xLeft && x <= xRight) & ( y >= yTop && y <= yBottom));
	}
	
	public int sum (int [] array) {
		if (array.length > 0) {
		   int sum = 0;
		   for (int x: array) {
			   sum += x;
		   }
		   return sum;
		}
		else return 0;
	}
	
	public int mul (int [] array) {
		if (array.length > 0) {
			   int sum = 1;
			   for (int x: array) {
				   sum *= x;
			   }
			   return sum;
			}
			else return 0;
	}
	
	public int min (int [] array) {
		if (array.length > 0) {
			   int min = 255;
			   for (int i = 0; i < array.length; i++) {
				   if (array[i] < min) {
					   min = array[i];
				   }
			   }
			   return min;
			}
			else return  Integer.MAX_VALUE;
	}
	
	public int max (int [] array) {
		if (array.length > 0) {
			   int max = 0;
			   for (int i = 0; i < array.length - 1; i++) {
				   if (array[i] > max) {
					   max = array[i];
				   }
			   }
			   return max;
			}
			else return Integer.MIN_VALUE;
	}
	
	public double average (int [] array) {
		if (array.length > 0) {
			   double sum = 0;
			   for (double x: array) {
				   sum += x;
			   }
			   return sum/array.length;
			}
			else return 0;
	}
	
	public boolean isSortedDescendant (int [] array) {
			   for (int i = 0; i < array.length - 1; i++) {
                 if (array[i] <= array[i+1]) {
                	 return false;
                 }
			   }
			   return true;
	}
	
    public void reverse (int [] array) {
		int j = array.length - 1;
		for (int i = 0; i < array.length - 1 ; i++) {
			int temp;
			temp = 0;
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			j--;
			if( j == i || j == i-1) break;
		}
	}
    
public boolean isPalindrome (int [] array) {
	int j = array.length - 1;
    int mas[] = array.clone();
    boolean sravn = true;
	for (int i = 0; i < array.length - 1 ; i++) {
		int temp;
		temp = 0;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		j--;
		if( j == i || j == i-1) break;
	} 
      

	  for(int i = 0; i < mas.length - 1; i++) {
	   if(mas[i] == array[i]) {
			sravn = true;
		}
	   else if (mas[i] != array[i]) {
		   sravn = false;
		   break;
	   }
	}
  return sravn;
}

	public int sum (int [][] matrix) {
		int sum = 0;
		for(int[] x: matrix) {
			for(int y: x) {
		       sum += y;	
			}
		}
	return sum;
}
	public int max (int [][] matrix) {
	if (matrix.length > 1) {
		int max = 0;
		for(int[] x: matrix) {
			for(int y: x) {
		       if( y > max) max = y;	
			}
		}
	return max;
	}
	return Integer.MIN_VALUE;
}
	public int diagonalMax (int [][] matrix) {
	 if (matrix.length > 0) {
		int max = 0;
	/*	for(int x = 0; x < matrix.length ; x++) {
			for(int y = 0; y < matrix[x].length - x  ; y++) {
		       if( matrix[matrix[x].length - 1][y] > max) max = matrix[matrix[x].length - 1][y ] ;	
			}
		}
		*/
		for(int x = 0; x < matrix.length  ; x++) {
			for(int y = 0 ; y <= x   ; y++) {
		       if( matrix[x][y] > max) max = matrix[x][y] ;	
		}
	}
		return max;
	 }
	 return Integer.MIN_VALUE;

}
	
	public boolean isSortedDescendant (int [][] matrix) {
        
		for(int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length - 1; y++) {
				if( matrix[x][y] <= matrix[x][y+1]) return false;
			}
		}
		return true;
		
	}
	
public void cube (int[]array) {
	 int i = 0;
	 for(int x: array) {
	    array[i]= x * x * x;
		i++;	
}
}



public boolean find (int[] array, int value) {
	 for(int x: array) {
		 if(x == value) return true;
	 } 
	 return false;	
}
}

