package gh.funthomas424242.examples.flow;

import gh.funthomas424242.examples.flow.support.Flow;
import gh.funthomas424242.examples.flow.support.SubFlow;
import gh.funthomas424242.examples.lib.BusinessModel;

public class _NatSpecTemplate extends SubFlow implements Runnable {

    final private FlowSupport flowSupport;

    /**
     * Diese Methode gibt die unterliegende Supoort Klasse zurück
     * 
     * @return flowSupport
     */
    public FlowSupport getFlowSupport() {
        return flowSupport;
    }

    /**
     * Konstruktor eines Subflow.
     * 
     * @param model
     *            globales Model der Anwendung.
     * @param parentFlow
     *            Flow zu dem der aktuelle Flow ein Teilflow ist.
     */
    public _NatSpecTemplate(final BusinessModel model, final Flow parentFlow) {
        super(model, parentFlow);
        flowSupport = new FlowSupport(model, this);
    }

    /**
     * Konstruktur für einen Top Level Flow.
     * 
     * @param model
     *            globales Model der Anwendung.
     */
    public _NatSpecTemplate(final BusinessModel model) {
        this(model, null);
    }

    /**
     * Methode zur Ausführung des Flows.
     */
    @Override
    public void run() {
        // generated code will be inserted here
        /* @MethodBody */

    }

}
