$(document).ready(function(){
    $("#animacio_kezd").click(function(){
        $("#szoveg").animate({
            left: '+=300',
            width: '300px',
            marginLeft: '200px',
            fontSize: '30pt'
        }, 1000)
        .animate({
            top: '+=100',
            width: '-=100',
            marginTop: '100px',
            height: '+=10%'
        }, 2000)
        .animate({
            left: '+=300',
            opacity: '0.4',
            marginLeft: '0px'
        }, 1000)
        .animate({
            left: '0',
            width: '150px',
            height: '50px',
            marginTop: '0px',
            fontSize: '12pt',
            opacity: '1'
        }, 2000, function() {
            alert("VÉGE");
        });
    });
    
    

    $("#Bekezdes_elrejtes").click(function(){
        $("p").animate({
            height: 0,
            paddingTop: 0,
            paddingBottom: 0,
            marginTop: 0,
            marginBottom: 0
        }, 'slow', function() {
            $(this).hide();
            $("#szoveg").animate({
                left: '0',
                top: '0'
            }, 'slow', function() {
                alert("Bekezdések elrejtése");
            });
        });
    });
    
    let isOpen = false;

    $("#osszecsuk_kinyit").click(function(){
        $("#szoveg").slideUp(2000, function() {
            $(this).slideDown(2000, function() {
                if (!isOpen) {
                    $(this).animate({
                        width: '+=100',
                        marginLeft: '+=300'
                    }, 2000, function() {
                        isOpen = true;
                    });
                } else {
                    $(this).animate({
                        left: '0',
                        width: '150px',
                        height: '50px',
                        marginLeft: '0px',
                        fontSize: '12pt',
                        opacity: '1'
                    }, 2000, function() {
                        isOpen = false;
                    });
                }
            });
        });
    });    
});
