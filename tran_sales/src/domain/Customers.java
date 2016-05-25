package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customers {
	private List<CustomersAccount> accounts;
	
	public Customers() {
		accounts = new ArrayList<>();
	}	
		
	public void add(CustomersAccount a) {
		accounts.add(a);
	}
	
	public void clear() {
		accounts.clear();
	}

	public void remove(CustomersAccount a) {
		accounts.remove(a);
	}

	public void remove(CustomersAccount... acc) {
		for (CustomersAccount a: acc) {
			remove(a);
		}
	}

	public void add(CustomersAccount... acc) {
		for (CustomersAccount a: acc) {
			add(a);
		}
	}
	
	public void addAll( List<CustomersAccount> accountList ) {
		accounts.addAll( accountList );
	}
	
	public List<CustomersAccount> getAccounts(){
		return Collections.unmodifiableList( accounts );
	}

	@Override
	public String toString() {
		return "Customers [accounts=" + accounts + "]";
	}
}
