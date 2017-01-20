package edu.pitt.is1017.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton implements ActionListener{
	
	private Controller controller;
	
	public AddButton(Controller controller){
		this.controller = controller;
	}
	
	public void actionPerformed(ActionEvent e) {
		String enteredText = controller.getView().getItemArea().getText();
		controller.getView().getListModel().addElement(enteredText);
		controller.getModel().addListItem(enteredText);
		controller.getView().getItemArea().setText(null);
	}

}
