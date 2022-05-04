/**
 * <h1><u>Sommatoria</u></h1> <i>ditta Meucci</i>
 * 
 * <UL>
 * Funzioni:
 * <li>calcola sommatoria di un certo valore</li>
 * </UL>
 * 
 * @author<b>SparascioFrancesco</b>
 * @version 1.0
 *          <p>
 *          <u>4CI</u>
 *          </p>
 *          <p>
 *          <i>04-05-2022</i>
 *          </p>
 * 
 */
public class SparascioFrancescoClass {

	/**
	 * metodo che calcola la sommatoria di un valore
	 * 
	 * @param f valore da calcolare la sommatoria
	 * @return sommatoria
	 */
	// l'errore era nel metodo in quanto per calcolatore la sommatoria l'operatore
	// da predere in considerazione è il '+', inoltre il ciclo for era errato in
	// quanto si inizializzava l'indice al valore da cui si deve calcolare la
	// sommatoria e si faceva ripetere il ciclo quando questo non diventava minore
	// di 0
	public int sparascioMet(int f) {
		int r = 0;
		for (int i = 1; i <= f; i++) {
			r = r + i;
		}
		return r;
	}
	
	/**
	 * metodo che testa il corretto funzionamento della classe
	 * 
	 * @param args parametri in input
	 */
	public static void main(String[] args) {
		SparascioFrancescoClass f = new SparascioFrancescoClass();
		System.out.println(f.sparascioMet(4));
	}
}
