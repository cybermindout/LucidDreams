package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write('\n');
      out.write('\n');
      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("  \t<title>Login</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Assets/Template/Login/css/style.css\">\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("             ");

            if(request.getParameter("btnlogin")!=null)
            {
                String selu="select * from tbl_user where user_email='"+request.getParameter("txtuname")+"' and user_password='"+request.getParameter("txtpwd")+"' ";
                ResultSet rs=con.selectCommand(selu);
                
                String selw="select * from tbl_worker where worker_email='"+request.getParameter("txtuname")+"' and worker_password='"+request.getParameter("txtpwd")+"' and worker_vstatus='1'";
                ResultSet rs1=con.selectCommand(selw);
                
                String sell="select * from tbl_landlord where landlord_email='"+request.getParameter("txtuname")+"' and landlord_password='"+request.getParameter("txtpwd")+"' and landlord_vstatus='1'";
                ResultSet res=con.selectCommand(sell);
                
                String selAdmin="select * from tbl_admin where admin_username='"+request.getParameter("txtuname")+"' and admin_password='"+request.getParameter("txtpwd")+"' ";
                ResultSet rsAdmin=con.selectCommand(selAdmin);
                
                String sels="select * from tbl_shop where shop_email='"+request.getParameter("txtuname")+"' and shop_password='"+request.getParameter("txtpwd")+"' and shop_vstatus='1'";
                ResultSet ress=con.selectCommand(sels);
                
                if(rs.next())
                {
                    session.setAttribute("userid",rs.getString("user_id"));
                    session.setAttribute("username", rs.getString("user_name"));
                    response.sendRedirect("../User/Homepage.jsp");
                }
                else if(rs1.next())
                {
                    session.setAttribute("workerid",rs1.getString("worker_id"));
                    session.setAttribute("workername", rs1.getString("worker_name"));
                    response.sendRedirect("../Worker/Homepage.jsp");
                }
                else if(res.next())
                {
                    session.setAttribute("landlordid",res.getString("landlord_id"));
                    session.setAttribute("landlordname", res.getString("landlord_name"));
                    response.sendRedirect("../Landlord/Homepage.jsp");
                }
                else if(ress.next())
                {
                    session.setAttribute("shopid",ress.getString("shop_id"));
                    session.setAttribute("shopname", ress.getString("shop_name"));
                    response.sendRedirect("../Shop/Homepage.jsp");
                }
                 else if(rsAdmin.next())
                {
                    session.setAttribute("adminid",rsAdmin.getString("admin_id"));
                    session.setAttribute("adminusername", rsAdmin.getString("admin_username"));
                    response.sendRedirect("../Admin/HomePage1.jsp");
                }
                else
                {
                    
      out.write("\n");
      out.write("                    <script>alert('Invalid Login')</script>\n");
      out.write("                    ");

                }
            }
        
      out.write("\n");
      out.write("\t<section class=\"ftco-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row justify-content-center\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6 text-center mb-5\">\n");
      out.write("\t\t\t\t\t<!--<h2 class=\"heading-section\">Login</h2>-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row justify-content-center\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12 col-lg-10\">\n");
      out.write("\t\t\t\t\t<div class=\"wrap d-md-flex\">\n");
      out.write("\t\t\t\t\t\t<div class=\"text-wrap p-4 p-lg-5 text-center d-flex align-items-center order-md-last\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text w-100\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Welcome to login</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Don't have an account?</p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"User.jsp\" class=\"btn btn-white btn-outline-white\">Sign Up</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t<div class=\"login-wrap p-4 p-lg-5\">\n");
      out.write("\t\t\t      \t<div class=\"d-flex\">\n");
      out.write("\t\t\t      \t\t<div class=\"w-100\">\n");
      out.write("\t\t\t      \t\t\t<h3 class=\"mb-4\">Sign In</h3>\n");
      out.write("\t\t\t      \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w-100\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"social-media d-flex justify-content-end\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.instagram.com/cybergallant/\" class=\"social-icon d-flex align-items-center justify-content-center\"><span class=\"fa fa-instagram\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"social-icon d-flex align-items-center justify-content-center\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t      \t</div>\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" class=\"signin-form\">\n");
      out.write("\t\t\t      \t\t<div class=\"form-group mb-3\">\n");
      out.write("\t\t\t      \t\t\t<label class=\"label\" for=\"name\">Email</label>\n");
      out.write("\t\t\t      \t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"example@gmail.com\" name=\"txtuname\" required>\n");
      out.write("\t\t\t      \t\t</div>\n");
      out.write("\t\t            <div class=\"form-group mb-3\">\n");
      out.write("\t\t            \t<label class=\"label\" for=\"password\">Password</label>\n");
      out.write("\t\t              <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"txtpwd\" required>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <div class=\"form-group\">\n");
      out.write("\t\t            \t<button type=\"submit\" name=\"btnlogin\" class=\"form-control btn btn-primary submit px-3\">Sign In</button>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <div class=\"form-group d-md-flex\">\n");
      out.write("\t\t            \t<div class=\"w-50 text-left\">\n");
      out.write("<!--\t\t\t            \t<label class=\"checkbox-wrap checkbox-primary mb-0\">Remember Me\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"checkbox\" checked>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <span class=\"checkmark\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>-->\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"w-50 text-md-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Forgot Password</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t          </form>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t      </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("        <script src=\"../Assets/Template/Login/js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Template/Login/js/popper.js\"></script>\n");
      out.write("  <script src=\"../Assets/Template/Login/js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Template/Login/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
