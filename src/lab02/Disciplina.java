package lab02;

public class Disciplina {
    String nomeDisciplina;
    int horas;
    double n1;
    double n2;
    double n3;
    double n4;
    double media;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        n1 = 0;
        n2 = 0;
        n3 = 0;
        n4 = 0;
    }
    public void cadastraHoras(int horas) {
        this.horas = horas;
    }
    public void cadastraNota(int nota, double valorNota) {
        if (nota == 1) {
            n1 = valorNota;
        } else if (nota == 2) {
            n2 = valorNota;
        } else if (nota == 3) {
            n3 = valorNota;
        } else {
            n4 = valorNota;
        }
    }
    public boolean aprovado() {
        media = (n1 + n2 + n3 + n4)/4 ;
        if (media >= 7.0) {
            return true;
        } return false;
    }
    public String toString() {
        return nomeDisciplina + horas + media + "[" + n1 + n2 +
    }
}
