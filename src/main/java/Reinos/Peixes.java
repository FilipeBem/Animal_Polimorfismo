package Reinos;

public class Peixes extends Animal {

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
       System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
       System.out.println("Comendo Substancias");
    }

    @Override
    public void emitirson() {
        System.out.println("Peixe não faz Som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando Bolhas");
    }
    
}
