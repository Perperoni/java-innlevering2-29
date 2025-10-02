package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        int longest = findLongest(matrise);
        String[][] stringMatrise = buildStringMatrise(matrise, longest);

        System.out.println("+-" + space(((longest/2 + longest + longest/2) * matrise[0].length) - 2) + "-+");
        for (int i = 0; i < stringMatrise.length; i++) {
            System.out.print("|");
            for (int j = 0; j < stringMatrise[i].length; j++) {
                System.out.print( space(longest/2) + stringMatrise[i][j] + space(longest/2));
            }
            System.out.println("|");
        }
        System.out.println("+-" + space(((longest/2 + longest + longest/2) * matrise[0].length) - 2) + "-+");
	}

    static int findLongest(int[][] matrise) {
        int longest = 2;

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                String str = String.valueOf(matrise[i][j]);
                if (str.length() > longest) longest = str.length();
            }
        }
        return longest;
    }

    static String[][] buildStringMatrise(int[][] matrise, int longest) {
        String[][] stringMatrise = new String[matrise.length][matrise[0].length];

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                String str = String.valueOf(matrise[i][j]);

                stringMatrise[i][j] = space(longest - str.length()) + str;
            }
        }
        return stringMatrise;
    }

    static String space(int length) {
        String space = "";
        for (int i = 0; i < length; i++) {
            space += " ";
        }
        return space;
    }

	// b)
	public static String tilStreng(int[][] matrise) {
        String returnString = "";

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                returnString += String.valueOf(matrise[i][j]) + " ";
            }
            returnString += "\n";
        }

        return returnString;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] multiplydMatrix = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                multiplydMatrix[i][j] = matrise[i][j] * tall;
            }
        }

	    return multiplydMatrix;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) return false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
		return true;
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
