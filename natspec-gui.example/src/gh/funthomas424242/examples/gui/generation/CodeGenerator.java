package gh.funthomas424242.examples.gui.generation;

import gh.funthomas424242.examples.gui.natspec.LoginDialog;
import gh.funthomas424242.examples.gui.swing.SwingDialog;

import javax.swing.SwingUtilities;

public class CodeGenerator {

	public static void main(String[] args) {
		new CodeGenerator().run();
	}

	private void run() {
		// final SwingDialogModel model = new SwingDialogModel();
		// LoginDialog loginDialog = new LoginDialog();
		// final SwingDialog
		// dialog=loginDialog.createSwingSupport().getDialog();
		// model.putDialog(dialog.getDialogId(), dialog);
		// final JFrame frame=dialog.getDialog();

		final Runnable guiCreator = new Runnable() {
			public void run() {
				LoginDialog loginDialog = new LoginDialog();
				final SwingDialog dialog = loginDialog.createSwingSupport()
						.getDialog();
			}
		};
		SwingUtilities.invokeLater(guiCreator);

		// go throw all model elements
	}

}