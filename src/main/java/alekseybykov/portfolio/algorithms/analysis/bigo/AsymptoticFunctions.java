package alekseybykov.portfolio.algorithms.analysis.bigo;

class AsymptoticFunctions {

	// f(n) = x1 + x2*n = O(n), fast growing term.
	// x1 and x2 is not significant, low growing terms or constants.
	 void On_Ex01(int n) {
		int var1 = 0;                   // x1
		for (int i = 0; i < n; i++) {
			var1 += i;                  // x2*n
		}
	}

	// f(n) = x1 + x2*(n-3) + x3 + x4*n + x5*10 = x2*(n-3) + x4*n = x2*n - x2*3 + x4*n = O(n), fast growing term.
	// x1, x2, x3, x4, x5 is not significant, low growing terms or constants.
	void On_Ex02(int n) {
		int var1 = 0;                   // x1
		for (int i = n-3; i >= 1; i--) {
			var1 += i;                  // x2*(n-3)
		}

		var1 = 1;                       // x3

		for (int i = 0; i < n; i++) {
			var1 += i;                  // x4*n
		}

		for (int i = 0; i < 10; i++) {
			var1 += i;                  // x5*10
		}
	}
}
