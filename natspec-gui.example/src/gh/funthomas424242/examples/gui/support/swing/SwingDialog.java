package gh.funthomas424242.examples.gui.support.swing;

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


	public Boolean isContainedElement(final Object element){
		return elements.containsValue(element);
	}
	
	public Boolean isContainedElementId(final String elementId){
		return elements.containsKey(elementId);
	}
	
	public Object putElement(final String elementId, final Object element){
		return elements.put(elementId, element);
	}
	
	public Object getElement(final String elementId){
		return elements.get(elementId);
	}
	
	
	
	
}
