package model;

public class Relogio {
    double hora;
    boolean possuiAlarme;
    String tipo;
    String cor;

    public Relogio(double hora, boolean possuiAlarme,String tipo, String cor) {
        this.hora = hora;
        this.possuiAlarme = possuiAlarme;
        this.tipo = tipo;
        this.cor = cor;

        if (hora > 23.59)
            hora = 0;
        if (hora < 0)
            hora = 23.3;

        int inteiro = (int) hora;
        double minutos = hora - inteiro;

        if (minutos >= .6)
            this.hora = inteiro+1;

    }

    public void mostrarHora() {
        String visual = String.format("%02d:00",hora);
        System.out.println("Hora atual: " + hora);
    }

    public void adiantar() {
        hora += .3;
        int inteiro = (int) hora;
        double minutos = hora - inteiro;

        if (minutos >= .6)
            hora = inteiro+1;

        if (hora >= 24)
            hora = 0;
    }

    public void atrasar() {
        hora -= .3;
        int inteiro = (int) hora;
        double minutos = hora - inteiro;

        if (minutos >= .6)
            hora = inteiro+.3;

        if (hora <= 0)
            hora = 23.3;
    }

    public void adicionarAlarme() {
        if (possuiAlarme) {
            System.out.println("O alarme já está ligado!");
            return;
        }

        possuiAlarme = true;
        System.out.println("Alarme ligado!");
    }

    public void removerAlarme() {
        if (!possuiAlarme) {
            System.out.println("O alarme já está desligado!");
            return;
        }

        possuiAlarme = false;
        System.out.println("Alarme desligado!");
    }

}
