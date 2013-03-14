
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Mar 14 17:01:21 GMT 2013
//----------------------------------------------------

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Mar 14 17:01:21 GMT 2013
  */
public class QCup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public QCup() {super();}

  /** Constructor which sets the default scanner. */
  public QCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public QCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\051\000\002\002\003\000\002\002\004\000\002\003" +
    "\005\000\002\013\004\000\002\013\002\000\002\014\004" +
    "\000\002\014\002\000\002\012\007\000\002\012\005\000" +
    "\002\011\007\000\002\011\007\000\002\011\005\000\002" +
    "\011\005\000\002\004\006\000\002\004\010\000\002\004" +
    "\010\000\002\004\004\000\002\015\005\000\002\015\003" +
    "\000\002\005\007\000\002\005\005\000\002\005\003\000" +
    "\002\005\003\000\002\010\005\000\002\010\003\000\002" +
    "\006\005\000\002\006\003\000\002\007\003\000\002\007" +
    "\003\000\002\007\003\000\002\007\003\000\002\007\003" +
    "\000\002\016\003\000\002\016\003\000\002\016\003\000" +
    "\002\017\014\000\002\020\003\000\002\022\004\000\002" +
    "\022\003\000\002\021\004\000\002\023\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\002\001\ufffd\000\002\001\001\000\004\044" +
    "\011\001\ufffb\000\004\002\007\001\002\000\002\001\000" +
    "\000\002\001\ufffe\000\006\003\116\004\115\001\002\000" +
    "\010\003\015\004\013\045\014\001\002\000\004\031\054" +
    "\001\002\000\004\004\021\001\002\000\004\027\020\001" +
    "\002\000\002\001\uffff\000\002\001\ufffc\000\002\001\ufff1" +
    "\000\004\032\022\001\002\000\004\004\023\001\002\000" +
    "\004\031\051\001\002\000\006\033\026\040\025\001\002" +
    "\000\004\004\045\001\002\000\004\031\027\001\002\000" +
    "\010\004\030\030\033\046\031\001\002\000\002\001\uffdf" +
    "\000\002\001\uffe0\000\004\034\034\001\002\000\002\001" +
    "\uffe1\000\004\047\035\001\002\000\002\001\uffd9\000\004" +
    "\047\035\001\uffdd\000\002\001\uffdb\000\004\035\043\001" +
    "\002\000\004\027\042\001\002\000\002\001\uffda\000\002" +
    "\001\uffde\000\002\001\uffdc\000\004\031\046\001\002\000" +
    "\006\004\047\030\050\001\002\000\002\001\ufff7\000\002" +
    "\001\ufff8\000\006\004\052\030\053\001\002\000\002\001" +
    "\ufff5\000\002\001\ufff6\000\006\004\055\030\056\001\002" +
    "\000\004\010\107\001\002\000\006\010\057\027\060\001" +
    "\002\000\020\004\066\005\062\006\071\007\061\036\067" +
    "\042\063\043\070\001\002\000\002\001\ufff4\000\002\001" +
    "\uffe5\000\002\001\uffe6\000\002\001\uffe3\000\004\027\106" +
    "\001\002\000\002\001\uffec\000\002\001\uffeb\000\022\004" +
    "\066\005\062\006\071\007\061\036\067\041\072\042\063" +
    "\043\070\001\002\000\002\001\uffe2\000\002\001\uffe4\000" +
    "\020\004\066\005\062\006\071\007\061\036\067\042\063" +
    "\043\070\001\002\000\002\001\uffe7\000\006\037\076\040" +
    "\075\001\002\000\020\004\066\005\062\006\071\007\061" +
    "\036\067\042\063\043\070\001\002\000\002\001\uffed\000" +
    "\002\001\uffe8\000\002\001\uffe9\000\006\040\102\041\103" +
    "\001\002\000\020\004\066\005\062\006\071\007\061\036" +
    "\067\042\063\043\070\001\002\000\004\037\104\001\002" +
    "\000\002\001\uffee\000\002\001\uffea\000\002\001\ufff3\000" +
    "\020\004\066\005\062\006\071\007\061\036\067\042\063" +
    "\043\070\001\002\000\002\001\uffef\000\006\027\113\040" +
    "\112\001\002\000\020\004\066\005\062\006\071\007\061" +
    "\036\067\042\063\043\070\001\002\000\002\001\ufff2\000" +
    "\002\001\ufff0\000\004\031\120\001\002\000\004\027\117" +
    "\001\002\000\002\001\ufff9\000\004\004\023\001\002\000" +
    "\006\027\122\040\025\001\002\000\002\001\ufffa" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\010\002\005\003\003\013\004\001\001\000" +
    "\002\001\001\000\006\012\007\014\011\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\004\016\017\015\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\011\023\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\016\031\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\020\037\021\036\022\035\023\040" +
    "\001\001\000\002\001\001\000\006\021\043\023\040\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\005\063\007\064\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\005" +
    "\072\006\073\007\064\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\005\077\007\064\010\100\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\005\076\007\064" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\005\104\007\064\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\005\107\007\064\015\110\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\005\113\007" +
    "\064\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\011" +
    "\120\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$QCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$QCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$QCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



