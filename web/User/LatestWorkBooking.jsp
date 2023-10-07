<%-- 
    Document   : LatestWorkBooking
    Created on : 17 Feb, 2022, 6:46:04 PM
    Author     : asanj
--%>
<%@page import="java.sql.ResultSet" %>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%--<%@include file="SessionValidator.jsp" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Work Booking</title>
        <link rel="stylesheet" href="form.css">
    </head>
    <body>
        <%@include file="Head.jsp" %>
        <br><br><br><br><br><br><br>
        <h1 align="center">Booking</h1>
        <div id="tab">
            <table align="center">    
                <tr>
                    <%
                        String worker_email = "", worker_name = "";
                        String user_email = "", user_name = "";
                        session.setAttribute("workerid", request.getParameter("wid"));

                    %>
                    <td>

                        <form name="frmbooking" method="post">
                            <table border="1" align="center" cellpadding="10" style="border-collapse: collapse">
                                <tr>
                                    <td>Work details</td>
                                    <td><input type="text" name="work" value="" required></td>
                                </tr>
                                 <tr>
                                    <td>Work address</td>
                                    <td><input type="text" name="address" value="" required></td>
                                </tr>
                                <tr>
                                    <td>Booking To</td>
                                    <td><input type="date" name="bdate" value="" required></td>
                                </tr>
                                <tr>
                                    <td colspan="2" align="center">
                                        <input type="submit" name="btnsave" value="BOOK">
                                    </td>
                                </tr>  
                            </table> 
                        </form>    

                    </td>

            </table>
        </div>
    </body>
    <br>  <br>  <br>  <br>  <br>  <br>  <br>
    <%@include file="Foot.jsp" %>
</html>

<%    if (request.getParameter("btnsave") != null) {
        String ins = "insert into tbl_lworkbooking(booked_date,worker_id,user_id,work_details,work_address,booking_date) values ('" + request.getParameter("bdate") + "','" + session.getAttribute("workerid") + "','" + session.getAttribute("userid") + "','" + request.getParameter("work") + "','" + request.getParameter("address") + "',curdate())";
        boolean status = con.executeCommand(ins);

        String st = "select * from tbl_lworkbooking lb inner join tbl_worker w on lb.worker_id=w.worker_id inner join tbl_user u on lb.user_id=u.user_id where lb.worker_id='" + session.getAttribute("workerid") + "' and u.user_id='" + session.getAttribute("userid") + "'";
        System.out.print(st);
        ResultSet r = con.selectCommand(st);
        if (r.next()) {
            //out.println(st);
            worker_name = r.getString("worker_name");
            worker_email = r.getString("worker_email");
            user_name = r.getString("user_name");
            user_email = r.getString("user_email");
            //out.println(worker_name);
        }

        if (status == true) {
            DB.mailconnection m = new DB.mailconnection();

            String mailid[] = {user_email};
            String name = user_name;
            String subject = "Booking Status";

            String text = "Respected " + name + "  \r\n \r\n"
                    + " This is from Dream Build team. \r\n"
                    + " We established Dream Build in order to bring the dream about your home come true. \r\n\r\n"
                    + " Your requset have been successfully submitted. \r\n"
                    + " Please wait for further updates. \r\n"
                    + " we were always happy to help!. \r\n \r\n"
                    + " Team Dream Build.";
            boolean b = m.sendMail(mailid, subject, text);
            System.out.println(b);
        }
        if (status == true) {
            DB.mailconnection m = new DB.mailconnection();
            String mailid[] = {worker_email};
            String name = worker_name;
            String subject = "New Booking";

            String text = "Respected " + name + "  \r\n \r\n"
                    + " This is from Dream Build team. \r\n"
                    + " We established Dream Build in order to bring the dream about your home come true. \r\n\r\n"
                    + " You got one new Booking. \r\n"
                    + " Check it out. \r\n \r\n"
                    + " Team Dream Build.";
            boolean b = m.sendMail(mailid, subject, text);
            System.out.println(b);
        }
%>
<script type="text/javascript">
    alert("Work Booking Successfull..");
    window.location="ViewWorkBookings.jsp";
</script>
<%
    }
%>
