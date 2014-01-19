package gh.funthomas424242.examples.gui.natspec;

import javax.swing.SwingUtilities;

public class LoginDialog {

	protected final SwingSupport swingSupport = new SwingSupport();
 
	public SwingSupport createSwingSupport() {
		// generated code will be inserted here
		// The code in this method is generated from: /natspec-gui.example/src/gh/funthomas424242/examples/gui/natspec/LoginDialog.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Beschreibung des Dialoges LoginDialog mit:
		javax.swing.JFrame jFrame_LoginDialog = swingSupport.createDialog("LoginDialog");
		// Beschreibung des Dialoges LoginDialog mit:
		javax.swing.JFrame jFrame_LoginDialog0 = swingSupport.createDialog("LoginDialog");
		// 300 200
		swingSupport.setSize(300, 200, jFrame_LoginDialog0);
		// 300 200
		swingSupport.setSize(300, 200, jFrame_LoginDialog0);
		// Hallo Welt mit Swing
		swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Hallo", "Welt", "mit", "Swing"}), jFrame_LoginDialog0);
		// Hallo Welt mit Swing
		swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Hallo", "Welt", "mit", "Swing"}), jFrame_LoginDialog0);
		// ja
		swingSupport.setVisibility("ja", jFrame_LoginDialog0);
		// ja
		swingSupport.setVisibility("ja", jFrame_LoginDialog0);
		// Schliesse diesen Dialog beim Beenden der Anwendung.
		swingSupport.setExitOnClose(jFrame_LoginDialog0);
		// Schliesse diesen Dialog beim Beenden der Anwendung.
		swingSupport.setExitOnClose(jFrame_LoginDialog0);
		 

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
