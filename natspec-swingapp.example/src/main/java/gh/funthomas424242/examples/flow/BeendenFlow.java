package gh.funthomas424242.examples.flow;

import gh.funthomas424242.examples.flow.support.Flow;
import gh.funthomas424242.examples.flow.support.SubFlow;
import gh.funthomas424242.examples.lib.BusinessModel;

public class BeendenFlow extends SubFlow implements Runnable {

    final private FlowSupport flowSupport;

    /**
     * Diese Methode gibt die unterliegende Supoort Klasse zurÃ¼ck
     * 
     * @return flowSupport
     */
    public FlowSupport getFlowSupport() {
        return flowSupport;
    }

    /**
     * Konstruktor eines Subflow.
     * 
     * @param model globales Model der Anwendung.
     * @param parentFlow Flow zu dem der aktuelle Flow ein Teilflow ist.
     */
    public BeendenFlow(final BusinessModel model, final Flow parentFlow) {
        super(model, parentFlow);
        flowSupport = new FlowSupport(model, this);
    }

    /**
     * Konstruktur fÃ¼r einen Top Level Flow.
     * 
     * @param model globales Model der Anwendung.
     */
    public BeendenFlow(final BusinessModel model) {
        this(model, null);
    }

    /**
     * Methode zur AusfÃ¼hrung des Flows.
     */
    @Override
    public void run() {
        // generated code will be inserted here
        // The code in this method is generated from: /natspec-swingapp.example/src/main/java/gh/funthomas424242/examples/flow/BeendenFlow.natspec
// Never change this method or any contents of this file, all local changes will be overwritten.

// Nutze den Registrierten Flow.
gh.funthomas424242.examples.flow.support.Flow flow_ = flowSupport.nutzeDenRegistriertenFlow();
// Beende die Anwendung.
flowSupport.beendeDieAnwendung();


    }

}
