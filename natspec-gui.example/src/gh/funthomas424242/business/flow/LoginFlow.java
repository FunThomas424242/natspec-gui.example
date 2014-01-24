package gh.funthomas424242.business.flow;

import gh.funthomas424242.business.BusinessModel;
import gh.funthomas424242.business.Flow;
import gh.funthomas424242.business.FlowSupport;

public class LoginFlow extends Flow implements Runnable { 
	
	final protected FlowSupport flowSupport;
	
	public LoginFlow (final BusinessModel model, final Flow parentFlow){
		super(model,parentFlow);
		flowSupport = new FlowSupport(model,this);
	}
	
	public LoginFlow (final BusinessModel model){
		this(model,null);
	}
	
	public void run() {
		// generated code will be inserted here
		// The code in this method is generated from: /natspec-gui.example/src/gh/funthomas424242/business/flow/LoginFlow.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Nutze den Registrierten Flow.
		gh.funthomas424242.business.Flow flow_ = flowSupport.nutzeDenRegistriertenFlow();
		// Erstelle einen Logindialog.
		gh.funthomas424242.examples.gui.swing.SwingDialog swingDialog_ = flowSupport.erstelleEinenLogindialog();
		// Schliesse den rufenden Dialog.
		flowSupport.schliesseDenRufendenDialog(flow_);
		 
	
	}

}
