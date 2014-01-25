package gh.funthomas424242.examples.flow;

import gh.funthomas424242.examples.app.BusinessModel;
import gh.funthomas424242.examples.flow.support.Flow;
import gh.funthomas424242.examples.flow.support.FlowSupport;
import gh.funthomas424242.examples.flow.support.SubFlow;

public class MainFlow extends SubFlow implements Runnable { 
	
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
		// The code in this method is generated from: /natspec-swingapp.example/src/main/java/gh/funthomas424242/examples/flow/MainFlow.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Erstelle den Flow MainFlow
		gh.funthomas424242.examples.flow.support.Flow flow_MainFlow = flowSupport.erstelleDenFlow("MainFlow");
		// Erstelle einen StartDialog.
		gh.funthomas424242.examples.gui.support.swing.SwingDialog swingDialog_ = flowSupport.createStartDialog();
		// Registriere am Button examples.button.login den LoginFlow.
		flowSupport.registriereLoginFlowAmButton("examples.button.login", swingDialog_, flow_MainFlow);
		// Registriere am Button examples.button.close den SchliessenFlow.
		flowSupport.registriereSchliessenFlowAmButton("examples.button.close", swingDialog_, flow_MainFlow);
		 
	
	}

}
