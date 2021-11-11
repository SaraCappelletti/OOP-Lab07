package it.unibo.oop.lab.nesting2;

import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	public OneListAcceptable(List<T>) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Acceptor<T> acceptor() {
		this.acceptor();
		return null;
	}

}
