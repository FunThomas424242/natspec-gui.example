package gh.funthomas424242.examples.gui.dialogs.spec;

import gh.funthomas424242.examples.gui.swing.SwingSupport;

import javax.swing.SwingUtilities; 

public class EmptyDialog { 

	protected final SwingSupport swingSupport = new SwingSupport();

	public SwingSupport createSwingSupport() {
		// generated code will be inserted here
		// The code in this method is generated from: /natspec-gui.example/src/gh/funthomas424242/examples/gui/dialogs/spec/EmptyDialog.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Beschreibung des Dialoges gh.funthomas424242.app.dialogs.empty wie folgt:
		javax.swing.JFrame jFrame_gh_funthomas424242_app_dialogs_empty = swingSupport.createDialog("gh.funthomas424242.app.dialogs.empty");
		// Breite: 700 Höhe: 80
		swingSupport.setSize(700, 80, jFrame_gh_funthomas424242_app_dialogs_empty);
		// Titel: Leeres Dialogfenster
		swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Leeres", "Dialogfenster"}), jFrame_gh_funthomas424242_app_dialogs_empty);
		// Sichtbarkeit: ja
		swingSupport.setVisibility("ja", jFrame_gh_funthomas424242_app_dialogs_empty);
		// Schliesse diesen Dialog beim Beenden der Anwendung.
		swingSupport.setExitOnClose(jFrame_gh_funthomas424242_app_dialogs_empty);
		 
		
		return swingSupport; 
	}
 
	

	public static void main(final String args[]) {

		final Runnable guiCreator = new Runnable() {
			public void run() {
				EmptyDialog tmp = new EmptyDialog();
				tmp.createSwingSupport();
			}
		};
		SwingUtilities.invokeLater(guiCreator);
	}

}
