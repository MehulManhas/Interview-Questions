package TCT2;

import java.util.ArrayList;

public class GenerateAllParenthesisII {
    public ArrayList<String> generateParenthesis(int A) {

        ArrayList<String> combinations = new ArrayList<>();
        String s = "";
        generateAllValidParenthesis(A, A, s, combinations);

        return combinations;
    }

    public void generateAllValidParenthesis(int left, int right, String s, ArrayList<String> combinations){

        if(left == 0 && right == 0){
            combinations.add(s);
        }

        if(left > right || right < 0 || left < 0){
            return;
        }

        s += "(";
        generateAllValidParenthesis(left-1, right, s, combinations);
        s = s.substring(0, s.length()-1);

        s += ")";
        generateAllValidParenthesis(left, right-1, s, combinations);
        s = s.substring(0, s.length()-1);

    }
}
