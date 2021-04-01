import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Float.parseFloat;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String report = balanceCheckbook(input);

        System.out.println(report);
    }

    static String  balanceCheckbook(String input){

        DecimalFormat df = new DecimalFormat("####.00");

        ArrayList<String> checkbook = new ArrayList<>(Arrays.asList(input.replaceAll("(\\b\\D\\W)", " ").split("\\n")));

        float currentBalance = parseFloat(checkbook.get(0));
        float totalExpense = 0;

        StringBuilder reportBuilder = new StringBuilder(("Original_Balance: " + df.format(currentBalance) + "\n"));

        for (int count = 1; count <checkbook.size(); count++){
            String[] values = checkbook.get(count).replaceAll("\\b(\\s{2})", " ").split("\\s");
            totalExpense += parseFloat(values[2]);
            currentBalance -= parseFloat(values[2]);
            checkbook.set(count, values[0] + " " + values[1] + " " + df.format(parseFloat(values[2])));
            reportBuilder.append(checkbook.get(count)).append(" Balance ").append(df.format(currentBalance)).append("\n");
        }

        float averageExpense = totalExpense / (checkbook.size() - 1);

        reportBuilder.append("Total expense ").append(df.format(totalExpense)).append("\n")
            .append("Average expense ").append(df.format(averageExpense));

        return reportBuilder.toString().replace(",", ".");
    }
}
