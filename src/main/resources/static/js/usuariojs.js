function tipou(){
    var u = document.getElementById("usuario").value;
    const a = `
        <div th:object="${a}">
        <hr>
        <h5 class="mb-5 text-uppercase">Datos Administrativo</h5>
        <div class="form-outline mb-4">
        <label class="form-label" for="area">Área</label>
        <input required minlength="10" maxlength="50" type="text" id="area" name="area"
        class="form-control form-control-lg" th:value="\${a.area}" />
        </div>
        <div class="form-outline mb-4">
        <label class="form-label" for="exp">Experiencia previa</label>
        <input maxlength="100" type="text" id="exp" name="exp" class="form-control form-control-lg"
        th:value="\${a.experiencia}"/>
        </div></div>
   `;
    const c = `
        <hr>
        <h5 class="mb-5 text-uppercase">Datos Cliente</h5>
        <div class="form-outline mb-4">
        <label class="form-label" for="rut">RUT (sin puntos ni digito verificador)</label>
        <input required min="1" max="99999999" type="number" id="rut" name="rut"
        class="form-control form-control-lg"
        th:value="\${c.rut}" />

        </div>
        <div class="row">
        <div class="col-md-6 mb-4">
        <div class="form-outline">
        <label class="form-label" for="nombreC">Nombre</label>
        <input required minlength="5" maxlength="30" type="text" id="nombreC" name="nombreC"
        class="form-control form-control-lg"
        th:value="\${c.nombres}" />
        </div></div>

        <div class="col-md-6 mb-4">
        <div class="form-outline">
        <label class="form-label" for="apellidoC">Apellido</label>
        <input required minlength="5" maxlength="30" type="text" id="apellidoC" name="apellidoC"
        class="form-control form-control-lg"
        th:value="\${c.apellidos}" />
        </div> </div> </div>

        <div class="form-outline mb-4">
        <label class="form-label" for="tel">Telefóno</label>
        <input required type="tel" id="tel" name="tel" class="form-control form-control-lg"
        th:value="\${c.telefono}" />
        </div>

        <div class="form-outline mb-4">
        <label class="form-label" for="afp">Nombre AFP</label>
        <input minlength="4" maxlength="30" type="text" id="afp" name="afp"
        class="form-control form-control-lg"
        th:value="\${c.afp}" /></div>

        <div class="form-outline mb-4">
        <label class="form-label" for="sSalud">Sistema de Salud</label>
        <select class="form-select" id="sSalud" name="sSalud"
        th:value="\${c.sistemaDeSalud}" >

        <option value="1">Fonasa</option>
        <option value="2">Isapre</option>
        </select></div>

        <div class="row"> <div class="col-md-6 mb-4"><div class="form-outline">
        <label class="form-label" for="direccion">Direccion</label>
        <input maxlength="70" type="text" id="direccion" name="direccion"
        class="form-control form-control-lg"
        th:value="\${c.direccion}" />
        </div></div>

        <div class="col-md-6 mb-4"><div class="form-outline">
        <label class="form-label" for="comuna">Comuna</label>
        <input maxlength="50" type="text" id="comuna" name="comuna"
        class="form-control form-control-lg"
        th:value="\${c.comuna}" />
        </div> </div></div>
    `;
    const p = `
        <hr>
        <h5 class="mb-5 text-uppercase">Datos Profesional</h5>
        <div class="form-outline mb-4">
        <label class="form-label" for="titulo">Título</label>
        <input required minlength="10" maxlength="50" type="text" id="titulo" name="titulo"
        class="form-control form-control-lg"
        th:value="\${p.titulo}" />
        </div>
        <div class="form-outline mb-4">
        <label class="form-label" for="ingreso">Fecha de Ingreso</label>
        <input type="date" id="ingreso" name="ingreso"
        class="form-control form-control-lg"
        th:value="\${p.ingreso}" />
        </div>
    `;

    if (u == "Admisistrativo") {
        document.getElementById("admisistrativo").style.display = "block";
        document.getElementById("cliente").style.display = "none";
        document.getElementById("profesional").style.display = "none";
        let b = document.getElementById("submit");
        b.disabled = false;

    } else if (u == "Cliente"){
        document.getElementById("cliente").style.display = "block";
        document.getElementById("profesional").style.display = "none";
        document.getElementById("admisistrativo").style.display = "none";
                let b = document.getElementById("submit");
                b.disabled = false;
    } else if (u == "Profesional"){
        document.getElementById("profesional").style.display = "block";
        document.getElementById("cliente").style.display = "none";
        document.getElementById("admisistrativo").style.display = "none";
        let b = document.getElementById("submit");
        b.disabled = false;
    } else {
            document.getElementById("profesional").style.display = "none";
            document.getElementById("cliente").style.display = "none";
            document.getElementById("admisistrativo").style.display = "none";
    let b = document.getElementById("submit");
    b.disabled = true;
    }

}

