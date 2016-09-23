<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- Favicon -->
<link rel="shortcut icon" href="favicon.ico">

<!-- Web Fonts -->
<link rel='stylesheet' type='text/css'
	href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600&amp;subset=cyrillic,latin'>

<!-- CSS Global Compulsory -->
<link rel="stylesheet"
	href="assets/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/shop.style.css">

<!-- CSS Header and Footer -->
<link rel="stylesheet" href="assets/css/headers/header-v5.css">
<link rel="stylesheet" href="assets/css/footers/footer-v4.css">

<!-- CSS Implementing Plugins -->
<link rel="stylesheet" href="assets/plugins/animate.css">
<link rel="stylesheet" href="assets/plugins/line-icons/line-icons.css">
<link rel="stylesheet"
	href="assets/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="assets/plugins/scrollbar/css/jquery.mCustomScrollbar.css">
<link rel="stylesheet"
	href="assets/plugins/owl-carousel/owl-carousel/owl.carousel.css">
<link rel="stylesheet"
	href="assets/plugins/revolution-slider/rs-plugin/css/settings.css">

<!-- materialize CSS --> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
<link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="assets/css/materialize.min.css"  media="screen,projection"/>
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="assets/js/materialize.min.js"></script>
<script type="text/javascript">
  	$(function(){
		$("#mon").on("click", function(param){
			location.href="webToon.do?week=mon"
		})
		$("#tue").on("click", function(param){
			location.href="webToon.do?week=tue"
		})
		$("#wed").on("click", function(param){
			location.href="webToon.do?week=wed"
		})
		$("#thu").on("click", function(param){
			location.href="webToon.do?week=thu"
		})
		$("#fri").on("click", function(param){
			location.href="webToon.do?week=fri"
		})
		$("#sat").on("click", function(param){
			location.href="webToon.do?week=sat"
		})
		$("#sun").on("click", function(param){
			location.href="webToon.do?week=sun"
		})
	}); 
</script>

