package gh.funthomas424242.examples.gui;

import gh.funthomas424242.examples.gui.support.swing.SwingSupport;
import gh.funthomas424242.examples.lib.DialogModelElement;

import javax.swing.SwingUtilities;

public class HalloWeltDialog {

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
        // The code in this method is generated from: /natspec-swingapp.example/src/main/java/gh/funthomas424242/examples/gui/HalloWeltDialog.natspec
// Never change this method or any contents of this file, all local changes will be overwritten.

// Beschreibung des Dialoges gh.funthomas424242.app.dialogs.halloWelt wie folgt:
javax.swing.JFrame jFrame_gh_funthomas424242_app_dialogs_halloWelt = swingSupport.createDialog("gh.funthomas424242.app.dialogs.halloWelt");
// Breite: 100 Höhe: 80
swingSupport.setSize(100, 80, jFrame_gh_funthomas424242_app_dialogs_halloWelt);
// Fixiere die Größe.
swingSupport.fixiereDieGröße(jFrame_gh_funthomas424242_app_dialogs_halloWelt);
// Titel: Hello Label Dialog
swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"Hello", "Label", "Dialog"}), jFrame_gh_funthomas424242_app_dialogs_halloWelt);
// Sichtbarkeit: ja
swingSupport.setVisibility("ja", jFrame_gh_funthomas424242_app_dialogs_halloWelt);
// Beende die Anwendung beim Schliessen des Dialoges.
swingSupport.setExitOnClose(jFrame_gh_funthomas424242_app_dialogs_halloWelt);
// Verwende das Gridlayout mit 1 Spalten und 2 Zeilen.
java.awt.GridLayout gridLayout_1_2 = swingSupport.setGridLayout(1, 2, jFrame_gh_funthomas424242_app_dialogs_halloWelt);
// Füge hinzu das Label halloWelt.label.hello mit dem Text Hallo Welt !
javax.swing.JLabel jLabel_halloWelt_label_hello_Hallo_Welt__ = swingSupport.addLabel("halloWelt.label.hello", java.util.Arrays.asList(new java.lang.String[] {"Hallo", "Welt", "!"}), jFrame_gh_funthomas424242_app_dialogs_halloWelt);
// Label vertikale Ausrichtung am Boden.
swingSupport.alignLabelVerticalBottom(jLabel_halloWelt_label_hello_Hallo_Welt__);
// Label horizontale Ausrichtung zur Mitte.
swingSupport.alignLabelHorizontalCenter(jLabel_halloWelt_label_hello_Hallo_Welt__);
// Füge hinzu den Button halloWelt.button.ok mit dem Text OK
swingSupport.addButton("halloWelt.button.ok", java.util.Arrays.asList(new java.lang.String[] {"OK"}), jFrame_gh_funthomas424242_app_dialogs_halloWelt);


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
                HalloWeltDialog tmp = new HalloWeltDialog();
                tmp.createDialog();
            }
        };
        SwingUtilities.invokeLater(guiCreator);
    }

}
