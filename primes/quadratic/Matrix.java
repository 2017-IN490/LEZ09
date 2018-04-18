/**
 * @author MP
 */


package primes.quadratic ;

import java.math.BigInteger ;
import primes.erathostenes.Item ;
import primes.erathostenes.Token ;

class Matrix extends Item {
	BigInteger entry ;
	Item nextrow ;

    /* Costruttore che inserisce un nuovo elemento e
       nella matrice  che continua con la riga n
       e la colonna nrow:
       @param n argomento di tipo Item che punta al resto della riga
       @param nrow argomento di tipo Item che punta al resto della colonna
       @param e il valore intero da inserire nella matrice
    */

	Matrix(Item n, Item nrow, BigInteger e) {
		super(n) ;
		this.set(nrow, e);
	}
       
    /* Metodo setter che prende 
       @param nrow la prossima riga della matrice 
       @param e    valore da immettere
    */
	void set(Item nrow, BigInteger e) {
		this.nextrow = nrow;
		this.entry = e;
	}
	//getters
	
    /* Implementazione del Metodo get ereditato
       calcolo del rango della matrice (da fare)
       @return restituisce l'intero nel token
     */
public    Token get() {
	return null ;
}

    /* implementazione del metodo value() ereditato
     @return restituisce il BigInteger dell'elemento della matrice
     */

public    BigInteger value() {
	return this.entry;
     } 

public void print() {	
	System.out.println("M:"+this.entry) ;
}



}
