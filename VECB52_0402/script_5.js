$(document).ready(function(){
    $("#animacio_kezd").click(function(){
        $("#szoveg").animate({
            left: '+=300',
            width: '300px',
            fontSize: '30pt'
        }, 'slow')
        .animate({
            top: '+=100',
            width: '-=100',
            height: '+=10%'
        }, 'slow')
        .animate({
            left: '300px',
            opacity: '0.4'
        }, 'slow')
        .animate({
            left: '+=300',
            width: '300px',
            fontSize: '12pt',
            opacity: '1'
        }, 'slow', function() {
            alert("VÉGE");
        });
    });

    $("#Bekezdes_elrejtes").click(function(){
        $("p").hide();
        $("#szoveg").animate({
            left: '0',
            top: '0'
        }, 'slow', function() {
            alert("Bekezdések elrejtése");
        });
    });

    var isOpen = false;

    $("#osszecsuk_kinyit").click(function(){
        if (!isOpen) {
            $("#szoveg").animate({
                left: '+=300'
            }, 'slow', function() {
                isOpen = true;
                alert("Doboz elnyújtva jobboldalra.");
            });
        } else {
            $("#szoveg").animate({
                left: '0'
            }, 'slow', function() {
                isOpen = false;
                alert("Doboz visszazárva.");
            });
        }
    });

});
