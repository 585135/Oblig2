package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		int [][] mat = matrise;
		
		for (int i = 0; i < mat.length; i++ ) {
			for (int j = 0; j < mat.length; j++ ) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {


        String out = "";
        String part = "";

        int [][] matrix = matrise;

        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix.length; j++) {

            part = Integer.toString(matrix[i][j]);
            
            out = out + part + " ";
            }
            out = out+"\n";
        
        
        }
       
        return out;
    }
	

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] matrix = matrise;
		int t = tall;

        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix.length; j++) {
            	matrix[i][j] = matrix[i][j] * t;
           }
            }
        return matrix;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int [][] mata = a;
		int [][] matb = b;
		boolean lik = false;

        for (int i = 0; i<mata.length; i++) {
            for (int j = 0; j<mata.length; j++) {
            	if (mata[i][j] == matb[i][j]) lik = true;
           }
            }
        return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		// TODO
		throw new UnsupportedOperationException("multiplikasjon ikke implementert");
		
	}
	
	}

