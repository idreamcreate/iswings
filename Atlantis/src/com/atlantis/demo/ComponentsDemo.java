package com.atlantis.demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

import com.atlantis.core.OpenFrame;

public class ComponentsDemo {

	public static void main(String[] args) {
		OpenFrame frame = new OpenFrame("PW Launcher");
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Container co = frame.getContentPane();
		co.setBackground(Color.WHITE);
		co.setForeground(Color.BLACK);
		co.setLayout(new FlowLayout(FlowLayout.RIGHT));
		co.add(new JLabel("Tesshsjkhdjk223232323"));
		
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
}
