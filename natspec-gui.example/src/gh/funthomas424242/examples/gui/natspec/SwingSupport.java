package gh.funthomas424242.examples.gui.natspec;

import gh.funthomas424242.examples.gui.model.Model;
import gh.funthomas424242.examples.gui.utils.StringConcatinator;

import java.util.List;

import javax.swing.JFrame;

import de.devboost.natspec.annotations.TextSyntax;

public class SwingSupport {

	final Model model = new Model();

	public Model getModel() {
		return model;
	}

	@TextSyntax("Beschreibung des Dialoges #1 mit:")
	public JFrame createDialog(final String dialogName) {
		final JFrame fenster = new JFrame();
		return fenster;
	}

	@TextSyntax("Breite=#1 Höhe=#2")
	public void setSize(final Integer breite, final Integer hoehe,
			final JFrame frame) {
		frame.setSize(breite, hoehe);
	}

	@TextSyntax("Titel=#1")
	public void setTitel(final List<String> titels, final JFrame frame) {
		final String title = new StringConcatinator(titels).getString();
		frame.setTitle(title);
	}

	@TextSyntax("Sichtbarkeit=#1")
	public void setVisibility(final String sichtbarkeit, final JFrame frame) {
		if ("JA".equals(sichtbarkeit) || "Ja".equals(sichtbarkeit)
				|| "ja".equals(sichtbarkeit)) {
			frame.setVisible(true);
		} else {
			frame.setVisible(false);
		}
	}

	@TextSyntax("Schliesse diesen Dialog beim Beenden der Anwendung.")
	public void setExitOnClose(final JFrame frame) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
