package gh.funthomas424242.examples.flow.support;

import gh.funthomas424242.examples.app.BusinessModel;
import gh.funthomas424242.examples.gui.support.swing.SwingDialog;

public class Flow  {

	protected final BusinessModel model;
	protected String flowName;
	protected SwingDialog rufenderDialog;
	
	
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
