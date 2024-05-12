function playOrPause() {
    let my_video = document.getElementById("my_video");
    if (my_video.paused) {
        my_video.play();
    }
    else {
        my_video.pause();
    }
}

function makeItBig() {
    let my_video = document.getElementById("my_video");
    my_video.style.width = "1000px";
    my_video.style.height = "auto";
}

function makeItSmall() {
    let my_video = document.getElementById("my_video");
    my_video.style.width = "600px";
    my_video.style.height = "auto";
}

function makeItNormal() {
    let my_video = document.getElementById("my_video");
    my_video.style.width = "800px";
    my_video.style.height = "auto";
}

function volumeUp() {
    let my_video = document.getElementById("my_video");
    my_video.volume += 0.1;
}

function volumeDown() {
    let my_video = document.getElementById("my_video");
    my_video.volume -= 0.1;
}

function speedUp() {
    let my_video = document.getElementById("my_video");
    my_video.playbackRate += 0.1;
}

function speedDown() {
    let my_video = document.getElementById("my_video");
    my_video.playbackRate -= 0.1;
}

function speedDefault() {
    let my_video = document.getElementById("my_video");
    my_video.playbackRate = 1;
}