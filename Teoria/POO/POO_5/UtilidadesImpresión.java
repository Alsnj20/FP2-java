public class UtilidadesImpresión {
    public static final int MAX_COL = 80;
    public static final int MAX_ROW = 50;

    // Print given string horizontally centered.
    public static void imprimirCentrado(String s) {
        int startingCol;
        startingCol = (MAX_COL / 2) - (s.length() / 2);
        for (int i = 0; i < startingCol; i++)
            System.out.print(" ");
        System.out.println(s);
    }

    // Print given string with dashes underneath it.
    public static void imprimirSubrayado(String s) {
        System.out.println(s);
        for (int i = 0; i < s.length(); i++)
            System.out.print("-");
    }
}
