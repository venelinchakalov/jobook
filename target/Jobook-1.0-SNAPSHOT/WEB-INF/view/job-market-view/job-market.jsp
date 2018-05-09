<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Job Form</title>
    <link rel="stylesheet" href="../../resources/assets-talent-market/talent.css">
</head>
<body>

<div class="wrapper">
    <div class="topnav">
        <form method="get">

            <input type="text" placeholder="What do you want from a company? eg. Java, Python, Salary, Insurance etc..." name="criteria">
            <input type="submit" value="Search..">
        </form>
    </div>
    <div class="cols">
        <c:forEach var="job" items="${job}">

            <div class="col" ontouchstart="this.classList.toggle('hover');">
                <a href="/showjob/${job.ID}">
                    <div class="container">
                    <div class="front" style="background-image: url(data:image/jpeg;base64,${job.img})">
                        <div class="inner">
                            <p>${job.companyName} is looking for :</p>
                            <span>${job.position}</span>
                        </div>
                    </div>

                    <div class="back">
                        <div class="inner">
                            <p>Technology stack: </p>
                            <c:forEach items="${job.criteria.technologies}" var="skill">
                                ${skill}
                            </c:forEach>

                            <p>Salary: </p>
                             <p>${job.benefits.payment}</p>
                        </div>
                    </div>
                </div>
                </a>
            </div>

        </c:forEach>
    </div>

</body>
</html>
