package primes.quadratic ;

import java.math.BigInteger ;
import primes.erathostenes.Item ;

class Filter extends primes.goldbach.Filter {
	Matrix column ;
	
	
// costruttori
	Filter(Item tail, BigInteger p) {
		super(tail,p) ;
		this.setzerocolumn(tail.column);
    }

	Matrix setzerocolumn(Matrix row) {
		if (row != null)
			this.column = new Matrix(row,setzerocolumn(row.nextrow),BigInteger.ZERO);
		else
			this.column = null;
	}
	

}










