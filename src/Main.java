public class Main {
    public static void main(String[] args) {
        Persona p =new Persona();

        p.setsNombre("Alli");
        p.setdAltura(1.80);
        p.setiEdad(40);
        p.setdPeso(200);
        p.setsSexo("s");
        p.calcularIMC();
        p.comprobarSexo();
        p.esMayorDeEdad();

    }
}