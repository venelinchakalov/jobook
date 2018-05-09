<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Create your CV</title>
  
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">

  
      <link rel="stylesheet" href="../../resources/assets-cv/css/style.css">

  
</head>

<body>

  <form id="msform" method="post" enctype="multipart/form-data">
      <ul id="progressbar">
           <li class="active">INFO</li>
           <li>	OBJECTIVE</li>
           <li>EDUCATION</li>
        <li>EXPERIENCE</>
        <li>SKILLS</>
        <li>IMAGE</>
      </ul>
      
      <fieldset>
        <h2 class="fs-title">PERSONAL INFORMATION</h2>
        <h3 class="fs-subtitle">Enter your details</h3>
        <input type="text" name="firstName" min="2" max="30" placeholder="First Name "/>
        <input type="text" name="lastName" min="2" max="30" placeholder="Last Name "/>
        <input type="text" name="address" min="1" max="50" placeholder="Address "/>
        <input type="text" name="languages" min="1" max="50" placeholder="Languages "/>
        <input type="text" name="desiredPosition" min="1" max="50" placeholder="Desired Position "/>
        <input type="text" name="number" min="2" max="30" placeholder="Mobile Number "/>
        <input type="text" name="age"  max="50" placeholder="Age">
        <input type="button" name="next" class="next action-button" value="Next" />
    
      </fieldset>
      
      <fieldset>
        <h2 class="fs-title">YOUR MOTIVATION</h2>
        <h3 class="fs-subtitle">What wakes you up in the morning? </h3>
        
        <textarea rows="6" name = "objective" placeholder = "Objective.."> </textarea>
      </br>
        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
      </fieldset>
    
      <fieldset>
        <h2 class="fs-title">YOUR EDUCATIONAL JOURNEY</h2>
        <h3 class="fs-subtitle"></h3>
        <div class="dates">
          <span>
            <input type="date" name="dateFrom[0]" placeholder="From">
            <input type="date" name="dateTo[0]" placeholder="To"><br>
            <input type="text" name="school[0]" placeholder="Where?"><br>
            <input type="text" name="major[0]" placeholder="What did you study?">
            <br>
          </span>

        </div>
        </br>
        <input type="button" class="add_more action-button" value="Add More"/>
        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
      </fieldset>
    <fieldset>
        <h2 class="fs-title">EXPERIENCE</h2>
        <h3 class="fs-subtitle"></h3>
        
        <div class="work">
          <div>
              <span>
                  <label>From
                    <input type = "date" name = "dateExpFrom[0]" placeholder = 'from'>
                  </label>
                  <label>To
                    <input type = "date" name = "dateExpTo[0]" placeholder = 'to' >
                  </label>

                  <input type = "text" name = "city[0]" placeholder = 'What city?'>
                </span>
              <br>
                <input type = "text" name="position[0]" placeholder = "You've worked as..."/>
                <input type = "text" name="place[0]" placeholder = "What was the company>"/>
                <textarea rows = "5" name = "describeJob[0]" placeholder="What did you do there?"></textarea>
        </div>

        </div>

        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
      </fieldset>

      <fieldset>
        <h2 class="fs-title">YOUR SKILLSET</h2>
        <h3 class="fs-subtitle"></h3>
        <textarea name="skills" placeholder="What are your software skills - eg.Java, Spring, ASP.Net ? Please separate by comma!"></textarea>
        <textarea name="softSkills" placeholder="What are your soft skills - eg.Leader, Team Player, Hones ? Please separate by comma!"></textarea>

        <input type="button" name="previous" class="previous action-button" value="Previous" />
          <input type="button" name="next" class="next action-button" value="Next" />

      </fieldset>


      <fieldset>
          <h2 class="fs-title">Upload a profile picture</h2>
          <input type="file" name="profilePic" accept="image/jpeg , image/png" />
          <input type="button" name="previous" class="previous action-button" value="Previous" />
          <input type="submit" name="next"  value="GO" style="background: crimson; color: white"  />

      </fieldset>

  </form>


  <script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
  <script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
         


    <script  src="../../resources/assets-cv/js/index.js"></script>
    <script  src="../../resources/assets-cv/js/add_field.js"></script>




</body>

</html>
