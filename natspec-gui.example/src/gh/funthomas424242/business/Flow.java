package gh.funthomas424242.business;

import gh.funthomas424242.examples.gui.swing.SwingDialog;

public class Flow  {

	protected final BusinessModel model;
	protected final Flow parentFlow;
	
	protected String flowName;
	protected SwingDialog rufenderDialog;
	
	
	public Flow(final BusinessModel model, final Flow parentFlow){
		this.model=model;
		this.parentFlow=parentFlow;
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
