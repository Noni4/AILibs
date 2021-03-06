package jaicore.search.algorithms.interfaces;

import jaicore.graph.observation.IObservableGraphAlgorithm;

public interface IObservableORGraphSearch<T,A, V extends Comparable<V>> extends IORGraphSearch<T, A, V>, IObservableGraphAlgorithm<T,A> {
	
}
