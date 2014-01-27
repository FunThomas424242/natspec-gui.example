package gh.funthomas424242.examples.flow;

import gh.funthomas424242.examples.flow.support.Flow;
import gh.funthomas424242.examples.flow.support.SubFlow;
import gh.funthomas424242.examples.lib.BusinessModel;

/**
 * Diese Klasse repÃ¤sentiert einen Flow oder Subflow.
 * 
 * @author SchubertT006
 */
public class LoginFlow extends SubFlow implements Runnable {

    /**
     * Unterliegende Support Klasse.
     */
    private final FlowSupport flowSupport;

    /**
     * Diese Methode gibt die unterliegende Supoort Klasse zurÃ¼ck.
     * 
     * @return flowSupport
     */
    public final FlowSupport getFlowSupport() {
        return flowSupport;
    }

    /**
     * Konstruktor eines Subflow.
     * 
     * @param model globales Model der Anwendung.
     * @param parentFlow Flow zu dem der aktuelle Flow ein Teilflow ist.
     */
    public LoginFlow(final BusinessModel model, final Flow parentFlow) {
        super(model, parentFlow);
        flowSupport = new FlowSupport(model, this);
    }

    /**
     * Konstruktur fÃ¼r einen Top Level Flow.
     * 
     * @param model globales Model der Anwendung.
     */
    public LoginFlow(final BusinessModel model) {
        this(model, null);
    }

    /**
     * Methode zur AusfÃ¼hrung des Flows.
     */
    @Override
    public void run() {
        // generated code will be inserted here
        // The code in this method is generated from: /natspec-swingapp/src/main/java/gh/funthomas424242/examples/flow/LoginFlow.natspec
// Never change this method or any contents of this file, all local changes will be overwritten.

// Nutze den Registrierten Flow.
gh.funthomas424242.examples.flow.support.Flow flow_ = flowSupport.nutzeDenRegistriertenFlow();
// Erstelle einen Logindialog.
gh.funthomas424242.examples.lib.DialogModelElement dialogModelElement_ = flowSupport.erstelleEinenLogindialog();
// Registriere am Button examples.login.button.login den SchliessenFlow.
flowSupport.registriereSchliessenFlowAmButton("examples.login.button.login", dialogModelElement_, flow_);
// Registriere am Button examples.login.button.cancel den BeendenFlow.
flowSupport.registriereBeendenFlowAmButton("examples.login.button.cancel", dialogModelElement_, flow_);


    }

}
