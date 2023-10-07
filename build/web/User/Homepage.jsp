<%-- 
    Document   : Homepage
    Created on : 26 Jan, 2023, 10:37:08 AM
    Author     : cyber
--%>
<%@page import="java.sql.ResultSet" %>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="SessionValidator.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User HomePage</title>
    </head>
    <%@include file="Head.jsp" %>
    <body>
        <section class="ftco-cover ftco-slant" style="background-image: url(../Assets/Template/Main/images/home.jpg);" id="section-home">
            <div class="container">
                <div class="row align-items-center justify-content-center text-center ftco-vh-100">
                    <div class="col-md-10">
                        <h1 class="ftco-heading ftco-animate">Let's Build Your Dream Home From Here</h1>
                        <h2 class="h5 ftco-subheading mb-5 ftco-animate">We Will Help You to Build Your Dream<a href="#"></a></h2>    
                        <!--<p><a href="Login.jsp" target="_blank" class="btn btn-primary ftco-animate">Get Started</a></p>-->
                    </div>
                </div>
            </div>
        </section>
        <section class="ftco-section bg-light  ftco-slant ftco-slant-white" id="section-features">
            <div class="container">

                <div class="row">
                    <div class="col-md-12 text-center mb-5 ftco-animate">
                        <h2 class="text-uppercase ftco-uppercase">Our Builder's</h2>
                        <div class="row justify-content-center">
                            <div class="col-md-7">
                                <p class="lead">Our working patners</p>
                            </div>
                        </div>
                    </div>
                    <%
                        int i=1;
                        String selQry = "select * from tbl_worker w inner join tbl_workertype t on w.workertype_id=t.workertype_id where worker_vstatus='1' order by rand()";
//                        out.println(selQry);
                        ResultSet rw = con.selectCommand(selQry);
                        
                       do
                        {
                          rw.next();
                          i++;
                           
                        
                    %>
                    <div class="col-lg-4 col-md-6">

                        <div class="media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate">

                            <div class="ftco-icon mb-3"><img height="100" width="100"src="../Assets/Worker/<%=rw.getString("worker_photo")%>"></div>


                            <div class="media-body">
                                <h5 class="mt-0"><%=rw.getString("worker_name")%></h5>
                                <p class="mb-5"><%=rw.getString("worker_contact")%>
                                    <br><%=rw.getString("workertype_name")%>
                                </p>

                                <p class="mb-0"><a href="SearchWorker.jsp" class="btn btn-primary btn-sm">Book now</a></p>

                            </div>

                        </div>

                    </div>
                    <%
                        }while(i<6);
                    %>

                    <div class="col-lg-4 col-md-6">
                        <div class="media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate">
                            <div class="ftco-icon mb-3"><span class="oi oi-phone display-4 text-muted"></span></div>
                            <div class="media-body">
                                <h5 class="mt-0">Find Workers</h5>
                                <p class="mb-5">Click here to find more workers near to your location                                                                      </p>
                                <p class="mb-0"><a href="SearchWorker.jsp" class="btn btn-primary btn-sm">Find More</a></p>
                            </div>
                        </div>
                    </div>
                </div>          
            </div>
        </div>
    </section>

    <!--section inserted here-->


    <section class="ftco-section ftco-slant ftco-slant-light">
        <div class="container">

            <div class="row">
                <div class="col-md-12 text-center mb-5 ftco-animate">
                    <h2 class="text-uppercase ftco-uppercase">Plot's</h2>
                    <div class="row justify-content-center">
                        <div class="col-md-7">
                            <p class="lead">Own your plots build your dreams</p>
                        </div>
                    </div>
                </div>
                <%
                    String selQry1 = "select * from tbl_land la inner join tbl_landlord l on la.landlord_id=l.landlord_id order by rand()";
                    ResultSet rs = con.selectCommand(selQry1);
                   do
                        {
                          rs.next();
                          i++;
                           
                %>
                <div class="col-lg-4 col-md-6">

                    <div class="media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate">

                        <div class="ftco-icon mb-3"><img height="100" width="100"src="../Assets/Land/<%=rs.getString("land_image")%>"></div>


                        <div class="media-body">
                            <h5 class="mt-0"><%=rs.getString("landlord_name")%></h5>
                            <p class="mb-5"><%=rs.getString("landlord_contact")%>
                                <br><%=rs.getString("land_details")%>
                            </p>

                            <p class="mb-0"><a href="SearchLand.jsp" class="btn btn-primary btn-sm">Book now</a></p>

                        </div>

                    </div>

                </div>
                    <%
                        }while(i<6);
                    %>

                <div class="col-lg-4 col-md-6">
                    <div class="media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate">
                        <div class="ftco-icon mb-3"><span class="oi oi-phone display-4 text-muted"></span></div>
                        <div class="media-body">
                            <h5 class="mt-0">Find Plots</h5>
                            <p class="mb-5">Click here to find more plots near to your location                                                                      </p>
                            <p class="mb-0"><a href="SearchLand.jsp" class="btn btn-primary btn-sm">Find More</a></p>
                        </div>
                    </div>
                </div>
            </div>   
        </div>
    </div>
