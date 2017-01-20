package edu.pitt.is1017.model;

import java.util.Vector;

public class Model {
	
	private Vector<ListItem> todoList;
	
	public Model(){
		todoList= new Vector<ListItem>();
	}
	
	public void addListItem(String text){
		todoList.addElement(new ListItem(text));
	}
	
	public void deleteListItem(int i){
		todoList.removeElement(i);
	}
	
	public Vector<ListItem> getList(){
		return todoList;
	}

}
