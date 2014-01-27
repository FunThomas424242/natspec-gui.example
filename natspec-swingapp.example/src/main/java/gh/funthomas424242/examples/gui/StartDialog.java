package gh.funthomas424242.examples.gui;

import gh.funthomas424242.examples.gui.support.swing.SwingSupport;
import gh.funthomas424242.examples.lib.DialogModelElement;

import javax.swing.SwingUtilities;

public class StartDialog {

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
        // The code in this method is generated from: /natspec-swingapp/src/main/java/gh/funthomas424242/examples/gui/StartDialog.natspec
// Never change this method or any contents of this file, all local changes will be overwritten.

// Beschreibung des Dialoges gh.funthomas424242.app.dialogs.start wie folgt:
javax.swing.JFrame jFrame_gh_funthomas424242_app_dialogs_start = swingSupport.createDialog("gh.funthomas424242.app.dialogs.start");
// Breite: 100 Höhe: 130
swingSupport.setSize(100, 130, jFrame_gh_funthomas424242_app_dialogs_start);
// Fixiere die Größe.
swingSupport.fixiereDieGröße(jFrame_gh_funthomas424242_app_dialogs_start);
// Titel: NatSpec GUI Example App
swingSupport.setTitel(java.util.Arrays.asList(new java.lang.String[] {"NatSpec", "GUI", "Example", "App"}), jFrame_gh_funthomas424242_app_dialogs_start);
// Sichtbarkeit: ja
swingSupport.setVisibility("ja", jFrame_gh_funthomas424242_app_dialogs_start);
// Beende die Anwendung beim Schliessen des Dialoges.
swingSupport.setExitOnClose(jFrame_gh_funthomas424242_app_dialogs_start);
// Verwende das Gridlayout mit 1 Spalten und 0 Zeilen.
java.awt.GridLayout gridLayout_1_0 = swingSupport.setGridLayout(1, 0, jFrame_gh_funthomas424242_app_dialogs_start);
// Füge hinzu das Label halloWelt.label.hello mit dem Text Bitte anmelden!
javax.swing.JLabel jLabel_halloWelt_label_hello_Bitte_anmelden_ = swingSupport.addLabel("halloWelt.label.hello", java.util.Arrays.asList(new java.lang.String[] {"Bitte", "anmelden!"}), jFrame_gh_funthomas424242_app_dialogs_start);
// Label vertikale Ausrichtung am Boden.
swingSupport.alignLabelVerticalBottom(jLabel_halloWelt_label_hello_Bitte_anmelden_);
// Label horizontale Ausrichtung zur Mitte.
swingSupport.alignLabelHorizontalCenter(jLabel_halloWelt_label_hello_Bitte_anmelden_);
// Füge hinzu den Button examples.button.login mit dem Text Login
swingSupport.addButton("examples.button.login", java.util.Arrays.asList(new java.lang.String[] {"Login"}), jFrame_gh_funthomas424242_app_dialogs_start);
// Füge hinzu den Button examples.button.close mit dem Text Schliessen
swingSupport.addButton("examples.button.close", java.util.Arrays.asList(new java.lang.String[] {"Schliessen"}), jFrame_gh_funthomas424242_app_dialogs_start);


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
                StartDialog tmp = new StartDialog();
                tmp.createDialog();
            }
        };
        SwingUtilities.invokeLater(guiCreator);
    }

}
