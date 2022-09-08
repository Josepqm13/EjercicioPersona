public class Persona {
    private String sNombre;
    private int iEdad;
    private String sSexo;
    private double dPeso;
    private double dAltura;
    //private double dIMC;

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public String getsSexo() {
        return sSexo;
    }

    public void setsSexo(String sSexo) {
        this.sSexo = sSexo;
    }

    public double getdPeso() {
        return dPeso;
    }

    public void setdPeso(double dPeso) {
        this.dPeso = dPeso;
    }

    public double getdAltura() {
        return dAltura;
    }

    public void setdAltura(double dAltura) {
        this.dAltura = dAltura;
    }


    public void calcularIMC () {
        double dIMC = dPeso / (dAltura * dAltura);

        if (dIMC < 20) {
            System.out.println("El IMC es -1");
        }
        else if (dIMC >= 20 && dIMC <= 25)
        {
        System.out.println("El IMC es 0");
        }
    else {
            System.out.println("El IMC es 1");
        }
    }

    public void esMayorDeEdad() {
        if (iEdad>=18){
            System.out.println("Es mayor de edad");
        } else
        System.out.println("Es menor de edad");

    }
    public void comprobarSexo() {
        if (sSexo == "H") {
            System.out.println("Su genero es: " + sSexo);
        }
        else if (sSexo == "M") {
            System.out.println("Su genero es: " + sSexo);
        } else {
            System.out.println("Valor ingresado es incorrecto");
        }
        /*if (sSexo == "H") {
            System.out.println("Su genero es: " + sSexo);
        }
        else if (sSexo == "M") {
            System.out.println("Su genero es: " + sSexo);
        } else {
            System.out.println("Valor ingresado es incorrecto");
        }


        if (sSexo!= "H" && sSexo!= "M") {
            this.sSexo = "H";
        }
        else {this.sSexo = sSexo;
        }

        public String toString(){
            String sSexo = "";
                    if (this.sSexo == "H");
            sSexo="Hombre";

        }
        else if {
            sSexo ="Mujer";
        }
*/

    }
}

