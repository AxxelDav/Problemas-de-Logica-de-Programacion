package ejercicio31;

public class Ejercicio31 {

    public String angulo(Integer grado){
        if(grado<90) return "Angulo: Agudo";
        else if (grado==90) return "Angulo: Recto";
        else if (grado == 180) return  "Angulo: Llano";
        else if (grado > 180 && grado < 360) return  "Angulo: Obtuso";
        else if (grado ==360) return "Angulo: Completo";
        return grado > 360 ? "Grado Incorrecto" : "Grado correcto";
    }

}
