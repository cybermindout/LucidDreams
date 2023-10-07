<%-- 
    Document   : Homepage
    Created on : 26 Jan, 2022, 10:37:08 AM
    Author     : asanj
--%>
<%@page import="java.sql.ResultSet" %>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <!DOCTYPE html>
<html lang="en">
  <head>
    <!-- 
    More Templates Visit ==> Free-Template.co
    -->
    <title>LUCID DREAMS</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Free Template by Free-Template.co" />
    <meta name="keywords" content="free bootstrap 4, free bootstrap 4 template, free website templates, free html5, free template, free website template, html5, css3, mobile first, responsive" />
    <meta name="author" content="Free-Template.co" />
    
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
    <link rel="stylesheet" href="../Assets/Template/Main/css/bootstrap.min.css">
    <link rel="stylesheet" href="../Assets/Template/Main/css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="../Assets/Template/Main/css/animate.css">
    
    <link rel="stylesheet" href="../Assets/Template/Main/css/owl.carousel.min.css">
    <link rel="stylesheet" href="../Assets/Template/Main/css/owl.theme.default.min.css">

    <link rel="stylesheet" href="../Assets/Template/Main/css/icomoon.css">
    <link rel="stylesheet" href="../Assets/Template/Main/css/style.css">
    <style>
        *{
            color:black;
        }
    </style>
  </head>
  <body data-spy="scroll" data-target="#ftco-navbar" data-offset="200">
    
      <nav  class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
      <div class="container">
          <a class="navbar-brand" href="Homepage.jsp" style="color:white">LUCID DREAMS</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="oi oi-menu"></span> Menu
        </button>

        <div class="collapse navbar-collapse" id="ftco-nav">
          <ul class="nav navbar-nav menu_nav ml-auto">
							<li class="nav-item active"><a class="nav-link" href="Homepage.jsp" style="color:white">Home</a></li>
							<li class="nav-item submenu dropdown" style="color:black">
							
							<li class="nav-item"><a class="nav-link" href="MyProfile.jsp" style="color:white">My Profile</a></li>
                                                        <li class="nav-item"><a class="nav-link" href="Land.jsp" style="color:white">Land</a></li>
                                                        <li class="nav-item"><a class="nav-link" href="BookingReport.jsp" style="color:white">Order</a></li>
                                                       <li class="nav-item submenu dropdown">
								<a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
								 aria-expanded="false"  style="color:white">Booking</a>
								<ul class="dropdown-menu">
                                                                    <li class="nav-item"><a class="nav-link" href="ViewUserLandBookings.jsp"  style="color:black">Bookings</a></li>
									<li class="nav-item"><a class="nav-link" href="ViewAcceptedLandBookings.jsp"  style="color:black">Accepted</a></li>
									<li class="nav-item"><a class="nav-link" href="ViewRejectedtedLandBookings.jsp" style="color:black">Rejected</a></li>
								</ul>
							</li>
                                                        <li class="nav-item"><a class="nav-link" href="ViewUserBookings.jsp" style="color:white">Bookings</a></li>
						</ul>
						
        </div>
      </div>
    </nav>
    <!-- END nav -->

    <body>
        <section class="ftco-cover ftco-slant" style="background-image: url(../Assets/Template/Main/images/landlord.jpg);" id="section-home">
            <div class="container">
                <div class="row align-items-center justify-content-center text-center ftco-vh-100">
                    <div class="col-md-10">
                        <h1 class="ftco-heading ftco-animate">We make sure your plots get's right value</h1>
                        <h2 class="h5 ftco-subheading mb-5 ftco-animate">We Will Help You to sell your plots<a href="#"></a></h2>    
                        <p><a href="Land.jsp" target="_blank" class="btn btn-primary ftco-animate">Add plots</a></p>
                    </div>
                </div>
            </div>
        </section>
        <section class="ftco-section bg-light  ftco-slant ftco-slant-white" id="section-features">
            
    <div class="container">

            <div class="row">
                <div class="col-md-12 text-center mb-5 ftco-animate">
                    <h2 class="text-uppercase ftco-uppercase">PLOTS</h2>
                    <div class="row justify-content-center">
                        <div class="col-md-7">
                            
                        </div>
                    </div>
                </div>
                <%
                  String selQry2 = "select * from tbl_land l inner join tbl_location c on l.location_id=c.location_id inner join tbl_place p on p.place_id=c.place_id inner join tbl_district d on d.district_id=p.district_id where landlord_id='"+session.getAttribute("landlordid")+"' ";
                  ResultSet rs2 = con.selectCommand(selQry2); 
                  while (rs2.next())
                         {
                        
                           
                %>
                <div class="col-lg-4 col-md-6">

                    <div class="media d-block mb-4 text-center ftco-media p-md-5 p-4 ftco-animate" style="max-height: 460px;
    max-width: 500px;">

                        <div class="ftco-icon mb-3"><img width="150" height="150" src="../Assets/Land/<%=rs2.getString("land_image")%>"></div>


                        <div class="media-body">
                            <h5 class="mt-0"><%=rs2.getString("location_name")%></h5>
                            <p class="mb-5">
                                Area :<%=rs2.getString("land_area")%>
                                <br>Rate per Cent :<%=rs2.getString("land_centrate")%>
                                <br>Token Amount :<%=rs2.getString("land_tokenamount")%>
                                <br>Address :<%=rs2.getString("land_address")%>
                            
                            </p>

                            <!--<p class="mb-0"><a href="Login.jsp" class="btn btn-primary btn-sm">Book now</a></p>-->

                        </div>

                    </div>

                </div>
                    <%
                        }
                    %>

                 
        </div>
    </div>
        <!-- END row -->

        </div>
    </div>

            </section>

            </body>

            <%@include file="Foot.jsp" %>


            </html>
