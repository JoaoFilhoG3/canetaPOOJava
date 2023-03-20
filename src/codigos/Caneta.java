package codigos;

public class Caneta {

    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;

    //Atributo modelo
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Atributo cor
    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //Atributo ponta
    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    //Atributo carga
    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    //Atributo tampada
    public boolean getTampada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

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
