
public class TestTabtrie {
	public static void main(String[] args) {
		int tab[] = {0,1,15,4,5,12,7,11,12};
		Tabtrie tab2 = new Tabtrie();
		tab2.trieC(tab);
		boolean c = tab2.rechercheT(11,tab);
		tab2.afficher(tab);
		System.out.println(c);
	}
}
