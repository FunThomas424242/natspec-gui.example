package gh.funthomas424242.examples.gui.natspec;

import javax.swing.SwingUtilities;

import gh.funthomas424242.examples.gui.model.Model;

public class _NatSpecTemplate {

	protected SwingSupport swingSupport = new SwingSupport();

	public SwingSupport createSwingSupport() {
		// generated code will be inserted here
		/* @MethodBody */

		return swingSupport;
	}

	public Model getModel() {
		return swingSupport.getModel();
	}

	public static void main(final String args[]) {

		final Runnable guiCreator = new Runnable() {
			public void run() {
				_NatSpecTemplate tmp = new _NatSpecTemplate();
				tmp.createSwingSupport();
			}
		};
		SwingUtilities.invokeLater(guiCreator);
	}

}
