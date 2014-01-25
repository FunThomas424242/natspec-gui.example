package gh.funthomas424242.examples.gui;

import gh.funthomas424242.examples.gui.support.swing.SwingDialog;
import gh.funthomas424242.examples.gui.support.swing.SwingSupport;

import javax.swing.SwingUtilities;

public class LoginDialog { 

	protected SwingSupport swingSupport;

	public SwingDialog createDialog() {
		swingSupport = new SwingSupport();
		// generated code will be inserted here
		// The code in this method is generated from: /natspec-gui.example/src/gh/funthomas424242/examples/gui/LoginDialog.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Beschreibung des Dialoges gh.funthomas424242.app.dialogs.login wie folgt:
		javax.swing.JFrame jFrame_gh_funthomas424242_app_dialogs_login = swingSupport.createDialog("gh.funthomas424242.app.dialogs.login");
		// Beschreibung des Dialoges gh.funthomas424242.app.dialogs.login wie folgt:
		javax.swing.JFrame jFrame_gh_funthomas424242_app_dialogs_login0 = swingSupport.createDialog("gh.funthomas424242.app.dialogs.login");
		// Breite: 200 Höhe: 80
		swingSupport.setSize(200, 80, jFrame_gh_funthomas424242_app_dialogs_login0);
		// Breite: 200 Höhe: 80
		swingSupport.setSize(200, 80, jFrame_gh_funthomas424242_app_dialogs_login0);
		// Titel: Login Dialog
		swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Login", "Dialog"}), jFrame_gh_funthomas424242_app_dialogs_login0);
		// Titel: Login Dialog
		swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Login", "Dialog"}), jFrame_gh_funthomas424242_app_dialogs_login0);
		// Sichtbarkeit: ja
		swingSupport.setVisibility("ja", jFrame_gh_funthomas424242_app_dialogs_login0);
		// Sichtbarkeit: ja
		swingSupport.setVisibility("ja", jFrame_gh_funthomas424242_app_dialogs_login0);
		// Beende die Anwendung beim Schliessen des Dialoges.
		swingSupport.setExitOnClose(jFrame_gh_funthomas424242_app_dialogs_login0);
		// Beende die Anwendung beim Schliessen des Dialoges.
		swingSupport.setExitOnClose(jFrame_gh_funthomas424242_app_dialogs_login0);
		// Verwende das Gridlayout mit 2 Spalten und 2 Zeilen.
		java.awt.GridLayout gridLayout_2_2 = swingSupport.setGridLayout(2, 2, jFrame_gh_funthomas424242_app_dialogs_login0);
		// Verwende das Gridlayout mit 2 Spalten und 2 Zeilen.
		java.awt.GridLayout gridLayout_2_20 = swingSupport.setGridLayout(2, 2, jFrame_gh_funthomas424242_app_dialogs_login0);
		// Füge hinzu das Label login.label.user mit dem Text Benutzer
		javax.swing.JLabel jLabel_login_label_user_Benutzer = swingSupport.addLabel("login.label.user", java.util.Arrays.asList(new java.lang.String[] {"Benutzer"}), jFrame_gh_funthomas424242_app_dialogs_login0);
		// Füge hinzu das Label login.label.user mit dem Text Benutzer
		javax.swing.JLabel jLabel_login_label_user_Benutzer0 = swingSupport.addLabel("login.label.user", java.util.Arrays.asList(new java.lang.String[] {"Benutzer"}), jFrame_gh_funthomas424242_app_dialogs_login0);
		// Füge hinzu das Label login.label.password mit dem Text Password
		javax.swing.JLabel jLabel_login_label_password_Password = swingSupport.addLabel("login.label.password", java.util.Arrays.asList(new java.lang.String[] {"Password"}), jFrame_gh_funthomas424242_app_dialogs_login0);
		// Füge hinzu das Label login.label.password mit dem Text Password
		javax.swing.JLabel jLabel_login_label_password_Password0 = swingSupport.addLabel("login.label.password", java.util.Arrays.asList(new java.lang.String[] {"Password"}), jFrame_gh_funthomas424242_app_dialogs_login0);
		 
		
		return swingSupport.getDialog(); 
	}
 
	

	/**
	 * only for preview
	 * @param args
	 */
	public static void main(final String args[]) {

		final Runnable guiCreator = new Runnable() {
			public void run() {
				LoginDialog tmp = new LoginDialog();
				tmp.createDialog();
			}
		};
		SwingUtilities.invokeLater(guiCreator);
	}

}
