package CMS;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        connect_mysql db=new connect_mysql();
        db.connect();
        ArrayList name=db.stu_info();
        System.out.println(name);

    }
}