<!-- CSS Customization -->
<link rel="stylesheet" href="assets/css/custom.css">
</head>
<body class="header-fixed">
<div class="wrapper">
    <!--=== Header v5 ===-->   
    <div class="header-v5 header-static">
        <!-- Topbar v3 -->
        <div class="topbar-v3">
            <div class="search-open">
                <div class="container">
                    <input type="text" class="form-control" placeholder="Search">
                    <div class="search-close"><i class="icon-close"></i></div>
                </div>    
            </div>

            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <!-- Topbar Navigation -->
                        <ul class="left-topbar">
                            <li>
                                <a>Currency (USD)</a>
                                <ul class="currency">
                                    <li class="active">
                                        <a href="#">USD <i class="fa fa-check"></i></a> 
                                    </li>
                                    <li><a href="#">Euro</a></li>
                                    <li><a href="#">Pound</a></li>
                                </ul>
                            </li>
                            <li>
                                <a>Language (EN)</a>
                                <ul class="language">
                                    <li class="active">
                                        <a href="#">English (EN)<i class="fa fa-check"></i></a> 
                                    </li>
                                    <li><a href="#">Spanish (SPN)</a></li>
                                    <li><a href="#">Russian (RUS)</a></li>
                                    <li><a href="#">German (GRM)</a></li>
                                </ul>
                            </li>   
                        </ul><!--/end left-topbar-->
                    </div>
                    <div class="col-sm-6">
                        <ul class="list-inline right-topbar pull-right">
                            <li><a href="#">Account</a></li>
                            <li><a href="shop-ui-add-to-cart.html">Wishlist (0)</a></li>
                            <li><a href="shop-ui-login.html">Login</a> | <a href="shop-ui-register.html">Register</a></li>
                            <li><i class="search fa fa-search search-button"></i></li>
                        </ul>
                    </div>
                </div>
            </div><!--/container-->
        </div>
        <!-- End Topbar v3 -->

        <!-- Navbar -->
        <div class="navbar navbar-default mega-menu" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html">
                        <img id="logo-header" src="assets/img/logo.png" alt="Logo">
                    </a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse navbar-responsive-collapse">
                    <!-- Shopping Cart -->
                    <ul class="list-inline shop-badge badge-lists badge-icons pull-right">
                        <li>
                            <a href="#"><i class="fa fa-shopping-cart"></i></a>
                            <span class="badge badge-sea rounded-x">3</span>
                            <ul class="list-unstyled badge-open mCustomScrollbar" data-mcs-theme="minimal-dark">
                                <li>
                                    <img src="assets/img/thumb/05.jpg" alt="">
                                    <button type="button" class="close">×</button>
                                    <div class="overflow-h">
                                        <span>Black Glasses</span>
                                        <small>1 x $400.00</small>
                                    </div>    
                                </li>
                                <li>
                                    <img src="assets/img/thumb/02.jpg" alt="">
                                    <button type="button" class="close">×</button>
                                    <div class="overflow-h">
                                        <span>Black Glasses</span>
                                        <small>1 x $400.00</small>
                                    </div>    
                                </li>
                                <li>
                                    <img src="assets/img/thumb/03.jpg" alt="">
                                    <button type="button" class="close">×</button>
                                    <div class="overflow-h">
                                        <span>Black Glasses</span>
                                        <small>1 x $400.00</small>
                                    </div>    
                                </li>
                                <li class="subtotal">
                                    <div class="overflow-h margin-bottom-10">
                                        <span>Subtotal</span>
                                        <span class="pull-right subtotal-cost">$1200.00</span>
                                    </div>
                                    <div class="row">    
                                        <div class="col-xs-6">
                                            <a href="shop-ui-inner.html" class="btn-u btn-brd btn-brd-hover btn-u-sea-shop btn-block">View Cart</a>
                                        </div>
                                        <div class="col-xs-6">
                                            <a href="shop-ui-add-to-cart.html" class="btn-u btn-u-sea-shop btn-block">Checkout</a>
                                        </div>
                                    </div>        
                                </li>    
                            </ul>
                        </li>
                    </ul>
                    <!-- End Shopping Cart -->

                    <!-- Nav Menu -->
                    <ul class="nav navbar-nav">
                        <!-- Pages -->
                        <li class="dropdown active">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown">
                                Pages
                            </a>
                            <ul class="dropdown-menu">
                                <li class="active"><a href="index.html">Shop UI</a></li>
                                <li><a href="shop-ui-inner.html">Product Page</a></li>
                                <li><a href="shop-ui-filter-grid.html">Filter Grid Page</a></li>
                                <li><a href="shop-ui-filter-list.html">Filter List Page</a></li>
                                <li><a href="shop-ui-add-to-cart.html">Checkout</a></li>
                                <li><a href="shop-ui-login.html">Login</a></li>
                                <li><a href="shop-ui-register.html">Register</a></li>
                            </ul>
                        </li>
                        <!-- End Pages -->

                        <!-- Promotion -->
                        <li class="dropdown">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown">
                                Promotion
                            </a>
                            <ul class="dropdown-menu">
                                <li class="dropdown-submenu">
                                    <a href="javascript:void(0);">Jeans</a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Skinny Jeans</a></li>
                                        <li><a href="#">Bootcut Jeans</a></li>
                                        <li><a href="#">Straight Cut Jeans</a></li>
                                    </ul>    
                                </li>
                                <li class="dropdown-submenu">
                                    <a href="javascript:void(0);">Shoes</a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Sandals</a></li>
                                        <li><a href="#">Heels</a></li>
                                    </ul>    
                                </li>
                            </ul>
                        </li>
                        <!-- End Promotion -->

                        <!-- Gifts -->
                        <li class="dropdown mega-menu-fullwidth">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown">
                                Gifts
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <div class="mega-menu-content">
                                        <div class="container">
                                            <div class="row">
                                                <div class="col-md-3 col-sm-12 col-xs-12 md-margin-bottom-30">
                                                    <h3 class="mega-menu-heading">Pellentes que nec diam lectus</h3>
                                                    <p>Proin pulvinar libero quis auctor pharet ra. Aenean fermentum met us orci, sedf eugiat augue pulvina r vitae. Nulla dolor nisl, molestie nec aliquam vitae, gravida sodals dolor...</p>
                                                    <button type="button" class="btn-u btn-u-dark">Read More</button>
                                                </div>
                                                <div class="col-md-3 col-sm-4 col-xs-4 md-margin-bottom-30">
                                                    <a href="#"><img class="product-offers img-responsive" src="assets/img/blog/01.jpg" alt=""></a>
                                                </div>
                                                <div class="col-md-3 col-sm-4 col-xs-4 sm-margin-bottom-30">
                                                    <a href="#"><img class="product-offers img-responsive" src="assets/img/blog/02.jpg" alt=""></a>
                                                </div>
                                                <div class="col-md-3 col-sm-4 col-xs-4">
                                                    <a href="#"><img class="product-offers img-responsive" src="assets/img/blog/03.jpg" alt=""></a>
                                                </div>
                                            </div><!--/end row-->
                                        </div><!--/end container-->
                                    </div><!--/end mega menu content-->  
                                </li>
                            </ul><!--/end dropdown-menu-->
                        </li>
                        <!-- End Gifts -->

                        <!-- Books -->
                        <li class="dropdown mega-menu-fullwidth">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown">
                                Books
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <div class="mega-menu-content">
                                        <div class="container">
                                            <div class="row">
                                                <div class="col-md-2 col-sm-6">
                                                    <h3 class="mega-menu-heading">Clothe</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">New in</a></li>
                                                        <li><a href="#">Coats &amp; Jackets</a></li>
                                                        <li><a href="#">Jeans</a></li>
                                                        <li><a href="#">Dresses</a></li>
                                                        <li><a href="#">Shorts</a> <span class="label label-danger-shop">New</span></li>
                                                        <li><a href="#">Skirts</a></li>
                                                        <li><a href="#">T-Shirts</a></li>
                                                    </ul>
                                                    <h3 class="mega-menu-heading">Shoes</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Boots</a></li>
                                                        <li><a href="#">FLats</a></li>
                                                        <li><a href="#">Heels</a></li>
                                                        <li><a href="#">Sandals</a></li>
                                                        <li><a href="#">Sports</a></li>
                                                    </ul>
                                                </div>

                                                <div class="col-md-2 col-sm-6">
                                                    <h3 class="mega-menu-heading">Accessories</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">All accessories</a></li>
                                                        <li><a href="#">Bags &amp; Purses</a></li>
                                                        <li><a href="#">Scarvs &amp; Hats</a></li>
                                                        <li><a href="#">Jewellery</a></li>
                                                        <li><a href="#">Fragrance &amp; Beauty</a></li>
                                                    </ul>
                                                    <h3 class="mega-menu-heading">Lingerie</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Linger</a> <span class="label label-danger-shop">New</span></li>
                                                        <li><a href="#">Slippers</a></li>
                                                    </ul>
                                                    <h3 class="mega-menu-heading">Nightwear</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Nightwear</a></li>
                                                        <li><a href="#">Socks</a></li>
                                                        <li><a href="#">Tights</a></li>
                                                    </ul>
                                                </div>

                                                <div class="col-md-2 col-sm-6">
                                                    <h3 class="mega-menu-heading">Mixed</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">New in</a></li>
                                                        <li><a href="#">Coats &amp; Jackets</a> <span class="label label-danger-shop">New</span></li>
                                                        <li><a href="#">Jeans</a></li>
                                                        <li><a href="#">Dresses</a></li>
                                                        <li><a href="#">Shorts</a></li>
                                                        <li><a href="#">Skirts</a></li>
                                                        <li><a href="#">T-shirts</a></li>
                                                        <li><a href="#">Boots</a></li>
                                                        <li><a href="#">Flats</a></li>
                                                        <li><a href="#">Heels</a></li>
                                                        <li><a href="#">Sandals</a></li>
                                                        <li><a href="#">Sports</a></li>
                                                        <li><a href="#">Socks</a></li>
                                                        <li><a href="#">Tights</a></li>
                                                    </ul>
                                                </div>        

                                                <div class="col-md-2 col-sm-6">
                                                    <h3 class="mega-menu-heading">Clothe</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">New in</a></li>
                                                        <li><a href="#">Coats &amp; Jackets</a></li>
                                                        <li><a href="#">Jeans</a></li>
                                                        <li><a href="#">Dresses</a></li>
                                                        <li><a href="#">Shorts</a> <span class="label label-danger-shop">New</span></li>
                                                        <li><a href="#">Skirts</a></li>
                                                        <li><a href="#">T-shirts</a></li>
                                                    </ul>
                                                    <h3 class="mega-menu-heading">Shoes</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Boots</a></li>
                                                        <li><a href="#">Flats</a></li>
                                                        <li><a href="#">Heels</a></li>
                                                        <li><a href="#">Sandals</a></li>
                                                        <li><a href="#">Sports</a></li>
                                                    </ul>
                                                </div>

                                                <div class="col-md-2 col-sm-6">
                                                    <h3 class="mega-menu-heading">Accessories</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">All accessories</a></li>
                                                        <li><a href="#">Bags &amp; Purses</a></li>
                                                        <li><a href="#">Scarvs &amp; Hats</a></li>
                                                        <li><a href="#">Jewellery</a></li>
                                                        <li><a href="#">Fragrance &amp; Beauty</a></li>
                                                    </ul>
                                                    <h3 class="mega-menu-heading">Lingerie</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Linger</a> <span class="label label-danger-shop">New</span></li>
                                                        <li><a href="#">Slippers</a></li>
                                                    </ul>
                                                    <h3 class="mega-menu-heading">Nightwear</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Nightwear</a></li>
                                                        <li><a href="#">Socks</a></li>
                                                        <li><a href="#">Tights</a></li>
                                                    </ul>
                                                </div>

                                                <div class="col-md-2 col-sm-6">
                                                    <h3 class="mega-menu-heading">Mixed</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">New in</a></li>
                                                        <li><a href="#">Coats &amp; Jackets</a> <span class="label label-danger-shop">New</span></li>
                                                        <li><a href="#">Jeans</a></li>
                                                        <li><a href="#">Dresses</a></li>
                                                        <li><a href="#">Shorts</a></li>
                                                        <li><a href="#">Skirts</a></li>
                                                        <li><a href="#">T-shirts</a></li>
                                                        <li><a href="#">Boots</a></li>
                                                        <li><a href="#">Flats</a></li>
                                                        <li><a href="#">Heels</a></li>
                                                        <li><a href="#">Sandals</a></li>
                                                        <li><a href="#">Sports</a></li>
                                                        <li><a href="#">Socks</a></li>
                                                        <li><a href="#">Tights</a> <span class="label label-danger-shop">New</span></li>
                                                    </ul>
                                                </div>
                                            </div><!--/end row-->
                                        </div><!--/end container-->
                                    </div><!--/end mega menu content-->  
                                </li>
                            </ul><!--/end dropdown-menu-->
                        </li>
                        <!-- End Books -->

                        <!-- Clothes -->
                        <li class="dropdown">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown" data-delay="1000">
                                Clothes
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Jeans</a></li>
                                <li><a href="#">T-shirts</a></li>
                                <li><a href="#">Shorts</a></li>
                            </ul>
                        </li>
                        <!-- End Clothes -->

                        <!-- Main Demo -->
                        <li><a href="../index.html">Main Demo</a></li>
                        <!-- Main Demo -->
                    </ul>
                    <!-- End Nav Menu -->
                </div>
            </div>    
        </div>            
        <!-- End Navbar -->
    </div>
    <!--=== End Header v5 ===-->

    <!--=== Slider ===-->
    <div class="tp-banner-container">
        <div class="tp-banner">
            <ul>
                 <!-- SLIDE -->
                <li class="revolution-mch-1" data-transition="fade" data-slotamount="5" data-masterspeed="1000" data-title="Slide 4">
                    <!-- MAIN IMAGE -->
                    <img src="assets/img/toonImage.png"  alt="darkblurbg"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat">

                </li>
                <!-- END SLIDE -->                

                <!-- SLIDE -->
  
            </ul>
            <div class="tp-bannertimer tp-bottom"></div>            
        </div>
    </div>
    <!--=== End Slider ===-->
