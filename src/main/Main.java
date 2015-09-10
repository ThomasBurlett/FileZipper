package main;

import gui.GUI;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				GUI ex = new GUI();
				ex.setVisible(true);
			}
		});

	}
}