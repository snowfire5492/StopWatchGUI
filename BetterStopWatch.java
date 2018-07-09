import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class BetterStopWatch extends JFrame implements ActionListener{
	
	//JButton bttn = new JButton("Start");
	
	JToggleButton bttn = new JToggleButton("Start");
	JToggleButton rstbtn = new JToggleButton("Reset");
	//JButton restBttn = new JButton("Restart");
	JLabel lbl;
	
	Timer tmr;
	
	public BetterStopWatch(){
		setSize(300,300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setIconImage(new ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//JClock.png").getImage());
		
		JPanel jpan = new JPanel();
		jpan.add(bttn);
		jpan.add(rstbtn);
		
		rstbtn.addActionListener(this);
		
		bttn.addActionListener(this);
		
		add(jpan, BorderLayout.PAGE_END);
		
		lbl = new JLabel("00.00");
		
		add(lbl, BorderLayout.CENTER);
		
		
		
		//jpan.add(restBttn);
		
		lbl.setFont(new Font(lbl.getFont().getFontName(), lbl.getFont().getStyle(), 30));
		
		getContentPane().setBackground(Color.green);
		lbl.setForeground(Color.red);
		
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
	
		tmr = new Timer(1000, ae -> {
			float temp = Float.parseFloat(lbl.getText());
			
			temp += .01;
			
			String temp1 = "";
			temp1 += temp;
			
			lbl.setText(temp1);
		});
		
	}
	
	
	
	public void actionPerformed(ActionEvent ae){
		
		
	
		
		if(ae.getActionCommand().equals("Start")){
			bttn.setText("Stop");
			tmr.start();
		}else /*if(ae.getActionCommand().equals("Stop"))*/{
			bttn.setText("Start");
			tmr.stop();
		}
		if(ae.getActionCommand().equals("Reset")){
			bttn.setText("Start");
			//lbl = 0.0;
			tmr.restart();
		}
		
		
	}
	
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(()->
		new BetterStopWatch());
	}
	
	
}
