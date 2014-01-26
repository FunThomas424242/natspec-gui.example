package gh.funthomas424242.examples.flow;

import gh.funthomas424242.examples.flow.support.Flow;
import gh.funthomas424242.examples.flow.support.SubFlow;
import gh.funthomas424242.examples.lib.BusinessModel;

public class LoginFlow extends SubFlow implements Runnable { 
	
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
		// The code in this method is generated from: /natspec-swingapp.example/src/main/java/gh/funthomas424242/examples/flow/LoginFlow.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Nutze den Registrierten Flow.
		gh.funthomas424242.examples.flow.support.Flow flow_ = flowSupport.nutzeDenRegistriertenFlow();
		// Erstelle einen Logindialog.
		gh.funthomas424242.examples.gui.support.swing.SwingDialog swingDialog_ = flowSupport.erstelleEinenLogindialog();
		// Registriere am Button examples.login.button.login den SchliessenFlow.
		flowSupport.registriereSchliessenFlowAmButton("examples.login.button.login", swingDialog_, flow_);
		// Registriere am Button examples.login.button.cancel den BeendenFlow.
		flowSupport.registriereBeendenFlowAmButton("examples.login.button.cancel", swingDialog_, flow_);
		 
	
	}

}
