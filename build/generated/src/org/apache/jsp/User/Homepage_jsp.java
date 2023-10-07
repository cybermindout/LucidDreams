package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
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
      out.write("  \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User HomePage</title>\n");
      out.write("    </head>\n");
      out.write("    ");
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
      out.write("                                                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../logout.jsp\" style=\"color:black\">Logout</a></li>\n");
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
      out.write("    <body>\n");
      out.write("        <section class=\"ftco-cover ftco-slant\" style=\"background-image: url(../Assets/Template/Main/images/home.jpg);\" id=\"section-home\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row align-items-center justify-content-center text-center ftco-vh-100\">\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <h1 class=\"ftco-heading ftco-animate\">Let's Build Your Dream Home From Here</h1>\n");
      out.write("                        <h2 class=\"h5 ftco-subheading mb-5 ftco-animate\">We Will Help You to Build Your Dream<a href=\"#\"></a></h2>    \n");
      out.write("                        <!--<p><a href=\"Login.jsp\" target=\"_blank\" class=\"btn btn-primary ftco-animate\">Get Started</a></p>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"ftco-section bg-light  ftco-slant ftco-slant-white\" id=\"section-features\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 text-center mb-5 ftco-animate\">\n");
      out.write("                        <h2 class=\"text-uppercase ftco-uppercase\">Our Builder's</h2>\n");
      out.write("                        <div class=\"row justify-content-center\">\n");
      out.write("                            <div class=\"col-md-7\">\n");
      out.write("                                <p class=\"lead\">Our working patners</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        int i=1;
                        String selQry = "select * from tbl_worker w inner join tbl_workertype t on w.workertype_id=t.workertype_id where worker_vstatus='1' order by rand()";
//                        out.println(selQry);
                        ResultSet rw = con.selectCommand(selQry);
                        
                       do
                        {
                          rw.next();
                          i++;
                           
                        
                    
      out.write("\n");
      out.write("                    <div class=\"col-lg-4 col-md-6\">\n");
      out.write("\n");
      out.write("                        <div class=\"media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate\">\n");
      out.write("\n");
      out.write("                            <div class=\"ftco-icon mb-3\"><img height=\"100\" width=\"100\"src=\"../Assets/Worker/");
      out.print(rw.getString("worker_photo"));
      out.write("\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h5 class=\"mt-0\">");
      out.print(rw.getString("worker_name"));
      out.write("</h5>\n");
      out.write("                                <p class=\"mb-5\">");
      out.print(rw.getString("worker_contact"));
      out.write("\n");
      out.write("                                    <br>");
      out.print(rw.getString("workertype_name"));
      out.write("\n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                                <p class=\"mb-0\"><a href=\"SearchWorker.jsp\" class=\"btn btn-primary btn-sm\">Book now</a></p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        }while(i<6);
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                        <div class=\"media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate\">\n");
      out.write("                            <div class=\"ftco-icon mb-3\"><span class=\"oi oi-phone display-4 text-muted\"></span></div>\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h5 class=\"mt-0\">Find Workers</h5>\n");
      out.write("                                <p class=\"mb-5\">Click here to find more workers near to your location                                                                      </p>\n");
      out.write("                                <p class=\"mb-0\"><a href=\"SearchWorker.jsp\" class=\"btn btn-primary btn-sm\">Find More</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>          \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!--section inserted here-->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"ftco-section ftco-slant ftco-slant-light\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 text-center mb-5 ftco-animate\">\n");
      out.write("                    <h2 class=\"text-uppercase ftco-uppercase\">Plot's</h2>\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-md-7\">\n");
      out.write("                            <p class=\"lead\">Own your plots build your dreams</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                    String selQry1 = "select * from tbl_land la inner join tbl_landlord l on la.landlord_id=l.landlord_id order by rand()";
                    ResultSet rs = con.selectCommand(selQry1);
                   do
                        {
                          rs.next();
                          i++;
                           
                
      out.write("\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("\n");
      out.write("                    <div class=\"media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate\">\n");
      out.write("\n");
      out.write("                        <div class=\"ftco-icon mb-3\"><img height=\"100\" width=\"100\"src=\"../Assets/Land/");
      out.print(rs.getString("land_image"));
      out.write("\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <h5 class=\"mt-0\">");
      out.print(rs.getString("landlord_name"));
      out.write("</h5>\n");
      out.write("                            <p class=\"mb-5\">");
      out.print(rs.getString("landlord_contact"));
      out.write("\n");
      out.write("                                <br>");
      out.print(rs.getString("land_details"));
      out.write("\n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <p class=\"mb-0\"><a href=\"SearchLand.jsp\" class=\"btn btn-primary btn-sm\">Book now</a></p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                    ");

                        }while(i<6);
                    
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <div class=\"media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate\">\n");
      out.write("                        <div class=\"ftco-icon mb-3\"><span class=\"oi oi-phone display-4 text-muted\"></span></div>\n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <h5 class=\"mt-0\">Find Plots</h5>\n");
      out.write("                            <p class=\"mb-5\">Click here to find more plots near to your location                                                                      </p>\n");
      out.write("                            <p class=\"mb-0\"><a href=\"SearchLand.jsp\" class=\"btn btn-primary btn-sm\">Find More</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<!-- END section -->\n");
      out.write("<section class=\"ftco-section bg-light  ftco-slant ftco-slant-white\" id=\"section-features\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 text-center mb-5 ftco-animate\">\n");
      out.write("                    <h2 class=\"text-uppercase ftco-uppercase\">Works</h2>\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-md-7\">\n");
      out.write("                            <p class=\"lead\">The the works that done through our websites</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                  String selQry2 = "select * from tbl_workgallery w inner join tbl_work wk on w.work_id=wk.work_id inner join tbl_worker wr on wk.worker_id=wr.worker_id order by rand()";
                  ResultSet rs2 = con.selectCommand(selQry2); 
                  while (rs2.next())
                         {
                        
                           
                
      out.write("\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("\n");
      out.write("                    <div class=\"media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate\">\n");
      out.write("\n");
      out.write("                        <div class=\"ftco-icon mb-3\"><img width=\"150\" height=\"150\" src=\"../Assets/WorkGallery/");
      out.print(rs2.getString("wgallery_image"));
      out.write("\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <h5 class=\"mt-0\">");
      out.print(rs2.getString("work_caption"));
      out.write("</h5>\n");
      out.write("                            <p class=\"mb-5\">Worker :");
      out.print(rs2.getString("worker_name"));
      out.write("\n");
      out.write("                                <br>Place :");
      out.print(rs2.getString("work_location"));
      out.write("\n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <p class=\"mb-0\"><a href=\"ViewWorkGallery.jsp\" class=\"btn btn-primary btn-sm\">Book now</a></p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <div class=\"media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate\">\n");
      out.write("                        <div class=\"ftco-icon mb-3\"><span class=\"oi oi-phone display-4 text-muted\"></span></div>\n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <h5 class=\"mt-0\">Find Plots</h5>\n");
      out.write("                            <p class=\"mb-5\">Click here to find more plots near to your location                                                                      </p>\n");
      out.write("                            <p class=\"mb-0\"><a href=\"ViewWorkGallery.jsp\" class=\"btn btn-primary btn-sm\">Find More</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("                    </section>\n");
      out.write("    <!-- About Us-->\n");
      out.write("<!--  <section class=\"ftco-section bg-light ftco-slant ftco-slant-white\" id=\"section-counter\">-->\n");
      out.write("       \n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row mb-5\">\n");
      out.write("          <div class=\"col-md-12 text-center ftco-animate\">\n");
      out.write("            <h2 class=\"text-uppercase ftco-uppercase\">About Us</h2>\n");
      out.write("            <div class=\"row justify-content-center mb-5\">\n");
      out.write("              <div class=\"col-md-7\">\n");
      out.write("                <p class=\"lead\">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Feel free to send us an email to <a href=\"#\">info@yourdomain.com</a></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- END row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row no-gutters align-items-center ftco-animate\">\n");
      out.write("          <div class=\"col-md-6 mb-md-0 mb-5\">\n");
      out.write("              <img src=\"../Assets/Template/Main/images/bg_3.jpg\" alt=\"Free Template by Free-Template.co\" class=\"img-fluid\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 p-md-5\">\n");
      out.write("            <h3 class=\"h3 mb-4\">Far far away, behind the word mountains</h3>\n");
      out.write("            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>\n");
      out.write("            <p class=\"mb-5\"><a href=\"#\">Learn More</a></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row no-gutters align-items-center ftco-animate\">\n");
      out.write("          <div class=\"col-md-6 order-md-3 mb-md-0 mb-5\">\n");
      out.write("            <img src=\"../Assets/Template/Main/images/bg_1.jpg\" alt=\"Free Template by Free-Template.co\" class=\"img-fluid\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 p-md-5 order-md-1\">\n");
      out.write("            <h3 class=\"h3 mb-4\">Far from the countries Vokalia and Consonantia</h3>\n");
      out.write("            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>\n");
      out.write("            <p class=\"mb-5\"><a href=\"#\">Learn More</a></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("     </section>\n");
      out.write("        <!-- END row -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("            \n");
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
      out.write("            </body>\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            </html>\n");
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
