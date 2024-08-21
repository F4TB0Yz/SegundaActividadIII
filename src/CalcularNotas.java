import java.util.Scanner;

public class CalcularNotas {
    float[] notas;

    public CalcularNotas(float[] notas) {
        this.notas = notas;
    }

    public void setNotas() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese las notas: ");

        for (int i = 0; i < 15; i++) {
            System.out.println((i + 1) + ":");
            float nota = input.nextFloat();
            this.notas[i] = nota;
        }
    }

    public float mayorNota() {
        float nota_mayor = 0;

        for (float nota: this.notas) {
            if (nota > nota_mayor) {
                nota_mayor = nota;
            }
        }

        return nota_mayor;
    }

    public double porcentajeAprobaronParcial() {
        int total_alumnos = this.notas.length;
        int alumnos_aprobados = 0;

        for (float nota: this.notas) {
            if (nota >= 3) {
                alumnos_aprobados++;
            }
        }

        double porcentaje = (double) alumnos_aprobados / total_alumnos * 100;
        porcentaje = Math.round(porcentaje * 100.0) / 100.0;

        return (float) porcentaje;
    }

    public float promedioNotas() {
        int total_alumnos = this.notas.length;
        float suma = 0;

        for (float nota: this.notas) {
            suma += nota;
        }

        return suma / total_alumnos;
    }

    public int indiceMejorNota() {
        float nota_mayor = 0;
        int index = 0;

        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] > nota_mayor) {
                nota_mayor = this.notas[i];
                index = i;
            }
        }

        return index;
    }
}
