package gh.funthomas424242.examples.lib;

import java.util.HashMap;
import java.util.Map;

public class BusinessModel {
	
	final Map<String,DialogModelElement> dialoge=new HashMap<String,DialogModelElement>();
	
	public Boolean isContainedDialog(final DialogModelElement dialog){
		return dialoge.containsValue(dialog);
	}
	
	public Boolean isContainedDialogId(final String dialogId){
		return dialoge.containsKey(dialogId);
	}
	
	public DialogModelElement putDialog(final String dialogId, final DialogModelElement dialog){
		return dialoge.put(dialogId, dialog);
	}
	
	public DialogModelElement getDialog(final String dialogId){
		return dialoge.get(dialogId);
	}
	
	public Object removeDialog(final String dialogId){
		return dialoge.remove(dialogId);
	}

}
