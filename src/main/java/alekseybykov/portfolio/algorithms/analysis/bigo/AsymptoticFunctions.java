package alekseybykov.portfolio.algorithms.analysis.bigo;

class AsymptoticFunctions {

	// f(n) = x1 + x2*n = O(n), x1 and x2 is not significant.
	 void On_Example01(int n) {
		int var1 = 0;                   // x1
		for (int i = 0; i < n; i++) {
			var1 += i;                  // x2*n
		}
	}
}
