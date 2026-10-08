package lab02;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempo;
    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempo = 0;
    }
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
    }
    public void adicionaTempoOnline(int tempoAdicionado) {
        tempo += tempoAdicionado;
    }
    public boolean atingiuMetaTempoOnline() {
        if (tempo >= tempoOnlineEsperado) {
            return true;
        } return false;
    }
    public String toString() {
        return nomeDisciplina + " " + tempo + "/" + tempoOnlineEsperado;
    }
}
