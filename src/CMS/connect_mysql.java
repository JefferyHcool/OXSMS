package CMS;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class  connect_mysql{
    private ArrayList<String> info = new ArrayList<String>();
    private  ArrayList stu_info=new ArrayList();
    private Map<String,String> name= new HashMap<String,String>();
    private  int stu_id;
    private int age;
    private  int phonenumber;

    private Object String;


    public void connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn=DriverManager.getConnection("jdbc:mysql://1.116.61.49:3306/stu_info","Stu_info","HJW123456");

        String sql="SELECT * FROM stu_info.INFO";

        Statement stmt=conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        int i=0;
        while (rs.next()){
            info.add(rs.getString("name"));
            info.add(rs.getString("age"));
            info.add(rs.getString("phoneNumber"));
            info.add(rs.getString("stu_id"));

        }


        stmt.close();
        conn.close();
    }

    public void sets_tu_Info(ArrayList stu_info){
        stu_info=this.stu_info;
    }

    public ArrayList stu_info() {

        return stu_info;
    }
    public void setName(Map name) {
        this.name = name;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}