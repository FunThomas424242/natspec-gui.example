package gh.funthomas424242.examples.gui.swing;

import gh.funthomas424242.examples.lib.utils.StringConcatinator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.util.List;

import javax.swing.JFrame;

import de.devboost.natspec.annotations.TextSyntax;

public class SwingSupport { 

	protected SwingDialog dialog; 

	public SwingDialog getDialog() {
		return dialog;
	}
 
	@TextSyntax("Beschreibung des Dialoges #1 wie folgt:")
	public JFrame createDialog(final String dialogId) {
		final JFrame frame = new JFrame();
		this.dialog = new SwingDialog(dialogId, frame);
		return frame;
	}

	@TextSyntax("Breite: #1 Höhe: #2")
	public void setSize(final Integer breite, final Integer hoehe,
			final JFrame frame) {
		frame.setSize(breite, hoehe);
	}

	@TextSyntax("Titel: #1")
	public void setTitel(final List<String> titles, final JFrame frame) {
		final String title = new StringConcatinator(titles).getString();
		frame.setTitle(title);
	}

	@TextSyntax("Sichtbarkeit: #1")
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
	
	@TextSyntax("Verwende folgendes Layout: #1")
	public LayoutManager setLayout(final String layout, final JFrame frame) {
		LayoutManager layoutManager=null;
		if("BorderLayout".equals(layoutManager) ){
			layoutManager=new BorderLayout();
		}else if("FlowLayout".equals(layoutManager)){
			layoutManager=new FlowLayout();
		}else if("GridBagLayout".equals(layoutManager)){
			layoutManager=new GridBagLayout();
		}else{
			//Default
			layoutManager=new BorderLayout();	
		}
		return layoutManager;
	}
}
