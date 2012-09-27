import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;

import javax.swing.border.EtchedBorder;


@SuppressWarnings("serial")
public class Lister extends JPanel {
	JPanel panel;
	/**
	 * Create the panel.
	 */
	public Lister(String ListName,ArrayList<String[]> data) {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setLayout(new BorderLayout(0, 0));

		JLabel lblListName = new JLabel(ListName,SwingConstants.CENTER);
		lblListName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblListName, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 10, 0, 0));
		scrollPane.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		feed(data);


	}

/**
 * Feed the list panel with data coming from param
 * @param data String array
 */
	public void feed(ArrayList<String[]> data){

		ArrayList<JCheckBox> checkboxes = new ArrayList<JCheckBox>();
		for (int i = 0; i < data.size(); i++) {
			JCheckBox chckbxNewCheckBox = new JCheckBox(data.get(i)[0]);
			panel.add(chckbxNewCheckBox);
			checkboxes.add(chckbxNewCheckBox); //for further use you add it to the list
		}

	}
}
