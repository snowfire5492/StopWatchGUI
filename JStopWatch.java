import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JStopWatch extends JFrame implements ActionListener {
		
	JButton bttn = new JButton("Start");
	
	private JLabel lbl;
	private Long start;
	
	JStopWatch(){
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Stop Watch");
		setIconImage(new ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//JClock.png").getImage());
		
		
		//setLayout(new GridLayout(2,1));
		//getContentPane().setLayout(new FlowLayout());
		
		setLocationRelativeTo(null);
		
		bttn.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.add(bttn);
		
		add(panel, BorderLayout.PAGE_END);
		
		lbl = new JLabel("Press Start");
		
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font(lbl.getFont().getFontName(), lbl.getFont().getStyle(), 20));
		
		add(lbl, BorderLayout.CENTER);
		
		
	}
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getActionCommand().equals("Start")){
			bttn.setText("Stop");
			//bttn.setActionCommand("Stop");
			start = ae.getWhen();
			lbl.setText("Stopwatch is running...");
		}else{
			bttn.setText("Start");
			
			lbl.setText("elapsed time is: " + (double) (ae.getWhen() - start) / 1000);
		}
		
		
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(() ->
		new JStopWatch());
	}
}
