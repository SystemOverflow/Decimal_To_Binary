import java.awt.event.*;

import javax.swing.*;

public class main {
	
static JButton Dec = new JButton("Decimale");
static JButton Bin = new JButton("Binario");
static JTextField txt = new JTextField();
static JLabel lb = new JLabel();
static Binary b = new Binary();
public static void main(String[] cmd)
	{
	JFrame f = new JFrame("Binary C");	
	f.setLayout(null);
	f.setSize(350,150);
	Dec.setBounds(30, 80, 140, 15);
	Bin.setBounds(180, 80, 140, 15);
	txt.setBounds(30, 15, 300, 20);
	lb.setBounds(80, 55, 300, 10);
	f.add(Dec);
	f.add(Bin);
	f.add(txt);
	f.add(lb);
	Dec.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			try
			{
			lb.setText(Integer.toString(b.BinaryToDecimal(Integer.parseInt(txt.getText()))));
			}catch(Exception e)
			{
				lb.setText("Errore");
			}
			}
		
	});
	
	Bin.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try
			{
				lb.setText(Integer.toString(b.DecimalToBinary(Integer.parseInt(txt.getText()))));
			}catch(Exception e)
			{
				lb.setText("Errore");
			}
			}
		
	});
	f.setVisible(true);
	}
}
