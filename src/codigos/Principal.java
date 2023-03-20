package codigos;

public class Principal {

    public static void main(String args[]) {
        Caneta c1 = new Caneta();
        c1.setModelo("Bic Cristal");
        c1.setCor("azul");
        c1.setCarga(200);
        c1.setPonta(1.0);
        c1.setTampada(true);

        c1.mostrarStatus();

//        Caneta c2 = new Caneta();
//        c2.modelo = "Pilot de quadro branco";
//        c2.cor = "Vermelho";
//        c2.carga = 50;
//        c2.ponta = 5.0;
//        c2.tampada = true;
//        c2.mostrarStatus();
    }
}
