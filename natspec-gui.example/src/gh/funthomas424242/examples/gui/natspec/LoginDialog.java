package gh.funthomas424242.examples.gui.natspec;

import gh.funthomas424242.examples.gui.swing.SwingSupport;

import javax.swing.SwingUtilities; 

public class LoginDialog { 

	protected final SwingSupport swingSupport = new SwingSupport();

	public SwingSupport createSwingSupport() {
		// generated code will be inserted here
		// The code in this method is generated from: /natspec-gui.example/src/gh/funthomas424242/examples/gui/natspec/LoginDialog.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		
		
		return swingSupport; 
	}
 
	

	public static void main(final String args[]) {

		final Runnable guiCreator = new Runnable() {
			public void run() {
				LoginDialog tmp = new LoginDialog();
				tmp.createSwingSupport();
			}
		};
		SwingUtilities.invokeLater(guiCreator);
	}

}
