<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="com.teamsankya.shoppingapplication.dto.ProductDto"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
* {
	box-sizing: border-box;
}

.column {
	float: left;
	width: 33.33%;
	padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
	content: "";
	clear: both;
	display: table;
}

.pagination {
    display: inline-block;
}

.pagination a {
    color: black;
    float: left;
    padding: 8px 16px;
    text-decoration: none;
    transition: background-color .3s;
    border: 1px solid #ddd;
    font-size: 12px;
}

.pagination a.active {
    background-color: #4CAF50;
    color: white;
    border: 1px solid #4CAF50;
}

/* .pagination a:hover:not(.active) {background-color: #ddd;} */
</style>
<%@include file="searchproduct.jsp"%>
<br><br>
<body>
<%
		List<ProductDto> beans = (List<ProductDto>) request.getAttribute("msg");
	%>
	
	<div class="row">
		<%
			for (ProductDto bean : beans) {
		%>
		<div class="column">
			<tr>
			    <img src="/resources/images/01_men_one.jpg" alt="Shoe" style="width:50%"><br>
				Id:<%=bean.getpId()%><br> Name:<%=bean.getpName()%><br>
				Company:<%=bean.getpCompany()%><br> Description:<%=bean.getpDescription()%><br>
				Price:<%=bean.getpPrice()%><br>
				
			</tr>
		</div>

		<%
			}
		%>
	</div>
	<br><br>
	 <%@include file="pagination.jsp"%>
	<footer>
<!-- <div class="pagination">
  <a href="#">&laquo;</a>
  <a href="#" class="active">1</a>
  <a action="./viewemp/2">2</a>
  <a href="./3"name="pid">3</a>
  <a href="#">4</a>
  <a href="#">5</a>
  <a href="#">6</a>
  <a href="#">&raquo;</a>
  <a href="#" class="active">1</a>
   <a href="/shoppingapplication/productlist/1">1</a>   
   <a href="/shoppingapplication/productlist/2">2</a>   
   <a href="/shoppingapplication/productlist/3">3</a> 
    <a href="#">&raquo;</a> -->
   
</div>
<br>
  <p>Developed by: TeamSankya</p>
  <p>Contact information: <a href="teamsankay@gmail.com">teamsankay@gmail.com</a>.</p>
</footer>
</body>
</html>