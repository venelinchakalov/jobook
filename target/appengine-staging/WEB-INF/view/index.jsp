<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>

    <head>
        <meta charset="utf-8">
        <title>Jobook</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../resources/assets/css/bootstrap.min.css">


        <link rel="stylesheet" href="../resources/assets/css/navmenu.css">
        <link rel="stylesheet" href="../resources/assets/fonts/stylesheet.css">
        <link rel="stylesheet" href="../resources/assets/css/magnific-popup.css">
        <link rel="stylesheet" href="../resources/assets/css/jquery.fancybox.css">
        <link rel="stylesheet" href="../resources/assets/css/font-awesome.min.css">


        <link rel="stylesheet" href="../resources/assets/css/plugins.css" />

        <link rel="stylesheet" href="../resources/assets/css/style.css">

        <link rel="stylesheet" href="../resources/assets/css/responsive.css" />

        <script src="../resources/assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    </head>
    <body data-spy="scroll" data-target=".navbar-collapse">



   <header class="header navbar-fixed-top">
                    <nav class="navbar navbar-inverse">
          <div class="container-fluid">
            <div class="navbar-header">
              <a class="navbar-brand" href="#"><h2 class = "h2class">Jobook</h1></a>
            </div>

            <ul class="nav navbar-nav navbar-right">
                <c:set var="user" value="${username}"/>
                <c:choose>
                    <c:when test="${user!=null}">
                        <li><span>Hello, ${user}</span></li>
                        <li><a href="/logout"><span class="glyphicon glyphicon-log-in"></span> Sign Out</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="<c:url value="/login"/>"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </c:otherwise>
                </c:choose>

            </ul>
          </div>
        </nav>

        </header>

        

        <section id="home" class="home">
            <div class="overlay">
                <div class="container">
                    <div class="div-menu">
                        <header class="cd-header">
                            <a class="cd-menu-trigger" href="#main-nav"><span></span></a>
                        </header>
                    </div>
                    <div class="row">
                        <div class="col-sm-12 ">
                            <div class="main_home_slider text-center">
                                <div class="single_home_slider">
                                    <div class="main_home wow fadeInUp" data-wow-duration="700ms">
                                        <h1>We&#39;ve got the talent</h1>
                                        <div class="whiseparator"></div>
                                        <h1 >You&#39;ve got the job.</p>

                                    </div>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                    
					<a class="mouse-scroll" href="#introduction"> 
						<span class="mouse">
							<span class="mouse-movement"></span>
						</span>
						<span class="mouse-message fadeIn">scroll</span> 
					</a>
					
				</div>
            </div>
        </section>


        <section id="introduction" class="introduction">
            <div class="container">
                <div class="row">
                    <div class="main_introduction sections">
                        <div class="head_title text-center wow fadeInUp" data-wow-duration="700ms">
                            <h2>Introduction</h2>
                            <div class="separator"></div>
                            <p>Jobook is recruiting platform, that helps you source better talents. You just pick the criteria and we'll find you the right person for you.
                            But Jobook thinks that the employees have the right to build their own future. So it's your turn to pick the company that you want to work for.
                            </p>
                        </div>

                    </div>
                </div>
            </div>
        </section>


        <section id="service" class="creativity wow fadeIn">
            <div class="creativity_overlay">
                <div class="container">
                    <div class="row">
                        <div class="main_creativity text-center">
                             
                             <a href="/talentmarket" class="btn btn-larg">I LOOK FOR A TALENT</a>
                             <a href="/jobmarket" class="btn btn-larg">I HAVE THE TALENT</a>
                             <a href="/createcv" class="btn btn-larg">CREATE CV</a>
                             <a href="/createjob" class="btn btn-larg">CREATE JOB OFFER</a>
                       
                        </div>
                        
                    </div>
                </div>
            </div>
        </section>

        <section id="platform" class="portfolio">
            <div class="container">
                <div class="row">
                    <div class="main_mix_content text-center sections">
                        <div class="head_title text-center wow fadeInUp" data-wow-duration="700ms">
                            <h2>OUR TALENTS</h2>
                            <div class="separator"></div>
                        </div>
                        <div class="main_mix_menu">
                            <ul>
                                <li class="filter" data-filter="all">All</li>
                                <li class="filter" data-filter=".cat1">branding</li>
                                <li class="filter" data-filter=".cat2">web design</li>
                                <li class="filter" data-filter=".cat3">mobile ui</li>
                                <li class="filter" data-filter=".cat4">illustrations</li>
                            </ul>
                        </div>

                        <div id="mixcontent" class="mixcontent">
                            <div class="col-sm-4 mix cat1">
                                <div class="single_mixi_portfolio">
                                    <img src="../resources/assets/images/pf1.jpg" alt="" />
                                    <div class="mixi_portfolio_overlay">
                                        <div class="overflow_hover_text">

                                            <div class="separator2"></div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="col-sm-4 mix cat2 ">
                                <div class="single_mixi_portfolio">
                                    <img src="../resources/assets/images/pf2.jpg" alt="" />
                                    <div class="mixi_portfolio_overlay">
                                        <div class="overflow_hover_text">
                                            <div class="separator2"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-4 mix cat1 cat4">
                                <div class="single_mixi_portfolio">
                                    <img src="../resources/assets/images/pf3.jpg" alt="" />
                                    <div class="mixi_portfolio_overlay">
                                        <div class="overflow_hover_text">
                                            <div class="separator2"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-4 mix cat3 cat4 ">
                                <div class="single_mixi_portfolio">
                                    <img src="../resources/assets/images/pf4.jpg" alt="" />
                                    <div class="mixi_portfolio_overlay">
                                        <div class="overflow_hover_text">

                                            <div class="separator2"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-4 mix cat4 ">
                                <div class="single_mixi_portfolio">
                                    <img src="../resources/assets/images/pf5.jpg" alt="" />
                                    <div class="mixi_portfolio_overlay">
                                        <div class="overflow_hover_text">

                                            <div class="separator2"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-4 mix cat1 cat2 ">
                                <div class="single_mixi_portfolio">
                                    <img src="../resources/assets/images/pf6.jpg" alt="" />
                                    <div class="mixi_portfolio_overlay">
                                        <div class="overflow_hover_text">
                                            <div class="separator2"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="portfolio_btn_area">
                                <a href="/talentmarket" class="btn btn-md">Show me more</a>
                            </div>
                            <div class="gap"></div>
                        </div>
                    </div>                     
                </div>
            </div>
        </section>





        <section id="aboutme" class="team">
            <div class="container">
                <div class="row">
                    <div class="main_team sections wow fadeInUp" data-wow-duration="700ms">
                        <div class="head_title text-center">
                            <h2>About Me</h2>
                            <div class="separator"></div>
                            <p>Hello! I am Venko Chakalov and this is my sample project.
                                    I am from Smolyan, Bulgaria. I love technology and music.
                                    Programming is my passion.
                                
                                
                            </p>
                        </div>
                        <div class="col-sm-12 col-sm-offset-3">
                            <div class="row">
                                <div class="main_team_content margin-top-110">  
                                    <div class="single_team">
                                        <div class="col-sm-3 col-xs-6">
                                            <div class="single_item">
                                                <img src="../resources/assets/images/me.png" alt="" />
                                                <div class="single_team_overlay">
                                                    <div class="team_socail">
                                                        <a href=""><i class="fa fa-external-link"></i></a>
                                                    </div>
                                                    <div class="s_t_overlay_text">
                                                        <h4>VENKO</h4>
                                                        <p>CEO & FOUnder</p>
                                                    </div>
                                                </div>
                                            </div> 
                                        </div>
                                     
                                        <div class="col-sm-3 col-xs-6">
                                            <div class="single_item about_apply text-center">
                                                <div class="single_team_right">

                                                    <h4>More about <br />
                                                        ME</h4>
                                                    <div class="separator"></div>
                                                    <a href="/about" class="btn"> Check</a>

                                                </div>
                                            </div> 
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>














        <div class="scrollup">
            <a href="#"><i class="fa fa-chevron-up"></i></a>
        </div>

        <script src="../resources/assets/js/vendor/jquery-1.11.2.min.js"></script>
        <script src="../resources/assets/js/vendor/bootstrap.min.js"></script>

        <script src="../resources/assets/js/jquery.easypiechart.min.js"></script>
        <script src="../resources/assets/js/jquery.mixitup.min.js"></script>
        <script src="../resources/assets/js/jquery.easing.1.3.js"></script>
        <script src="../resources/assets/js/jquery.magnific-popup.js"></script>
        <script src="../resources/assets/js/jquery.fancybox.pack.js"></script>




        <script src="../resources/assets/js/plugins.js"></script>
        <script src="../resources/assets/js/main.js"></script>

    </body>
</html>
