package gh.funthomas424242.examples.lib;

public abstract class DialogModelElement {

	final protected String dialogId;

	public DialogModelElement(final String dialogId) {
		this.dialogId = dialogId;
	}

	public String getDialogId() {
		return dialogId;
	}

}
