package gh.funthomas424242.examples.gui;

import gh.funthomas424242.examples.gui.support.swing.SwingDialog;
import gh.funthomas424242.examples.gui.support.swing.SwingSupport;

import javax.swing.SwingUtilities;

public class EmptyDialog { 

	protected SwingSupport swingSupport;

	public SwingDialog createDialog() {
		swingSupport = new SwingSupport();
		// generated code will be inserted here
		// The code in this method is generated from: /natspec-gui.example/src/gh/funthomas424242/examples/gui/EmptyDialog.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Beschreibung des Dialoges gh.funthomas424242.app.dialogs.empty wie folgt:
		javax.swing.JFrame jFrame_gh_funthomas424242_app_dialogs_empty = swingSupport.createDialog("gh.funthomas424242.app.dialogs.empty");
		// Beschreibung des Dialoges gh.funthomas424242.app.dialogs.empty wie folgt:
		javax.swing.JFrame jFrame_gh_funthomas424242_app_dialogs_empty0 = swingSupport.createDialog("gh.funthomas424242.app.dialogs.empty");
		// Breite: 700 Höhe: 80
		swingSupport.setSize(700, 80, jFrame_gh_funthomas424242_app_dialogs_empty0);
		// Breite: 700 Höhe: 80
		swingSupport.setSize(700, 80, jFrame_gh_funthomas424242_app_dialogs_empty0);
		// Titel: Leeres Dialogfenster
		swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Leeres", "Dialogfenster"}), jFrame_gh_funthomas424242_app_dialogs_empty0);
		// Titel: Leeres Dialogfenster
		swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Leeres", "Dialogfenster"}), jFrame_gh_funthomas424242_app_dialogs_empty0);
		// Sichtbarkeit: ja
		swingSupport.setVisibility("ja", jFrame_gh_funthomas424242_app_dialogs_empty0);
		// Sichtbarkeit: ja
		swingSupport.setVisibility("ja", jFrame_gh_funthomas424242_app_dialogs_empty0);
		 
		
		return swingSupport.getDialog(); 
	}
 
	

	/**
	 * only for preview
	 * @param args
	 */
	public static void main(final String args[]) {

		final Runnable guiCreator = new Runnable() {
			public void run() {
				EmptyDialog tmp = new EmptyDialog();
				tmp.createDialog();
			}
		};
		SwingUtilities.invokeLater(guiCreator);
	}

}
