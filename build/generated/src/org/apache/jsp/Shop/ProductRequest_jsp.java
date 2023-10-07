package org.apache.jsp.Shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class ProductRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Shop/Head.jsp");
    _jspx_dependants.add("/Shop/Foot.jsp");
  }

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
//@include file="SessionValidator.jsp" 
      out.write('\n');
      out.write('\n');
      DB.ConnectionClass connect = null;
      synchronized (_jspx_page_context) {
        connect = (DB.ConnectionClass) _jspx_page_context.getAttribute("connect", PageContext.PAGE_SCOPE);
        if (connect == null){
          connect = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("connect", connect, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Request</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"form.css\">\n");
      out.write("    </head>\n");
      out.write("    ");

        String Prequest = "", name = "", category="";
        
        if(request.getParameter("btnsave")!=null)
        {
            String Request = request.getParameter("product");
            name = request.getParameter("name");
            category =request.getParameter("category");
                
                
            String insQry = "insert into tbl_prequest(pr_name,pr_category,shop_id)values('"+name+"','"+category+"','"+session.getAttribute("shopid")+"')";
            if(connect.executeCommand(insQry))
            {
                out.println("<script>alert('Request placed')</script>");
            }
            else
            {
                out.println("<script>alert('Failed to place request')</script>");
                out.println(insQry);
            }
        }
        if(request.getParameter("did")!=null){
            String del="delete from tbl_prequest where pr_id='"+request.getParameter("did")+"'";
            connect.executeCommand(del);
            response.sendRedirect("ProductRequest.jsp");
        }
    
        
        
      out.write("\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- \n");
      out.write("    More Templates Visit ==> Free-Template.co\n");
      out.write("    -->\n");
      out.write("    <title>LUCID DREAMS</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"Free Template by Free-Template.co\" />\n");
      out.write("    <meta name=\"keywords\" content=\"free bootstrap 4, free bootstrap 4 template, free website templates, free html5, free template, free website template, html5, css3, mobile first, responsive\" />\n");
      out.write("    <meta name=\"author\" content=\"Free-Template.co\" />\n");
      out.write("    \n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Assets/Template/Main/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Assets/Template/Main/css/open-iconic-bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Assets/Template/Main/css/animate.css\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"../Assets/Template/Main/css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Assets/Template/Main/css/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Assets/Template/Main/css/icomoon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Assets/Template/Main/css/style.css\">\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("            color:black;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body data-spy=\"scroll\" data-target=\"#ftco-navbar\" data-offset=\"200\">\n");
      out.write("    \n");
      out.write("      <nav  class=\"navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("          <a class=\"navbar-brand\" href=\"Homepage.jsp\" style=\"color:black\">LUCID DREAMS</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"oi oi-menu\"></span> Menu\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\n");
      out.write("          <ul class=\"nav navbar-nav menu_nav ml-auto\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"Homepage.jsp\" style=\"color:black\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\" style=\"color:black\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"MyProfile.jsp\" style=\"color:black\">My Profile</a></li>\n");
      out.write("                                                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"NewProduct.jsp\" style=\"color:black\">Product</a></li>\n");
      out.write("                                                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"OrderReport.jsp\" style=\"color:black\">Order</a></li>\n");
      out.write("                                                       \n");
      out.write("                                                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"ViewUserBookings.jsp\" style=\"color:black\">Bookings</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- END nav -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("        <br>        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div id=\"tab\">\n");
      out.write("        <form name=\"frmComplaints\" method=\"post\">\n");
      out.write("            <table border=\"1\" align=\"center\" cellpadding=\"10\" style=\"border-collapse: collapse\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Product Name</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"name\" placeholder=\"Enter Product Name\" required=\"required\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Product Category</td>\n");
      out.write("                    <td><input type=\"text\" name=\"category\" placeholder=\"Enter Product Category\" required=\"required\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\n");
      out.write("                        <input type=\"submit\" name=\"btnsave\" value=\"submit\">\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("                        <br><br>\n");
      out.write("        <table border=\"1\" align=\"center\" cellpadding=\"10\" style=\"border-collapse: collapse\">\n");
      out.write("            <tr>\n");
      out.write("                <th>SI.No</th>\n");
      out.write("                <th>Product</th>\n");
      out.write("                <th>Category</th>\n");
      out.write("                <th>Reply</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                    String s = "select * from tbl_prequest where shop_id='"+session.getAttribute("shopid")+"'";
                    ResultSet r = connect.selectCommand(s);
                    int i = 0;
                    while (r.next()) {
                        i++;

                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(r.getString("pr_name"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(r.getString("pr_category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(r.getString("pr_reply"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"roductRequest.jsp?did=");
      out.print(r.getString("pr_id"));
      out.write("\">Delete</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write(" \n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <br>  <br>  <br>  <br>  <br>  <br>  <br>\n");
      out.write("    ");
      out.write("<section class=\"ftco-section bg-white ftco-slant ftco-slant-dark\" id=\"section-contact\">\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("<footer class=\"ftco-footer ftco-bg-dark\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row mb-5\">\n");
      out.write("          <div class=\"col-md-8\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md\">\n");
      out.write("                <div class=\"ftco-footer-widget mb-4\">\n");
      out.write("                  <h2 class=\"ftco-heading-2\">Company</h2>\n");
      out.write("                  <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">About</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">Jobs</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">Press</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">News</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md\">\n");
      out.write("                 <div class=\"ftco-footer-widget mb-4\">\n");
      out.write("                  <h2 class=\"ftco-heading-2\">Communities</h2>\n");
      out.write("                  <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">Support</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">Sharing is Caring</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">Better Web</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">Good Template</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md\">\n");
      out.write("                 <div class=\"ftco-footer-widget mb-4\">\n");
      out.write("                  <h2 class=\"ftco-heading-2\">Useful links</h2>\n");
      out.write("                  <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">Bootstrap 4</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">jQuery</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">HTML5</a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"py-2 d-block\">Sass</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <div class=\"ftco-footer-widget mb-4\">\n");
      out.write("              <ul class=\"ftco-footer-social list-unstyled float-md-right float-lft\">\n");
      out.write("                <li><a href=\"#\"><span class=\"icon-twitter\"></span></a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"icon-facebook\"></span></a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"icon-instagram\"></span></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md text-left\">\n");
      out.write("            <p>All Rights Reserved<span class=\"icon-heart text-danger\"></span>  by <a href=\"https://www.instagram.com/cybergallant/\">Cyber</a></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!-- loader -->\n");
      out.write("    <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#4586ff\"/></svg></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"../Assets/Template/Main/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../Assets/Template/Main/js/popper.min.js\"></script>\n");
      out.write("    <script src=\"../Assets/Template/Main/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"../Assets/Template/Main/js/jquery.easing.1.3.js\"></script>\n");
      out.write("    <script src=\"../Assets/Template/Main/js/jquery.waypoints.min.js\"></script>\n");
      out.write("    <script src=\"../Assets/Template/Main/js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"../Assets/Template/Main/js/jquery.animateNumber.min.js\"></script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n");
      out.write("    <script src=\"../Assets/Template/Main/js/google-map.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"../Assets/Template/Main/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>");
      out.write("\n");
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
