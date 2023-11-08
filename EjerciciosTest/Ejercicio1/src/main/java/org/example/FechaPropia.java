package org.example;

public class FechaPropia {
    private int anio;
    private int mes;
    private int dia;

    public FechaPropia(String fecha) {
        String[] partes = fecha.split("-");
        this.anio = Integer.parseInt(partes[0]);
        this.mes = Integer.parseInt(partes[1]);
        this.dia = Integer.parseInt(partes[2]);
    }

    public void sumarDias(int numDias) {
        while (numDias > 0) {
            int diasMes = diasEnMes(anio, mes);
            int diasRestantes = diasMes - dia;
            if (numDias <= diasRestantes) {
                dia += numDias;
                numDias = 0;
            } else {
                numDias -= diasRestantes + 1;
                if (mes == 12) {
                    anio++;
                    mes = 1;
                } else {
                    mes++;
                }
                dia = 1;
            }
        }
    }

    public void restarDias(int numDias) {
        while (numDias > 0) {
            if (numDias < dia) {
                dia -= numDias;
                numDias = 0;
            } else {
                numDias -= dia;
                if (mes == 1) {
                    anio--;
                    mes = 12;
                } else {
                    mes--;
                }
                dia = diasEnMes(anio, mes);
            }
        }
    }

    private int diasEnMes(int anio, int mes) {
        if (mes == 2) {
            return esBisiesto(anio) ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    private boolean esBisiesto(int anio) {
        return anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0);
    }

    @Override
    public String toString() {
        String strAnio = String.format("%04d", anio);
        String strMes = String.format("%02d", mes);
        String strDia = String.format("%02d", dia);
        return strAnio + "-" + strMes + "-" + strDia;
    }
}

