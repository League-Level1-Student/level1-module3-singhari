package _02_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmileyBlues {
	void start() {
		// 1. Make a new JFrame and set it to be visible
		JFrame fram = new JFrame();
		fram.setVisible(true);
		// 2. Set your frame's default close operation to JFrame.EXIT_ON_CLOSE
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Make a new JPanel
		JPanel esa = new JPanel();
		// 4. Add your panel to your frame
		fram.add(esa);
		// 8. DO THIS LAST: 
		// Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley object's!)
		// Using a specific object for a static variable works, but is not usually recommended.
		// Run it again; are your Smileys all yellow now? Also try changing them to red or green!
		Smiley.color = Smiley.YELLOW;
		// 5. Make three Smiley objects and add them to your panel
		Smiley fat = new Smiley();
		Smiley poor = new Smiley();
		Smiley liter = new Smiley();
		fram.add(fat);
		fram.add(poor);
		fram.add(liter);
		// 6. Pack your frame
		fram.pack();
		// 7. RUN THE PROGRAM and make sure you see three blue Smileys!
	}
}
