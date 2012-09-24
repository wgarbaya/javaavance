import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JFrame;
 


public class Test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ArrayList<String[]> data = new ArrayList<String[]>();
		try {

			@SuppressWarnings("unused")
			DataParser dataParser = new DataParser(new FileReader("Musees.csv"), data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		Lister lister= new Lister("Musees",data);
		frame.getContentPane().add(lister, BorderLayout.CENTER);
	}

}
