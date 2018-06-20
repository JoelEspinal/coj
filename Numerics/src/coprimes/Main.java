package coprimes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

	public static void main(String [] args) {
		primes.add(2);
		int limit = 10;
		for(int i = 2; i <= 10; i++) {
			addPrime(i);
		}

		Integer [] primesA = new Integer[primes.size()];
		primes.toArray(primesA);
		
		Integer [] primesB = new Integer[primes.size()];
		primes.toArray(primesB);
		
		for(int i = 0; i < primesA.length; i++) {
			for(int j = 0; j < primesB.length; j++) {
				int a = primesA[i];
				int b = primesB[j];
				if(a != b) {
					// if mcd == 1; means two numbers (a, b) are coprimes.
					if(mcd(a, b) == 1) {
						System.out.println(a + ", " + b);
					}
				}
			}
		}
	}
	
	
	// verify de coprime relationship by a, b
	public static int mcd(int a, int b) {
		if(b == 0) return a;
		
		return mcd(b, (a % b));
	}
	
	// add a given number if it's a prime number
	static List<Integer> primes = new CopyOnWriteArrayList<>();	
	public static void addPrime(int a) {
		for(int p : primes) {
			if((a % p) == 0) return;
		}
		primes.add(a);
	}
}
