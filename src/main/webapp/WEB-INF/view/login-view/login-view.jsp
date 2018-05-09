

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){ window.scrollTo(0,1); } </script>

    <link href="../../resources/assets-register/css/style.css" rel="stylesheet" type="text/css" media="all">
    <link href="../../resources/assets-register/css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all">

    <link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'><link href='//fonts.googleapis.com/css?family=Raleway+Dots' rel='stylesheet' type='text/css'>
</head>
<body>


<div class="main-agileits">
    <h2 class="sub-head">Sign In</h2>
    <div class="sub-main">
        <form method="post">
            <input placeholder="Email" name="username" class="mail" type="text" required="">
            <input  placeholder="Password" name="password" class="pass" type="password" required="">
            <input type="submit" value="Sign In">
            <button class="btn" onclick="window.location.href='/register'">Sign Up</button>


        </form>
    </div>
    <div class="clear"></div>
</div>

</body>
</html>
