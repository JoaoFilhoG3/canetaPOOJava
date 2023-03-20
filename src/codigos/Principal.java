package codigos;

public class Principal {

    public static void main(String args[]) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.carga = 100;
        c1.ponta = 0.7;
        c1.tampada = true;
        
        c1.destampar();
        c1.escrever("Olá, tudo bem? Como vai você? eu estou bem, como o dia está bonito hoje, o sol está realmente belo");
        
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
