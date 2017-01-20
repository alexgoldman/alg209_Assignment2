package edu.pitt.is1017.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DeleteButton implements ActionListener {
	
	private Controller controller;
	
	public DeleteButton(Controller controller){
		
		this.controller=controller;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		int i = controller.getView().getItemList().getSelectedIndex();
		if(controller.getView().getItemList().getSelectedValue()==null){
			controller.getView().getBtnDelete().setEnabled(false);
			controller.getView().getBtnDelete().setEnabled(true);
		}
		else{
		controller.getView().getListModel().removeElementAt(i);
		controller.getModel().deleteListItem(i);
		}
	}

}
