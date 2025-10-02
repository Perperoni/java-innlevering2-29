package no.hvl.dat100.matriser;

public class Matriser {

    static int[][] copyEmptyMatrixInt(int[][] matrise) {
        int[][] copyMatrix = new int[matrise.length][];
        for (int i = 0; i < matrise.length; i++) copyMatrix[i] = new int[matrise[i].length];

        return copyMatrix;
    }

    static String[][] copyEmptyMatrixString(int[][] matrise) {
        String[][] copyMatrix = new String[matrise.length][];
        for (int i = 0; i < matrise.length; i++) copyMatrix[i] = new String[matrise[i].length];

        return copyMatrix;
    }

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
        String[][] stringMatrise = copyEmptyMatrixString(matrise);

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
		int[][] multiplydMatrix = copyEmptyMatrixInt(matrise);
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
        int[][] transposedMatrix = copyEmptyMatrixInt(matrise);
        for (int i = 0; i < matrise.length; i++){
            for (int j = 0; j < matrise[i].length; j++) {
                transposedMatrix[i][j] = matrise[j][i];
            }
        }
	    return transposedMatrix;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
        if (a[0].length != b.length) throw new UnsupportedOperationException("Kan ikke utføre matrise-multiplikasjon. For å kunne utføre matrise-multiplikasjon må antall kolonner i den første matrisen tilsvare antall rader i den andre matrisen.");
        int[][] ab = new int[a.length][b[0].length];

        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab[i].length; j++) {
                int sum = 0;
                for (int k = 0; k < a[i].length; k++) sum += a[i][k] * b[k][j];
                ab[i][j] = sum;
            }
        }

        return ab;
	}
}
