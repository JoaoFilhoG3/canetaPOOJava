package codigos;

public class Caneta {

    public String modelo;
    public String cor;
    public double ponta;
    public int carga;
    public boolean tampada;

    public void mostrarStatus() {
        System.out.println("--------------------------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ponta: " + ponta);
        System.out.println("Carga:" + carga);
        System.out.println("Tampada: " + tampada);
        System.out.println("--------------------------------------");
    }

    public void escrever(String texto) {
        if (tampada) {
            System.out.println("Destampe a caneta!!!");
        } else {
            if (carga - texto.length() < 0) {
                System.out.println("A carga é insuficiente!!!");
            } else {
                System.out.println(texto);
                carga -= texto.length();
            }
        }
    }

    public void tampar() {
        if (tampada) {
            System.out.println("A caneta já está tampada.");
        } else {
            System.out.println("Tampando caneta.");
            tampada = true;
        }
    }

    public void destampar() {
        if (!tampada) {
            System.out.println("A caneta já está destampada.");
        } else {
            System.out.println("Destampando caneta.");
            tampada = false;
        }
    }

}