</section>
<!-- END section -->
<section class="ftco-section bg-light  ftco-slant ftco-slant-white" id="section-features">
    <div class="container">

            <div class="row">
                <div class="col-md-12 text-center mb-5 ftco-animate">
                    <h2 class="text-uppercase ftco-uppercase">Works</h2>
                    <div class="row justify-content-center">
                        <div class="col-md-7">
                            <p class="lead">The the works that done through our websites</p>
                        </div>
                    </div>
                </div>
                <%
                  String selQry2 = "select * from tbl_workgallery w inner join tbl_work wk on w.work_id=wk.work_id inner join tbl_worker wr on wk.worker_id=wr.worker_id order by rand()";
                  ResultSet rs2 = con.selectCommand(selQry2); 
                  while (rs2.next())
                         {
                        
                           
                %>
                <div class="col-lg-4 col-md-6">

                    <div class="media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate">

                        <div class="ftco-icon mb-3"><img width="150" height="150" src="../Assets/WorkGallery/<%=rs2.getString("wgallery_image")%>"></div>


                        <div class="media-body">
                            <h5 class="mt-0"><%=rs2.getString("work_caption")%></h5>
                            <p class="mb-5">Worker :<%=rs2.getString("worker_name")%>
                                <br>Place :<%=rs2.getString("work_location")%>
                            </p>

                            <p class="mb-0"><a href="ViewWorkGallery.jsp" class="btn btn-primary btn-sm">Book now</a></p>

                        </div>

                    </div>

                </div>
                    <%
                        }
                    %>

                <div class="col-lg-4 col-md-6">
                    <div class="media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate">
                        <div class="ftco-icon mb-3"><span class="oi oi-phone display-4 text-muted"></span></div>
                        <div class="media-body">
                            <h5 class="mt-0">Find Plots</h5>
                            <p class="mb-5">Click here to find more plots near to your location                                                                      </p>
                            <p class="mb-0"><a href="ViewWorkGallery.jsp" class="btn btn-primary btn-sm">Find More</a></p>
                        </div>
                    </div>
                </div>
            </div>   
        </div>
                    </section>
    <!-- About Us-->
<!--  <section class="ftco-section bg-light ftco-slant ftco-slant-white" id="section-counter">-->
       
        <div class="container">

        <div class="row mb-5">
          <div class="col-md-12 text-center ftco-animate">
            <h2 class="text-uppercase ftco-uppercase">About Us</h2>
            <div class="row justify-content-center mb-5">
              <div class="col-md-7">
                <p class="lead">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Feel free to send us an email to <a href="#">info@yourdomain.com</a></p>
              </div>
            </div>
          </div>
        </div>
        <!-- END row -->


        <div class="row no-gutters align-items-center ftco-animate">
          <div class="col-md-6 mb-md-0 mb-5">
              <img src="../Assets/Template/Main/images/bg_3.jpg" alt="Free Template by Free-Template.co" class="img-fluid">
          </div>
          <div class="col-md-6 p-md-5">
            <h3 class="h3 mb-4">Far far away, behind the word mountains</h3>
            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
            <p class="mb-5"><a href="#">Learn More</a></p>
          </div>
        </div>
        <div class="row no-gutters align-items-center ftco-animate">
          <div class="col-md-6 order-md-3 mb-md-0 mb-5">
            <img src="../Assets/Template/Main/images/bg_1.jpg" alt="Free Template by Free-Template.co" class="img-fluid">
          </div>
          <div class="col-md-6 p-md-5 order-md-1">
            <h3 class="h3 mb-4">Far from the countries Vokalia and Consonantia</h3>
            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
            <p class="mb-5"><a href="#">Learn More</a></p>
          </div>
        </div>

      </div>
     </section>
        <!-- END row -->

        </div>
    </div>

            
<%@include file="Foot.jsp" %>
            </body>

            


            </html>
