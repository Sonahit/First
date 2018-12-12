
interface Lyabda{
	double RemenL1 = 3.6 * Math.pow(10,-6);
	double KorpusL2 = 1.1 * Math.pow(10,-6);
	double PedalL3 = 2.4 * Math.pow(10,-6);
	double RamaL4 = 16 * Math.pow(10,-6);
	double MuftaL5 = 0.06 * Math.pow(10,-6);
	double MahovikL6 = 0.06 * Math.pow(10,-6);
	double VseostalnoeL7 = 0.4 * Math.pow(10,-6);
}

class Rashet implements Lyabda{
    Lyabda L;
    private double sum = 1;
    void Osnovnoi_rashet () {
		int j = 6, k = 4;
		double mas2 [][] = new double [j][k]; 
		 for(int dlina = 0; dlina < mas2.length - 1 ; dlina++) {
				 if( dlina == 0 ) {
					 mas2[dlina][k-4] = Math.exp((-1)*RemenL1*1000);
					 mas2[dlina][k-3] = Math.exp((-1)*MuftaL5*1000);
					 mas2[dlina][k-2] = Math.exp((-1)*MahovikL6*1000);
					 mas2[dlina][k-1] = Math.exp((-1)*KorpusL2*1000);
				 }
				 if( dlina >= 1 && dlina  < 3 ) {
					 mas2[dlina][k-4] = Math.exp((-1)*PedalL3*1000);
					 mas2[dlina][k-3] = Math.exp((-1)*VseostalnoeL7*1000);
					 mas2[dlina][k-2] = Math.exp((-1)*VseostalnoeL7*1000);
				 }
				 if(dlina >= 3 && dlina <= mas2.length - 1 ) {
					 mas2[dlina][k-4] = Math.exp((-1)*VseostalnoeL7*1000);
					 mas2[dlina][k-3] = Math.exp((-1)*VseostalnoeL7*1000);
					 mas2[dlina][k-2] = Math.exp((-1)*VseostalnoeL7*1000);
					 
				 }
		 }

		 for(double []elem : mas2) {
			 for(double el : elem) {
				 sum *= (1 - el);
			 }
		 }
		 
		 
    }
		 
    double pop() {
    	return sum;
    }
   
    
}








public class Shtripling {
  
	public static void main(String[] args) {
        Rashet rash = new Rashet();
		rash.Osnovnoi_rashet();
	    System.out.println("Q = " + rash.pop());
		
	}

}
