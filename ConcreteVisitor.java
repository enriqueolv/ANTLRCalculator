import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class ConcreteVisitor extends CalculatorGrammarBaseVisitor<Double>{
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Double> memory = new HashMap<String, Double>();


    /** ID '=' expr NEWLINE */
    @Override
    public Double visitAssign(CalculatorGrammarParser.AssignContext ctx) {
        String id = ctx.ID().getText();    // id is left-hand side of '='
        double value = visit(ctx.expr());  // compute value of expression on right
        memory.put(id, value);             // store it in our memory
        return value;
    }

    /** expr NEWLINE */
    @Override
    public Double visitPrintExpr(CalculatorGrammarParser.PrintExprContext ctx) {
        double value = visit(ctx.expr());          // evaluate the expr child
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(8);
        System.out.println(df.format(value));      // print the result
        return value;                              // return dummy value
    }

    /** INT */
    @Override
    public Double visitFloat(CalculatorGrammarParser.FloatContext ctx) {
        return Double.valueOf(ctx.FLOAT().getText());
    }

    /** ID */
    @Override
    public Double visitId(CalculatorGrammarParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return 0.0;
    }

    /** expr op=('*'|'/') expr */
    @Override
    public Double visitMulDivPow(CalculatorGrammarParser.MulDivPowContext ctx) {
        double left = visit(ctx.expr(0));  // get value of left subexpression
        double right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == CalculatorGrammarParser.POW ) return Math.pow(left, right);
        if ( ctx.op.getType() == CalculatorGrammarParser.MUL ) return left * right;
        return left / right; // must be DIV
    }

    /** expr op=('+'|'-') expr */
    @Override
    public Double visitAddSub(CalculatorGrammarParser.AddSubContext ctx) {
        double left = visit(ctx.expr(0));  // get value of left subexpression
        double right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == CalculatorGrammarParser.ADD ) return left + right;
        return left - right; // must be SUB
    }

    /** '(' expr ')' */
    @Override
    public Double visitParens(CalculatorGrammarParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }

    @Override
    public Double visitClear(CalculatorGrammarParser.ClearContext ctx){
        memory = new HashMap<String, Double>();
        return 0.0;
    }

    @Override
    public Double visitPi(CalculatorGrammarParser.PiContext ctx){
        return Math.PI;
    }

    @Override 
    public Double visitEuler(CalculatorGrammarParser.EulerContext ctx){
        return Math.E;
    }

    @Override
    public Double visitTrig(CalculatorGrammarParser.TrigContext ctx) {
        double expr = visit(ctx.expr());  // get value of subexpression
        if ( ctx.op.getType() == CalculatorGrammarParser.SIN ) return Math.sin(expr);
        if ( ctx.op.getType() == CalculatorGrammarParser.COS ) return Math.cos(expr);
        return Math.tan(expr); //must be tan
    }

    @Override
    public Double visitInvTrig(CalculatorGrammarParser.InvTrigContext ctx) {
        double expr = visit(ctx.expr());  // get value of subexpression
        if ( ctx.op.getType() == CalculatorGrammarParser.ASIN ) return Math.asin(expr);
        if ( ctx.op.getType() == CalculatorGrammarParser.ACOS ) return Math.cos(expr);
        return Math.tan(expr); //must be tan
    }

    @Override
    public Double visitSqrt(CalculatorGrammarParser.SqrtContext ctx){
        double value = visit(ctx.expr());
        return Math.sqrt(value);
    }

    @Override
    public Double visitLog(CalculatorGrammarParser.LogContext ctx){
        double value = visit(ctx.expr());
        if (ctx.op.getType() == CalculatorGrammarParser.LOG10) return Math.log10(value);
        return Math.log(value);
    }

}