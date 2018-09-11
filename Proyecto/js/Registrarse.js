
$(document).ready(function(){
    $("#Usuario").blur(function(){ //cuando se pierda el foco una vez terminado de escribir el usuario
        var user = $("#Usuario").val();
        if(user.length<6){
            alert ("El nombre de usuario debe tener al menos 6 letras."); 
        }
    });
    $('#Telefono').blur(function(){
        this.value = (this.value + '').replace(/[^0-9]/g, '');  //borra cualquier otra cosa que no sean numeros
      });
      
    $("#Contraseña").blur(function(){
        var mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        var minusculas = "abcdefghijklmnopqrstuvwxyz";
        var numeros = "0123456789";
        var hayMayu=false;
        var hayMinu=false;
        var hayNum=false;

        var contraseña = $("#Contraseña").val();
        if(contraseña.length<8){
            alert ("La contraseña debe tener al menos 8 caracteres."); 
        }       
        if(contraseña.length>=7){
            for (var i = 0; i < mayusculas.length; i++) {
                for (var x = 0; x < contraseña.length; x++) {
                    if(contraseña[x]==mayusculas[i]){
                        hayMayu=true;
                    }
                }
            }
            for (var i = 0; i < minusculas.length; i++) {
                for (var x = 0; x < contraseña.length; x++) {
                    if(contraseña[x]==minusculas[i]){
                        hayMinu=true;
                    }
                }
            }
            for (var i = 0; i < numeros.length; i++) {
                for (var x = 0; x < contraseña.length; x++) {
                    if(contraseña[x]==numeros[i]){
                        hayNum=true;
                    }
                }
            }
            if(hayMayu==false || hayMinu==false || hayNum==false){
                alert ("Debe haber al menos 1 mayuscula, 1 minuscula y un numero."); 
            }
        }
     
    });
});
