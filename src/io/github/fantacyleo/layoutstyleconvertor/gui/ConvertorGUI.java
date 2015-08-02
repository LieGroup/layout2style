package io.github.fantacyleo.layoutstyleconvertor.gui;

import io.github.fantacyleo.layoutstyleconvertor.engine.Convertor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ConvertorGUI implements ActionListener{
	private JButton jbtn;
	private JTextArea jtaIn;
	private JTextArea jtaOut;

	public ConvertorGUI() {
		JFrame jfrm = new JFrame("Android布局参数-->样式转换器");
		jfrm.setSize(600, 600);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setResizable(false);
		jtaIn = new JTextArea(10, 30);
		jtaIn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JScrollPane inScrollPane = new JScrollPane(jtaIn);
		
		jbtn = new JButton("转换为样式");
		jbtn.setActionCommand("convert");
		jbtn.addActionListener(this);
		jbtn.setAlignmentX(Component.CENTER_ALIGNMENT);

		jtaOut = new JTextArea(10, 30);
		jtaOut.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jtaOut.setAutoscrolls(true);
		JScrollPane outScrollPane = new JScrollPane(jtaOut);

		jfrm.add(Box.createHorizontalStrut(20), BorderLayout.EAST);
		jfrm.add(Box.createHorizontalStrut(20), BorderLayout.WEST);
		jfrm.add(Box.createVerticalStrut(10), BorderLayout.NORTH);
		jfrm.add(Box.createVerticalStrut(10), BorderLayout.SOUTH);

		Box vertical = Box.createVerticalBox();
		vertical.add(inScrollPane);
		vertical.add(Box.createVerticalStrut(20));
		vertical.add(jbtn);
		vertical.add(Box.createVerticalStrut(20));
		vertical.add(outScrollPane);
		
		jfrm.add(vertical, BorderLayout.CENTER);

		jfrm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(jbtn.getActionCommand())) {
			String layoutStr = jtaIn.getText();
			String[] layoutStrLines = layoutStr.split("\\n");
			for (String line : layoutStrLines) {
				jtaOut.append(Convertor.Layout2Style(line) + "\n");
			}
		}
	}

}
