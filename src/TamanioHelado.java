/**
 * Enumeración que representa los tamaños de helado disponibles.
 *
 * @author REMR11
 */
public enum TamanioHelado {
    PEQUENIO(2),
    MEDIANIO(3),
    GRANDE(4);


    private final double costo;

    /**
     * Constructor que inicializa el costo del tamaño de helado.
     *
     * @param costo el costo del tamaño de helado
     */
    TamanioHelado(double costo) {
        this.costo = costo;
    }

    /**
     * Obtiene el costo del tamaño de helado.
     *
     * @return el costo del tamaño de helado
     */
    public double getCosto() {
        return costo;
    }
}

