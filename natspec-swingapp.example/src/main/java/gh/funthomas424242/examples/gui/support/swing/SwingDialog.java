package gh.funthomas424242.examples.gui.support.swing;

import gh.funthomas424242.examples.lib.DialogModelElement;

import javax.swing.JFrame;

public class SwingDialog extends DialogModelElement {

    final protected JFrame dialog;

    public SwingDialog(final String dialogId, final JFrame dialog) {
        super(dialogId);
        this.dialog = dialog;
    }

    public JFrame getDialog() {
        return dialog;
    }

    @Override
    public void schliesseDialog() {
        dialog.dispose();
    }

}
