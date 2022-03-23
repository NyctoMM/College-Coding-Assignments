$(document).ready(
    //Everything will be wrapped in *1* Document.Ready Tag, making this much easier to read
    /*
    ***SO, THIS CAN ONLY HAPPEN IF YOU WRAP EVERYTHING IN THE SAME FUNCITON TAG AS WELL, WHICH FEELS UNNECESSARY***
    */
    //Div 1 and 2
    function(){
        $("#div1").click(function(){
            $(this).hide();
        });
        $("#div2").click(function(){
            $("#div1").show();
        });
    //Toggle Button
        $("#divToggle").click(function(){
            $("#div1").toggle();
        });
    //Toggle Class
        $("#divClass").click(function(){
            $("#div1").toggleClass('action');
            $("#div1").removeAttr('id');
        });
    }
);


    //Sliding Div Function
$(document).ready(
    function(){
    $("#extra").hide();
    $("#divMore").click(function(){
        $("#extra").slideDown(750); //Slow Slide Down
    });
    $("#divLess").click(function(){
        $("#extra").slideUp(125); //Fast Slide Up
    });
    }
);

$(document).ready(
    function(){
        //Regular Left and Right
        $("#imageRight").click(function(){
            $("#imageID").animate({left: '-=100px'}); //To go right, subtract from the left
        });
        $("#imageLeft").click(function(){
            $("#imageID").animate({left: '+=100px'});
        });
        //"Experimental Button"
        $("#imageEx").click(function(){
            $("#imageID").animate(
                {
                    opacity: '0.5'
                }
            );
        });
        //Resets the Image
        $("#imageReset").click(function(){
            $("#imageID").animate(
                {
                    width: '416',
                    height: '492',
                    opacity: '1',
                    left: '550px'
                }
            )
        })
        $("#imageStop").click(function(){
            $("#imageID").stop(true, true);
        });
    }
);