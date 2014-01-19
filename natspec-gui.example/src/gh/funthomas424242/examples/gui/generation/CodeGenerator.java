package gh.funthomas424242.examples.gui.generation;

import gh.funthomas424242.examples.gui.model.Model;
import gh.funthomas424242.examples.gui.natspec.LoginDialog;

import java.util.List;


public class CodeGenerator {

	public static void main(String[] args) {
		new CodeGenerator().run();
	}

	private void run() {
		LoginDialog loginDialog = new LoginDialog();
		loginDialog.createSwingSupport();
		Model model = loginDialog.getModel();
		
		// go throw all model elements
	}

}