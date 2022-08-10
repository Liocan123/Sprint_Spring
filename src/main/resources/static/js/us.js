
//Este es un codigo que muestra los datos del formulario segun el tipo de usuario seleccionado.

function tipou(){

    var u = document.getElementById("usuario").value;

    if (u == "Administrativo") {
        document.getElementById("administrativo").style.display = "block";
        document.getElementById("cliente").style.display = "none";
        document.getElementById("profesional").style.display = "none";
        let b = document.getElementById("submit");
        b.disabled = false;

    } else if (u == "Cliente"){
        document.getElementById("cliente").style.display = "block";
        document.getElementById("profesional").style.display = "none";
        document.getElementById("administrativo").style.display = "none";
                let b = document.getElementById("submit");
                b.disabled = false;
    } else if (u == "Profesional"){
        document.getElementById("profesional").style.display = "block";
        document.getElementById("cliente").style.display = "none";
        document.getElementById("administrativo").style.display = "none";
        let b = document.getElementById("submit");
        b.disabled = false;
    } else {
            document.getElementById("profesional").style.display = "none";
            document.getElementById("cliente").style.display = "none";
            document.getElementById("administrativo").style.display = "none";
    let b = document.getElementById("submit");
    b.disabled = true;
    }

}

