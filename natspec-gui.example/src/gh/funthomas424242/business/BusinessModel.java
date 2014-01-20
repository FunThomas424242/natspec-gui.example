package gh.funthomas424242.business;

import gh.funthomas424242.examples.gui.swing.SwingDialog;

import java.util.HashMap;
import java.util.Map;

public class BusinessModel {
	
	final Map<String,SwingDialog> dialoge=new HashMap<String,SwingDialog>();
	
	public Boolean isContainedDialog(final SwingDialog dialog){
		return dialoge.containsValue(dialog);
	}
	
	public Boolean isContainedDialogId(final String dialogId){
		return dialoge.containsKey(dialogId);
	}
	
	public SwingDialog putDialog(final String dialogId, final SwingDialog dialog){
		return dialoge.put(dialogId, dialog);
	}
	
	public SwingDialog getDialog(final String dialogId){
		return dialoge.get(dialogId);
	}
	
	public Object removeDialog(final String dialogId){
		return dialoge.remove(dialogId);
	}

}
