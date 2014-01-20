package gh.funthomas424242.examples.gui.dialogs.spec;

import gh.funthomas424242.examples.gui.swing.SwingDialog;
import gh.funthomas424242.examples.gui.swing.SwingSupport;

import javax.swing.SwingUtilities; 

public class HelloLabelDialog { 

	protected SwingSupport swingSupport;

	public SwingDialog createDialog() {
		swingSupport = new SwingSupport();
		// generated code will be inserted here
		// The code in this method is generated from: /natspec-gui.example/src/gh/funthomas424242/examples/gui/dialogs/spec/HelloLabelDialog.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Beschreibung des Dialoges gh.funthomas424242.app.dialogs.hello wie folgt:
		javax.swing.JFrame jFrame_gh_funthomas424242_app_dialogs_hello = swingSupport.createDialog("gh.funthomas424242.app.dialogs.hello");
		// Breite: 300 Höhe: 200
		swingSupport.setSize(300, 200, jFrame_gh_funthomas424242_app_dialogs_hello);
		// Titel: Hello Label Dialog
		swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Hello", "Label", "Dialog"}), jFrame_gh_funthomas424242_app_dialogs_hello);
		// Sichtbarkeit: ja
		swingSupport.setVisibility("ja", jFrame_gh_funthomas424242_app_dialogs_hello);
		// Schliesse diesen Dialog beim Beenden der Anwendung.
		swingSupport.setExitOnClose(jFrame_gh_funthomas424242_app_dialogs_hello);
		// Verwende das Borderlayout.
		java.awt.BorderLayout borderLayout_ = swingSupport.setBorderLayout(jFrame_gh_funthomas424242_app_dialogs_hello);
		// Füge hinzu das Label hello.label mit dem Text Hallo Welt
		swingSupport.addLabel("hello.label", java.util.Arrays.asList(new java.lang.String[] {"Hallo", "Welt"}), jFrame_gh_funthomas424242_app_dialogs_hello);
		 
		
		return swingSupport.getDialog(); 
	}
 
	

	/**
	 * only for preview
	 * @param args
	 */
	public static void main(final String args[]) {

		final Runnable guiCreator = new Runnable() {
			public void run() {
				HelloLabelDialog tmp = new HelloLabelDialog();
				tmp.createDialog();
			}
		};
		SwingUtilities.invokeLater(guiCreator);
	}

}
