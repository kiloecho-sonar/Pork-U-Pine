package com.acme.basic;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import java.sql.Statement;

public class HelloEarth {

  void sayHello() {
    System.out.println("Hello World!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }

  void keithTest(){
    System.out.println("Write a log damnit!");
  }

  void keithTest1(){
    System.out.println("All work and no play makes me a dull boy!");
  }

  void keithTest2(){
    System.out.println("This looks familiar!");
  }

  public String taintedSQL(HttpServletRequest request, Connection connection) throws Exception {
    String user = request.getParameter("user");
    String query = 
"SELECT userid FROM users WHERE username = '" + user  + "'";
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(query);
    return resultSet.getString(0);
  }



}
