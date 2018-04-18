package primes.quadratic ;

import java.math.BigInteger ;
import primes.erathostenes.Item ;

class Filter extends primes.goldbach.Filter {
	Matrix column ;
	
	
// costruttori
	Filter(Item tail, BigInteger p) {
		super(tail,p) ;
		this.column = new Matrix( tail.nextrow, setzerocolumn(tail.nextrow), Biginteger.ONE);
	}

	Matrix setzerocolumn(Matrix r) {
	
		
		if (r.nextrow != null) {
			this.nextrow = new Matrix(r.nextrow,setzerocolumn(r.nextrow),BigInteger.ZERO);
			
			}
		else
									  this.nextrow = null ;
									  
		
	}

}










