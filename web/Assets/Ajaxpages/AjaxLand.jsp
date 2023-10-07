
<%@page import="java.sql.ResultSet" %>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
    </head>
    <body>
        
    
<%
    String did="", pid="", lid="";
    did=request.getParameter("did");
    pid=request.getParameter("pid");
    lid=request.getParameter("lid");
    
    String sel="select * from tbl_land la inner join tbl_location l on la.location_id=l.location_id inner join tbl_place p on p.place_id=l.place_id inner join tbl_district d on d.district_id=p.district_id inner join tbl_landlord lr on la.landlord_id=lr.landlord_id where landlord_vstatus=1 and true";
    if(did!="")
    {
        sel+=" and d.district_id='"+did+"' ";
    }
    if(pid!="")
    {
        sel+=" and p.place_id='"+pid+"' ";
    }
    if(lid!="")
    {
        //out.println(wid);
        sel+=" and l.location_id='"+lid+"' ";
        //out.println(sel);
    }
    %>
<table align="center">
    <tr>

</body>
</html>

