package b;

import javax.persistence.Entity;

import a.AImpl;





@Entity
public class BImpl extends AImpl {

	public AImpl getA() {
		return null;
	}

	public void setA(AImpl a) {}
}
