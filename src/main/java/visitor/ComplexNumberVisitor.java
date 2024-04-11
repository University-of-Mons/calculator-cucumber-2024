package visitor;


import calculator.Operation;
import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.numbers.MyNumber;

import java.util.ArrayList;

public class ComplexNumberVisitor extends Evaluator {

    private ComplexNumber complexNumber;

    @Override
    public void visit(MyNumber n){
        complexNumber = (ComplexNumber) n;
    }

    @Override
    public ComplexNumber getResult() {
        return complexNumber;
    }

    @Override
    public void visit(Operation o) {
        ArrayList<ComplexNumber> evaluatedArgs = new ArrayList<>();
        //first loop to recursively evaluate each subexpression
        for(Expression a:o.getArgs()) {
            a.accept(this);
            evaluatedArgs.add(complexNumber);
        }
        //second loop to accumulate all the evaluated sub results
        ComplexNumber temp = evaluatedArgs.getFirst();
        int max = evaluatedArgs.size();
        for(int counter=1; counter<max; counter++) {
            temp = o.op(temp,evaluatedArgs.get(counter));
        }
        // store the accumulated result
        complexNumber = temp;
    }
}
