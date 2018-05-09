<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Void Function
  Date: 6.5.2018 г.
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en-US">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>CV</title>
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href="../../resources/assets-cv/css/aos.css" rel="stylesheet">
    <link href="../../resources/assets-cv/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../resources/assets-cv/css/styles/main.css" rel="stylesheet">
</head>
<body id="top">

<c:set var="cv" value="${cv}"/>
<header>
    <div class="profile-page sidebar-collapse">
        <nav class="navbar navbar-expand-lg fixed-top navbar-transparent bg-primary" color-on-scroll="400">
            <div class="container">
                <div class="navbar-translate"><a class="navbar-brand" href="/" rel="tooltip">JOBOOK</a>
                    <button class="navbar-toggler navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-bar bar1"></span><span class="navbar-toggler-bar bar2"></span><span class="navbar-toggler-bar bar3"></span></button>
                </div>
                <div class="collapse navbar-collapse justify-content-end" id="navigation">
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link smooth-scroll" href="#about">About</a></li>
                        <li class="nav-item"><a class="nav-link smooth-scroll" href="#skill">Skills</a></li>
                        <li class="nav-item"><a class="nav-link smooth-scroll" href="#experience">Experience</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
</header>



<div class="page-content">
    <div>
        <div class="profile-page">
            <div class="wrapper">
                <div class="page-header page-header-small" filter-color="green">
                    <div class="page-header-image" data-parallax="true" style="background-image: url('../../resources/assets-cv/images/background.jpg');"></div>
                    <div class="container">
                        <div class="content-center">
                            <div class="cc-profile-image"><a href="#"><img src="data:image/jpeg;base64,${cv.img}" alt="${cv.firstName}"/></a></div>
                            <div class="h2 title">${cv.firstName} ${cv.lastName}</div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
        <div class="section" id="about">
            <div class="container">
                <div class="card" data-aos="fade-up" data-aos-offset="10">
                    <div class="row">
                        <div class="col-lg-6 col-md-12">
                            <div class="card-body">
                                <div class="h4 mt-0 title">About</div>
                                <p>${cv.objective}</p>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-12">
                            <div class="card-body">
                                <div class="h4 mt-0 title">Basic Information</div>
                                <div class="row">
                                    <div class="col-sm-4"><strong class="text-uppercase">Age:</strong></div>
                                    <div class="col-sm-8">${cv.age}</div>
                                </div>
                                <div class="row mt-3">
                                    <div class="col-sm-4"><strong class="text-uppercase">Email:</strong></div>
                                    <div class="col-sm-8">N/A</div>
                                </div>
                                <div class="row mt-3">
                                    <div class="col-sm-4"><strong class="text-uppercase">Phone:</strong></div>
                                    <div class="col-sm-8">${cv.number}</div>
                                </div>
                                <div class="row mt-3">
                                    <div class="col-sm-4"><strong class="text-uppercase">Address:</strong></div>
                                    <div class="col-sm-8">${cv.address}</div>
                                </div>
                                <div class="row mt-3">
                                    <div class="col-sm-4"><strong class="text-uppercase">Language:</strong></div>
                                    <div class="col-sm-8">${cv.languages}</div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="section" id="skill">
            <div class="container">
                <div class="h4 text-center mb-4 title">Professional Skills</div>
                <div class="card" data-aos="fade-up" data-aos-anchor-placement="top-bottom">
                    <div class="card-body">
                  <c:forEach var="skill" items="${cv.skills}">
                              <div class="col-md-12">
                                  <div class="progress-container progress-primary"><span class="progress-badge">${skill}</span>
                                      <div class="progress">
                                          <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10" data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 100%;"></div><span class="progress-value">100%</span>
                                      </div>
                                  </div>
                              </div>
                  </c:forEach>

                    <c:forEach var="skill" items="${cv.softSkills}">
                                <div class="col-md-12">
                                    <div class="progress-container progress-primary"><span class="progress-badge">${skill}</span>
                                        <div class="progress">
                                            <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10" data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 100%;"></div><span class="progress-value">100%</span>
                                        </div>
                                    </div>
                                </div>


                    </c:forEach>
                    </div>

                </div>
            </div>
        </div>
        <div class="section" id="experience">
            <div class="container cc-experience">
                <div class="h4 text-center mb-4 title">Work Experience</div>
                <div class="card">
                    <div class="row">
                        <div class="col-md-3 bg-primary" data-aos="fade-right" data-aos-offset="50" data-aos-duration="500">
                            <div class="card-body cc-experience-header">
                                <p>${cv.dateExpFrom[0]} - ${cv.dateExpTo[0]}</p>
                                <div class="h5">${cv.place[0]}</div>
                            </div>
                        </div>
                        <div class="col-md-9" data-aos="fade-left" data-aos-offset="50" data-aos-duration="500">
                            <div class="card-body">
                                <div class="h5">${cv.position[0]}</div>
                                <p>${cv.describeJob[0]}</p>
                            </div>
                        </div>
                    </div>
                </div>
        </div>
        <div class="section">
            <div class="container cc-education">
                <div class="h4 text-center mb-4 title">Education</div>


                <div class="card">
                    <div class="row">
                        <div class="col-md-3 bg-primary" data-aos="fade-right" data-aos-offset="50" data-aos-duration="500">
                            <div class="card-body cc-education-header">
                                <p>${cv.dateFrom[0]} - ${cv.dateTo[0]}</p>
                                <div class="h5">Master's Degree</div>
                            </div>
                        </div>
                        <div class="col-md-9" data-aos="fade-left" data-aos-offset="50" data-aos-duration="500">
                            <div class="card-body">
                                <div class="h5">${cv.major[0]}</div>
                                <p class="category">${cv.school[0]}</p>
                                <p>Euismod massa scelerisque suspendisse fermentum habitant vitae ullamcorper magna quam iaculis, tristique sapien taciti mollis interdum sagittis libero nunc inceptos tellus, hendrerit vel eleifend primis lectus quisque cubilia sed mauris. Lacinia porta vestibulum diam integer quisque eros pulvinar curae, curabitur feugiat arcu vivamus parturient aliquet laoreet at, eu etiam pretium molestie ultricies sollicitudin dui.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
</div>
    <script src="../../resources/assets-cv/js/core/jquery.3.2.1.min.js"></script>
    <script src="../../resources/assets-cv/js/core/popper.min.js"></script>
    <script src="../../resources/assets-cv/js/core/bootstrap.min.js"></script>
    <script src="../../resources/assets-cv/js/now-ui-kit.js?v=1.1.0"></script>
    <script src="../../resources/assets-cv/js/aos.js"></script>
    <script src="../../resources/assets-cv/scripts/main.js"></script>

</body>
</html>
