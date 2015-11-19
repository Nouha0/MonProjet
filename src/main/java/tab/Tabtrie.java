package tab;


	public class Tabtrie {

	public void trieC(int tabTrie[]) throws Exception{
			if( tabTrie.length == 0){
				throw new Exception();
			}

			if (tabTrie.length > 2){
		
			int i,j;
			int tmp = 0;
			//int min = tabTrie[0];
			
			for(i = 0; i < tabTrie.length; i++){
				for(j = 0; j < tabTrie.length; j++){
					if( tabTrie[i] < tabTrie[j]){
						tmp = tabTrie[i];
						tabTrie[i] = tabTrie[j];
						tabTrie[j] = tmp;
					}
				}
			}
		}	
		
	}
	
	public void trieD(int tabTrie[]) throws Exception{
		int i,j;
		int tmp = 0;
		
		if( tabTrie.length == 0){
			throw new Exception();
		}
	
		for(i = 0; i < tabTrie.length; i++){
			for(j = 0; j < tabTrie.length; j++){
				if( tabTrie[i] > tabTrie[j]){
					tmp = tabTrie[i];
					tabTrie[i] = tabTrie[j];
					tabTrie[j] = tmp;
				}
			}
		}
		
	}
	
	public void afficher(int tabTrie[]){
		int i;
		for(i = 0; i < tabTrie.length; i++){
			System.out.print(" | " + tabTrie[i]);
		}
	}
}
