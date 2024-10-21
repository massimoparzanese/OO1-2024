package ar.edu.unlp.info.oo1.FilteredSet16;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EvenNumberSet extends HashSet<Integer>{



	public EvenNumberSet() {
		super();
	}

	
	public boolean insertar(int number) {
		if((number % 2) == 0) {
			super.add(number);
			return true;
		}
		else return false;
		
	}
		
	

}
