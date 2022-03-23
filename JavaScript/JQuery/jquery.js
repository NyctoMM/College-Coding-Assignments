//This Document.ready function 
$(document).ready(
    function(){
        $("#div1").click(
            function(){
              $(this).hide();
            }
        );
        $("#div2").click(
            function(){
              $("#div1").show();
            }
        );
    }
);

$(document).ready(function(){
    $("#divToggle").click(function(){
        $("#div1").toggle();
    });
});

$(document).ready(function(){
    $("#extra").hide();
    $("#divMore").click(function(){
        $("#extra").slideDown(750);
    });
    $("#divLess").click(function(){
        $("#extra").slideUp(125);
    })
});

$(document).ready(function(){
    $("#imageRight").click(function(){
        $("#imageID").animate({right: '10px'});
    });
    $("#imageLeft").click(function(){
        $("#imageID").animate({left: '10px'});
    })
});

$(document).ready(function(){
    $("#imageEx").click(function(){
        $("#imageID").animate(
            {
               left: '125px',
               opacity: '0.75',
               width:  '+=25'
            }
        );
    });
});
