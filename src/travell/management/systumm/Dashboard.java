package travell.management.systumm;
import Underated;
import Underated;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    String username;
    JButton addPersonalDetails,updateaddPersonalDetails,viewDetails,checkPackages,bookPackages,viewPackage,viewhotel,destination, bookhotel,viewBookHotel,payment;
    JButton calculator,notepad,about,deleteDetails,underated;
    Dashboard(String usename){
        this.username = username;
        setBounds(0,0,1600,1000);
        setLayout(null);
        
        
       JPanel p1 = new JPanel();
       p1.setLayout(null);
       p1.setBackground(new Color(51,153,255));
       p1.setBounds(0,0,1600,65);
       add(p1);
       
       ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
       Image i2= i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(5,0,70,70);
       p1.add(icon);
       
       JLabel heading = new JLabel("Dashboard");
       heading.setBounds(80,10,300,40);
       heading.setForeground(Color.WHITE);
       heading.setFont(new Font("Tahoma",Font.BOLD,30));
       p1.add(heading);
       
       JPanel p2= new JPanel();
       p2.setLayout(null);
       p2.setBackground(new Color(51,153,255));
       p2.setBounds(0,65,300,900);
       add(p2);
       
       addPersonalDetails = new JButton("Add Personal Details");
       addPersonalDetails.setBounds(0,0,300,50);
       addPersonalDetails.setBackground(new Color(51,153,255));
       addPersonalDetails.setForeground(Color.WHITE);
       addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       addPersonalDetails.setMargin(new Insets(0,0,0,60));
       addPersonalDetails.addActionListener(this);
       p2.add(addPersonalDetails);
       
       updateaddPersonalDetails = new JButton("Update Personal Details");
       updateaddPersonalDetails.setBounds(0,50,300,50);
       updateaddPersonalDetails.setBackground(new Color(51,153,255));
       updateaddPersonalDetails.setForeground(Color.WHITE);
       updateaddPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       updateaddPersonalDetails.setMargin(new Insets(0,0,0,30));
       updateaddPersonalDetails.addActionListener(this);
       p2.add(updateaddPersonalDetails);
       
       viewDetails = new JButton("View Details");
       viewDetails.setBounds(0,100,300,50);
       viewDetails.setBackground(new Color(51,153,255));
       viewDetails.setForeground(Color.WHITE);
       viewDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewDetails.setMargin(new Insets(0,0,0,130));
       viewDetails.addActionListener(this);
       p2.add(viewDetails);
       
       deleteDetails = new JButton("Delete Personal Details");
       deleteDetails.setBounds(0,150,300,50);
       deleteDetails.setBackground(new Color(51,153,255));
       deleteDetails.setForeground(Color.WHITE);
       deleteDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       deleteDetails.setMargin(new Insets(0,0,0,40));
       deleteDetails.addActionListener(this);
       p2.add(deleteDetails);
       
       checkPackages = new JButton("Check Package");
       checkPackages.setBounds(0,200,300,50);
       checkPackages.setBackground(new Color(51,153,255));
       checkPackages.setForeground(Color.WHITE);
       checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
       checkPackages.setMargin(new Insets(0,0,0,110));
       checkPackages.addActionListener(this);
       p2.add(checkPackages);
       
       

       bookPackages = new JButton("Book Package");
       bookPackages.setBounds(0,250,300,50);
       bookPackages.setBackground(new Color(51,153,255));
       bookPackages.setForeground(Color.WHITE);
       bookPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
       bookPackages.setMargin(new Insets(0,0,0,120));
       bookPackages.addActionListener(this);
       p2.add( bookPackages);
               
       
       viewPackage = new JButton("View Package");
       viewPackage.setBounds(0,300,300,50);
       viewPackage.setBackground(new Color(51,153,255));
       viewPackage.setForeground(Color.WHITE);
       viewPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewPackage.setMargin(new Insets(0,0,0,120));
       viewPackage.addActionListener(this);
       p2.add( viewPackage);
       
       viewhotel = new JButton("View Hotels");
       viewhotel.setBounds(0,350,300,50);
       viewhotel.setBackground(new Color(51,153,255));
       viewhotel.setForeground(Color.WHITE);
       viewhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewhotel.setMargin(new Insets(0,0,0,130));
       viewhotel.addActionListener(this);
       p2.add( viewhotel);
       
       bookhotel = new JButton("Book Hotel");
       bookhotel.setBounds(0,400,300,50);
       bookhotel.setBackground(new Color(51,153,255));
       bookhotel.setForeground(Color.WHITE);
       bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
       bookhotel.setMargin(new Insets(0,0,0,140));
       bookhotel.addActionListener(this);
       p2.add( bookhotel);
       
       viewBookHotel = new JButton("View Booked Hotel");
       viewBookHotel.setBounds(0,450,300,50);
       viewBookHotel.setBackground(new Color(51,153,255));
       viewBookHotel.setForeground(Color.WHITE);
       viewBookHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewBookHotel.setMargin(new Insets(0,0,0,70));
       viewBookHotel.addActionListener(this);
       p2.add( viewBookHotel);
       
        destination = new JButton("Destinations");
       destination.setBounds(0,500,300,50);
       destination.setBackground(new Color(51,153,255));
       destination.setForeground(Color.WHITE);
       destination.setFont(new Font("Tahoma",Font.PLAIN,20));
       destination.setMargin(new Insets(0,0,0,125));
       destination.addActionListener(this);
       p2.add( destination);
       
       payment = new JButton("Emergency Contacts");
       payment.setBounds(0,550,400,50);
       payment.setBackground(new Color(51,153,255));
       payment.setForeground(Color.WHITE);
       payment.setFont(new Font("Tahoma",Font.PLAIN,20));
       payment.setMargin(new Insets(0,0,0,155));
       payment.addActionListener(this);
       p2.add( payment );
       
       underated= new JButton("Underated Places");
       underated.setBounds(0,600,360,50);
       underated.setBackground(new Color(51,153,255));
       underated.setForeground(Color.WHITE);
       underated.setFont(new Font("Tahoma",Font.PLAIN,20));
       underated.setMargin(new Insets(0,0,0,145));
       underated.addActionListener(this);
       p2.add( underated );

       notepad = new JButton("Notepad");
       notepad.setBounds(0,650,300,50);
       notepad.setBackground(new Color(51,153,255));
       notepad.setForeground(Color.WHITE);
       notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
       notepad.setMargin(new Insets(0,0,0,155));
       notepad.addActionListener(this);
       p2.add( notepad );

       about = new JButton("About");
       about.setBounds(0,700,300,50);
       about.setBackground(new Color(51,153,255));
       about.setForeground(Color.WHITE);
       about.setFont(new Font("Tahoma",Font.PLAIN,20));
       about.setMargin(new Insets(0,0,0,175));
       about.addActionListener(this);
       p2.add( about );
       
       ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("images/goa6.jpg"));
       Image i5= i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
       ImageIcon i6= new ImageIcon(i5);
       JLabel image= new JLabel(i6);
       image.setBounds(0,0,1650,1000);
       add(image);
       
       JLabel text = new JLabel("MANZIL...");
       text.setBounds(760,70,2000,70);
       text.setForeground(Color.BLACK);
       text.setFont(new Font("Georgia",Font.ROMAN_BASELINE,75));
       image.add(text); 
       
       JLabel ttext = new JLabel("      The Destination");
       ttext.setBounds(930,160,2000,50);
       ttext.setForeground(Color.BLACK);
       ttext.setFont(new Font("Edwardian Script ITC",Font.ROMAN_BASELINE,75));
       image.add(ttext);
       
        setVisible(true);
        
    } 
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource()== viewDetails){
            new ViewCustomer(username);
        }else if(ae.getSource()== updateaddPersonalDetails){
            new UpdateDetails(username);
        }else if(ae.getSource()== deleteDetails){
            new DeleteDetails(username);
        }
        else if(ae.getSource()== checkPackages){
            new CheckPackage();
        }
        else if(ae.getSource()== bookPackages){
            new BookPackage(username).setVisible(true);
        }else if(ae.getSource()== viewPackage){
            new ViewPackage(username).setVisible(true);
        }else if(ae.getSource()== viewhotel){
            new CheckHotels().setVisible(true);
        }
        else if(ae.getSource()== destination){
            new Destination().setVisible(true);
        }else if(ae.getSource() == bookhotel){
            new BookHotel(username).setVisible(true);
        }else if(ae.getSource()== viewBookHotel){
            new ViewBookedHotel(username).setVisible(true);
        }else if(ae.getSource() == payment){
            new Payment().setVisible(true);
        }
        else if(ae.getSource() == underated){
            new Underated().setVisible(true);
        }
        else if(ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == about){
            new About().setVisible(true);
        }
        
    }
    public static void main(String args[]){
        new Dashboard("");
    }
    
    
}
