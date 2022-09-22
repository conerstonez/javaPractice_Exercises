package Practice.DeitelExercises.Chapter4;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        double rate = 0.011;
        double currentPopulation = 7.97;
        double newPopulation;
        double increment;
        int year = 1;
        int currentYear = 2022;

        System.out.print("Year: " + currentYear + "    Current World Population: " + currentPopulation + "bn" + "    World Population Growth Rate: " + "1.1%");
        System.out.print("\n\nEstimated World Population for the next 75 years at a Population Growth rate of 1.1% \n");
        System.out.printf("%n%s%30s%30s%n", "Year", "Estimated Population", "Population increment");
        while (year <= 75){
            currentYear += 1;
            newPopulation = currentPopulation + (currentPopulation * rate);
            increment = newPopulation - currentPopulation;
            System.out.printf("%d%15.2fbn%28.2fbn%n", currentYear, newPopulation, increment);
            year++;
            currentPopulation = newPopulation;
        }
    }
}
