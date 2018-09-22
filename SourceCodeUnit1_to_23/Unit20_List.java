package com.hola_labjava.basics;
import java.util.ArrayList;
import java.util.List;

public class Unit20_List<E> {
 private List<E> backingStore; 
 public Unit20_List() { 
	 backingStore = new ArrayList<E>();
	 
 } 
 		public E add(E e) { 
 			if (backingStore.add(e)) return e;
 			else return null; 
 			
 		} 
 		
 		public int size() { 
 			return backingStore.size(); 
 			}
 		public void clear() { 
 				backingStore.clear(); 
 				}

}
