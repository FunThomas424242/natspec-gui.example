package gh.funthomas424242.examples.flow.support;

import gh.funthomas424242.examples.lib.BusinessModel;
import gh.funthomas424242.examples.lib.DialogModelElement;

public abstract class Flow implements Runnable {

    protected final BusinessModel model;
    protected String flowName;
    protected DialogModelElement rufenderDialog;

    @Override
    public abstract void run();

    public Flow(final BusinessModel model) {
        this.model = model;
    }

    public void setFlowName(final String flowName) {
        this.flowName = flowName;
    }

    public String getFlowName() {
        return flowName;
    }

    public DialogModelElement getRufenderDialog() {
        return rufenderDialog;
    }

    public void setRufenderDialog(DialogModelElement dialog) {
        this.rufenderDialog = dialog;
    }

}
