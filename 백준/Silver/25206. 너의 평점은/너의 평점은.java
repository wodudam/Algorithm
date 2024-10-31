import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int line = 20;
        double totalSum = 0;
        double scoreSum = 0;

        for (int i = 0; i < line; i++) {
            String[] input = br.readLine().split(" ");

            double score = Double.parseDouble(input[1]);   //학점
            String grade = input[2];    //등급
            double gradeScore = 0;

            if (grade.equals("P")) {
                continue;
            }

            switch (grade) {
                case "A+" :
                    gradeScore = 4.5;
                    break;
                case "A0" : 
                    gradeScore = 4.0;
                    break;
                case "B+" : 
                    gradeScore = 3.5;
                    break;
                case "B0" : 
                    gradeScore = 3.0;
                    break;
                case "C+" : 
                    gradeScore = 2.5;
                    break;
                case "C0" : 
                    gradeScore = 2.0;
                    break;
                case "D+" : 
                    gradeScore = 1.5;
                    break;
                case "D0" : 
                    gradeScore = 1.0;
                    break;
            }

            totalSum += score * gradeScore;
            scoreSum += score;
        }

        double average = totalSum / scoreSum;
        System.out.printf("%.6f\n", average);
    }
}
