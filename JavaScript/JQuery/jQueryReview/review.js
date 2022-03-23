/*
$(document).ready(
    function(){

    }
)

//DEFAULT DOCUCMENT READY COPY-PASTABLE
*/
//Test for all variable types making sure that they match the requirements
//Validation Scripts
/*$(document).ready(
    function(){
        $("ValidateButton").click(function(){
           var validCheck = $("#ValidationForm").validate();
           alert(validCheck.element("#ValidationProof"));
           alert(validCheck);
        })
    }
)*/

//Add – remove classes
$(document).ready(
    function(){
        $("#ClassTestButton").click(function(){ //Activiates on clicking of the button with the id of ClassTestButton
            $("#ClassTest").toggleClass('class1'); //Toggles class1 either on or off onto the ID of #ClassTest
        })
    }
)
$(document).ready(
    function(){
        $("#ClassTestButton2").click(function(){ //Activiates on clicking of the button with the id of ClassTestButton
            $("#ClassTest").removeClass('class1'); //Toggles class1 either on or off onto the ID of #ClassTest
        })
    }
)
$(document).ready(
    function(){
        $("#ClassTestButton3").click(function(){ //Activiates on clicking of the button with the id of ClassTestButton
            $("#ClassTest").addClass('class1'); //Toggles class1 either on or off onto the ID of #ClassTest
        })
    }
)
//More/Less, hide/show

$(document).ready(
    function(){
        $("#ShowText").click(function(){ //Links to the Button with teh id of #ShowText
            $("#Show_Hide").show(); //Shows text with the ID of Show_Hide
        })
        $("#HideText").click(function(){ //Links to the button of the id of #HideText
            $("#Show_Hide").hide(); //Hides text with the ID of Show_Hide
        })
    }
)

$(document).ready(
    function(){
        $("#SlideU").click(function(){
            $("#Slides").slideUp(500);
        })
        $("#SlideD").click(function(){
            $("#Slides").slideDown(500);
        })
    }
)

//On page load accomplish something.

$(window).on('load',
    function(){
        alert("Window Has Loaded") //This waits for *ALL* Graphics and webpage componets to load in
    }
)


//Utilizing specific keys to accomplish at least one task
$(document).ready(
    function(){
        $( "body" ).keydown(function( event ) {
            if ( event.which == 65 /*65 is the number for the A key on the keybaord*/ ) {
             alert("It works!")
            }
        })
    }
)

//Alter text with the mouse over, mouse up and/or down


$(document).ready(function(){
        $("#MouseOvering").hover(function(){ //Hover does both MouseOver things
            $("#MouseOvering").css({
                "color": "goldenRod"
            })
        }, //Has two functions, one for entering and onen for exitinig
        function(){
            $("#MouseOvering").css({
                "color": "paleGoldenRod"
            })
        });
    }
)

$(document).ready(
    function(){ //When you releas the mouse button
        $("#MouseUp").mouseup(function(){
            alert("Mouse Up Over Mouse Range!");
        })
    }
)
$(document).ready(
    function(){ //When you first press on something
        $("#MouseDown").mousedown(function(){
            alert("Mouse Down Over Mouse Range!");
        })
    }
)
//Alter text size, ask the user for a specific text size and color, then apply those variaables
$(document).ready(function(){
    $("#CSSButton").click(function(){
        $("#CSSChange").css({
           //"color": document.getElementById("#CSSColors").value,
            //"font-size": document.getElementById("#CSSSize").value
            "color": $("#CSSColors").val(), //Pulls the value from the ID and puts into the CSS Spot
            "font-size": $("#CSSSize").val()
        })
    })
})


//Use <p>or<div> to display use of .css to change color, font background color etc. do this to at least three areas. Indicate that you know how to accomplish this in several ways, ie. Mouse over, out click etc.

//Fading in and out with speed control

$(document).ready(function(){
    $("#appearingImage").animate(
        {
            width: '250',
            height: '125'
        }
    )
    $("#imageButton").click(function(){
        $("#appearingImage").fadeToggle()
    })
})
/*
$("#imageID").animate(
                {
                    width: '416',
                    height: '492',
                    opacity: '1',
                    left: '550px'
                }
            )
        })
*/
//Insert and alter the opacity of an imagejqu

$(document).ready(function(){
    $("#opacityButton").click(function(){
        $("#appearingImage").animate(
            {
                opacity: "-=.15"
            }
        )
    })
})

//Placing user input into variables and using the variable
$(document).ready(function(){
    $("#userSubmit").click(function(){
        var input = document.getElementById("userInput").value;
        alert("Your message is: " + input)
    })
})
//Display output to the user in at least three different ways
//Done

//Display properties of nested objects

//Add DOM object, make, a DOM object disappear, make a DOM object move to a different location.

//Add values to a <ul>, copy a <ul><li> to a different <ul> and add as first and last child
$(document).ready(function(){
    
})
//Back to top, any way that you want.
//Done
//Extra Credit:
/*
EC:

                Create a timed slide show with at least three images

                Use an image to create a thumbnail situation

               Insert a sound file with a control that you have coded
  */             