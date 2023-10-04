package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int i = 0; i < matrise.length; i++) {
			System.out.print("[");
			for(int j = 0; j < matrise[i].length; j++) {
				if(j == matrise[i].length - 1) {
					System.out.print(matrise[i][j]);
				} else {
					System.out.print(matrise[i][j] + ", ");
				}
			}
			System.out.println("]");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String matriseTxt = "";
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				if(j == matrise[i].length - 1) {
					matriseTxt += matrise[i][j] + " \n";
				} else {
					matriseTxt += matrise[i][j] + " ";
				}
			}
		}
		return matriseTxt;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
	    int[][] nyMatrise = new int[matrise.length][];
	    
	    for(int i = 0; i < nyMatrise.length; i++) {
	        nyMatrise[i] = new int[matrise[i].length];
	        for(int j = 0; j < nyMatrise[i].length; j++) {
	            nyMatrise[i][j] = matrise[i][j] * tall;
	        }
	    }
	    
	    return nyMatrise;
	}


	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		for(int i = 0; i < a.length && i < b.length; i++) {
			for(int j = 0; j < a[i].length && j < b[i].length; j++) {
				if(a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][];
		
		for(int i = 0; i < matrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];
			for(int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[j][i];
			}
		}
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		if(a[0].length != b.length) {
			return null;
		}
		
		int rad = a.length;
		int kolonne = b[0].length;
		int [][] nyMatrise = new int[rad][kolonne];
		
		for(int i = 0; i < rad; i++) {
			for(int j = 0; j < kolonne; j++) {
				for(int k = 0; k < a[0].length; k++) {
					nyMatrise[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		return nyMatrise;
	}
}
