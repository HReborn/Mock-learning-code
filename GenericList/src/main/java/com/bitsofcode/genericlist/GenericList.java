package com.bitsofcode.genericlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class GenericList<T> implements Iterable<T> {
	private T[] dataArray = createNsizedTarray(0);
	
	GenericList() {
	}
	@SafeVarargs
	GenericList(T... data) {
		for (T elmt : data) {
			if (ifNullCreateDataArray(elmt)) {
				continue;
			}
			this.add(elmt);
		}
	}
	GenericList(Collection<T> data) {
		if(data instanceof Map) {
			return;
		}
		for (T elmt : data) {
			if (ifNullCreateDataArray(elmt)) {
				continue;
			}
			this.add(elmt);
		}
	}
	private boolean ifNullCreateDataArray(T elmt) {
		if (dataArray.length == 0) {
			dataArray = createNsizedTarray(1);
			dataArray[0] = elmt;
			return true;
		} else {
			return false;
		}
	}
	
	public void add(Collection<T> data) {
		if(data instanceof Map) {
			return;
		}
		for (T elmt : data) {
			add(elmt);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void add(T... data) {
		for (T elmt : data) {
			add(elmt);
		}
	}
	
	public void add(T elmt) {
		// primeiro criamos uma array temporário para armazenar valores atuais
		// fazemos isso porque os valores são perdidos ao aumentar o array
		// quando criamos um novo e damos o assignment ao dataArray
		T[] tempArr = cloneDataArrayIntoNewObject();
		// aumentamos o array para armazenar o valor
		// ao aumentar o array, todos os valores retornados são nulos
		// só após ter um array aumentado nulo, nós pegamos todos os valores
		// guardados e colocamos no dataArray
		dataArray = assignValuesIntoAugmentedEmptyArray(tempArr);
		// quando todos os valores já existentes já estão no array
		// dizemos que o último valor do array é o elemento a ser adicionado
		// já que quando aumentamos o array, o último valor vai ser nulo.
		dataArray[dataArray.length-1] = elmt;
	}
	private T[] assignValuesIntoAugmentedEmptyArray (T[] tempArr) {
		T[] array = createNsizedTarray(tempArr.length+1);
		int i = 0;
		for (T temp : tempArr) {
			array[i++] = temp;
		}
		return array;
	}
	private T[] cloneDataArrayIntoNewObject() {
		T[] tempArr = createNsizedTarray(dataArray.length);
		int i = 0;
		for (T temp : this) {
			tempArr[i++] = temp;
		}
		return tempArr;
	}
	
	public void remove(int index) {
		int leftLenght = index;
		int rightLenght = dataArray.length - index - 1;
		T[] tempArray = createNsizedTarray(dataArray.length - 1);
		System.arraycopy(dataArray, 0, tempArray, 0, leftLenght);
		// when i do index+1, i skip the value i wanna skip
		System.arraycopy(dataArray, index+1, tempArray, leftLenght, rightLenght);
		dataArray = tempArray;
	}
	
	public void remove(T elmt) {
		// remove first ocurrence of the element
		int i = 0;
		for (T temp : this) {
			if (Objects.equals(elmt, temp)) {
				remove(i);
				break;
			}
			i++;
		}
	}
	
	public T get(int index) {
		//System.out.println(dataArray[]);
		return dataArray[index];
	}
	
	public int getIndex(T elmt) {
		int i = 0;
		for (T temp : this) {
			if (Objects.equals(elmt, temp)) {
				break;
			}
			i++;
		}
		return i;
	}
	
	public int getSize() {
		return dataArray.length;
	}
	
	@SuppressWarnings("unchecked")
	private T[] createNsizedTarray(int n) {
		return (T[]) new Object[n];
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new GenericListIterator<T>(dataArray);
	}
	
	@Override
	public String toString() {
		String display = "";
		for (T temp : this) {
			display += temp + "\n";
		}
		return display;
	}
	
	@SuppressWarnings("hiding")
	private class GenericListIterator<T> implements Iterator<T> {
		T[] list;
		int count = 0;
		
		GenericListIterator(T[] dataArray) {
			list = dataArray;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return count < list.length;
		}
		
		@Override
		public T next() {
			// TODO Auto-generated method stub
			return list[count++];
		}
	}
}