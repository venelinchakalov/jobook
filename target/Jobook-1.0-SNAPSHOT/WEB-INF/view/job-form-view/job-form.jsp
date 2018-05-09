<!DOCTYPE html>
<html lang="en" >

<head>
    <meta charset="UTF-8">
    <title>Multi Step Form with Progress Bar using jQuery and CSS3</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">


    <link rel="stylesheet" href="../../resources/assets-cv/css/style.css">


</head>

<body>

<form id="msform" method="post" enctype="multipart/form-data">
    <ul id="progressbar">
        <li class="active">COMPANY NAME</li>
        <li>JOB DESCRIPTION</li>
        <li>REQUIREMENTS</li>
        <li>BENEFITS</li>
        <li>IMAGE</li>
    </ul>

    <fieldset>
        <h2 class="fs-title">COMPANY DETAILS</h2>
        <input type="text" name="companyName" min="2" max="30" placeholder="Company Name "/>
        <textarea rows="6" name = "description" placeholder = "Describe your company"> </textarea>

        <input type="button" name="next" class="next action-button" value="Next" />

    </fieldset>

    <fieldset>
        <h2 class="fs-title">JOB DESCRIPTION</h2>
        <h3 class="fs-subtitle">What are candidates duties? </h3>
        <input type="text"  name="position" placeholder="Desired position... ?"/>
        <textarea rows="6" name = "jobDescription" placeholder = "Describe.."> </textarea>
        </br>
        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
    </fieldset>

    <fieldset>
        <h2 class="fs-title">SET CRITERIA</h2>
        <h3 class="fs-subtitle"></h3>

        <input type="text"  name="experience" placeholder="How many years of experience?"/>
        <input type="text"  name="education" placeholder="What type of education?"/>
        <input type="text"  name="technologies" placeholder="Technologies required. Please separate by comma"/>
        <input type="text"  name="softSkills" placeholder="Soft skills required. Please separate by comma"/>

        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
    </fieldset>
    <fieldset>
        <h2 class="fs-title">BENEFITS</h2>
        <h3 class="fs-subtitle"></h3>


        <input type = "text" name = "payment" placeholder = 'What is the salary?'>
        <input type = "text" name = "officeLocation" placeholder = 'Where is the job located?'>
        <input type = "text" name = "insurance" placeholder = 'What kind of insurance do you offer?'>

        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
    </fieldset>




    <fieldset>
        <h2 class="fs-title">Upload a company  picture</h2>
        <input type="file" name="profilePic" accept="image/jpeg , image/png" />
        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="submit" name="next"  value="GO" style="background: crimson; color: white"  />

    </fieldset>

</form>

<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>


<script  src="../../resources/assets-cv/js/index.js"></script>




</body>

</html>
