package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class WorkRating_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/User/SessionValidator.jsp");
    _jspx_dependants.add("/User/Head.jsp");
    _jspx_dependants.add("/User/Foot.jsp");
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Review & Rating System in PHP & Mysql using Ajax</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\" integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\" crossorigin=\"anonymous\"/>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        ");
//@include file="Head.jsp" 

        response.setHeader("Cache-Control", "no-cache, no-store");
        if(session.getAttribute("userid") == null)
        {
            response.sendRedirect("../");
        }
    
      out.write("\n");
      out.write("    </head>\n");
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
      out.write("  </head>\n");
      out.write("  <body data-spy=\"scroll\" data-target=\"#ftco-navbar\" data-offset=\"200\">\n");
      out.write("    \n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"Homepage.jsp\" style=\"color:black\">LUCID DREAMS</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"oi oi-menu\"></span> Menu\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <ul class=\"nav navbar-nav menu_nav ml-auto\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"Homepage.jsp\" style=\"color:black\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\" style=\"color:black\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\"  style=\"color:black\">Profile</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\" ><a class=\"nav-link\" href=\"MyProfile.jsp\" style=\"color:black\">My Profile</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"EditProfile.jsp\"  style=\"color:black\">Edit Profile</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("<!--\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\"  style=\"color:black\">Shop</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"mycart.jsp\"  style=\"color:black\">Cart</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"Wishlist.jsp\" style=\"color:black\">Wishlist</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>-->\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\" style=\"color:black\">Search</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("                                                                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"SearchLand.jsp\" style=\"color:black\">Landlord</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"SearchShop.jsp\" style=\"color:black\">Shop</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"SearchWorker.jsp\" style=\"color:black\">Worker</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                                                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"ViewWorkBookings.jsp\" style=\"color:black\">Bookings</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"mycart.jsp\" style=\"color:black\">Cart</a></li>\n");
      out.write("                                                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"Wishlist.jsp\" style=\"color:black\">Wishlist</a></li>\n");
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
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"mt-5 mb-5\"></h1>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-header\">Rating Box</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-4 text-center\">\n");
      out.write("                            <h1 class=\"text-warning mt-4 mb-4\">\n");
      out.write("                                <b><span id=\"average_rating\">0.0</span> / 5</b>\n");
      out.write("                            </h1>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <i class=\"fas fa-star star-light mr-1 main_star\"></i>\n");
      out.write("                                <i class=\"fas fa-star star-light mr-1 main_star\"></i>\n");
      out.write("                                <i class=\"fas fa-star star-light mr-1 main_star\"></i>\n");
      out.write("                                <i class=\"fas fa-star star-light mr-1 main_star\"></i>\n");
      out.write("                                <i class=\"fas fa-star star-light mr-1 main_star\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <h3><span id=\"total_review\">0</span> Review</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <p>\n");
      out.write("                            <div class=\"progress-label-left\"><b>5</b> <i class=\"fas fa-star text-warning\"></i></div>\n");
      out.write("\n");
      out.write("                            <div class=\"progress-label-right\">(<span id=\"total_five_star_review\">0</span>)</div>\n");
      out.write("                            <div class=\"progress\">\n");
      out.write("                                <div class=\"progress-bar bg-warning\" role=\"progressbar\" aria-valuenow=\"0\" aria-valuemin=\"0\" aria-valuemax=\"100\" id=\"five_star_progress\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                            <div class=\"progress-label-left\"><b>4</b> <i class=\"fas fa-star text-warning\"></i></div>\n");
      out.write("\n");
      out.write("                            <div class=\"progress-label-right\">(<span id=\"total_four_star_review\">0</span>)</div>\n");
      out.write("                            <div class=\"progress\">\n");
      out.write("                                <div class=\"progress-bar bg-warning\" role=\"progressbar\" aria-valuenow=\"0\" aria-valuemin=\"0\" aria-valuemax=\"100\" id=\"four_star_progress\"></div>\n");
      out.write("                            </div>               \n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                            <div class=\"progress-label-left\"><b>3</b> <i class=\"fas fa-star text-warning\"></i></div>\n");
      out.write("\n");
      out.write("                            <div class=\"progress-label-right\">(<span id=\"total_three_star_review\">0</span>)</div>\n");
      out.write("                            <div class=\"progress\">\n");
      out.write("                                <div class=\"progress-bar bg-warning\" role=\"progressbar\" aria-valuenow=\"0\" aria-valuemin=\"0\" aria-valuemax=\"100\" id=\"three_star_progress\"></div>\n");
      out.write("                            </div>               \n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                            <div class=\"progress-label-left\"><b>2</b> <i class=\"fas fa-star text-warning\"></i></div>\n");
      out.write("\n");
      out.write("                            <div class=\"progress-label-right\">(<span id=\"total_two_star_review\">0</span>)</div>\n");
      out.write("                            <div class=\"progress\">\n");
      out.write("                                <div class=\"progress-bar bg-warning\" role=\"progressbar\" aria-valuenow=\"0\" aria-valuemin=\"0\" aria-valuemax=\"100\" id=\"two_star_progress\"></div>\n");
      out.write("                            </div>               \n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                            <div class=\"progress-label-left\"><b>1</b> <i class=\"fas fa-star text-warning\"></i></div>\n");
      out.write("\n");
      out.write("                            <div class=\"progress-label-right\">(<span id=\"total_one_star_review\">0</span>)</div>\n");
      out.write("                            <div class=\"progress\">\n");
      out.write("                                <div class=\"progress-bar bg-warning\" role=\"progressbar\" aria-valuenow=\"0\" aria-valuemin=\"0\" aria-valuemax=\"100\" id=\"one_star_progress\"></div>\n");
      out.write("                            </div>               \n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-4 text-center\">\n");
      out.write("                            <h3 class=\"mt-4 mb-3\">Write Review Here</h3>\n");
      out.write("                            <button type=\"button\" name=\"add_review\" id=\"add_review\" class=\"btn btn-primary\">Review</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mt-5\" id=\"review_content\"></div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <br>  <br>  <br>  <br>  <br>  <br>  <br>\n");
      out.write("    ");
      out.write("<!--<section class=\"ftco-section bg-white ftco-slant ftco-slant-dark\" id=\"section-contact\">\n");
      out.write(" \n");
      out.write("    </section>-->\n");
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
      out.write("\n");
      out.write("<div id=\"review_modal\" class=\"modal\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\">Submit Review</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <h4 class=\"text-center mt-2 mb-4\">\n");
      out.write("                    <i class=\"fas fa-star star-light submit_star mr-1\" id=\"submit_star_1\" data-rating=\"1\"></i>\n");
      out.write("                    <i class=\"fas fa-star star-light submit_star mr-1\" id=\"submit_star_2\" data-rating=\"2\"></i>\n");
      out.write("                    <i class=\"fas fa-star star-light submit_star mr-1\" id=\"submit_star_3\" data-rating=\"3\"></i>\n");
      out.write("                    <i class=\"fas fa-star star-light submit_star mr-1\" id=\"submit_star_4\" data-rating=\"4\"></i>\n");
      out.write("                    <i class=\"fas fa-star star-light submit_star mr-1\" id=\"submit_star_5\" data-rating=\"5\"></i>\n");
      out.write("                </h4>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"user_name\" id=\"user_name\" class=\"form-control\" placeholder=\"Enter Your Name\" />\n");
      out.write("                    <input type=\"hidden\" name=\"txt_lid\" id=\"txt_lid\" value=\"");
      out.print(request.getParameter("lid"));
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <textarea name=\"user_review\" id=\"user_review\" class=\"form-control\" placeholder=\"Type Review Here\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group text-center mt-4\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" id=\"save_review\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .progress-label-left\n");
      out.write("    {\n");
      out.write("        float: left;\n");
      out.write("        margin-right: 0.5em;\n");
      out.write("        line-height: 1em;\n");
      out.write("    }\n");
      out.write("    .progress-label-right\n");
      out.write("    {\n");
      out.write("        float: right;\n");
      out.write("        margin-left: 0.3em;\n");
      out.write("        line-height: 1em;\n");
      out.write("    }\n");
      out.write("    .star-light\n");
      out.write("    {\n");
      out.write("        color:#e9ecef;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    $(document).ready(function() {\n");
      out.write("\n");
      out.write("        var rating_data = 0;\n");
      out.write("\n");
      out.write("        $('#add_review').click(function() {\n");
      out.write("\n");
      out.write("            $('#review_modal').modal('show');\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(document).on('mouseenter', '.submit_star', function() {\n");
      out.write("\n");
      out.write("            var rating = $(this).data('rating');\n");
      out.write("\n");
      out.write("            reset_background();\n");
      out.write("\n");
      out.write("            for (var count = 1; count <= rating; count++)\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                $('#submit_star_' + count).addClass('text-warning');\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        function reset_background()\n");
      out.write("        {\n");
      out.write("            for (var count = 1; count <= 5; count++)\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                $('#submit_star_' + count).addClass('star-light');\n");
      out.write("\n");
      out.write("                $('#submit_star_' + count).removeClass('text-warning');\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $(document).on('mouseleave', '.submit_star', function() {\n");
      out.write("\n");
      out.write("            reset_background();\n");
      out.write("\n");
      out.write("            for (var count = 1; count <= rating_data; count++)\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                $('#submit_star_' + count).removeClass('star-light');\n");
      out.write("\n");
      out.write("                $('#submit_star_' + count).addClass('text-warning');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(document).on('click', '.submit_star', function() {\n");
      out.write("\n");
      out.write("            rating_data = $(this).data('rating');\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('#save_review').click(function() {\n");
      out.write("\n");
      out.write("            var user_name = $('#user_name').val();\n");
      out.write("\n");
      out.write("            var user_review = $('#user_review').val();\n");
      out.write("\n");
      out.write("            var labour_id = $('#txt_lid').val();\n");
      out.write("\n");
      out.write("            if (user_name == '' || user_review == '')\n");
      out.write("            {\n");
      out.write("                alert(\"Please Fill Both Field\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                $.ajax({\n");
      out.write("                    url: \"../Assets/Ajaxpages/AjaxRating.jsp\",\n");
      out.write("                    method: \"POST\",\n");
      out.write("                    data: {rating_data: rating_data, user_name: user_name, user_review: user_review, labour_id: labour_id},\n");
      out.write("                    success: function(data)\n");
      out.write("                    {\n");
      out.write("                        $('#review_modal').modal('hide');\n");
      out.write("\n");
      out.write("                        load_rating_data();\n");
      out.write("                        //$(\"#review_content\").html(data);\n");
      out.write("                        alert(data);\n");
      out.write("                    }\n");
      out.write("                })\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        load_rating_data();\n");
      out.write("\n");
      out.write("        function load_rating_data()\n");
      out.write("        {\n");
      out.write("            var labour_id = $('#txt_lid').val();\n");
      out.write("\n");
      out.write("            $.ajax({\n");
      out.write("                url: \"../Assets/Ajaxpages/AjaxRating.jsp\",\n");
      out.write("                method: \"POST\",\n");
      out.write("                data: {action: 'load_data', lid: labour_id},\n");
      out.write("                dataType: \"JSON\",\n");
      out.write("                success: function(data)\n");
      out.write("                {\n");
      out.write("                    console.log(data);\n");
      out.write("\n");
      out.write("                    $(\"#review_content\").html(data);\n");
      out.write("\n");
      out.write("\n");
      out.write("                    $('#average_rating').text(data.average_rating);\n");
      out.write("                    $('#total_review').text(data.total_review);\n");
      out.write("\n");
      out.write("                    var count_star = 0;\n");
      out.write("\n");
      out.write("                    $('.main_star').each(function() {\n");
      out.write("                        count_star++;\n");
      out.write("                        if (Math.ceil(data.average_rating) >= count_star)\n");
      out.write("                        {\n");
      out.write("                            $(this).addClass('text-warning');\n");
      out.write("                            $(this).addClass('star-light');\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    $('#total_five_star_review').text(data.five_star_review);\n");
      out.write("\n");
      out.write("                    $('#total_four_star_review').text(data.four_star_review);\n");
      out.write("\n");
      out.write("                    $('#total_three_star_review').text(data.three_star_review);\n");
      out.write("\n");
      out.write("                    $('#total_two_star_review').text(data.two_star_review);\n");
      out.write("\n");
      out.write("                    $('#total_one_star_review').text(data.one_star_review);\n");
      out.write("\n");
      out.write("                    $('#five_star_progress').css('width', (data.five_star_review / data.total_review) * 100 + '%');\n");
      out.write("\n");
      out.write("                    $('#four_star_progress').css('width', (data.four_star_review / data.total_review) * 100 + '%');\n");
      out.write("\n");
      out.write("                    $('#three_star_progress').css('width', (data.three_star_review / data.total_review) * 100 + '%');\n");
      out.write("\n");
      out.write("                    $('#two_star_progress').css('width', (data.two_star_review / data.total_review) * 100 + '%');\n");
      out.write("\n");
      out.write("                    $('#one_star_progress').css('width', (data.one_star_review / data.total_review) * 100 + '%');\n");
      out.write("\n");
      out.write("                    if (data.review_data.length > 0)\n");
      out.write("                    {\n");
      out.write("                        var html = '';\n");
      out.write("\n");
      out.write("                        for (var count = 0; count < data.review_data.length; count++)\n");
      out.write("                        {\n");
      out.write("                            html += '<div class=\"row mb-3\">';\n");
      out.write("\n");
      out.write("                            html += '<div class=\"col-sm-1\"><div class=\"rounded-circle bg-danger text-white pt-2 pb-2\"><h3 class=\"text-center\">' + data.review_data[count].user_name.charAt(0) + '</h3></div></div>';\n");
      out.write("\n");
      out.write("                            html += '<div class=\"col-sm-11\">';\n");
      out.write("\n");
      out.write("                            html += '<div class=\"card\">';\n");
      out.write("\n");
      out.write("                            html += '<div class=\"card-header\"><b>' + data.review_data[count].user_name + '</b></div>';\n");
      out.write("\n");
      out.write("                            html += '<div class=\"card-body\">';\n");
      out.write("\n");
      out.write("                            for (var star = 1; star <= 5; star++)\n");
      out.write("                            {\n");
      out.write("                                var class_name = '';\n");
      out.write("\n");
      out.write("                                if (data.review_data[count].rating >= star)\n");
      out.write("                                {\n");
      out.write("                                    class_name = 'text-warning';\n");
      out.write("                                }\n");
      out.write("                                else\n");
      out.write("                                {\n");
      out.write("                                    class_name = 'star-light';\n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                                html += '<i class=\"fas fa-star ' + class_name + ' mr-1\"></i>';\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            html += '<br />';\n");
      out.write("\n");
      out.write("                            html += data.review_data[count].user_review;\n");
      out.write("\n");
      out.write("                            html += '</div>';\n");
      out.write("\n");
      out.write("                            html += '<div class=\"card-footer text-right\">On ' + data.review_data[count].datetime + '</div>';\n");
      out.write("\n");
      out.write("                            html += '</div>';\n");
      out.write("\n");
      out.write("                            html += '</div>';\n");
      out.write("\n");
      out.write("                            html += '</div>';\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        $('#review_content').html(html);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            })\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("  ");
//@include file="Foot.jsp" 
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
