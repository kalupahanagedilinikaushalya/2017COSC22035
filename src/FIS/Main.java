package FIS;

import DBConnect.*;
import com.sun.corba.se.spi.orbutil.fsm.Guard;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Statement stml = null;
        Statement stm=null;

        DBConnect.dbConnect myDB=new dbConnect();
        myDB.Connect2DB();
        stm=myDB.Conn2DB();
        String newsql="SELECT * from userdetails";
        String insertquery="INSERT INTO userdetails(319,'dilini','hfhhg@hfhg','dilini',5)";
        try{
            System.out.println("hello");
            ResultSet rs=stm.executeQuery(newsql);
            System.out.println("hello");
            //int r=stm.executeUpdate(insertquery);
            while(rs.next()){
                int uid=rs.getInt("UserID");
                String pw=rs.getString("Password");
                System.out.println("User id from DB "+uid+" password from DB"+pw);
            }
        }
        catch(SQLException s){
            System.out.println("SQLExeption");
            s.printStackTrace();
        }
        myDB.closeDB();

       /* DBConnect.dbConnect DB = new dbConnect();//Object from DB connect
        DB.Connect2DB();//Connect to DB

        System.out.print("Input Lecturer Name:");
        academic UPL = new academic();
        course COSC22035 = new course();
        UPL.name = sc.nextLine();
        System.out.println("Insert Phone Number:");
        UPL.phoneNumber = sc.nextInt();
        UPL.displayInfo();
        /*
        try{
            System.out.println(COSC22035.creditValue/0);
        }
        catch (ArithmeticException exp)
        {
            exp.printStackTrace();
        }
        try{
            System.out.println(args[0]);
        }
        catch (ArrayIndexOutOfBoundsException exp)
        {
            exp.printStackTrace();
        }
        */
        //test.name=sc.nextLine();

        //System.out.println("Out of Exception");
      /*  System.out.print("Input Credit Value:");
        COSC22035.creditValue=sc.nextInt();
        UPL.courseTaught.add(COSC22035);
        try
        {
            if(UPL.totalCredits()>0) throw new courseException();
        }catch (courseException exp)
        {
            exp.printStackTrace();
        }
        UPL.outSal();
        DB.Connect2DB();
        stml = DB.Conn2DB();
        String sql = "SELECT * FROM `userDetails`";
        try{
            if (UPL.totalCredits()>10) throw new courseException();
        }catch (courseException exp)
        {
            exp.printStackTrace();
        }
        try{
            stml.execute(sql);
            ResultSet rs = stml.executeQuery(sql);
            while(rs.next()){
                System.out.println("User Name "+rs.getString("UserName"));
            }
            stml.close();
        }catch (SQLException exp)
        {
            exp.printStackTrace();
        }
        UPL.calcSal();*/


    }
}
