package gh.funthomas424242.examples.gui.swing;

import java.util.Hashtable;
import java.util.Map;

import javax.swing.JFrame;

public class SwingDialog {
	
	final protected String dialogId;
	final protected JFrame dialog;
	final Map<String,Object> elements=new Hashtable<String,Object>();
	
	
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
