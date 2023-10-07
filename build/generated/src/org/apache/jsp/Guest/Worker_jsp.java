package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Worker_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Guest/Head.jsp");
    _jspx_dependants.add("/Guest/Foot.jsp");
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

      out.write(' ');
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <meta charset=\"utf-8\">\n");
      out.write("        <title>Lucid Dreams</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Construction Company Website Template\" name=\"keywords\">\n");
      out.write("        <meta content=\"Construction Company Website Template\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"../Template/Main/img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- CSS Libraries -->\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/flaticon/font/flaticon.css\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"../Template/Main/lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/slick/slick.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/slick/slick-theme.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Template Stylesheet -->\n");
      out.write("        <link href=\"../Template/Main/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"../Assets/JQ/jQuery.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function getPlace(did)\n");
      out.write("            {\n");
      out.write("                    //alert(did);\n");
      out.write("                    $.ajax({\n");
      out.write("                    url: \"../Assets/Ajaxpages/Ajaxplace.jsp?did=\"+did,\n");
      out.write("                      success: function(html){\n");
      out.write("                            $(\"#place\").html(html);\n");
      out.write("                      }\n");
      out.write("                    });\n");
      out.write("            }\n");
      out.write("            function chkpwd(txtrp, txtp)\n");
      out.write("{\n");
      out.write("\tif((txtrp.value)!=(txtp.value))\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"pass\").innerHTML = \"<span style='color: red;'>Passwords Mismatch</span>\";\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function checknum(elem)\n");
      out.write("{\n");
      out.write("\tvar numericExpression = /^[0-9]{8,10}$/;\n");
      out.write("\tif(elem.value.match(numericExpression))\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"contact\").innerHTML = \"\";\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"contact\").innerHTML = \"<span style='color: red;'>Numbers Only Allowed</span>\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function emailval(elem)\n");
      out.write("{\n");
      out.write("\tvar emailexp=/^([a-zA-Z0-9.\\_\\-])+\\@([a-zA-Z0-9.\\_\\-])+\\.([a-zA-Z]{2,4})$/;\n");
      out.write("\tif(elem.value.match(emailexp))\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"content\").innerHTML = \"\";\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\t\n");
      out.write("\t\tdocument.getElementById(\"content\").innerHTML =\"<span style='color: red;'>Check Email Address Entered</span>\";;\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function nameval(elem)\n");
      out.write("{\n");
      out.write("\tvar emailexp=/^([A-Za-z ]*)$/;\n");
      out.write("\tif(elem.value.match(emailexp))\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"name\").innerHTML = \"\";\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\t\n");
      out.write("\t\tdocument.getElementById(\"name\").innerHTML = \"<span style='color: red;'>Alphabets Are Allowed</span>\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("        function checkEmail(did)\n");
      out.write("            {\n");
      out.write("                    //alert(did);\n");
      out.write("                    $.ajax({\n");
      out.write("                    url: \"../Assets/Ajaxpages/AjaxEmail.jsp?did=\"+did,\n");
      out.write("                      success: function(html){\n");
      out.write("                            $(\"#content\").html(html);\n");
      out.write("                      }\n");
      out.write("                    });\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"Login.jsp\" style=\"color:black\">Login or SignUp</a></li>\n");
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
      out.write("        <br><br><br><br><br>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("                  <div class=\"contact wow fadeInUp\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"section-header text-center\">\n");
      out.write("                        <p>Registration</p>\n");
      out.write("                        <h2>Worker</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"contact-info\">\n");
      out.write("\n");
      out.write("                                <img src=\"../Assets/Template/Main/images/worker.png\" style=\"margin-left:80px;margin-top:250px\" width=\"300\" height=\"250\"/>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"contact-form\">\n");
      out.write("            <form name=\"frmworker\" method=\"post\" action=\"../Assets/Actionpages/WorkerUploadAction.jsp\" enctype=\"multipart/form-data\">\n");
      out.write("            <table border=\"1\" align=\"center\" cellpadding=\"10\" style=\"border-collapse: collapse\">\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                \n");
      out.write("           <input type=\"text\" name=\"txtname\" class=\"form-control\" placeholder=\"Enter Your Name\" value=\"\" required onchange=\"nameval(this)\">\n");
      out.write("                    <div id=\"name\"></div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("             <div class=\"control-group\">\n");
      out.write("                 \n");
      out.write("                    <input type=\"radio\" name='gender' value='Male'>Male\n");
      out.write("                        <input type=\"radio\" name='gender' value='Female'>Female\n");
      out.write("                        <input type=\"radio\" name='gender' value='Other'>Other\n");
      out.write("             </div><br>\n");
      out.write("                \n");
      out.write("                  <div class=\"control-group\">\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                        <select class=\"form-control\" style=\"background-color:transparent\" name=\"workertype\" required=\"\">\n");
      out.write("                            <option value=\"\" selected=\"\" style=\"text-align: center\">--Select Work Type--</option>\n");
      out.write("                            ");

            String s="select * from tbl_workertype";
            ResultSet r=con.selectCommand(s);
           
            while(r.next())
            {
               
            
            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(r.getString("workertype_id"));
      out.write('"');
      out.write('>');
      out.print(r.getString("workertype_name") );
      out.write("</option>\n");
      out.write("                            ");

                    }
            
      out.write("\n");
      out.write("                        </select>    \n");
      out.write("                  </div> \n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"control-group\">\n");
      out.write("                            <input type=\"text\" name=\"txtcontact\" class=\"form-control\" placeholder=\"Enter Valid Phone Number\" value=\"\" pattern=\"[0-9]{10}\" required onchange=\"checknum(this)\">\n");
      out.write("                   <div id=\"contact\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("               <div class=\"control-group\">\n");
      out.write("                    <input type=\"email\" class=\"form-control\" placeholder=\"Your Email\" name=\"email\" value=\"\" required onchange=\"emailval(this),checkEmail(this.value)\">\n");
      out.write("                    <div id=\"content\"></div>\n");
      out.write("               </div><br>\n");
      out.write("                     <div class=\"control-group\">\n");
      out.write("                    <input type=\"date\" name=\"dob\" class=\"form-control\" value=\"\" required>\n");
      out.write("                     </div>\n");
      out.write("               <br>\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                  \n");
      out.write("                    <select name=\"district\" required=\"\" class=\"form-control\" style=\"background-color:transparent\" onchange=\"getPlace(this.value)\">\n");
      out.write("                        <option value=\"\" selected=\"\" style=\"text-align: center\">--Select District--</option>\n");
      out.write("                            ");

                             String st="select * from tbl_district";
                             ResultSet rs=con.selectCommand(st);
           
                                while(rs.next())
                                {
                         
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(rs.getString("district_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("district_name") );
      out.write("</option>\n");
      out.write("                            ");

                             }
                            
      out.write("\n");
      out.write("                        </select>    \n");
      out.write("                </div><br>\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <select name=\"place\" id=\"place\" required=\"\" class=\"form-control\" style=\"background-color:transparent\">\n");
      out.write("                    <option value=\"\" selected=\"\" style=\"text-align: center\">--Select Place--</option>\n");
      out.write("                          \n");
      out.write("                        </select>    \n");
      out.write("            </div><br>\n");
      out.write("         <div class=\"control-group\">\n");
      out.write("             <textarea name=\"txtaddress\" required=\"\" class=\"form-control\" placeholder=\"Address\" required data-validation-required-message=\"Please enter your Address\"></textarea>\n");
      out.write("                   \n");
      out.write("         </div><br>\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label id=\"txt_label\" style=\"color: white\">Select Your Photo</label>\n");
      out.write("                <input type=\"file\" name=\"image\" class=\"form-control\"  required></div><br>\n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                  <label id=\"txt_label\" style=\"color: white\">Select Your Proof</label>\n");
      out.write("                  <input type=\"file\" name=\"proof\"  required=\"\"  class=\"form-control\">\n");
      out.write("              </div><br>\n");
      out.write("                \n");
      out.write("               <div class=\"control-group\">\n");
      out.write("                   <input type=\"password\" placeholder=\"Your Password\" class=\"form-control\" name=\"txtpwd\" value=\"\" required>\n");
      out.write("               </div><br>\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <input type=\"password\" name=\"txtpwd1\" class=\"form-control\" placeholder=\"Re ENter Password\" value=\"\" required onchange=\"chkpwd(this,txtpwd)\">\n");
      out.write("               <div id=\"pass\"></div></div>\n");
      out.write("               <br>\n");
      out.write("               <div align=\"center\">\n");
      out.write("                   <input type=\"submit\" class=\"btn\" name=\"btnsave\" value=\"SAVE\">\n");
      out.write("                   <input type=\"reset\" class=\"btn\" name=\"btncancel\" value=\"CANCEL\">\n");
      out.write("               </div>\n");
      out.write("            </table>\n");
      out.write("                         </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("       <br><br><br><br><br>\n");
      out.write("    ");
      out.write("<!--<section class=\"ftco-section bg-white ftco-slant ftco-slant-dark\" id=\"section-contact\">-->\n");
      out.write("\n");
      out.write("    <!--</section>-->\n");
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
