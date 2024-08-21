public class Main {
    public static void main(String[] args) {
        float[] notas = new float[15];
        CalcularNotas calculadora_notas = new CalcularNotas(notas);

        calculadora_notas.setNotas();

        float nota_mayor = calculadora_notas.mayorNota();
        double porcentaje_aprobado = calculadora_notas.porcentajeAprobaronParcial();
        float promedio = calculadora_notas.promedioNotas();
        int indice_mejor_nota = calculadora_notas.indiceMejorNota();

        System.out.println("La nota mas grande es: " + nota_mayor);
        System.out.println("El porcentaje de estudiantes aprobados es: " + porcentaje_aprobado + "%");
        System.out.println("El promedio del curso es: " + promedio);
        System.out.println("El indice de la mejor nota es i: " + indice_mejor_nota + " -- " + nota_mayor);
    }
}