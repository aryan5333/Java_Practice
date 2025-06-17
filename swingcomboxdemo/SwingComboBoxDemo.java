package swingcomboxdemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.smartcardio.CardPermission;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyFrame extends JFrame implements ActionListener,ChangeListener,ListSelectionListener
{
    JComboBox cb;
    JSpinner sp1,sp2;
    JTextField tf;
    JList l;

    MyFrame()
    {
        super("swingCombo Demo");
        String countries[]={"India","Austrialia","Uk","US","Pakistan"};
        String Months[]={"January","February","March","April","May","June","July","August","September"};
        String Days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        cb=new JComboBox(countries);
        l=new JList(Months);
        l.setVisibleRowCount(5);;
        tf=new JTextField(15);
        sp1=new JSpinner(new SpinnerNumberModel(1,1,31,1));
        sp2=new JSpinner(new SpinnerListModel(Days));
        
        setLayout(new FlowLayout());
        add(cb);
        add(sp1);
        add(sp2);
        add(new JScrollPane(l));
        add(tf);

      cb.addActionListener(this);
      l.addListSelectionListener(this);
      sp1.addChangeListener(this);
            
       
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        tf.setText((String)(cb.getSelectedItem()));
    }
    public void valueChanged(ListSelectionEvent ls)
    {
        tf.setText((String)l.getSelectedValue());
    }
    public void stateChanged(ChangeEvent ce)
    {
        if(ce.getSource()==sp1)
        {
            tf.setText(sp1.getValue()+" ");
        }
        else{
            tf.setText((String)sp2.getValue());
        }
    }

}

public class SwingComboBoxDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
