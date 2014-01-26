package  gh.funthomas424242.examples.flow;

import gh.funthomas424242.examples.flow.support.Flow;
import gh.funthomas424242.examples.flow.support.SubFlow;
import gh.funthomas424242.examples.lib.BusinessModel;

public class _NatSpecTemplate extends SubFlow implements Runnable { 
	
	final protected FlowSupport flowSupport;
	
	public _NatSpecTemplate (final BusinessModel model, final Flow parentFlow){
		super(model,parentFlow);
		flowSupport = new FlowSupport(model,this);
	}
	
	public _NatSpecTemplate (final BusinessModel model){
		this(model,null);
	}
	
	public void run() {
		// generated code will be inserted here
		/* @MethodBody */ 
	
	}

}
