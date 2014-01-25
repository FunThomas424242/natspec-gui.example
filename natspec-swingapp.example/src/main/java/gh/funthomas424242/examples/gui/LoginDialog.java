package gh.funthomas424242.examples.gui;

import gh.funthomas424242.examples.gui.support.swing.SwingDialog;
import gh.funthomas424242.examples.gui.support.swing.SwingSupport;

import javax.swing.SwingUtilities;

public class LoginDialog { 

	protected SwingSupport swingSupport;

	public SwingDialog createDialog() {
		swingSupport = new SwingSupport();
		// generated code will be inserted here
		// The code in this method is generated from: /natspec-swingapp.example/src/main/java/gh/funthomas424242/examples/gui/LoginDialog.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Beschreibung des Dialoges gh.funthomas424242.app.dialogs.login wie folgt:
		javax.swing.JFrame jFrame_gh_funthomas424242_app_dialogs_login = swingSupport.createDialog("gh.funthomas424242.app.dialogs.login");
		// Breite: 300 Höhe: 130
		swingSupport.setSize(300, 130, jFrame_gh_funthomas424242_app_dialogs_login);
		// Titel: Login Dialog
		swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Login", "Dialog"}), jFrame_gh_funthomas424242_app_dialogs_login);
		// Sichtbarkeit: ja
		swingSupport.setVisibility("ja", jFrame_gh_funthomas424242_app_dialogs_login);
		// Verwende das Gridlayout mit 2 Spalten und 3 Zeilen.
		java.awt.GridLayout gridLayout_2_3 = swingSupport.setGridLayout(2, 3, jFrame_gh_funthomas424242_app_dialogs_login);
		// Füge hinzu das Label login.label.user mit dem Text Benutzer
		javax.swing.JLabel jLabel_login_label_user_Benutzer = swingSupport.addLabel("login.label.user", java.util.Arrays.asList(new java.lang.String[] {"Benutzer"}), jFrame_gh_funthomas424242_app_dialogs_login);
		// Füge hinzu das TextField login.textfield.userName
		swingSupport.addTextField("login.textfield.userName", jFrame_gh_funthomas424242_app_dialogs_login);
		// Füge hinzu das Label login.label.password mit dem Text Password
		javax.swing.JLabel jLabel_login_label_password_Password = swingSupport.addLabel("login.label.password", java.util.Arrays.asList(new java.lang.String[] {"Password"}), jFrame_gh_funthomas424242_app_dialogs_login);
		// Füge hinzu das PasswordField login.textfield.password
		swingSupport.addPasswordField("login.textfield.password", jFrame_gh_funthomas424242_app_dialogs_login);
		// Füge hinzu den Button examples.login.button.login mit dem Text Login
		swingSupport.addButton("examples.login.button.login", java.util.Arrays.asList(new java.lang.String[] {"Login"}), jFrame_gh_funthomas424242_app_dialogs_login);
		// Füge hinzu den Button examples.login.button.cancel mit dem Text Beenden
		swingSupport.addButton("examples.login.button.cancel", java.util.Arrays.asList(new java.lang.String[] {"Beenden"}), jFrame_gh_funthomas424242_app_dialogs_login);
		 
		
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
