package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		int [] tab = tabell;
		
		for (int i = 0; i <= tab.length-1; i++) {
			System.out.print(tab[i]+(" "));
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String part = "";
		String output ="";
		String f = "[";
		String b = "]";
		
		int [] tab = tabell;
		
		for (int i = 0; i <= tab.length-1; i++) {
			
		if (tab.length-1 != i) {	
		part = (Integer.toString(tab[i])) + ",";
		
		
		output = output + part;
		}
		else {
			part = (Integer.toString(tab[i]));
		
		
		output = output + part;
		}
		}
		output = f + output + b;
		
		return output;
		
		
		}
	

	// c)
	public static int summer(int[] tabell) {
		
		int [] tab = tabell;
		int sum = 0;
		
		for (int i = 0; i <= tab.length-1; i++) {
			sum = sum + tab[i];
		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int [] tab = tabell;
		int t = tall;
		boolean funnet = false;
		
		for (int i = 0; i <= tab.length-1; i++) {
			if (tab[i] == t) funnet = true;
		}
		
		return funnet;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int [] tab = tabell;
		int t = tall;
		int ut = -1;
		
		for (int i = 0; i <= tab.length-1; i++) {
			if (tab[i] == t) ut = i;
			
		}
		
		return ut;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] tab = tabell;
		int u = tab.length;
		int [] reverse = new int [u];
		int ned = u;
		
		for (int i = 0; i < ned; i++) {
		reverse[i] = tab[u-1];
		u--;
		
		}
		return reverse;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

	boolean sortert = true;
	if (tabell.length == 0) {
		return true;
	}
	int x = tabell[0];
	
	for (int i = 1; i<=tabell.length-1; i++) {
		if (x > tabell[i]) {
			return false;
		}
		x = tabell[i];
	}
	
	return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		 int tab [] = new int [tabell1.length + tabell2.length];
	        int n = 0;

	        for (int i = 0; i < tabell1.length; i++) {
	            tab[i] = tabell1[i];
	        }
	        for (int j = tabell1.length; j < tab.length; j++) {
	            tab[j] = tabell2[n];
	            n++;
	        }
	        return tab;

	    }
	}
		
		
		
		
	

