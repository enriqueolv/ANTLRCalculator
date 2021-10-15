import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame implements ActionListener {
	// create a frame
	static JFrame f;

	// create a textfield
	static JTextField l;

	// store operator and operands
	String inputString;
	String outputString;
	String curString;

	// default constructor
	Calculator() {
		inputString = outputString = curString = "";
	}

	// main function
	public static void main(String args[]) {
		// create a frame
		f = new JFrame("Calculator");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			// set look and feel
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// create a object of class
		Calculator calculator = new Calculator();

		// create a textfield
		l = new JTextField(20);

		// set the textfield to non editable
		l.setEditable(true);

		// create number buttons and some operators
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;
		JButton bpow, bsin, bcos, btan, bdot, bsqrt, bpi, bx, baa, bac, by, bz, bassign;
		JButton blog, bln, bsn;

		// create number buttons
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");

		// equals button
		beq1 = new JButton("Enter");

		// create operator buttons
		bsn = new JButton("E");
		ba = new JButton("+");
		bs = new JButton("-");
		bd = new JButton("/");
		bm = new JButton("*");
		bpow = new JButton("^");
		bsin = new JButton("sin");
		bcos = new JButton("cos");
		btan = new JButton("tan");
		bsqrt = new JButton("sqrt");
		bpi = new JButton("pi");
		be = new JButton("e");
		beq = new JButton("Clear");
		bx = new JButton("x");
		by = new JButton("y");
		bz = new JButton("z");
		baa = new JButton("(");
		bac = new JButton(")");
		bassign = new JButton("=");
		blog = new JButton("log");
		bln = new JButton("ln");
		// create . button
		bdot = new JButton(".");

		// create a panel
		JPanel p = new JPanel();

		// add action listeners
		
        
        bsn.addActionListener(calculator);
		bm.addActionListener(calculator);
		bd.addActionListener(calculator);
		bs.addActionListener(calculator);
		ba.addActionListener(calculator);
		b9.addActionListener(calculator);
		b8.addActionListener(calculator);
		b7.addActionListener(calculator);
		b6.addActionListener(calculator);
		b5.addActionListener(calculator);
		b4.addActionListener(calculator);
		b3.addActionListener(calculator);
		b2.addActionListener(calculator);
		b1.addActionListener(calculator);
		b0.addActionListener(calculator);
		bdot.addActionListener(calculator);
		beq.addActionListener(calculator);
		beq1.addActionListener(calculator);
		be.addActionListener(calculator);
		bpow.addActionListener(calculator);
		bsin.addActionListener(calculator);
		bcos.addActionListener(calculator);
		btan.addActionListener(calculator);
		bsqrt.addActionListener(calculator);
		bpi.addActionListener(calculator);
		bx.addActionListener(calculator);
		by.addActionListener(calculator);
		bz.addActionListener(calculator);
		baa.addActionListener(calculator);
		bac.addActionListener(calculator);
		bassign.addActionListener(calculator);
		blog.addActionListener(calculator);
		bln.addActionListener(calculator);

		//add elements to panel
        //screen
        p.add(l);
        //numbers
        /*
        p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b0);*/


       


		p.add(bsn);
        p.add(be);

		p.add(ba);
		p.add(bs);
		p.add(bm);
		p.add(bd);
		p.add(bdot);
		p.add(bpow);

        //tigonometric functions
		p.add(bsin);
		p.add(bcos);
		p.add(btan);
		p.add(bsqrt);
		
		p.add(bpi);
		p.add(bx);
		p.add(by);
		p.add(bz);
		p.add(bassign);
		p.add(blog);
		p.add(bln);
		p.add(baa);
		p.add(bac);
		

    

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3, 10, 10));
        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(new JButton(""));
        buttonPanel.add(b0);
        buttonPanel.add(new JButton(""));
        p.add(buttonPanel);

        JLabel space = new JLabel("                                                           ");
        p.add(space);


        p.add(beq1);
		p.add(beq);

		// set Background of panel
		p.setBackground(Color.black);



		// add panel to frame
		f.add(p);

		f.setSize(300, 400);
		f.show();
	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		// string is being input
		// if the value is a number
		if (s.charAt(0) != 'C' && s != "enter") {
			// if operand is present then add to second no
			inputString += s;
			curString += s;

			outputString = curString;
			// set the value of text
			l.setText(outputString);
		} else if (s.charAt(0) == 'C') {

			// clear the one letter
			inputString = "clear;";
			outputString = " ";
			double value;

			ANTLRInputStream input = new ANTLRInputStream(inputString);
			CalculatorGrammarLexer lexer = new CalculatorGrammarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CalculatorGrammarParser parser = new CalculatorGrammarParser(tokens);
			ParseTree tree = parser.prog(); // parse; start at prog ​
			//
			ConcreteVisitor visitor = new ConcreteVisitor();
			value = visitor.visit(tree); // set the value of text
			inputString = "";
			curString = "";
			// set the value of text
			l.setText(outputString);
		} else if (s == "enter") {

			double value = 0.0;
			outputString = curString;
			inputString += ";";
			ANTLRInputStream input = new ANTLRInputStream(inputString);
			CalculatorGrammarLexer lexer = new CalculatorGrammarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CalculatorGrammarParser parser = new CalculatorGrammarParser(tokens);
			ParseTree tree = parser.prog(); // parse; start at prog ​System.out.println(inputString+" value: "+value);
			//
			ConcreteVisitor visitor = new ConcreteVisitor();
			value = visitor.visit(tree); // set the value of text

			outputString = " " + value;
			l.setText(outputString);
			curString = " ";
		}
		// set the value of text
		l.setText(outputString);
	}
}