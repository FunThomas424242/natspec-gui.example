package gh.funthomas424242.examples.flow;

import gh.funthomas424242.examples.flow.support.Flow;
import gh.funthomas424242.examples.flow.support.SubFlow;
import gh.funthomas424242.examples.lib.BusinessModel;

/**
 * Diese Klasse repÃ¤sentiert einen Flow oder Subflow.
 * 
 * @author SchubertT006
 */
public class MainFlow extends SubFlow implements Runnable {

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
    public MainFlow(final BusinessModel model, final Flow parentFlow) {
        super(model, parentFlow);
        flowSupport = new FlowSupport(model, this);
    }

    /**
     * Konstruktur fÃ¼r einen Top Level Flow.
     * 
     * @param model globales Model der Anwendung.
     */
    public MainFlow(final BusinessModel model) {
        this(model, null);
    }

    /**
     * Methode zur AusfÃ¼hrung des Flows.
     */
    @Override
    public void run() {
        // generated code will be inserted here
        // The code in this method is generated from: /natspec-swingapp/src/main/java/gh/funthomas424242/examples/flow/MainFlow.natspec
// Never change this method or any contents of this file, all local changes will be overwritten.

// Erstelle den Flow MainFlow
gh.funthomas424242.examples.flow.support.Flow flow_MainFlow = flowSupport.erstelleDenFlow("MainFlow");
// Erstelle einen StartDialog.
gh.funthomas424242.examples.lib.DialogModelElement dialogModelElement_ = flowSupport.createStartDialog();
// Registriere am Button examples.button.login den LoginFlow.
flowSupport.registriereLoginFlowAmButton("examples.button.login", dialogModelElement_, flow_MainFlow);
// Registriere am Button examples.button.close den SchliessenFlow.
flowSupport.registriereSchliessenFlowAmButton("examples.button.close", dialogModelElement_, flow_MainFlow);


    }

}
