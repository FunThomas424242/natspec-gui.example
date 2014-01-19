package gh.funthomas424242.examples.gui.natspec;

import gh.funthomas424242.examples.gui.swing.SwingSupport;

import javax.swing.SwingUtilities; 

public class LoginDialog { 

	protected final SwingSupport swingSupport = new SwingSupport();

	public SwingSupport createSwingSupport() {
		// generated code will be inserted here
		// The code in this method is generated from: /natspec-gui.example/src/gh/funthomas424242/examples/gui/natspec/LoginDialog.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Beschreibung des Dialoges gh.funthomas424242.app.dialogs.login wie folgt:
		javax.swing.JFrame jFrame_gh_funthomas424242_app_dialogs_login = swingSupport.createDialog("gh.funthomas424242.app.dialogs.login");
		// Breite: 300 Höhe: 200
		swingSupport.setSize(300, 200, jFrame_gh_funthomas424242_app_dialogs_login);
		// Titel: Login Dialog
		swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Login", "Dialog"}), jFrame_gh_funthomas424242_app_dialogs_login);
		// Sichtbarkeit: ja
		swingSupport.setVisibility("ja", jFrame_gh_funthomas424242_app_dialogs_login);
		// Schliesse diesen Dialog beim Beenden der Anwendung.
		swingSupport.setExitOnClose(jFrame_gh_funthomas424242_app_dialogs_login);
		// Verwende folgendes Layout: BorderLayout
		java.awt.LayoutManager layoutManager_BorderLayout = swingSupport.setLayout("BorderLayout", jFrame_gh_funthomas424242_app_dialogs_login);
		 
		
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
