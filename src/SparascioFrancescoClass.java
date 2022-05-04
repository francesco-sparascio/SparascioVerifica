/**
 * <h1><u>Sommatoria</u></h1>
 * <i>ditta Meucci</i>
 * 
 * <UL>
 * Funzioni:
 * <li>calcola sommatoria di un certo valore</li>
 * </UL>
 * 
 * @author<b>SparascioFrancesco</b>
 * @version 1.0
 * <p><u>4CI</u></p>
 * <p><i>04-05-2022</i></p>
 * 
 */
public class SparascioFrancescoClass {

	/**
	 * metodo che calcola la sommatoria di un valore
	 * @param f valore da calcolare la sommatoria
	 * @return sommatoria 
	 */
	public int sparascioMet(int f) {
		int r = 1;
		for (int i = f; i < 0; i++) {
			r = r * i;
		}
		return r;
	}
	
	/**
	 * metodo che testa il corretto funzionamento della classe
	 * @param args parametri in input
	 */
	public static void main(String[] args) {
		SparascioFrancescoClass f = new SparascioFrancescoClass();
		System.out.println(f.sparascioMet(4));
	}
}
