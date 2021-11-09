import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	boolean operationclicked=false;
	String oldValue;
	char operator;
	float result;
	
	JFrame jf;
	JLabel displaylabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton dotbutton;
	JButton zerobutton;
	JButton equalbutton;
	JButton divisonbutton;
	JButton multiplicationbutton;
	JButton subtractionbutton;
	JButton Additionbutton;
	JButton clearbutton;
	JButton delbutton;
	Font myfont=new Font("Blackletter",Font.BOLD,20);
	
	
	public Calculator() {
	
	jf=new JFrame("Calculator");
	jf.setSize(400,500);
    jf.setLayout(null);
    jf.setLocation(0, 329);
    
    displaylabel=new JLabel();
    displaylabel.setBounds(10, 5, 350, 40);
    //displaylabel.setBackground(Color.blue);
    displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
    displaylabel.setForeground(Color.BLACK);
    displaylabel.setOpaque(true);
    displaylabel.setFont(myfont);
    jf.add(displaylabel);
    
    
    sevenbutton=new JButton("7");
    sevenbutton.setBounds(10, 215, 50,50);
    jf.add(sevenbutton);
    sevenbutton.addActionListener(this);
    sevenbutton.setFont(myfont);
    sevenbutton.setFocusable(false);
    
    eightbutton=new JButton("8");
    eightbutton.setBounds(65, 215, 50,50);
    jf.add(eightbutton);
    eightbutton.addActionListener(this);
    eightbutton.setFont(myfont);
    eightbutton.setFocusable(false);
    
    ninebutton=new JButton("9");
    ninebutton.setBounds(120, 215, 50,50);
    jf.add(ninebutton);
    ninebutton.addActionListener(this);
    ninebutton.setFont(myfont);
    ninebutton.setFocusable(false);
    
    fourbutton=new JButton("4");
    fourbutton.setBounds(10, 280, 50,50);
    jf.add(fourbutton);
    fourbutton.addActionListener(this);
    fourbutton.setFont(myfont);
    fourbutton.setFocusable(false);
    
    fivebutton=new JButton("5");
    fivebutton.setBounds(65, 280, 50,50);
    jf.add(fivebutton);
    fivebutton.addActionListener(this);
    fivebutton.setFont(myfont);
    fivebutton.setFocusable(false);
    
    sixbutton=new JButton("6");
    sixbutton.setBounds(120, 280, 50,50);
    jf.add(sixbutton);
    sixbutton.addActionListener(this);
    sixbutton.setFont(myfont);
    sixbutton.setFocusable(false);
    
    onebutton=new JButton("1");
    onebutton.setBounds(10, 345, 50,50);
    jf.add(onebutton);
    onebutton.addActionListener(this);
    onebutton.setFont(myfont);
    onebutton.setFocusable(false);
    
    twobutton=new JButton("2");
    twobutton.setBounds(65, 345, 50,50);
    jf.add(twobutton);
    twobutton.addActionListener(this);
    twobutton.setFont(myfont);
    twobutton.setFocusable(false);
    
    threebutton=new JButton("3");
    threebutton.setBounds(120, 345, 50,50);    
    jf.add(threebutton);
    threebutton.addActionListener(this);
    threebutton.setFont(myfont);
    threebutton.setFocusable(false);
    
    dotbutton=new JButton(".");
    dotbutton.setBounds(10, 410, 50,50);
    jf.add(dotbutton);
    dotbutton.addActionListener(this);
    dotbutton.setFont(myfont);
    dotbutton.setFocusable(false);
    
    zerobutton=new JButton("0");
    zerobutton.setBounds(65, 410, 50,50);
    jf.add(zerobutton);
    zerobutton.addActionListener(this);
    zerobutton.setFont(myfont);
    zerobutton.setFocusable(false);
    
    equalbutton=new JButton("=");
    equalbutton.setBounds(120, 410, 50,50);
    jf.add(equalbutton);
    equalbutton.addActionListener(this);
    equalbutton.setFont(myfont);
    equalbutton.setFocusable(false);
    
    //OPERATIONS
    
    divisonbutton=new JButton("/");
    divisonbutton.setBounds(176, 215, 50,50);
    jf.add(divisonbutton);
    divisonbutton.addActionListener(this);
    divisonbutton.setFont(myfont);
    divisonbutton.setFocusable(false);
    
    clearbutton=new JButton("C");
    clearbutton.setBounds(232, 215, 50,50);
    jf.add(clearbutton);
    clearbutton.addActionListener(this);
    clearbutton.setFont(myfont);
    clearbutton.setFocusable(false);
    
    
    multiplicationbutton=new JButton("*");
    multiplicationbutton.setBounds(176, 280, 50,50);
    jf.add(multiplicationbutton);
    multiplicationbutton.addActionListener(this);
    multiplicationbutton.setFont(myfont);
    multiplicationbutton.setFocusable(false);
    
    subtractionbutton=new JButton("-");
    subtractionbutton.setBounds(177, 345, 50,50);
    jf.add(subtractionbutton);
    subtractionbutton.addActionListener(this);
    subtractionbutton.setFont(myfont);
    subtractionbutton.setFocusable(false);
    
    Additionbutton=new JButton("+");
    Additionbutton.setBounds(177, 410, 50,50);
    jf.add(Additionbutton);
    Additionbutton.addActionListener(this);
    Additionbutton.setFont(myfont);
    Additionbutton.setFocusable(false);
    
    delbutton=new JButton("D");
    delbutton.setBounds(232, 280, 50, 50);
    jf.add(delbutton);
    delbutton.addActionListener(this);
    delbutton.setFont(myfont);
    delbutton.setFocusable(false);
    
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	}

