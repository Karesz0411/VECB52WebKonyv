$(document).ready(function(){
    $("header").mousemove(function(){
        alert("Az egeret elhúztad a fejlécről!");
    });
    
    /* $("button").mouseover(function(){
        alert("Az egeret felé húztad a gombot!");
    });
    */
    
    $("input").hover(function(){
        $(this).css("border-color", "red");
    }, function(){
        $(this).css("border-color", "initial");
    });
    
    $("input").click(function(){
        $(this).css("background-color", "yellow");
    });

    $("#felso_elrejt").click(function(){
        $('p').hide();
    });

    $("#felso_megjelenit").click(function(){
        $('p').show();
    });

    $("#felso_kibekapcsol").click(function(){
        $('p').toggle();
    });

    $("#attetsz_01").click(function(){
        $("form").css("opacity", "0.1");
    });

    $("#attetsz_05").click(function(){
        $("form").css("opacity", "0.5");
    });

    $("#attetsz_08").click(function(){
        $("form").css("opacity", "0.8");
    });

    $("#also_elrejt").click(function(){
        $("form").hide();
    });

    $("#also_megjelenit").click(function(){
        $("form").show();
    });

    $("#also_kibekapcsol").click(function(){
        $("form").toggle();
    });
});
