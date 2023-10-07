<%-- 
    Document   : Wishlist
    Created on : 6 Mar, 2022, 4:50:32 PM
    Author     : asanj
--%>
<%@page import="java.sql.ResultSet" %>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
    <%@include file="SessionValidator.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wishlist</title>
        <link rel="stylesheet" href="form.css">
<style>
.zoom {
  padding: 50px;
  background-color: white;
  transition: transform .2s; /* Animation */
  width: 300px;
  height: 200px;
  margin: 0 auto;
}

.zoom:hover {
  transform: scale(1.5); /* (150% zoom - Note: if the zoom is too large, it will go outside of the viewport) */
}
.btn {
  background-color: null ;
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  font-size: 16px;
  margin: 4px 2px;
  opacity: 0.6;
  transition: 0.3s;
  text-decoration: none;
}
a{
    text-decoration: none;
}

.btn:hover {opacity: 1}
</style>
    </head>
    <script src="../Assets/JQ/jQuery.js"></script>
    <body>
        <%@include file="Head.jsp" %>
        <br>  <br>  <br>  <br>  <br>  <br>  <br>
        <h1 align="center">Wishlist</h1>
         <%
          if(request.getParameter("did")!=null)
            {
            String del="delete from tbl_wishlist where wishlist_id='"+request.getParameter("did")+"'";
            con.executeCommand(del);
//            response.sendRedirect("Wishlist.jsp");
            }
            String sel="select * from tbl_wishlist w inner join tbl_worker wo on wo.worker_id=w.worker_id inner join tbl_workertype wt on wt.workertype_id=wo.workertype_id where  user_id='"+session.getAttribute("userid")+"'";
            ResultSet rs1=con.selectCommand(sel);
            if(rs1.next())
            {
           
           
          
        %>
        
        <div id="tab">
        <form name="frmsearch" method="post">
            <table border="1" align="center" cellpadding="10" style="border-collapse: collapse">
                <tr>
                    <td class="zoom"><p style="text-align:center;border:1px solid #999;margin:22px;padding:10px">
                        <img src="../Assets/Worker/<%=rs1.getString("worker_photo")%>" width="150" height="150" style="border-radius: 200px">
                    
                        Name:<%=rs1.getString("worker_name")%>
                        <br>
                        Contact:<%=rs1.getString("worker_contact")%>
                        <br>
                        Type:<%=rs1.getString("workertype_name")%>
                        <br>
                        <button class="btn"><a href="Wishlist.jsp?did=<%=rs1.getString("wishlist_id")%>">Delete</a></button>
                    
                </tr>
                 
            </table>
                        <%}%>
        </div>
        </form>
   
    <br>  <br>  <br>  <br>  <br>  <br>  <br>
    <%@include file="Foot.jsp" %>
</html>
<%
                if(request.getParameter("wid")!=null)
            {
                String se="select *  from tbl_wishlist where user_id='"+session.getAttribute("userid")+"' and worker_id='"+request.getParameter("wid")+"'  ";
                //out.println(se);
                ResultSet rs=con.selectCommand(se);
                if(rs.next())
                {
                    //out.println(se);
                    %>
                    <script>alert("Already added to wishlist")</script>
                    <%  
                //response.sendRedirect("SearchWorker.jsp");
                }
                else
                {
                    //out.println(se);
                    String in="insert into tbl_wishlist(user_id,worker_id)values ('"+session.getAttribute("userid")+"','"+request.getParameter("wid")+"')";
                    con.executeCommand(in);
                    response.sendRedirect("SearchWorker.jsp");
                }
            }
%>
