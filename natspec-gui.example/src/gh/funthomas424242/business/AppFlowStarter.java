package gh.funthomas424242.business;

import gh.funthomas424242.business.flow.MainFlow;

public class AppFlowStarter {

	public void execute() {
		final BusinessModel model= new BusinessModel();
		final MainFlow flow = new MainFlow(model);
		flow.run();
//		final Thread thread = new Thread(mainFlow);
//		thread.start();
	}

	public static void main(String[] args) {

		final AppFlowStarter mainFlow = new AppFlowStarter();
		mainFlow.execute();

	}
}