<br />

        <!--=== Illustration v4 ===-->
        <div class="row illustration-v4 margin-bottom-40">
			<!-- 월~일 구분 버튼 추가 -->
				<div>
				<a class="btn-floating btn-large waves-effect waves-light gray"><i class="material-icons" id="mon" value="mon">월</i></a> 
				<a class="btn-floating btn-large waves-effect waves-light gray"><i class="material-icons" id="tue" value="tue">화</i></a> 
				<a class="btn-floating btn-large waves-effect waves-light gray"><i class="material-icons" id="wed" value="wed">수</i></a> 
				<a class="btn-floating btn-large waves-effect waves-light gray"><i class="material-icons" id= "thu" value="thu">목</i></a> 
				<a class="btn-floating btn-large waves-effect waves-light gray"><i class="material-icons" id= "fri" value="fri">금</i></a> 
				<a class="btn-floating btn-large waves-effect waves-light gray"><i class="material-icons" id="sat" value="sat">토</i></a> 
				<a	class="btn-floating btn-large waves-effect waves-light gray"><i class="material-icons" id="sun" value="sun">일</i></a>
				</div>
			<div class="col-md-4">
                <div class="heading heading-v1 margin-bottom-20">
                <!-- Naver Webtoon -->
                    <h2>Naver</h2>
                </div>

				<c:forEach var="i" items="${webToonList }">
					<div class="thumb-product">
						<img class="thumb-product-img" src="${i.wImage }" alt="">

						<div class="thumb-product-in">
							<h4>
							<a href="webToonDetail.do?wname=${i.wName }&site=${i.webSite}">${i.wName }</a>
							</h4>
							<span class="thumb-product-type">작가이름</span>
						</div>
					</div>
				</c:forEach>
			</div>
            <!-- Daum Webtoon -->
            <div class="col-md-4">
                <div class="heading heading-v1 margin-bottom-20">
                    <h2>Daum</h2>
                </div>
    				<c:forEach var="i" items="${webToonList }">
					<div class="thumb-product">
						<img class="thumb-product-img" src="${i.wImage }" alt="">

						<div class="thumb-product-in">
							<h4>
								<a href="shop-ui-inner.html">${i.wName }</a>
							</h4>
							<span class="thumb-product-type">작가이름</span>
						</div>
					</div>
				</c:forEach>
            </div>
            
            <!-- Lezhin Webtoon -->
            <div class="col-md-4 padding">
                <div class="heading heading-v1 margin-bottom-20">
                    <h2>lezhin</h2>
                </div>
  				<c:forEach var="i" items="${webToonList }">
					<div class="thumb-product">
						<img class="thumb-product-img" src="${i.wImage }" alt="">

						<div class="thumb-product-in">
							<h4>
								<a href="shop-ui-inner.html">${i.wName }</a>
							</h4>
							<span class="thumb-product-type">작가이름</span>
						</div>
					</div>
				</c:forEach>
            </div>
        </div><!--/end row-->
        <!--=== End Illustration v4 ===-->
    </div><!--/end cotnainer-->

    <!--=== Collection Banner ===-->
    <div class="collection-banner">
        <div class="container">
            <div class="col-md-7 md-margin-bottom-50">
                <h2>Makeup collection</h2>
                <p>Duis in posuere risus. Vivamus sed dignissim tellus. In vehicula justo tempor commodo. <br> Nunc lobortis dapibus neque quis lacinia</p><br>
                <a href="#" class="btn-u btn-brd btn-brd-hover btn-u-light">Shop Now</a>
            </div>
            <div class="col-md-5">
                <div class="overflow-h">
                    <span class="percent-numb">50</span>
                    <div class="percent-off">
                        <span class="discount-percent">%</span>
                        <span class="discount-off">off</span>
                    </div>
                    <div class="new-offers shop-bg-green rounded-x">
                        <p>new</p>
                        <span>Products</span>
                    </div>    
                </div>    
            </div>
        </div>
    </div>
    <!--=== End Collection Banner ===-->

    <!--=== Sponsors ===-->
    <div class="container content">
        <div class="heading heading-v1 margin-bottom-40">
            <h2>Sponsors</h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed odio elit, ultrices vel cursus sed, placerat ut leo. Phasellus in magna erat. Etiam gravida convallis augue non tincidunt. Nunc lobortis dapibus neque quis lacinia. Nam dapibus tellus sit amet odio venenatis</p>
        </div>

        <ul class="list-inline owl-slider-v2">
            <li class="item first-child">
                <img src="assets/img/clients/07.png" alt="">
            </li>
            <li class="item">
                <img src="assets/img/clients/08.png" alt="">
            </li>
            <li class="item">
                <img src="assets/img/clients/10.png" alt="">
            </li>
            <li class="item">
                <img src="assets/img/clients/11.png" alt="">
            </li>
            <li class="item">
                <img src="assets/img/clients/09.png" alt="">
            </li>
            <li class="item">
                <img src="assets/img/clients/12.png" alt="">
            </li>
            <li class="item">
                <img src="assets/img/clients/07.png" alt="">
            </li>
            <li class="item">
                <img src="assets/img/clients/08.png" alt="">
            </li>
            <li class="item">
                <img src="assets/img/clients/09.png" alt="">
            </li>
            <li class="item">
                <img src="assets/img/clients/10.png" alt="">
            </li>
            <li class="item">
                <img src="assets/img/clients/11.png" alt="">
            </li>
            <li class="item">
                <img src="assets/img/clients/12.png" alt="">
            </li>
        </ul><!--/end owl-carousel-->
    </div>
    <!--=== End Sponsors ===-->

    <!--=== Shop Suvbscribe ===-->
    <div class="shop-subscribe">
        <div class="container">
            <div class="row">
                <div class="col-md-8 md-margin-bottom-20">
                    <h2>subscribe to our weekly <strong>newsletter</strong></h2>
                </div>  
                <div class="col-md-4">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Email your email...">
                        <span class="input-group-btn">
                            <button class="btn" type="button"><i class="fa fa-envelope-o"></i></button>
                        </span>
                    </div>    
                </div>
            </div>
        </div><!--/end container-->
    </div>
    <!--=== End Shop Suvbscribe ===-->

    <!--=== Footer v4 ===-->
    <div class="footer-v4">
        <div class="footer">
            <div class="container">
                <div class="row">
                    <!-- About -->
                    <div class="col-md-4 md-margin-bottom-40">
                        <a href="index.html"><img class="footer-logo" src="assets/img/logo-2.png" alt=""></a>
                        <p>About Unify dolor sit amet, consectetur adipiscing elit. Maecenas eget nisl id libero tincidunt sodales.</p>
                        <br>
                        <ul class="list-unstyled address-list margin-bottom-20">
                            <li><i class="fa fa-angle-right"></i>California, US, Lorem Lis Street, Orange, 25</li>
                            <li><i class="fa fa-angle-right"></i>Phone: 800 123 3456</li>
                            <li><i class="fa fa-angle-right"></i>Fax: 800 123 3456</li>
                            <li><i class="fa fa-angle-right"></i>Email: info@anybiz.co</li>
                        </ul>

                        <ul class="list-inline shop-social">
                            <li><a href="#"><i class="fb rounded-md fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="tw rounded-md fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="gp rounded-md fa fa-google-plus"></i></a></li>
                            <li><a href="#"><i class="yt rounded-md fa fa-youtube"></i></a></li>
                        </ul>
                    </div>
                    <!-- End About -->                    

                    <!-- Simple List -->
                    <div class="col-md-2 col-sm-3">
                        <div class="row">
                            <div class="col-sm-12 col-xs-6">
                                <h2 class="thumb-headline">Secciones</h2>
                                <ul class="list-unstyled simple-list margin-bottom-20">
                                    <li><a href="#">Ultima Hora</a></li>
                                    <li><a href="#">Exclusiva</a></li>
                                    <li><a href="#">Documentos </a></li>
                                    <li><a href="#">Francisco papa</a></li>
                                    <li>...</li>
                                </ul>
                            </div>    

                            <div class="col-sm-12 col-xs-6">
                                <h2 class="thumb-headline">Temas</h2>
                                <ul class="list-unstyled simple-list">
                                    <li><a href="#">Ultima Hora</a></li>
                                    <li><a href="#">Exclusiva</a></li>
                                    <li><a href="#">Documentos </a></li>
                                    <li><a href="#">Francisco papa</a></li>
                                    <li>...</li>
                                </ul>
                            </div>
                        </div>
                    </div>    

                    <div class="col-md-2 col-sm-3">
                        <div class="row">
                            <div class="col-sm-12 col-xs-6">
                                <h2 class="thumb-headline">Utilidades</h2>
                                <ul class="list-unstyled simple-list margin-bottom-20">
                                    <li><a href="#">Ultima Hora</a></li>
                                    <li><a href="#">Exclusiva</a></li>
                                    <li><a href="#">Documentos </a></li>
                                    <li>...</li>
                                </ul>
                            </div>    

                            <div class="col-sm-12 col-xs-6">
                                <h2 class="thumb-headline">Documentos</h2>
                                <ul class="list-unstyled simple-list">
                                    <li><a href="#">Ultima Hora</a></li>
                                    <li><a href="#">Exclusiva</a></li>
                                    <li><a href="#">Documentos </a></li>
                                    <li><a href="#">Francisco papa</a></li>
                                    <li>...</li>
                                </ul>
                            </div>
                        </div>        
                    </div>

                    <div class="col-md-2 col-sm-3">
                        <div class="row">
                            <div class="col-sm-12 col-xs-6">
                                <h2 class="thumb-headline">Publicidad</h2>
                                <ul class="list-unstyled simple-list margin-bottom-20">
                                    <li><a href="#">Ultima Hora</a></li>
                                    <li><a href="#">Exclusiva</a></li>
                                    <li><a href="#">Documentos </a></li>
                                    <li><a href="#">Francisco papa</a></li>
                                    <li>...</li>
                                </ul>
                            </div>    

                            <div class="col-sm-12 col-xs-6">
                                <h2 class="thumb-headline">Contacto</h2>
                                <ul class="list-unstyled simple-list">
                                    <li><a href="#">Ultima Hora</a></li>
                                    <li><a href="#">Exclusiva</a></li>
                                    <li><a href="#">Documentos </a></li>
                                    <li><a href="#">Francisco papa</a></li>
                                    <li>...</li>
                                </ul>
                            </div>
                        </div>        
                    </div>

                    <div class="col-md-2 col-sm-3">
                        <div class="row">
                            <div class="col-sm-12 col-xs-6">
                                <h2 class="thumb-headline">Utilidades</h2>
                                <ul class="list-unstyled simple-list margin-bottom-20">
                                    <li><a href="#">Ultima Hora</a></li>
                                    <li><a href="#">Exclusiva</a></li>
                                    <li>...</li>
                                </ul>
                            </div>
                                
                            <div class="col-sm-12 col-xs-6">
                                <h2 class="thumb-headline">Documentos</h2>
                                <ul class="list-unstyled simple-list">
                                    <li><a href="#">Ultima Hora</a></li>
                                    <li><a href="#">Exclusiva</a></li>
                                    <li>...</li>
                                </ul>
                            </div>
                        </div>        
                    </div>
                    <!-- End Simple List -->
                </div><!--/end row-->
            </div><!--/end continer-->
        </div><!--/footer-->

        <div class="copyright">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">                     
                        <p>
                            2014 &copy; Unify. ALL Rights Reserved. 
                            <a target="_blank" href="https://twitter.com/htmlstream">Htmlstream</a> | <a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a>
                        </p>
                    </div>
                    <div class="col-md-6">  
                        <ul class="list-inline sponsors-icons pull-right">
                            <li><i class="fa fa-cc-paypal"></i></li>
                            <li><i class="fa fa-cc-visa"></i></li>
                            <li><i class="fa fa-cc-mastercard"></i></li>
                            <li><i class="fa fa-cc-discover"></i></li>
                        </ul>
                    </div>
                </div>
            </div> 
        </div><!--/copyright--> 
    </div>
    <!--=== End Footer v4 ===-->
