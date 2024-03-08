package Reinos;

public class Aves extends Animal {

    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
       System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirson() {
        System.out.println("Som de Ave");
    }
    
    public void contruirNinho(){
        System.out.println("Construiu Ninho");
    }

}
