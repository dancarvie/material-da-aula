package exercicios.exercicios01;

// criar a class Relogio

public class Relogio {

    // atributos, hora, minuto e segundo

    public int hora, minuto, segundo;

    // construtor que recebe horas, min e seg para inicializar o relogio

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);

    }

    public int setHora(int hora) {
        if (hora >= 0 && hora < 23) {
            this.hora = hora;
        }
        return hora;
    }

    public int setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        }
        return minuto;
    }

    public int setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        }
        return segundo;

    }

    // metodo para exibir hora atual

    public void getHora() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }

}
