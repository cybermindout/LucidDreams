<%-- 
    Document   : testpage
    Created on : 26 Mar, 2023, 11:49:54 AM
    Author     : ashwi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Seller Page</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<script type="text/javascript" src="script.js"></script>
</head>
<body>
	<header>
		<h1>Products for Sale</h1>
	</header>
	<main>
		<% 
			String[] products = {"Product 1", "Product 2", "Product 3"};
			for (String product : products) {
				out.println("<div class='product'>" + product + "</div>");
			}
		%>
	</main>
	<footer>
		<p>&copy; 2023 Seller Co.</p>
	</footer>
</body>
</html>