public static void main(String[] args) {
	new Calculator();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()== sevenbutton) {
		
		if(operationclicked) {
			displaylabel.setText("7");
			operationclicked=false;
		}
		else {
			displaylabel.setText(displaylabel.getText()+"7");
		}
		
	}
	else if(e.getSource()== eightbutton){
		if(operationclicked) {
			displaylabel.setText("8");
			operationclicked=false;
		}
		else {
			displaylabel.setText(displaylabel.getText()+"8");
		}
		
	}
	else if(e.getSource()== ninebutton) {
		if(operationclicked) {
			displaylabel.setText("9");
			operationclicked=false;
		}
		else {
			displaylabel.setText(displaylabel.getText()+"9");
		}
		
	}
	else if(e.getSource()== fourbutton) {
		if(operationclicked) {
			displaylabel.setText("4");
			operationclicked=false;
		}
		else {
			displaylabel.setText(displaylabel.getText()+"4");
		}
		
	}
	else if(e.getSource()== fivebutton) {
		if(operationclicked) {
			displaylabel.setText("5");
			operationclicked=false;
		}
		else {
			displaylabel.setText(displaylabel.getText()+"5");
		}
		
	}
	else if(e.getSource()== sixbutton) {
		if(operationclicked) {
			displaylabel.setText("6");
			operationclicked=false;
		}
		else {
			displaylabel.setText(displaylabel.getText()+"6");
		}
		
	}
	else if(e.getSource()== onebutton) {
		if(operationclicked) {
			displaylabel.setText("1");
			operationclicked=false;
		}
		else {
			displaylabel.setText(displaylabel.getText()+"1");
		}
		
	}
	else if(e.getSource()== twobutton) {
		if(operationclicked) {
			displaylabel.setText("2");
			operationclicked=false;
		}
		else {
			displaylabel.setText(displaylabel.getText()+"2");
		}
		
		
	}
	else if(e.getSource()== threebutton) {
		if(operationclicked) {
			displaylabel.setText("3");
			operationclicked=false;
		}
		else {
			displaylabel.setText(displaylabel.getText()+"3");
		}
		
	}
	else if(e.getSource()== dotbutton) {
		displaylabel.setText(displaylabel.getText()+".");
		
	}
	else if(e.getSource()== zerobutton) {
		if(operationclicked) {
			displaylabel.setText("0");
			operationclicked=false;
		}
		else {
			displaylabel.setText(displaylabel.getText()+"0");
		}
			
	}
	else if(e.getSource()== equalbutton) {
		
		String newValue=displaylabel.getText();
		float oldValueF=Float.parseFloat(oldValue);
		float newValueF=Float.parseFloat(newValue);
		//float result=oldValueF+newValueF;
		//displaylabel.setText(result+"");
	
		switch(operator){
			
			case'+':
			         result=oldValueF+newValueF;
			         break;
			         
			case'-':
				     result=oldValueF-newValueF;
				     break;
				     
			case'*':
				    
				    result=oldValueF*newValueF;
				    break;
				    
			case'/':
				
				   result=oldValueF/newValueF;
				   break;
		}
		displaylabel.setText(String.valueOf(result));
		oldValueF=result;
	}
	//equal operation ends.

	else if(e.getSource()== divisonbutton) {
		
		operationclicked=true;
		oldValue=displaylabel.getText();
		operator='/';
		
	}
	else if(e.getSource()== multiplicationbutton) {
		
		operationclicked=true;
		oldValue=displaylabel.getText();
		operator='*';
		
	}
	else if(e.getSource()== Additionbutton) {
		
		operationclicked=true;
		oldValue=displaylabel.getText();
		operator='+';
		
		
	}
	else if(e.getSource()== subtractionbutton) {
		
		operationclicked=true;
		oldValue=displaylabel.getText();
		operator='-';
		
	}
	else if(e.getSource()== clearbutton) {
		displaylabel.setText("");
		
	}
	else if(e.getSource()== delbutton) {
	    String string=displaylabel.getText();
	    displaylabel.setText("");
	    for(int i=0;i<string.length()-1;i++) {
	    	displaylabel.setText(displaylabel.getText()+string.charAt(i));
	    }
	}

	
}
}