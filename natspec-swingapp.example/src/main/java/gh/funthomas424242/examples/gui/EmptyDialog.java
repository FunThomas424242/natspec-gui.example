package gh.funthomas424242.examples.gui;

import gh.funthomas424242.examples.gui.support.swing.SwingSupport;
import gh.funthomas424242.examples.lib.DialogModelElement;

import javax.swing.SwingUtilities;

public class EmptyDialog {

    /**
     * Unterliegende Support Klasse.
     */
    protected SwingSupport swingSupport;

    /**
     * Fabrikmethode fÃ¼r den Dialog.
     * 
     * @return einen Dialog
     */
    public DialogModelElement createDialog() {
        swingSupport = new SwingSupport();
        // generated code will be inserted here
        // The code in this method is generated from: /natspec-swingapp/src/main/java/gh/funthomas424242/examples/gui/EmptyDialog.natspec
// Never change this method or any contents of this file, all local changes will be overwritten.

// Beschreibung des Dialoges gh.funthomas424242.app.dialogs.empty wie folgt:
javax.swing.JFrame jFrame_gh_funthomas424242_app_dialogs_empty = swingSupport.createDialog("gh.funthomas424242.app.dialogs.empty");
// Breite: 700 Höhe: 80
swingSupport.setSize(700, 80, jFrame_gh_funthomas424242_app_dialogs_empty);
// Titel: Leeres Dialogfenster
swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Leeres", "Dialogfenster"}), jFrame_gh_funthomas424242_app_dialogs_empty);
// Sichtbarkeit: ja
swingSupport.setVisibility("ja", jFrame_gh_funthomas424242_app_dialogs_empty);


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
                EmptyDialog tmp = new EmptyDialog();
                tmp.createDialog();
            }
        };
        SwingUtilities.invokeLater(guiCreator);
    }

}
