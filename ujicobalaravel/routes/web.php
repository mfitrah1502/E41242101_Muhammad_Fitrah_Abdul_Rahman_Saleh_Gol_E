<?php

use Illuminate\Support\Facades\Route;

Route::get('/halo', function () {
    return "Halo! Laravel berjalan dengan benar.";
});
Route::get('/tombol', function () {
    return view('button');
});

Route::get('/karaoke', function () {
    return view('karaoke');
});
Route::get('/gender-counter', function () {
    return view('count');
});



