
/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogot? - Colombia)
 * Programa de Ingenier?a de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Gu?a 2 - Actividad 2
 * Ejercicio: alcancia
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package mundo;

import java.util.Random;

public class Alcancia {
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * N?mero de monedas de $50 que hay en la alcanc?a.
     */
    private int numeroMonedas50;

    /**
     * N?mero de monedas de $100 que hay en la alcanc?a.
     */
    private int numeroMonedas100;

    /**
     * N?mero de monedas de $200 que hay en la alcanc?a.
     */
    private int numeroMonedas200;

    /**
     * N?mero de monedas de $500 que hay en la alcanc?a.
     */
    private int numeroMonedas500;

    /**
     * N?mero de monedas de $1000 que hay en la alcanc?a.
     */
    private int numeroMonedas1000;

    /**
     * Estado de la alcanc?a. <br>
     * 0 indica que no est? rota. <br>
     * 1 indica que est? rota.
     */
    private int estado;

    // -----------------------------------------------------------------
    // M?todos
    // -----------------------------------------------------------------

    /**
     * Construye la alcanc?a. <br>
     * <b>post: </b> El n?mero de monedas de 50, n?mero de monedas de 100, n?mero de monedas de 200, n?mero de monedas de 500, n?mero de monedas de 1000 <br>
     * y el estado fueron inicializados en 0.
     */
    public Alcancia() {
        numeroMonedas50 = 0;
        numeroMonedas100 = 0;
        numeroMonedas200 = 0;
        numeroMonedas500 = 0;
        numeroMonedas1000 = 0;
        estado = 0;
    }

    /**
     * Retorna el n�mero de monedas de $50 que hay en la alcanc�a.
     *
     * **@return** N�mero de monedas de $50 en la alcanc�a.
     */
    public int darNumeroMonedas50() {
        return numeroMonedas50;
    }

    /**
     * Retorna el n�mero de monedas de $100 que hay en la alcanc�a.
     *
     * **@return** N�mero de monedas de $100 en la alcanc�a.
     */
    public int darNumeroMonedas100() {
        return numeroMonedas100;
    }

    /**
     * Retorna el n�mero de monedas de $200 que hay en la alcanc�a.
     *
     * **@return** N�mero de monedas de $200 en la alcanc�a.
     */
    public int darNumeroMonedas200() {
        return numeroMonedas200;
    }

    /**
     * Retorna el n�mero de monedas de $500 que hay en la alcanc�a.
     *
     * **@return** N�mero de monedas de $500 en la alcanc�a.
     */
    public int darNumeroMonedas500() {
        return numeroMonedas500;
    }

    /**
     * Retorna el n�mero de monedas de $1000 que hay en la alcanc�a.
     *
     * **@return** N�mero de monedas de $1000 en la alcanc�a.
     */
    public int darNumeroMonedas1000() {
        return numeroMonedas1000;
    }

    /**
     * Informa si la alcanc�a est� rota o no.
     *
     * **@return** Retorna "ROTA" si est� rota, "NO ROTA" en caso contrario.
     */
    public String darEstado() {
        if (estado == 1) {
            return "ROTA";
        } else {
            return "NO ROTA";
        }
    }

    /**
     * Retorna el total de dinero que hay en la alcanc?a.
     *
     * @return Total de dinero que hay en la alcanc?a.
     */
    public int calcularTotalDinero() {
        return numeroMonedas50 * 50 + numeroMonedas100 * 100 + numeroMonedas200 * 200 + numeroMonedas500 * 500 + numeroMonedas1000 * 1000;
    }

    private int ahorroPorDenominacion(int denominacion) {
        switch (denominacion) {
            case 50:
                return numeroMonedas50 * 50;
            case 100:
                return numeroMonedas100 * 100;
            case 200:
                return numeroMonedas200 * 200;
            case 500:
                return numeroMonedas500 * 500;
            case 1000:
                return numeroMonedas1000 * 1000;
            default:
                return 0;
        }
    }

    /**
     * Retorna el estado de la alcanc?a. <br>
     * <b>pre: </b> La alcanc?a no est? rota.
     *
     * @return Cadena que informa la cantidad de monedas que hab?a en la alcanc?a y la cantidad total de dinero.
     */
    public String darEstadoAlcancia() {
        int totalDinero = calcularTotalDinero();
        return "La alcanc�a ten�a: \n" +
                numeroMonedas50 + " moneda(s) de $50 ($" + ahorroPorDenominacion(50) + " pesos)\n" +
                numeroMonedas100 + " moneda(s) de $100 ($" + ahorroPorDenominacion(100) + " pesos)\n" +
                numeroMonedas200 + " moneda(s) de $200 ($" + ahorroPorDenominacion(200) + " pesos)\n" +
                numeroMonedas500 + " moneda(s) de $500 ($" + ahorroPorDenominacion(500) + " pesos)\n" +
                numeroMonedas1000 + " moneda(s) de $1000 ($" + ahorroPorDenominacion(1000) + " pesos)\n" +
                "Para un total de $" + totalDinero + " pesos.";
    }

