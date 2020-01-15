package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class loginVerify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        String username;
        String password1;
        Connection con;
        PreparedStatement st;
        ResultSet res;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Verification</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <\n");
      out.write("<!--//        try{\n");
      out.write("//          String sql = \"select * from register where username=? and password=?\";\n");
      out.write("//          String username = request.getParameter(\"username\").trim();\n");
      out.write("//          String password1 = request.getParameter(\"password\").trim();\n");
      out.write("//          String dbName = null;\n");
      out.write("//          String dbPassword = null;\n");
      out.write("//          Class.forName(\"com.mysql.jdbc.Driver\");\n");
      out.write("//          Connection con = DriverManager.getConnection(\"jdbc:mysql://localhost/CMSignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC\", \"root\", \"\");\n");
      out.write("//          PreparedStatement ps = con.prepareStatement(sql);\n");
      out.write("//          ps.setString(1, username);\n");
      out.write("//          ps.setString(3, password1);\n");
      out.write("//          ResultSet rs = ps.executeQuery();\n");
      out.write("//          while(rs.next()){\n");
      out.write("//              dbName = rs.getString(1);\n");
      out.write("//              dbPassword = rs.getString(3);\n");
      out.write("//          }\n");
      out.write("//          if(username.equals(dbName)&&password1.equals(dbPassword)){\n");
      out.write("//              out.println(\"Welcome!\");\n");
      out.write("//          }else{\n");
      out.write("//              response.sendRedirect(\"login.jsp\");\n");
      out.write("//          }\n");
      out.write("//          \n");
      out.write("//        } catch (ClassNotFoundException ex) {\n");
      out.write("//            ex.printStackTrace();\n");
      out.write("//        }\n");
      out.write("//           catch(SQLException ex){\n");
      out.write("//            ex.printStackTrace();\n");
      out.write("//        }-->\n");
      out.write("\n");
      out.write("           ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            try{
                Class.forName("com.mysql.jdbc.Driver");
                username = "";
                password1 = "";
                String item = request.getParameter("item");
                String usernameEntered = request.getParameter("username").trim();
                String passwordEntered = request.getParameter("password").trim();
                String sql = "SELECT * FROM register WHERE ( username = ' "+usernameEntered+ " ' AND password = ' "+passwordEntered+ " ') ";
//                String sql = "SELECT * FROM login WHERE (username =?,  item =?  AND password =?' )";
                
                
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/CMSignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC", "root", "");

                st = (PreparedStatement) con.prepareStatement(sql);
                res = st.executeQuery();
               
                
//                    out.write("Please register first");
                    response.sendRedirect("landingPage.jsp");
                
                  /* response.sendRedirect("choose.jsp");
                else
                    response.sendRedirect("home.jsp");*/
                con.close();
                
            }
            catch(SQLException ex){
                out.write("An error occured: " + ex.toString());
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
