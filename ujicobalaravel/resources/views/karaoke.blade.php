<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Lyrics</title>
<style>
body {
    margin: 0;
    height: 100vh;
    background: black;
    color: #00ff00;
    font-family: monospace;
    display: flex;
    justify-content: center;
    align-items: center;
    overflow: hidden;
}

.box {
    width: 70%;
    height: 80%;
    border: 2px solid #00ff00;
    overflow: hidden;
    padding: 20px;
    position: relative;
}

.lyrics {
    position: absolute;
    bottom: 0;
    width: 100%;
}

.line {
    margin-bottom: 14px;
    text-align: center;
    color: #00ff00;
    position: relative;
    transition: color 0.2s;
}

.line img {
    display: none;
    position: absolute;
    left: 80px; /* posisi kiri logo */
    top: 50%;
    transform: translateY(-50%);
    width: 30px;
    height: 30px;
}

.line.active {
    color: #ff0000; /* highlight merah */
    font-weight: bold;
}

.line.active img {
    display: inline-block; /* tampilkan logo kitten saat aktif */
}
</style>
</head>
<body>

<div class="box">
    <!-- Ganti src sesuai file mp3 kamu -->
    <audio id="song" src="/Yves - White cat [128 kbps].mp3" controls></audio>
    <div class="lyrics" id="lyrics">

        <!-- Contoh beberapa baris lirik dengan logo kitten -->
        <div class="line" data-time="4">
            <img src="/kitten.png" alt="Kitten">
            Can't reach me yet
        </div>
        <div class="line" data-time="6">
            <img src="/kitten.png" alt="Kitten">
            Another type, baby
        </div>
        <div class="line" data-time="8">
            <img src="/kitten.png" alt="Kitten">
            Please, I don't wait
        </div>
        <div class="line" data-time="10">
            <img src="/kitten.png" alt="Kitten">
            Too bright, can't be a bad kind
        </div>
        <div class="line" data-time="12">
            <img src="/kitten.png" alt="Kitten">
            Don't you know?
        </div>
        <div class="line" data-time="14">
            <img src="/kitten.png" alt="Kitten">
            Gritty treats, dirty streets
        </div>
        <div class="line" data-time="16">
            <img src="/kitten.png" alt="Kitten">
            Won't belong, yeah
        </div>

        <!-- Tambahkan semua lirik lengkap berikutnya sesuai file mp3 -->
    </div>
</div>

<script>
const song = document.getElementById('song');
const lines = document.querySelectorAll('.line');

// Mulai lagu dari detik tertentu (misal 4 detik)
song.currentTime = 4;

song.addEventListener('timeupdate', () => {
    const currentTime = song.currentTime;

    lines.forEach((line, index) => {
        const time = parseFloat(line.getAttribute('data-time'));
        const nextTime = index < lines.length - 1 ? parseFloat(lines[index+1].getAttribute('data-time')) : Infinity;

        if(currentTime >= time && currentTime < nextTime){
            line.classList.add('active');
            line.scrollIntoView({behavior: 'smooth', block: 'center'});
        } else {
            line.classList.remove('active');
        }
    });
});
</script>

</body>
</html>
