package elictricityBilling;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class Bill_details extends JFrame {
    String meter;
    Bill_details(String meter){
        this.meter =meter;
        setSize(700,650);
        setLocation(400,150);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JTable table = new JTable();

        try{
            database c = new database();
            String query_bill = "select * from bill where meter_no = '"+meter+"'";
            ResultSet resultSet = c.statement.executeQuery(query_bill);

        }catch (Exception e){
            e.printStackTrace();
        }
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(0,0,700,650);
        add(sp);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Bill_details("");
    }
}