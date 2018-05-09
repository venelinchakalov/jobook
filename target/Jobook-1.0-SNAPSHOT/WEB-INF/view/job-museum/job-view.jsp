<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: voidfn
  Date: 21.04.18
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Resume</title>
    <link type="text/css" rel="stylesheet" href="../../resources/assets-cv-museum/css/blue.css" />
    <link type="text/css" rel="stylesheet" href="../../resources/assets-cv-museum/css/print.css" media="print"/>
    <!--[if IE 7]>
    <link href="../../resources/assets-cv-museum/css/ie7.css" rel="stylesheet" type="text/css" />
    <![endif]-->
    <!--[if IE 6]>
    <link href="../../resources/assets-cv-museum/css/ie6.css" rel="stylesheet" type="text/css" />
    <![endif]-->

</head>
<body>
<!-- Begin Wrapper -->

    <c:set var="job" value="${job}"/>
<a  href="/">
    <img src="../../resources/assets-cv-museum/images/arrow.svg"  width="400" height="100" >
</a>
<div id="wrapper">
    <div class="wrapper-top"></div>

    <div class="wrapper-mid">
        <div id="paper">
            <div class="paper-top"></div>
            <div id="paper-mid">
                <div class="entry">
                    <img class="portrait" src="data:image/jpeg;base64,${job.img}"  />

                    <div class="self">
                        <h1 class="name">${job.companyName} <br><br>is looking for

                            <br><br><br>
                            <span>${job.position}</span>
                        </h1>
                        <ul>
                            <li class="ad">${user.mail}</li>
                            <li class="tel">${user.number}</li>

                        </ul>
                    </div>

                </div>
                <div class="entry">
                    <h2>Company Description</h2>
                    <p>${job.description}</p>
                </div>

                <div class="entry">
                    <h2>Requirements: </h2>
                        <div class="content">
                            <h3>Education </h3>
                                <p>${job.criteria.education}
                            <br>
                        </div>
                </div>


                <div class="entry">
                    <h2>EXPERIENCE</h2>
                    <div class="content">
                        <h3>Required years of experience</h3>
                        <p>Desired experience <br />
                            <em></em></p>
                        <ul class="info">
                            <li>${job.criteria.experience} years </li>
                        </ul>
                    </div>

                </div>


                <div class="entry">
                    <h2>SKILLS</h2>
                    <div class="content">
                        <h3>Software Knowledge</h3>
                        <ul class="skills">
                    <c:choose>
                        <c:when test="${job.criteria.technologies!=null}">
                            <c:forEach var="skill" items="${job.criteria.technologies}">
                                        <li>${skill}</li>
                            </c:forEach>
                        </c:when>
                            </c:choose>
                        </ul>
                    </div>
                    <div class="content">
                        <h3>Soft Skills</h3>
                        <ul class="skills">
                            <c:forEach var="softskill" items="${job.criteria.softSkills}">
                                <li>${softskill}</li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>

                <div class="entry">
                    <h2>Benefits</h2>
                    <div class="content">
                        <h3>Salary</h3>
                        <p>${job.benefits.payment} <br />
                            <em></em></p>
                    </div>

                    <div class="content">
                        <h3>Insurance</h3>
                        <p>${job.benefits.insurance} <br />
                            <em></em></p>
                    </div>

                    <div class="content">
                        <h3>Office Location</h3>
                        <p>${job.benefits.officeLocation} <br />
                            <em></em></p>
                    </div>

                </div>
            </div>
            <div class="clear"></div>
            <div class="paper-bottom"></div>
        </div>
    </div>
    <div class="wrapper-bottom"></div>
</div>

    <script href="../../resources/assets-cv/js/index.js"></script>
</body>
</html>

