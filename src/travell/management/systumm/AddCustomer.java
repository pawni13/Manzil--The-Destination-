package travell.management.systumm;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class AddCustomer extends JFrame implements ActionListener{
    JLabel labelusername, lblusername,id,lblnumber,lblname,labelname,lblgender,lblcountry,lbladdress,lblemail,lblphone;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphone;
    JRadioButton rmale,rfemale;
    JButton add,back;
    String username;
    AddCustomer(String username){
        this.username = username;
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(150,50,150,25);
        add(labelusername);
        
        id = new JLabel("ID:");
        id.setBounds(30,90,150,25);
        add(id);
        
        comboid = new JComboBox(new String[]{"Passport", "Adhar Card", "PanCard"});
        comboid.setBounds(150,90,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(150,130,150,25);
        add(tfnumber);
        
        lblname = new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(150,170,150,25);
        add(labelname);
        
        lblgender = new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        rmale= new JRadioButton("Male");
        rmale.setBounds(150,210,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        rfemale= new JRadioButton("Female");
        rfemale.setBounds(230,210,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
        
        lblcountry = new JLabel("Country");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(150,250,150,25);
        add(tfcountry);
        
        lbladdress = new JLabel("Address");
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(150,290,150,25);
        add(tfaddress); 
        
        lblemail = new JLabel("Email");
        lblemail.setBounds(30,330,150,25);
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(150,330,150,25);
        add(tfemail);
        
        lblphone = new JLabel("Phone Number");
        lblphone.setBounds(30,370,150,25);
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(150,370,150,25);
        add(tfphone); 
        
        add =new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground( Color.WHITE);
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);
        
        back =new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground( Color.WHITE);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back); 
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("images/addd.jpg"));
       Image i2= i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(400,40,450,420);
       add(image);
       
       try{
           Conn c = new Conn();
         ResultSet rs =  c.s.executeQuery("select * from acccount where username = username" );
         while(rs.next()){
             labelusername.setText(rs.getString("username"));
             labelname.setText(rs.getString("name"));
         }
       }catch(Exception e){
           e.printStackTrace();
       }

        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()== add) {
           String username = labelusername.getText();
           String id = (String) comboid.getSelectedItem();
           String number = tfnumber.getText();
           String name = labelname.getText();
           String gender = null;
           if(rmale.isSelected()){
               gender = "Male";
           }
           else{
               gender = "Female";
           }
           String country = tfcountry.getText();
           String address = tfaddress.getText();
           String email = tfemail.getText();
           String phone = tfphone.getText();
           try{
              Conn c= new Conn();
               String query = "insert into customeer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+email+"','"+phone+"')";
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Customer Details Added Sucessfully");
               setVisible(false);
           }catch (Exception e){
               e.printStackTrace();
           }
           
       }else{
           setVisible(false);
       }
    }
    public static void main(String[] args){
        new AddCustomer("");
    }
    
}
