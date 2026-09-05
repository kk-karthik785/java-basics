import java.util.Arrays;

public class Main {

    static class Candidate implements Comparable<Candidate> {
        String name;
        double cgpa;
        int codingScore;

        Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        // CGPA-only eligibility
        static boolean isEligible(double cgpa) {
            return cgpa >= 8.0;
        }

        // CGPA + coding score eligibility
        static boolean isEligible(double cgpa, int codingScore) {
            return cgpa >= 6.5 && codingScore >= 60;
        }

        // Composite score = CGPA × 10 + coding score × 0.5
        double compositeScore() {
            return cgpa * 10 + codingScore * 0.5;
        }

        // Sort in descending order of composite score
        @Override
        public int compareTo(Candidate other) {
            return Double.compare(other.compositeScore(), this.compositeScore());
        }
    }

    static String shortlistAndRank(Candidate[] candidates) {
        Candidate[] shortlisted = new Candidate[candidates.length];
        int count = 0;

        for (Candidate c : candidates) {
            if (Candidate.isEligible(c.cgpa) ||
                Candidate.isEligible(c.cgpa, c.codingScore)) {
                shortlisted[count++] = c;
            }
        }

        Candidate[] result = Arrays.copyOf(shortlisted, count);

        Arrays.sort(result);

        String output = "";

        for (int i = 0; i < result.length; i++) {
            output += (i + 1) + ". " + result[i].name +
                      " (" + String.format("%.1f", result[i].compositeScore()) + ")";

            if (i < result.length - 1) {
                output += " | ";
            }
        }

        return output;
    }

    public static void main(String[] args) {

        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Karan", 6.0, 50),
            new Candidate("Meena", 7.2, 40)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}