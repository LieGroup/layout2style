package io.github.fantacyleo.layoutstyleconvertor;

import io.github.fantacyleo.layoutstyleconvertor.gui.ConvertorGUI;

import javax.swing.SwingUtilities;

public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ConvertorGUI();
			}
		});
	}

}
