/*
https://www.w3schools.com/whatis/whatis_ajax.asp
https://www.w3schools.com/js/js_ajax_intro.asp
https://www.w3schools.com/js/js_ajax_examples.asp


*/
'use strict'
$(document).ready(function(){
    //console.log('JQuery carregat');

    // Load

    //$("#dades").load("https://reqres.in/");

    // mirar network a la consola Network Headers per veure la petició

    // Get i Post

    // https://www.w3schools.com/jquery/jquery_ajax_get_post.asp


    // https://reqres.in/ mirem list users

    $.get("https://reqres.in/api/users?page=1", function(response){
    //$.get("https://reqres.in/api/users", {page: 2}, function(response){

    //console.log(response);
        response.data.forEach((element, index)=>{
        $("#dades").append("<p>"+element.first_name+" "+element.last_name+"</p>");
        });

    }) ;

    $("#formulari").submit(function(e){

        // que no se'ns carregui la pàgina per defecte

        // mirar la url de la pàgina

        e.preventDefault();

        var usuari = {
            name: $('input[name="nom"]').val(),
            web: $('input[name="web"]').val()

        }

        /*console.log(usuari);

        $.post($(this).attr("action"),usuari,function(response){
            console.log(response);
        }).done(function(){
            alert("Usuari afegit correctament");
        });

        */

        // $.ajax

        $.ajax({

            type: 'POST',
            url: $(this).attr("action"),
            data:usuari,
            beforeSend: function() {
                console.log("Enviant usuari...");
            },
            success: function(response){
                console.log(response);
                $("#dades").append("<p>"+response.name+"</p>")
            },
            error: function(){
                console.log("Hi ha hagut un error");
            },
            timeout: 1000

        });

        return false;




    })











});
