package  gh.funthomas424242.business.flow;

import gh.funthomas424242.business.BusinessModel;
import gh.funthomas424242.business.Flow;
import gh.funthomas424242.business.FlowSupport;

public class _NatSpecTemplate extends Flow implements Runnable { 
	
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
