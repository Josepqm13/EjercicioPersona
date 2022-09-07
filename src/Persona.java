import java.util.Scanner;

public class Persona {
    String sNombre;
    int iEdad;
    char sSexo;

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

    public char getsSexo() {
        return sSexo;
    }

    public void setsSexo(char sSexo) {
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

    public double getdIMC() {
        return dIMC;
    }

    public void setdIMC(double dIMC) {
        this.dIMC = dIMC;
    }

    double dPeso;
    double dAltura;
    double dIMC;

    public void calcularIMC () {
        dIMC = dPeso / (dAltura * dAltura);

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
        boolean bEsMayor;
        if (iEdad>=18){
            bEsMayor = true;
        } else
            bEsMayor = false;

    }
    public void comprobarSexo() {

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
        System.out.print("Ingrese sexo (h)ombre, (m)ujer");
        while (sSexo!='h' && sSexo!='m') {
            System.out.println(" ");
            System.out.println("Solo h o m");
break;
        }



    }
}

