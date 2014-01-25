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
		// The code in this method is generated from: /natspec-gui.example/src/gh/funthomas424242/examples/flow/MainFlow.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Erstelle den Flow MainFlow
		gh.funthomas424242.business.Flow flow_MainFlow = flowSupport.erstelleDenFlow("MainFlow");
		// Erstelle den Flow MainFlow
		gh.funthomas424242.flow.support.Flow flow_MainFlow0 = flowSupport.erstelleDenFlow("MainFlow");
		// Erstelle den Flow MainFlow
		gh.funthomas424242.examples.flow.support.Flow flow_MainFlow1 = flowSupport.erstelleDenFlow("MainFlow");
		// Erstelle einen HalloWeltDialog.
		gh.funthomas424242.examples.gui.swing.SwingDialog swingDialog_ = flowSupport.erstelleEinenHelloLabeldialog();
		// Erstelle einen HalloWeltDialog.
		gh.funthomas424242.examples.gui.swing.SwingDialog swingDialog_0 = flowSupport.erstelleEinenHelloLabeldialog();
		// Erstelle einen HalloWeltDialog.
		gh.funthomas424242.examples.gui.swing.SwingDialog swingDialog_1 = flowSupport.erstelleEinenHelloLabeldialog();
		// Erstelle einen HalloWeltDialog.
		gh.funthomas424242.examples.gui.support.swing.SwingDialog swingDialog_2 = flowSupport.erstelleEinenHelloLabeldialog();
		// Registriere den LoginFlow am Button halloWelt.button.ok
		flowSupport.registriereLoginFlowAmButton("halloWelt.button.ok", swingDialog_1, flow_MainFlow);
		// Registriere den LoginFlow am Button halloWelt.button.ok
		flowSupport.registriereLoginFlowAmButton("halloWelt.button.ok", swingDialog_1, flow_MainFlow0);
		// Registriere den LoginFlow am Button halloWelt.button.ok
		flowSupport.registriereLoginFlowAmButton("halloWelt.button.ok", swingDialog_2, flow_MainFlow1);
		 
	
	}

}
