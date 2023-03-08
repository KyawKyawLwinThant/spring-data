package com.solt;

import com.solt.ds.Pair;
import com.solt.evaluator.AddEvaluator;
import com.solt.evaluator.Evaluator;
import com.solt.evaluator.MultiplyEvaluator;
import com.solt.render.FormalRender;
import com.solt.render.VerboseRender;
import com.solt.service.EvaluatorService;

public class Main {
    public static void main(String[] args) {

        Evaluator evaluator=new Evaluator() {
            @Override
            public int evaluate(Pair pair) {
                return pair.getB() + pair.getA();
            }
        };
        EvaluatorService service=new EvaluatorService();
        service.takeAction(
                evaluator,
                a -> System.out.println("Ans:"+ a),
                new Pair(6,3)
        );
    }
}
