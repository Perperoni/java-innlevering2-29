package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        int longest = findLongest(matrise);
        String[][] stringMatrise = buildStringMatrise(matrise, longest);

        for (int i = 0; i < stringMatrise.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < stringMatrise[i].length; j++) {
                System.out.print(stringMatrise[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("");
	}

    static int findLongest(int[][] matrise) {
        int longest = 0;

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                String str = String.valueOf(matrise[i][j]);
                if (str.length() > longest) longest = str.length();
            }
        }
        return longest;
    }

    static String[][] buildStringMatrise(int[][] matrise, int longest) {
        String[][] stringMatrise = new String[matrise.length][];

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                String str = String.valueOf(matrise[i][j]);

                String spacerStr = "";
                for (int k = 0; k < longest - str.length(); k++) {
                    spacerStr += " ";
                }
                stringMatrise[i][j] = spacerStr + str;
            }
        }
        return stringMatrise;
    }

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
