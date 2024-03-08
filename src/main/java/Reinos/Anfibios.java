package Reinos;

public class Anfibios extends Animal {

    private String corPele;
    

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
    @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos");
    }

    @Override
    public void emitirson() {
        System.out.println("Som de Anfibio");
    }
    
}
