package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Starter {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame");
		frame.setSize(900, 1000);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JLabel enterNameLabel = new JLabel("Enter name: ");
		JLabel objectiveLabel = new JLabel();
		
		JButton StartButton = new JButton("Start game");
		
		JTextField PlayerNameField = new JTextField();
		PlayerNameField.setColumns(10);
		
		panel.add(enterNameLabel);
		panel.add(objectiveLabel);
		panel.add(PlayerNameField);
		panel.add(StartButton);
		StartButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//spelframe tonen + spel spelen
					PlayerNameField.setVisible(false);
					objectiveLabel.setText("Your objective is to keep the enemy fighters from destroying our capital ship.");
			}
		});
		frame.setVisible(true);
	}
}
