<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>Gym Fitness Membership</title>
    <meta charset="UTF-8">
    <meta name="description" content="Gym Fitness Membership">
    <meta name="keywords" content="fitness, membership">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Stylesheets -->
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/font-awesome.min.css" />
    <link rel="stylesheet" href="css/owl.carousel.min.css" />
    <link rel="stylesheet" href="css/flaticon.css" />
    <link rel="stylesheet" href="css/slicknav.min.css" />

    <!-- Main Stylesheets -->
    <link rel="stylesheet" type="text/css" href="css/util.css">
    <link rel="stylesheet" type="text/css" href="css/login.css">

</head>

<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <!-- Header section -->
    <header class="header-section">
        <a href="index.html" class="site-logo">
            <h1>Gym Membership</h1>
        </a>
        <ul class="main-menu">
            <li><a class="active" href="index.html">Home</a></li>
            <li><a href="about.html">About Us</a></li>
            <li><a href="classes.html">Classes</a></li>
            <li><a href="register.html">Register</a></li>
            <li><a href="login.html">Login</a></li>
            <li class="header-right">
                <div class="hr-box">
                    <img src="images/location-icon.png" alt="">
                    <h6>1430 N 8th Street, San Jose, CA</h6>
                </div>
            </li>
        </ul>
    </header>
    <div class="clearfix"></div>
    <!-- Header section end -->

    <div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-85 p-r-85 p-t-55 p-b-55">
				<div style="text-align: center">
        <h1>Welcome to your Gym Membership Admin Panel</h1>
        <b><%=session.getAttribute("email") %></b>
        <br><br>
        <a href="LogOutSuccess">Logout</a>
    </div>
			</div>
		</div>
	</div>
	<div id="dropDownSelect1"></div>

    <!-- Footer section -->
    <footer class="footer-section set-bg" data-setbg="images/footer-bg.jpg">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-sm-6">
                    <div class="footer-widget">
                        <h4>Location</h4>
                        <div class="fw-info-box">
                            <img src="images/location.png" alt="">
                            <div class="fw-info-text">
                                <p>1430 N 8th Street, San Jose, CA</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class="footer-widget">
                        <h4>Subscriptions</h4>
                        <div class="fw-info-box">
                            <img src="images/phoneIcon.png" alt="">
                            <div class="fw-info-text">
                                <p>+1 (603)535-4592</p>
                                <p>+1 (603)535-4556</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class="footer-widget">
                        <h4>E-mail</h4>
                        <div class="fw-info-box">
                            <img src="images/email_icon.png" alt="">
                            <div class="fw-info-text">
                                <p>contact@fitnessmembership.com</p>
                                <p>www.fitnessmembership.com</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 order-2 order-md-1">
                    <div class="copyright">
                        <p>
                            Copyright &copy;
                            <script>document.write(new Date().getFullYear());</script> All rights reserved
                        </p>
                    </div>
                </div>
                <div class="col-md-6 order-1 order-md-2">
                    <ul class="footer-menu">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="about.html">About Us</a></li>
                        <li><a href="classes.html">Classes</a></li>
                        <li><a href="register.html">Register</a></li>
                        <li><a href="login.html">Login</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
    <!-- Footer section end -->

    <!--====== Javascripts & Jquery ======-->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/circle-progress.min.js"></script>
    <script src="js/login.js"></script>
</body>

</html>