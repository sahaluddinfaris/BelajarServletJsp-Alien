package com.sahaluddin.dao;

import com.sahaluddin.model.Alien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AlienDao
{

    public Alien getAlien(int aid)
    {
        Alien a = new Alien();

//        a.setAid(101);
//        a.setAname("faris");
//        a.setTech("lovejava");

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jspservlet","root", "super");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from alien where aid ="+aid);
            if (rs.next())
            {
                a.setAid(rs.getInt("aid"));
                a.setAname(rs.getString("aname"));
                a.setTech(rs.getString("tech"));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }






        return a;
    }

}
