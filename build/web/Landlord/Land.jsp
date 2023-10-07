<%-- 
    Document   : Land
    Created on : 27 Jan, 2022, 8:12:34 PM
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
        <title>Land</title>
        <link rel="stylesheet" href="form.css">
                  <script src="../Assets/JQ/jQuery.js"></script>
        <script>
            function getPlace(did)
            {
                    //alert(did);
                    $.ajax({
                    url: "../Assets/Ajaxpages/Ajaxplace.jsp?did="+did,
                      success: function(html){
                            $("#place").html(html);
                      }
                    });
            }
            function getLocation(did)
            {
                    //alert(did);
                    
                    //alert(did);
                    $.ajax({
                    url: "../Assets/Ajaxpages/Ajaxlocation.jsp?did="+did,
                      success: function(html){
                            $("#location").html(html);
                      }
                    });
            }
            </script>
    </head>
    <body>
         <%@include file="Head.jsp" %>
         <br><br><br><br><br><br>
        <%
          if(request.getParameter("did")!=null)
            {
                String del="delete from tbl_land where land_id='"+request.getParameter("did")+"'";
                con.executeCommand(del);
                response.sendRedirect("Land.jsp");
            }  
        %>
        <h1></h1>
        
        <div id="tab">
        <form name="frmland" method="post" action="../Assets/Actionpages/LandUploadAction.jsp" enctype="multipart/form-data">
            <table border="1" align="center" cellpadding="10" style="border-collapse: collapse">
             
                <tr>
                    
                    <td>District
                    <td>
                        <select name="district" required id="district" onchange="getPlace(this.value)">
                            <option value="" selected>--Select--</option>
                            <%
                             String st="select * from tbl_district";
                             ResultSet r=con.selectCommand(st);
           
                                while(r.next())
                                {
                         
                            %>
                            <option value="<%=r.getString("district_id")%>"><%=r.getString("district_name") %></option>
                            <%
                             }
                            %>
                            
                        </select>   
                            </td>
                    </td>
                
                    <tr>
                        <td>Place
                        <td>
                        <select name="place" id="place" required onchange="getLocation(this.value)">
                             <option value="" selected>--Select--</option>
                          
                        </select> 
                            </td>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Location
                        <td>
                        <select name="place" id="location" required>
                            <option value="" selected>--Select--</option>
                          
                        </select> 
                            </td>
                            </td>
                    </tr>
                   
                <tr>
                    <td>Land Image</td>
                    <td><input type="file" name="image" required></td>
                </tr>
                <tr>
                    <td>Token amount</td>
                    <td><input type="text" name="txtamt" value="<%%>" required></td>
                </tr>
                 <tr>
                    <td>Rate per Cent</td>
                    <td><input type="text" name="txtcent" value="<%%>" required></td>
                </tr>
                 <tr>
                    <td>Area</td>
                    <td><input type="text" name="txtarea" value="<%%>" required></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><textarea name="txtaddr" required> <%%>
                        </textarea>
                    </td>
                </tr>
                <tr>
                    <td>Details</td>
                    <td><textarea name="txtdet" required> <%%>
                        </textarea></td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" name="btnsave" value="SAVE">
                        <input type="reset" name="btncancel" value="CANCEL">
                    </td>
                </tr>
            </table>
        </form>
        
                <hr>
                <br>
                
        <table border="1" align="center" cellpadding="10">
           <tr>
                <td>Sl.No</td>
                <td>Location</td>
                <td>Image</td>
                <td>Address</td>
                <td>Amount</td>
                <td>Rate per Cent</td>
                <td>Area</td>
                <td>Details</td>
                <td>Action</td>
            </tr>
            <%
            String st1="select * from tbl_land l inner join tbl_location c on l.location_id=c.location_id inner join tbl_place p on p.place_id=c.place_id inner join tbl_district d on d.district_id=p.district_id where landlord_id='"+session.getAttribute("landlordid")+"' ";
            ResultSet rs=con.selectCommand(st1);
            int i=0;
            while(rs.next())
            {
                i++;
            
            %>
            <tr>
                <td><%=i%></td>
                <td>
                    <%=rs.getString("location_name")%>
                </td>
                <td>
                    <img src="../Assets/Land/<%=rs.getString("land_image")%>" width="75" height="75">
                </td>
                
                <td>
                    <%=rs.getString("land_address")%>
                </td>
                <td>
                    <%=rs.getString("land_tokenamount")%>
                </td>
                <td>
                    <%=rs.getString("land_centrate")%>
                </td>
                <td>
                    <%=rs.getString("land_area")%>
                </td>
                <td>
                    <%=rs.getString("land_details")%>
                </td>
                <td>
                    <a href="Land.jsp?did=<%=rs.getString("land_id")%>">Delete</a> 
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

