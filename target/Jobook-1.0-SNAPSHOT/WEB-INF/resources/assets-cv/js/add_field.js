


$(document).ready(function() {
    var max_fields      = 10;
    var wrapper         = $(".dates");
    var add_button      = $(".add_more");
    var wrapperWork     = $(".work");
    var add_button_work = $(".add_more_work");

    var x = 1;
    var y = 1;
    $(add_button).click(function(e){
        e.preventDefault();
        if(x < max_fields){
            x++;
            $(wrapper).append('<div><span><input type="date" name="dateFrom[' +x+']" placeholder="from"><input type="date" name="dateTo[' +x+ ']" placeholder="to"><br><input type="text" name="school['+x+']" placeholder="Where?"> <input type="text" name="major[' +x +']" placeholder="What did you study?"><br></span></div></br>\n'); //add input box
        }
    });


     $(add_button_work).click(function(e){
        e.preventDefault();
        if(y < max_fields){
            y++;
            $(wrapperWork).append('<div>\n' +
                '              <span>\n' +
                '                  <label>From\n' +
                '                    <input type = "date" name = "dateExpFrom['+ y +']" placeholder = \'from\'>\n' +
                '                  </label>\n' +
                '                  <label>To\n' +
                '                    <input type = "date" name = "dateExpTo['+ y +']" placeholder = \'to\' >\n' +
                '                  </label>\n' +
                '    \n' +
                '                  <input type = "text" name = "city['+ y +']" placeholder = \'Where?\'>\n' +
                '                </span>\n' +
                '              <br>\n' +
                '                <input type = "text" name="position['+ y +']" placeholder = "You\'ve worked as..."/>\n' +
                '                <input type = "text" name="place['+ y +']" placeholder = "Where have you worked?"/>\n' +
                '                <textarea rows = "5" name = "describeJob['+ y +']" placeholder="What did you do there?"></textarea>\n' +
                '        </div>');
        }
    });



    $(wrapper).on("click",".remove_field", function(e){
        e.preventDefault(); $(this).parent('span').remove(); x--;
    }
    )
}
)
;