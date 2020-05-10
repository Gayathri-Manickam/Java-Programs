import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="bankform.class" width=300 height=300>
</applet>*/
public class bankform extends Applet implements ActionListener
{
	Label l1=new Label("First Name:");
	Label l2=new Label("Last Name:");
	Label l3=new Label("Mobile Number:");
	Label l4=new Label("Gender:");
	Label l5=new Label("Address:");
	Label l6=new Label("D.O.B:");
	Label l7=new Label("Select your account type:");
	TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	TextField t3=new TextField(10);
	TextField t4=new TextField(10);
	TextField t5=new TextField(20);
	
	CheckboxGroup cm=new CheckboxGroup();
	Checkbox c1=new Checkbox("Male",cm,false);
	Checkbox c2=new Checkbox("Female",cm,false);
	
	CheckboxGroup cy=new CheckboxGroup();
	Checkbox c3=new Checkbox("Savings Account",cy,false);
	Checkbox c4=new Checkbox("Current Account",cy,false);
	
	TextArea ta=new TextArea(10,100);
	
	Button b1=new Button("Submit");
	Button b2=new Button("Reset");
    
	
		public void start()
	{
		add(new Label("Bank Account opening Form"));
		add(l1); add(t1);
		
		add(l2); add(t2);
		
		add(l3); add(t3);
		
		add(l4); add(c1); add(c2);
		
		add(l5); add(t5);
				 
		add(l6); add(t4);
		add(l7); add(c3);add(c4);		
		add(b1);   add(b2);
		
		add(ta);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
	    ta.setText("");
		if(s.equals("Submit"))
		{
			if(t1.getText().equals("")||t1.getText().equals(" "))
			{
			    ta.append("First Name not Entered\n");
			}
			else
			{
				ta.append("First Name:\t"+t1.getText()+"\n");
			}
			if(t2.getText().equals("")||t2.getText().equals(" "))
			{
			    ta.append("Last Name not Entered\n");
			}
			else
			{
				ta.append("Last Name:\t"+t2.getText()+"\n");
			}
			if(t3.getText().equals("")||t3.getText().equals(" "))
			{
			    ta.append("Mobile.no not Entered\n");
			}
			else
			{
				ta.append("Mobile.no:\t"+t3.getText()+"\n");
			}
			if(t5.getText().equals("")||t5.getText().equals(" "))
			{
			    ta.append("Address not Entered\n");
			}
			else
			{
				ta.append("Address:\t"+t5.getText()+"\n");
			}
			if(t4.getText().equals("")||t4.getText().equals(" "))
			{
			    ta.append("D.O.B not Entered\n");
			}
			else
			{
				ta.append("D.O.B:\t"+t4.getText()+"\n");
			}
			String t=""+cm.getSelectedCheckbox();
				if(t.equals("null"))
					ta.append("\nGender not selected\n");
				else
					ta.append("\nGender:\t"+cm.getSelectedCheckbox().getLabel()+"\n");
				String t1=""+cy.getSelectedCheckbox();
				if(t1.equals("null"))
					ta.append("\nAccount Type not selected\n");
				else
					ta.append("\nAccount Type:\t"+cy.getSelectedCheckbox().getLabel()+"\n");
			
		}
		else
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
			t4.setText(" ");
			t5.setText(" ");
			ta.setText(" ");
		}
	}
}
