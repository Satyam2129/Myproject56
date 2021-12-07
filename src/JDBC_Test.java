import java.sql.*;
import java.util.Scanner;

public class JDBC_Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Satyam_i","root","");
        PreparedStatement s= con.prepareStatement("insert into information values(?)");

        Scanner sc=new Scanner(System.in);
        String str[]=new String[3];
        int a=0;
        for(int i=0;i<3;i++)
        {
            String s1=sc.nextLine();
            if(s1.matches("[a-zA-Z0-9]+(@gmail.com|@rediff.com|@outlook.com)"))
                str[a++]=s1;
        }

        for(int i=0;i<a;i++)
        {
            s.setString(1,str[i]);
            s.execute();
        }

    }
}
