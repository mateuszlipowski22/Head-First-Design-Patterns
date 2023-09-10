package head_first_desing_patterns.template_method.coffee_exapme_with_handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHandler extends DrinkWithCaffeineWithHandler {
    @Override
    protected void addingExtras() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected void brewing() {
        System.out.println("Brewing and percolate the coffee through the filter");
    }

    @Override
    protected boolean customerWantsExtras() {
        String answer = getCustomerInput();
        return (answer.toLowerCase().startsWith("y"));
    }

    public String getCustomerInput() {

        String answer = null;

        System.out.println("Do you want coffee with sugar and milk (y/n)?");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            System.err.println("Input - output error during reading customer answer");
        }

//        Scanner scanner = new Scanner(System.in);
//        answer=scanner.nextLine();

        if(answer==null){
            return "no";
        }
        return answer;
    }
}