    /**
     * Agrega una moneda de $50 a la alcanc?a. <br>
     * <b>pre: </b> La alcanc?a no est? rota. <br>
     * <b>post: </b> Aument? en uno la cantidad de monedas de $50 en la alcanc?a.
     */
    public void agregarMoneda50() {
        numeroMonedas50++;
    }

    /**
     * Agrega una moneda de $100 a la alcanc?a. <br>
     * <b>pre: </b> La alcanc?a no est? rota. <br>
     * <b>post: </b> Aument? en uno la cantidad de monedas de $100 en la alcanc?a.
     */
    public void agregarMoneda100() {
        numeroMonedas100++;
    }

    /**
     * Agrega una moneda de $200 a la alcanc?a. <br>
     * <b>pre: </b> La alcanc?a no est? rota. <br>
     * <b>post: </b> Aument? en uno la cantidad de monedas de $200 en la alcanc?a.
     */
    public void agregarMoneda200() {
        numeroMonedas200++;
    }

    /**
     * Agrega una moneda de $500 a la alcanc?a. <br>
     * <b>pre: </b> La alcanc?a no est? rota. <br>
     * <b>post: </b> Aument? en una la cantidad de monedas de $500 en la alcanc?a.
     */
    public void agregarMoneda500() {
        numeroMonedas500++;
    }

    /**
     * Agrega una moneda de $1000 a la alcanc?a. <br>
     * <b>pre: </b> La alcanc?a no est? rota. <br>
     * <b>post: </b> Aument? en uno la cantidad de monedas de $1000 en la alcanc?a.
     */
    public void agregarMoneda1000() {
        numeroMonedas1000++;
    }

    /**
     * Rompe la alcanc?a. Es decir, cambia el estado a 1<br>
     */
    public void romperAlcancia() {
        estado = 1; // Cambiar el estado a 1 para indicar que la alcanc�a est� rota
    }

    // -----------------------------------------------------------------
    // Puntos de Extensi?n
    // -----------------------------------------------------------------

    /**
     * De las 5 denominaciones de monedas que hay en la alcanc?a (de 50, de 100,
     * de 200, de 500 y de 1000), retorna cu?l tiene la mayor cantidad de monedas.
     *
     * @return la denominaci?n m?s numerosa en la alcanc?a: 50 o 100 o 200 o 500 o 1000.
     */
    public int obtenerDenominacionMasNumerosa() {
        int max = Math.max(Math.max(Math.max(numeroMonedas50, numeroMonedas100), numeroMonedas200), Math.max(numeroMonedas500, numeroMonedas1000));
        if (max == numeroMonedas50) {
            return 50;
        } else if (max == numeroMonedas100) {
            return 100;
        } else if (max == numeroMonedas200) {
            return 200;
        } else if (max == numeroMonedas500) {
            return 500;
        } else {
            return 1000;
        }
    }


    /**
     * Una alcanc?a es valiosa si solo posee monedas de 1000 y de 500, y no hay
     * monedas de otras denominaciones.
     *
     * Este m?todo permite determinar si la alcanc?a es valiosa, o sea, solo posee
     * monedas de 1000 pesos y de 500
     *
     * @return si es valiosa o no
     */
    public boolean valiosa() {
        return (numeroMonedas50 == 0 && numeroMonedas100 == 0 && numeroMonedas200 == 0 && (numeroMonedas500 > 0 || numeroMonedas1000 > 0));
    }

    public void llenarConMonedasAleatorias(int cantidad) {
        Random random = new Random();
        int monedas50 = 0, monedas100 = 0, monedas200 = 0, monedas500 = 0, monedas1000 = 0;
        for (int i = 0; i < cantidad; i++) {
            int tipoMoneda = random.nextInt(5);
            switch (tipoMoneda) {
                case 0: monedas50++; break;
                case 1: monedas100++; break;
                case 2: monedas200++; break;
                case 3: monedas500++; break;
                case 4: monedas1000++; break;
            }
        }

        numeroMonedas50 += monedas50;
        numeroMonedas100 += monedas100;
        numeroMonedas200 += monedas200;
        numeroMonedas500 += monedas500;
        numeroMonedas1000 += monedas1000;
    }
}