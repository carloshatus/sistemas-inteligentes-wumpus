package wumpus.agente;

import java.util.ArrayList;
import wumpus.ambiente.Ambiente;

public class Agente {

    private Ambiente ambiente;
    private ArrayList modeloAmbiente;
    private ArrayList<String> objetivos;
    private boolean fedor;
    private boolean brisa;
    private boolean brilho;
    private boolean choque;
    private boolean grito;

    public Agente(Ambiente ambiente) {
        this.ambiente = ambiente;
        modeloAmbiente = new ArrayList();
        objetivos = new ArrayList<>();
        fedor = false;
        brisa = false;
        brilho = false;
        choque = false;
        grito = false;
        System.out.println("Agente iniciado!!!");
        while (true) {
            interpretarPercepções(ambiente.getPercepcao());
        }
    }

    public void interpretarPercepções(boolean[] percepcoes) {

        atualizarAmbiente();
    }

    public void atualizarAmbiente() {
        atualizarObjetivo();
    }

    public void atualizarObjetivo() {
        escolherAcao();
    }

    public void escolherAcao() {

    }

}
