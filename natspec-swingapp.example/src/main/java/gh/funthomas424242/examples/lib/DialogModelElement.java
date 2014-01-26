package gh.funthomas424242.examples.lib;

import java.util.Hashtable;
import java.util.Map;

public abstract class DialogModelElement {

    final protected String dialogId;
    final Map<String, Object> elements = new Hashtable<String, Object>();

    public DialogModelElement(final String dialogId) {
        this.dialogId = dialogId;
    }

    public abstract void schliesseDialog();

    public String getDialogId() {
        return dialogId;
    }

    public Boolean isContainedElement(final Object element) {
        return elements.containsValue(element);
    }

    public Boolean isContainedElementId(final String elementId) {
        return elements.containsKey(elementId);
    }

    public Object putElement(final String elementId, final Object element) {
        return elements.put(elementId, element);
    }

    public Object getElement(final String elementId) {
        return elements.get(elementId);
    }

}
