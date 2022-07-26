<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body style="background-image: url(static/registration.jpg)">
<div style="text-align: center; color: red;  ">
		<h1>Feedbck Form</h1>
	</div>
	<div class="container">
		<div class="row">
			<div class="col"></div>
			<div class="col">
				<form action="RatingController" method="post">
					<div class="form-group">
						<label>Enter the User Id:</label> <input type="number"
							class="form-control" name="user-id" aria-describedby="emailHelp"
							placeholder="Enter User Id" required>
					</div>
					<div class="form-group">
						<label>Enter Booking Id:</label> <input type="number"
							class="form-control" placeholder="Enter Booking Id"
							name="booking-id" required>
					</div>
					<div class="form-group">
						<label>Enter the rating:</label> <input type="number" min="1" max="5"
							class="form-control" placeholder="Enter Rating" name="rating_rating" required>
					</div>

					<div class="form-group">
						<label>Enter the rating:</label> <input type="text"
							class="form-control" placeholder="Enter Description"
							name="description" required>
					</div>


					<button type="submit" class="btn btn-primary" value="submit">Submit</button>
				</form>
			</div>
			<div class="col"></div>
		</div>


	</div>

</body>
</html>