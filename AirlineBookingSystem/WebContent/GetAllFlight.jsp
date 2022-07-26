<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>&lt;sql:dateParam&gt; Demo</title>
  </head>
  <body>

     
    <sql:setDataSource var="myDS" driver="com.mysql.jdbc.Driver"
  url="jdbc:mysql://localhost:3306/akshay" user="root" password="root" />
         
   <%--  <c:choose>
   <c:when test="${not empty param.id  && not empty param.name && not empty param.price}">       
        
        
        <c:when test="${not empty param.flight_No }">       
    
        <sql:update dataSource="${myDS}" var="pro">
            INSERT INTO product VALUES  (?, ?, ?)           
            <sql:param value="${param.id}" />
            <sql:param value="${param.name}" />
            <sql:param value="${param.price}"/>   
                    
        </sql:update>
    </c:when>
    <c:otherwise>
        <font color="#cc0000">Please enter mandatory information.</font>
    </c:otherwise>
    </c:choose>
      --%>
    <br/><br/>
    <sql:query dataSource="${myDS}" var="pro">
        SELECT * from flight;
    </sql:query>
    <table border="1">
    <tr>
    <th>Flight_No</th>
    <th>Flight_name</th>
    <th>Flight _price</th>
   
    </tr>
        <c:forEach var="row" items="${pro.rows}">
            <tr>               
                <td><c:out value="${row.flight_No}" /></td>
                <td><c:out value="${row.flight_name}" /></td>
                <td><c:out value="${row.flight_price}" /></td>  
               <td>
               <a href="${pageContext.request.contextPath }/EditProductController?action=EDIT&id=${flight.flight_No}">Edit</a>
                <a href="${pageContext.request.contextPath }/DeleteProductController?action=EDIT&id=${flight.flight_No}">Delete</a>
               </td>
             </tr>
        </c:forEach>
        
    </table>
    </body>
</html>