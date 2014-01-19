package gh.funthomas424242.examples.gui.model;

import javax.swing.JFrame;

public class SwingDialog {
	
	final protected String dialogId;
	final protected JFrame dialog;
	
	
	public SwingDialog(final String dialogId, final JFrame dialog){
		this.dialogId=dialogId;
		this.dialog=dialog;
	}


	public String getDialogId() {
		return dialogId;
	}


	public JFrame getDialog() {
		return dialog;
	}
	
	
}
