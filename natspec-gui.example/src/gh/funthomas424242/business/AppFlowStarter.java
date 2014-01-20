package gh.funthomas424242.business;

import gh.funthomas424242.examples.gui.dialogs.spec.EmptyDialog;
import gh.funthomas424242.examples.gui.dialogs.spec.LoginDialog;
import gh.funthomas424242.examples.gui.swing.SwingDialog;

import javax.swing.SwingUtilities;

public class AppFlowStarter {

	protected  void businessLogic() {
		final LoginDialog loginDialogFactory = new LoginDialog();
		final SwingDialog loginDialog = loginDialogFactory.createDialog();
		final EmptyDialog emptyDialogFactory = new EmptyDialog();
		final SwingDialog emptyDialog = emptyDialogFactory.createDialog();
	}

	public void execute() {
		final Runnable guiCreator = new Runnable() {
			public void run() {
				businessLogic();
			}
		};
		SwingUtilities.invokeLater(guiCreator);
	}

	public static void main(String[] args) {
		
		final AppFlowStarter mainFlow=new AppFlowStarter();
		mainFlow.execute();
		
	}
}