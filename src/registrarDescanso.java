public class registrarDescanso {
    int horasDescanso;
    int numeroSemanas;
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }
    public String getStatusGeral() {
        if (horasDescanso >= 26 && numeroSemanas >= 1) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}

