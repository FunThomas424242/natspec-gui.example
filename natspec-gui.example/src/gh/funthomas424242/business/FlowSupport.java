package gh.funthomas424242.business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gh.funthomas424242.business.flow.LoginFlow;
import gh.funthomas424242.examples.gui.dialogs.spec.HalloWeltDialog;
import gh.funthomas424242.examples.gui.dialogs.spec.LoginDialog;
import gh.funthomas424242.examples.gui.swing.SwingDialog;
import de.devboost.natspec.annotations.TextSyntax;

public class FlowSupport {

	final protected BusinessModel model;
	final protected Flow supportedFlow;

	public FlowSupport(final BusinessModel model, final Flow supportedFlow) {
		this.model = model;
		this.supportedFlow=supportedFlow;
	}

	@TextSyntax("Nutze den Registrierten Flow.")
	public Flow nutzeDenRegistriertenFlow() {
		return supportedFlow;
	}
	
	@TextSyntax("Erstelle den Flow #1")
	public Flow erstelleDenFlow(String flowId) {
		final Flow flow= new Flow(model,null);
		flow.setFlowName(flowId);
		return flow;
	}

	
	@TextSyntax("Erstelle einen HalloWeltDialog.")
	public SwingDialog erstelleEinenHelloLabeldialog() {
		return new HalloWeltDialog().createDialog();
	}

	@TextSyntax("Erstelle einen Logindialog.")
	public SwingDialog erstelleEinenLogindialog() {
		return new LoginDialog().createDialog();
	}

	@TextSyntax("Registriere den LoginFlow am Button #1")
	public void registriereLoginFlowAmButton(final String elementId,
			final SwingDialog dialog, final Flow parentFlow) {
		final LoginFlow loginFlow = new LoginFlow(this.model, parentFlow);
		loginFlow.setRufenderDialog(dialog);
		final JButton button = (JButton) dialog.getElement(elementId);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loginFlow.run();
			}
		});
	}

	@TextSyntax("Schliesse den rufenden Dialog.")
	public void schliesseDenRufendenDialog(final Flow flow) {
		SwingDialog dialog=flow.getRufenderDialog();
		dialog.getDialog().dispose();
		
	}

	

}
