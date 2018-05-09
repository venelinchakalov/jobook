<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Void Function
  Date: 6.5.2018 г.
  Time: 2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Talent Market</title>
    <link rel="stylesheet" href="../../resources/assets-talent-market/talent.css">
</head>
<body>




    <div class="wrapper">
        <div class="topnav">
        <form method="get">

            <input type="text" placeholder="What do you want from a candidate? eg. Java, Python, Team Leader etc..." name="criteria">
            <input type="submit" value="Search..">
        </form>
        </div>
        <div class="cols">
            <c:forEach var="cv" items="${cvList}">

                <div class="col" ontouchstart="this.classList.toggle('hover');">
                    <a href="/showcv/${cv.ID}">
                        <div class="container">
                    <div class="front" style="background-image: url(data:image/jpeg;base64,${cv.img})">
                        <div class="inner">
                            <p>${cv.firstName} ${cv.lastName}</p>
                            <span>${cv.desiredPosition}</span>
                        </div>
                    </div>
                    <div class="back">
                        <div class="inner">
                            <p>Technology stack: </p>
                            <c:forEach var="skill" items="${cv.skills}">
                                ${skill}
                            </c:forEach>
                        </div>
                    </div>
                    </div>
                    </a>
            </div>

            </c:forEach>
        </div>
    </div>


</body>
</html>
