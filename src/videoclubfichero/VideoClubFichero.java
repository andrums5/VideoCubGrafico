/*
 * Ejemplo videoclub con persistencia en fichero (XML)
 */
package videoclubfichero;

import utilidades.Fichero;

/**
 *
 * @author mfontana
 */
public class VideoClubFichero {
    public static Fichero miFichero;
    public static ListaPeliculas misPeliculas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        miFichero = new Fichero ("videoclub.xml");
        misPeliculas = (ListaPeliculas)miFichero.leer();
        if (misPeliculas == null) {
            // Inicializo la lista como una lista nueva (vacía)
            misPeliculas = new ListaPeliculas();
        }
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
        
    }
    
}
