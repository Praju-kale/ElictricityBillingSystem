package elictricityBilling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    String acctype;
    String meter_pass;
    Main(String acctype, String meter_pass){
        this.meter_pass = meter_pass;
        this.acctype = acctype;
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/ebs.png"));
        Image image = imageIcon.getImage().getScaledInstance(1250,680,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image);
        JLabel imageLable = new JLabel(imageIcon2);
        add(imageLable);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Menu");
        menu.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem New_customer = new JMenuItem("New Customer");
        New_customer.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerImg = new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
        Image customerImage = customerImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        New_customer.setIcon(new ImageIcon(customerImage));
        New_customer.addActionListener(this);
        menu.add(New_customer);

        JMenuItem customer_details = new JMenuItem("Customer Details");
        customer_details.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customer_detailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
        Image customerdetailsImage = customer_detailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customer_details.setIcon(new ImageIcon(customerdetailsImage));
        customer_details.addActionListener(this);
        menu.add(customer_details);

        JMenuItem deposit_detail = new JMenuItem("Deposit Details");
        deposit_detail.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon deposit_detailImg = new ImageIcon(ClassLoader.getSystemResource("icon/depositdetails.png"));
         Image deposit_detailImage = deposit_detailImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        deposit_detail.setIcon(new ImageIcon(deposit_detailImage));
        deposit_detail.addActionListener(this);
        menu.add(deposit_detail);

        JMenuItem calculate_bill = new JMenuItem("Calculate Bill");
        calculate_bill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculate_billImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
        Image calculatebillImage = calculate_billImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculate_bill.setIcon(new ImageIcon(calculatebillImage));
        calculate_bill.addActionListener(this);
        menu.add(calculate_bill);


        JMenu info = new JMenu("Information");
        info.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem update_info =new JMenuItem("Update Information");
        update_info.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon update_infoImg = new ImageIcon(ClassLoader.getSystemResource("icon/refresh.png"));
        Image upinfoImage = update_infoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        update_info.setIcon(new ImageIcon(upinfoImage));
        update_info.addActionListener(this);
        info.add(update_info);

        JMenuItem view_info =new JMenuItem("View Information");
        view_info.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon view_infoImg = new ImageIcon(ClassLoader.getSystemResource("icon/information.png"));
        Image viewInfoImage = view_infoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        view_info.setIcon(new ImageIcon(viewInfoImage));
        view_info.addActionListener(this);
        info.add(view_info);

        JMenu user = new JMenu("User");
        user.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem pay_bill =new JMenuItem("Pay Bill");
        pay_bill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon pay_billImg = new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
        Image pay_billImage = pay_billImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        pay_bill.setIcon(new ImageIcon(pay_billImage));
        pay_bill.addActionListener(this);
        user.add(pay_bill);

        JMenuItem Bill_details =new JMenuItem("Bill Details");
        Bill_details.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon Bill_detailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
        Image billdetailsImage = Bill_detailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        Bill_details.setIcon(new ImageIcon(billdetailsImage));
        Bill_details.addActionListener(this);
        user.add(Bill_details);

        JMenu bill = new JMenu("Bill");
        bill.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem generate_Bill =new JMenuItem("Generate Bill");
        generate_Bill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon generate_BillImg = new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
        Image generate_BillImage = generate_BillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        generate_Bill.setIcon(new ImageIcon(generate_BillImage));
        generate_Bill.addActionListener(this);
        bill.add(generate_Bill);

        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem notepad =new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon notepadImg = new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image notepadImage = notepadImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadImage));
        notepad.addActionListener(this);
        utility.add(notepad);


        JMenuItem calculator =new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatorImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image calculatorImage = calculatorImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatorImage));
        calculator.addActionListener(this);
        utility.add(calculator);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem eexit =new JMenuItem("Exit");
        eexit.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon eexitImg = new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image eexitImage = eexitImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        eexit.setIcon(new ImageIcon(eexitImage));
        eexit.addActionListener(this);
        exit.add(eexit);

        if (acctype.equals("Admin")){
            menuBar.add(menu);
        }else {
            menuBar.add(bill);
            menuBar.add(user);
            menuBar.add(info);
        }
        menuBar.add(utility);
        menuBar.add(exit);


        setLayout(new FlowLayout());
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if (msg.equals("New Customer")) {
            new New_customer();
        } else if (msg.equals("Customer Details")) {
            new customer_details();
        } else if (msg.equals("Deposit Details")) {
            new deposit_details();
        } else if (msg.equals("Calculate Bill")) {
            new calculate_bill();
        } else if (msg.equals("View Information")) {
            new view_info(meter_pass);
        } else if (msg.equals("Update Information")) {
            new update_info(meter_pass);
        } else if (msg.equals("Bill Details")) {
            new Bill_details(meter_pass);
        } else if (msg.equals("Calculator")) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (msg.equals("Notepad")) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (msg.equals("Exit")) {
            setVisible(false);
            new Login();
        } else if (msg.equals("Pay Bill")) {
            new pay_bill(meter_pass);
        } else if (msg.equals("Generate Bill")) {
            new generate_Bill(meter_pass);
        }
    }

    public static void main(String[] args) {
        new Main("","");
    }
}