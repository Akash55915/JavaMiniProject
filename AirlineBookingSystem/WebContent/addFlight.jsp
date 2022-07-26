<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="AddFlightController2" method="post">
flight_No:<input type="number"  name="flight_No"/><br>
flight_total_no_seats:<input type="number"  name="flight_total_no_seats"/><br>
flight_avaliable_seats:<input type="number"  name="flight_avaliable_seats"/><br>


Flight_name:<input type="text"  name="flight_name"/><br>
flight_source:<input type="text"  name="flight_source"/><br>
flight_destination:<input type="text"  name="flight_destination"/><br>
flight_type:<input type="text"  name="flight_type"/><br>

flight_time:<input type="time"  name="flight_time"/><br>
flight_date:<input type="date"  name="flight_date"/><br>

flight_price:<input type="number"  name="flight_price"/><br>

<input type="submit" value="submit">
</form>
</body>
</html>