</div><!--/wrapper-->

<!-- JS Global Compulsory -->
<script src="assets/plugins/jquery/jquery.min.js"></script>
<script src="assets/plugins/jquery/jquery-migrate.min.js"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
<!-- JS Implementing Plugins -->
<script src="assets/plugins/back-to-top.js"></script>
<script src="assets/plugins/smoothScroll.js"></script>
<script src="assets/plugins/jquery.parallax.js"></script>
<script src="assets/plugins/owl-carousel/owl-carousel/owl.carousel.js"></script>
<script src="assets/plugins/scrollbar/js/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="assets/plugins/revolution-slider/rs-plugin/js/jquery.themepunch.tools.min.js"></script>
<script src="assets/plugins/revolution-slider/rs-plugin/js/jquery.themepunch.revolution.min.js"></script>
<!-- JS Customization -->
<script src="assets/js/custom.js"></script>
<!-- JS Page Level -->
<script src="assets/js/shop.app.js"></script>
<script src="assets/js/plugins/owl-carousel.js"></script>
<script src="assets/js/plugins/revolution-slider.js"></script>
<script>
    jQuery(document).ready(function() {
        App.init();
        App.initScrollBar();
        App.initParallaxBg();
        OwlCarousel.initOwlCarousel();
        RevolutionSlider.initRSfullWidth();
});
</script>
<!--[if lt IE 9]>
    <script src="assets/plugins/respond.js"></script>
    <script src="assets/plugins/html5shiv.js"></script>
    <script src="assets/js/plugins/placeholder-IE-fixes.js"></script>
<![endif]-->

</body>
</html>