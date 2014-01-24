package gh.funthomas424242.business.flow;

import gh.funthomas424242.business.BusinessModel;
import gh.funthomas424242.business.Flow;
import gh.funthomas424242.business.FlowSupport;

public class MainFlow extends Flow implements Runnable { 
	
	final protected FlowSupport flowSupport;
	
	public MainFlow (final BusinessModel model, final Flow parentFlow){
		super(model,parentFlow);
		flowSupport = new FlowSupport(model,this);
	}
	
	public MainFlow (final BusinessModel model){
		this(model,null);
	}
	
	public void run() {
		// generated code will be inserted here
		// The code in this method is generated from: /natspec-gui.example/src/gh/funthomas424242/business/flow/MainFlow.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Erstelle den Flow MainFlow
		gh.funthomas424242.business.Flow flow_MainFlow = flowSupport.erstelleDenFlow("MainFlow");
		// Erstelle einen HalloWeltDialog.
		gh.funthomas424242.examples.gui.swing.SwingDialog swingDialog_ = flowSupport.erstelleEinenHelloLabeldialog();
		// Registriere den LoginFlow am Button halloWelt.button.ok
		flowSupport.registriereLoginFlowAmButton("halloWelt.button.ok", swingDialog_, flow_MainFlow);
		 
	
	}

}
