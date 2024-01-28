import java.util.Arrays;

public class metodo2 {

    static double Adenina = 135.128;
    static double Citosina = 111.103;
    static double Guanina = 151.128;
    static double Timina = 125.107;

    public static void main(String[] args) {
        String sequence = "AAAATTAATATATATACCCGGXXXAAA";
        System.out.println("La secuencia que entra en el método es: " + sequence);
        MassInfo result = calculateMassPercentages(sequence);
        System.out.printf("Masa (%%): [%.1f, %.1f, %.1f, %.1f] de %.1f%n",
                result.getAdenina(), result.getCitosina(), result.getGuanina(), result.getTimina(),
                result.getTotalMass());
    }

    public static MassInfo calculateMassPercentages(String seq) {

        MassInfo massInfo = new MassInfo();

        massInfo.setAdenina(seq.chars().filter(c -> c == 'A').count() * Adenina);
        massInfo.setCitosina(seq.chars().filter(c -> c == 'C').count() * Citosina);
        massInfo.setGuanina(seq.chars().filter(c -> c == 'G').count() * Guanina);
        massInfo.setTimina(seq.chars().filter(c -> c == 'T').count() * Timina);

        double totalMass = massInfo.getAdenina() + massInfo.getCitosina() + massInfo.getGuanina()
                + massInfo.getTimina();
        massInfo.setTotalMass(totalMass);

        // Calcular el porcentaje y almacenar en la clase MassInfo
        massInfo.calculatePercentages();

        return massInfo;
    }
}

class MassInfo {
    private double adenina;
    private double citosina;
    private double guanina;
    private double timina;
    private double totalMass;

    public double getAdenina() {
        return adenina;
    }

    public void setAdenina(double adenina) {
        this.adenina = adenina;
    }

    public double getCitosina() {
        return citosina;
    }

    public void setCitosina(double citosina) {
        this.citosina = citosina;
    }

    public double getGuanina() {
        return guanina;
    }

    public void setGuanina(double guanina) {
        this.guanina = guanina;
    }

    public double getTimina() {
        return timina;
    }

    public void setTimina(double timina) {
        this.timina = timina;
    }

    public double getTotalMass() {
        return totalMass;
    }

    public void setTotalMass(double totalMass) {
        this.totalMass = totalMass;
    }

    public void calculatePercentages() {
        adenina = (adenina / totalMass) * 100.0;
        citosina = (citosina / totalMass) * 100.0;
        guanina = (guanina / totalMass) * 100.0;
        timina = (timina / totalMass) * 100.0;
    }
}
