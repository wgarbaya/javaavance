import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;

public class Checklistener implements ActionListener{




	@Override
	public void actionPerformed(ActionEvent arg0) {
		JCheckBox jbox = new JCheckBox();
		jbox = (JCheckBox) arg0.getSource();

		if (jbox.isSelected()){
			System.out.println(jbox.getText()+"is selected");
		}
		else{
			System.out.println(jbox.getText()+"is unchecked");
		}


	}
}

