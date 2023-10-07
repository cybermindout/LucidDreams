package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class shop2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
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
      out.write("        <script src=\"../Assets/JQ/jQuery.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function getLocation(did)\n");
      out.write("            {\n");
      out.write("                    //alert(did);\n");
      out.write("                    $.ajax({\n");
      out.write("                    url: \"../Assets/Ajaxpages/Ajaxlocation.jsp?did=\"+did,\n");
      out.write("                      success: function(html){\n");
      out.write("                            $(\"#location\").html(html);\n");
      out.write("                      }\n");
      out.write("                    });\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("  \t<title>Sign Up 10</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Assets/Template/Registration/css/style.css\">\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("        <form name=\"frmnewuser\" method=\"post\" action=\"../Assets/Actionpages/UserUploadAction.jsp\" enctype=\"multipart/form-data\">\n");
      out.write("\t<section class=\"ftco-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row justify-content-center\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row justify-content-center\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t<div class=\"wrap d-md-flex\">\n");
      out.write("\t\t\t\t\t\t<div class=\"text-wrap p-4 p-lg-5 d-flex img d-flex align-items-end\" style=\"background-image: url(../Assets/Template/Registration/images/bg.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text w-100\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2 class=\"mb-4\">Welcome to signup form</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t<div class=\"login-wrap p-4 p-md-5\">\n");
      out.write("\t      \t\t\t<h3 class=\"mb-3\">Create an account</h3>\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" class=\"signup-form\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t      \t\t\t<label class=\"label\" for=\"txtname\">Full Name</label>\n");
      out.write("\t\t\t\t\t      \t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Full Name\">\n");
      out.write("\t\t\t\t\t      \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t      \t\t\t<label class=\"label\" for=\"email\" required onkeyup=\"emailval(this), checkEmail(this.value)\"> Email Address</label>\n");
      out.write("\t\t\t\t\t      \t\t\t<input type=\"email\" class=\"form-control\" placeholder=\"example@email.com\">\n");
      out.write("\t\t\t\t\t      \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t      \t\t\t<label class=\"label\" for=\"txtcontact\">Phone no.</label>\n");
      out.write("\t\t\t\t\t      \t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"+91\">\n");
      out.write("\t\t\t\t\t      \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                        \n");
      out.write("                                                                 \n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("                                                                            <div class=\"form-group d-flex align-items-center\">\n");
      out.write("                                                                                <label id=\"txt_label\">District</label>\n");
      out.write("                                     <select name=\"district\"class=\"form-control\" required onchange=\"getPlace(this.value)\">\n");
      out.write("                                        <option value=\"\" selected=\"\" style=\"text-align: center\">--Select District--</option>\n");
      out.write("                                        ");

                                            String s = "select * from tbl_district";
                                            ResultSet r = con.selectCommand(s);

                                            while (r.next()) {

                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(r.getString("district_id"));
      out.write('"');
      out.write('>');
      out.print(r.getString("district_name"));
      out.write("</option>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                     </select> \n");
      out.write("                                                                            </div>\n");
      out.write("                                     <div class=\"col-md-12\">\n");
      out.write("                                     <div class=\"form-group d-flex align-items-center\">\n");
      out.write("                                         <label id=\"txt_label\">Place</label>\n");
      out.write("                                          <select name=\"place\" id=\"place\" class=\"form-control\" style=\"background-color: transparent\"  required onchange=\"getLocation(this.value)\">\n");
      out.write("                      <option value=\"\" selected=\"\" style=\"text-align: center\">--Select Place--</option>\n");
      out.write("\n");
      out.write("                        </select>  \n");
      out.write("                                     </div>\n");
      out.write("                                     </div>\n");
      out.write("                                     <div class=\"form-group d-flex align-items-center\">\n");
      out.write("                                         <label id=\"txt_label\">Location</label>\n");
      out.write("                                         <select name=\"place\" id=\"location\" required=\"\" class=\"form-control\" style=\"background-color: transparent\">\n");
      out.write("                     <option value=\"\" selected=\"\" style=\"text-align: center\">--Select Location--</option>\n");
      out.write("\n");
      out.write("                        </select>    \n");
      out.write("                                     </div>\n");
      out.write("                                     <div class=\"col-md-12\">\n");
      out.write("                                     <div class=\"form-group d-flex align-items-center\">\n");
      out.write("                                         <label id=\"txt_label\">Photo</label>\n");
      out.write("                                         <input type=\"file\" name=\"image\" class=\"form-control\"  required>\n");
      out.write("                                     </div>\n");
      out.write("                                     </div>\n");
      out.write("                                                                          <div class=\"col-md-12\">\n");
      out.write("                                                                          <div class=\"form-group d-flex align-items-center\">\n");
      out.write("                                                                                    \n");
      out.write("                                                                <label class=\"label\" for=\"txtpwd\">Password</label>\n");
      out.write("                                                                <input type=\"password\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                                                                        </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t      \t\t\t<label class=\"label\" for=\"website\">Website</label>\n");
      out.write("\t\t\t\t\t      \t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Website\">\n");
      out.write("\t\t\t\t\t      \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12 my-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t            \t<button type=\"submit\" class=\"btn btn-secondary submit p-3\">Create an account</button>\n");
      out.write("\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t          </form>\n");
      out.write("\t\t          <div class=\"social-wrap\">\n");
      out.write("\t\t          \t<p class=\"or\">\n");
      out.write("\t\t          \t\t<span>or</span>\n");
      out.write("\t\t          \t\n");
      out.write("\t          \t</div>\n");
      out.write("\t\t          <div class=\"w-100 text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"mt-4\">I'm already a member! <a href=\"Login.jsp\">Sign In</a></p>\n");
      out.write("\t\t          </div>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t      </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("            </form>\n");
      out.write("\t<script src=\"../Assets/Template/Registration/js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Template/Registration/js/popper.js\"></script>\n");
      out.write("  <script src=\"../Assets/Template/Registration/js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Template/Registration/js/main.js\"></script>\n");
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
