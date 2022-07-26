<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration here</title>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style >
.card{
   opacity: 0.9;
}
</style>
</head>
<body style="background-image: url(static/registration.jpg)">
<form action="registration" method="post">
<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-white text-black" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <div class="mb-md-5 mt-md-4 pb-5">

              <h2 class="fw-bold mb-2 text-uppercase">Registration</h2>
              

              <div class="form-outline form-white mb-4">
                <input type="text"  name="user_name"class="form-control form-control-lg" />
                <label class="form-label" for="user_name"> Name</label>
              </div>

              <div class="form-outline form-white mb-4">
                <input type="email" name="user_email"class="form-control form-control-lg" />
                <label class="form-label" for="user_email"">Email</label>
              </div>
              
              <div class="form-outline form-white mb-4">
                <input type="password"  name="user_password"class="form-control form-control-lg" />
                <label class="form-label" for="user_password">Password</label>
              </div>
              <div class="form-outline form-white mb-4">
                <input type="text"  name="user_contact"class="form-control form-control-lg" />
                <label class="form-label" for="user_contact">Contact No</label>
              </div>
              <div class="form-outline form-white mb-4">
                <input type="text"  name="user_address"class="form-control form-control-lg" />
                <label class="form-label" for="user_address">Address</label>
              </div>
              <div class="form-outline form-white mb-4">
                <input type="number"  name="user_age"class="form-control form-control-lg" />
                <label class="form-label" for="user_age">Age</label>
              </div>
              <div class="form-outline form-white mb-4">
                <input type="text"  name="user_gender"class="form-control form-control-lg" />
                <label class="form-label" for="user_gender">Gender</label>
              </div>
              
    
              <button class="btn btn-outline-dark btn-lg btn-Success  px-5" type="submit">SignUp</button>

              
            </div>

         
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</form>
</body>
</html>