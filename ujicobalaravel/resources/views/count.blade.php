<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <title>Hitung Jumlah Gender</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h3 class="text-center mb-4">Hitung Jumlah Gender</h3>

    <div class="row text-center">
        <!-- Laki-laki -->
        <div class="col-md-6">
            <div class="card p-4">
                <h4>Laki-laki</h4>
                <h1 id="maleCount">0</h1>
                <button class="btn btn-success" onclick="increase('male')">+</button>
                <button class="btn btn-danger" onclick="decrease('male')">-</button>
            </div>
        </div>

        <!-- Perempuan -->
        <div class="col-md-6">
            <div class="card p-4">
                <h4>Perempuan</h4>
                <h1 id="femaleCount">0</h1>
                <button class="btn btn-success" onclick="increase('female')">+</button>
                <button class="btn btn-danger" onclick="decrease('female')">-</button>
            </div>
        </div>
    </div>
</div>
<script>
    let male = 0;
    let female = 0;

    function increase(type) {
        if (type === 'male') {
            male++;
            document.getElementById('maleCount').innerText = male;
        } else {
            female++;
            document.getElementById('femaleCount').innerText = female;
        }
    }

    function decrease(type) {
        if (type === 'male' && male > 0) {
            male--;
            document.getElementById('maleCount').innerText = male;
        } else if (type === 'female' && female > 0) {
            female--;
            document.getElementById('femaleCount').innerText = female;
        }
    }
</script>

</body>
</html>
