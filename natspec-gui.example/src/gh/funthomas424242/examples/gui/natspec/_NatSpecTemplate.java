package gh.funthomas424242.examples.gui.natspec;

import gh.funthomas424242.examples.gui.swing.SwingSupport;

import javax.swing.SwingUtilities; 

public class _NatSpecTemplate { 

	protected final SwingSupport swingSupport = new SwingSupport();

	public SwingSupport createSwingSupport() {
		// generated code will be inserted here
		/* @MethodBody */
		
		return swingSupport; 
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
