package tab;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestTabtrieD {
	@Test (expected = Exception.class) 
	public void mainTa() throws Exception{
		int tab[] = {};
		Tabtrie tab2 = new Tabtrie();
		tab2.trieD(tab);
		tab2.afficher(tab);
	}
	@Test
	public void mainT() throws Exception{
		int tab[] = {1,2,3,8,6,9,6};
		Tabtrie tab2 = new Tabtrie();
		tab2.trieD(tab);
		tab2.afficher(tab);
	}
	
	
}

