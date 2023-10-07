<%-- 
    Document   : Request.jsp
    Created on : 14 feb, 2023, 12:04:43 AM
    Author     : 91907
--%>
<%//@include file="SessionValidator.jsp" %>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean class="DB.ConnectionClass" id="connect"></jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Request</title>
        <link rel="stylesheet" href="form.css">
    </head>
    <%
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
    
        
        %>
   
    <body>
        <%@include file="Head.jsp" %>
        <br>        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>

        <div id="tab">
        <form name="frmComplaints" method="post">
            <table border="1" align="center" cellpadding="10" style="border-collapse: collapse">
                <tr>
                    <td>Product Name</td>
                    <td>
                        <input type="text" name="name" placeholder="Enter Product Name" required="required">
                    </td>
                </tr>
                <tr>
                    <td>Product Category</td>
                    <td><input type="text" name="category" placeholder="Enter Product Category" required="required"></td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" name="btnsave" value="submit">
                        
                    </td>
                    
                </tr>
            </table>
        </form>
                        <br><br>
        <table border="1" align="center" cellpadding="10" style="border-collapse: collapse">
            <tr>
                <th>SI.No</th>
                <th>Product</th>
                <th>Category</th>
                <th>Reply</th>
                <th>Action</th>
            </tr>
            <%
                    String s = "select * from tbl_prequest where shop_id='"+session.getAttribute("shopid")+"'";
                    ResultSet r = connect.selectCommand(s);
                    int i = 0;
                    while (r.next()) {
                        i++;

                %>
                <tr>
                    <td><%=i%></td>
                    <td>
                        <%=r.getString("pr_name")%>
                    </td>
                    <td>
                        <%=r.getString("pr_category")%>
                    </td>
                    <td>
                        <%=r.getString("pr_reply")%>
                    </td>
                    <td>
                        <a href="roductRequest.jsp?did=<%=r.getString("pr_id")%>">Delete</a>
                    </td>
                </tr>
                <%
                    }
                %> 
        </table>
        </div>
    </body>
    <br>  <br>  <br>  <br>  <br>  <br>  <br>
    <%@include file="Foot.jsp" %>
</html>