public String section = "main";
public void syntax_error(Symbol cur_token) {
report_error("Syntax error at line " + (cur_token.left+1) +
", column " + cur_token.right + " at section " + section, cur_token);
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$QCup$actions {
  private final QCup parser;

  /** Constructor */
  CUP$QCup$actions(QCup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$QCup$do_action(
    int                        CUP$QCup$act_num,
    java_cup.runtime.lr_parser CUP$QCup$parser,
    java.util.Stack            CUP$QCup$stack,
    int                        CUP$QCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$QCup$result;

      /* select the action based on the action number */
      switch (CUP$QCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // expr ::= TEST 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("expr",17, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // statement ::= expr SEMI 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("statement",15, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-1)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // statementList ::= statement 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("statementList",16, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // statementList ::= statementList statement 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("statementList",16, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-1)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // fbody ::= statementList 
            {
              Object RESULT =null;
		int slleft = ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()).left;
		int slright = ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()).right;
		Object sl = (Object)((java_cup.runtime.Symbol) CUP$QCup$stack.peek()).value;
		 RESULT = sl; 
				        System.out.println( "entering function body and result is " + sl); 
				      
              CUP$QCup$result = parser.getSymbolFactory().newSymbol("fbody",14, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // functionDecl ::= FDEF ID LPAREN fieldDecl RPAREN COLON type_specifier LBRACE fbody RBRACE 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("functionDecl",13, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-9)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // type_specifier ::= ID 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("type_specifier",12, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // type_specifier ::= VOID 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("type_specifier",12, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // type_specifier ::= TYPE 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("type_specifier",12, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // simpleInit ::= CHAR 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("simpleInit",5, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // simpleInit ::= STRING_LITERAL 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("simpleInit",5, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // simpleInit ::= FLOAT 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("simpleInit",5, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // simpleInit ::= INT 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("simpleInit",5, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // simpleInit ::= BOOL 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("simpleInit",5, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // list ::= initalisation 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("list",4, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // list ::= list COMMA initalisation 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("list",4, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-2)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // tuple ::= initalisation 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("tuple",6, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // tuple ::= tuple COMMA initalisation 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("tuple",6, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-2)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // initalisation ::= ID 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("initalisation",3, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // initalisation ::= simpleInit 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("initalisation",3, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // initalisation ::= LSQPAREN list RSQPAREN 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("initalisation",3, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-2)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // initalisation ::= LSQPAREN PIPE tuple PIPE RSQPAREN 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("initalisation",3, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-4)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // newDT ::= initalisation 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("newDT",11, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // newDT ::= newDT COMMA initalisation 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("newDT",11, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-2)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // variableDecl ::= error SEMI 
            {
              Object RESULT =null;
		 System.err.println("Invalid variable declaration"); 
              CUP$QCup$result = parser.getSymbolFactory().newSymbol("variableDecl",2, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-1)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // variableDecl ::= ID COLON ID EQ newDT SEMI 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("variableDecl",2, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-5)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // variableDecl ::= ID COLON TYPE EQ initalisation SEMI 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("variableDecl",2, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-5)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // variableDecl ::= ID COLON TYPE SEMI 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("variableDecl",2, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-3)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // fieldDecl ::= ID COLON ID 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("fieldDecl",7, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-2)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // fieldDecl ::= ID COLON TYPE 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("fieldDecl",7, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-2)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // fieldDecl ::= fieldDecl COMMA ID COLON ID 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("fieldDecl",7, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-4)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // fieldDecl ::= fieldDecl COMMA ID COLON TYPE 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("fieldDecl",7, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-4)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // typeDecl ::= TDEF error SEMI 
            {
              Object RESULT =null;
		 System.err.println("Invalid type declaration"); 
              CUP$QCup$result = parser.getSymbolFactory().newSymbol("typeDecl",8, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-2)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // typeDecl ::= TDEF ID COLON fieldDecl SEMI 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("typeDecl",8, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-4)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // variableDeclList ::= 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("variableDeclList",10, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // variableDeclList ::= variableDeclList variableDecl 
            {
              Object RESULT =null;
		 parser.section = "Variable Declaration"; 
              CUP$QCup$result = parser.getSymbolFactory().newSymbol("variableDeclList",10, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-1)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // typeDeclList ::= 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("typeDeclList",9, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // typeDeclList ::= typeDeclList typeDecl 
            {
              Object RESULT =null;
		 parser.section = "Type Declaration"; 
              CUP$QCup$result = parser.getSymbolFactory().newSymbol("typeDeclList",9, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-1)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // grammar ::= typeDeclList variableDeclList functionDecl 
            {
              Object RESULT =null;

              CUP$QCup$result = parser.getSymbolFactory().newSymbol("grammar",1, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-2)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$QCup$stack.elementAt(CUP$QCup$top-1)).value;
		RESULT = start_val;
              CUP$QCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$QCup$stack.elementAt(CUP$QCup$top-1)), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$QCup$parser.done_parsing();
          return CUP$QCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= grammar 
            {
              Object RESULT =null;
		 System.out.println("========end parsing=========="); 
              CUP$QCup$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$QCup$stack.peek()), RESULT);
            }
          return CUP$QCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

