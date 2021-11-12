package it.unibo.oop.lab.nesting2;

import java.util.List;

import javax.swing.text.ElementIterator;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> list;

	public OneListAcceptable(final List<T> list) {
		this.list = list;
	}

	@Override
	public Acceptor<T> acceptor() {
		return new OneListAcceptor<T>(list);
	}
	
	private static class OneListAcceptor<T> implements Acceptor<T> {
		
		private final List <T> list;
		private int count;

		public OneListAcceptor(final List<T> list) {
			super();
			this.list = list;
			this.count = 0;
		}

		@Override
		public void accept(T newElement) throws ElementNotAcceptedException {
			if (list.size() == count) {
				throw new ElementNotAcceptedException(newElement);
			}
			if (list.get(count).equals(newElement)) {
				count++;
			} else {
				throw new ElementNotAcceptedException(newElement);
			}
		}

		@Override
		public void end() throws EndNotAcceptedException {
			if (list.size() != count) {
				throw new EndNotAcceptedException();
			}
		}
		
	}

}
