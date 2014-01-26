package gh.funthomas424242.examples.flow.support;

import gh.funthomas424242.examples.lib.BusinessModel;


public abstract class SubFlow extends Flow {

	protected final Flow parentFlow;

	public SubFlow(BusinessModel model, Flow parentFlow) {
		super(model);
		this.parentFlow = parentFlow;
		
	}

}
