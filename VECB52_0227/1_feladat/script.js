function playOrPause() {
    let my_video = document.getElementById("my_video");
    if (my_video.paused) {
        my_video.play();
    }
    else {
        my_video.pause();
    }
}

function volumeChangeUp() {
    let my_video = document.getElementById("my_video");
    my_video.volume += 0.1;
}

function volumeChangeDown() {
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

function setSpeedToDefault() {
    let my_video = document.getElementById("my_video");
    my_video.playbackRate = 1;
}