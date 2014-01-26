package gh.funthomas424242.examples.flow.support;

import gh.funthomas424242.examples.gui.support.swing.SwingDialog;
import gh.funthomas424242.examples.lib.BusinessModel;

public abstract class Flow  implements Runnable{

	protected final BusinessModel model;
	protected String flowName;
	protected SwingDialog rufenderDialog;
	
	
	public abstract void run();
	
	public Flow(final BusinessModel model){
		this.model=model;
	}

	public void setFlowName(final String flowName){
		this.flowName=flowName;
	}
	
	public String getFlowName() {
		return flowName;
	}

	public SwingDialog getRufenderDialog() {
		return rufenderDialog;
	}

	public void setRufenderDialog(SwingDialog rufenderDialog) {
		this.rufenderDialog = rufenderDialog;
	}

}
