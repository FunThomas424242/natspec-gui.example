package gh.funthomas424242.examples.gui;

import gh.funthomas424242.examples.gui.support.swing.SwingSupport;
import gh.funthomas424242.examples.lib.DialogModelElement;

import javax.swing.SwingUtilities;

public class _NatSpecTemplate {

    /**
     * Unterliegende Support Klasse.
     */
    protected SwingSupport swingSupport;

    /**
     * Fabrikmethode für den Dialog.
     * 
     * @return einen Dialog
     */
    public DialogModelElement createDialog() {
        swingSupport = new SwingSupport();
        // generated code will be inserted here
        /* @MethodBody */

        return swingSupport.getDialog();
    }

    /**
     * Only for preview.
     * 
     * @param args
     */
    public static void main(final String args[]) {

        final Runnable guiCreator = new Runnable() {
            @Override
            public void run() {
                _NatSpecTemplate tmp = new _NatSpecTemplate();
                tmp.createDialog();
            }
        };
        SwingUtilities.invokeLater(guiCreator);
    }

}
