/* The following code was generated by JFlex 1.4.3 on 4/21/13 5:19 PM */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/21/13 5:19 PM from the specification file
 * <tt>C:/Users/EmilGeorge/Documents/GitHub/QCompiler/Compilers/Q.lex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;
  public static final int TRADITIONALCOMMENT = 6;
  public static final int ENDOFLINECOMMENT = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\5\1\21\1\2\1\0\1\21\1\1\16\5\4\0\1\21\1\37"+
    "\1\57\1\0\1\5\1\0\1\51\1\32\1\52\1\53\1\43\1\42"+
    "\1\56\1\7\1\20\1\44\1\6\11\3\1\34\1\35\1\40\1\36"+
    "\1\41\2\0\32\33\1\46\1\63\1\50\1\45\1\5\1\0\1\15"+
    "\1\26\1\30\1\60\1\13\1\14\1\27\1\31\1\22\2\4\1\16"+
    "\1\4\1\23\1\24\1\25\1\4\1\11\1\17\1\10\1\12\1\62"+
    "\1\61\3\4\1\54\1\47\1\55\1\0\41\5\2\0\4\5\4\0"+
    "\1\5\2\0\1\5\7\0\1\5\4\0\1\5\5\0\27\5\1\0"+
    "\37\5\1\0\u01ca\5\4\0\14\5\16\0\5\5\7\0\1\5\1\0"+
    "\1\5\21\0\165\5\1\0\2\5\2\0\4\5\10\0\1\5\1\0"+
    "\3\5\1\0\1\5\1\0\24\5\1\0\123\5\1\0\213\5\1\0"+
    "\5\5\2\0\236\5\11\0\46\5\2\0\1\5\7\0\47\5\11\0"+
    "\55\5\1\0\1\5\1\0\2\5\1\0\2\5\1\0\1\5\10\0"+
    "\33\5\5\0\3\5\15\0\4\5\7\0\1\5\4\0\13\5\5\0"+
    "\112\5\4\0\146\5\1\0\11\5\1\0\12\5\1\0\23\5\2\0"+
    "\1\5\17\0\74\5\2\0\145\5\16\0\66\5\4\0\1\5\5\0"+
    "\56\5\22\0\34\5\244\0\144\5\2\0\12\5\1\0\7\5\1\0"+
    "\7\5\1\0\3\5\1\0\10\5\2\0\2\5\2\0\26\5\1\0"+
    "\7\5\1\0\1\5\3\0\4\5\2\0\11\5\2\0\2\5\2\0"+
    "\4\5\10\0\1\5\4\0\2\5\1\0\5\5\2\0\16\5\7\0"+
    "\1\5\5\0\3\5\1\0\6\5\4\0\2\5\2\0\26\5\1\0"+
    "\7\5\1\0\2\5\1\0\2\5\1\0\2\5\2\0\1\5\1\0"+
    "\5\5\4\0\2\5\2\0\3\5\3\0\1\5\7\0\4\5\1\0"+
    "\1\5\7\0\20\5\13\0\3\5\1\0\11\5\1\0\3\5\1\0"+
    "\26\5\1\0\7\5\1\0\2\5\1\0\5\5\2\0\12\5\1\0"+
    "\3\5\1\0\3\5\2\0\1\5\17\0\4\5\2\0\12\5\1\0"+
    "\1\5\17\0\3\5\1\0\10\5\2\0\2\5\2\0\26\5\1\0"+
    "\7\5\1\0\2\5\1\0\5\5\2\0\11\5\2\0\2\5\2\0"+
    "\3\5\10\0\2\5\4\0\2\5\1\0\5\5\2\0\12\5\1\0"+
    "\1\5\20\0\2\5\1\0\6\5\3\0\3\5\1\0\4\5\3\0"+
    "\2\5\1\0\1\5\1\0\2\5\3\0\2\5\3\0\3\5\3\0"+
    "\14\5\4\0\5\5\3\0\3\5\1\0\4\5\2\0\1\5\6\0"+
    "\1\5\16\0\12\5\11\0\1\5\7\0\3\5\1\0\10\5\1\0"+
    "\3\5\1\0\27\5\1\0\12\5\1\0\5\5\3\0\10\5\1\0"+
    "\3\5\1\0\4\5\7\0\2\5\1\0\2\5\6\0\4\5\2\0"+
    "\12\5\22\0\2\5\1\0\10\5\1\0\3\5\1\0\27\5\1\0"+
    "\12\5\1\0\5\5\2\0\11\5\1\0\3\5\1\0\4\5\7\0"+
    "\2\5\7\0\1\5\1\0\4\5\2\0\12\5\1\0\2\5\17\0"+
    "\2\5\1\0\10\5\1\0\3\5\1\0\51\5\2\0\10\5\1\0"+
    "\3\5\1\0\5\5\10\0\1\5\10\0\4\5\2\0\12\5\12\0"+
    "\6\5\2\0\2\5\1\0\22\5\3\0\30\5\1\0\11\5\1\0"+
    "\1\5\2\0\7\5\3\0\1\5\4\0\6\5\1\0\1\5\1\0"+
    "\10\5\22\0\2\5\15\0\72\5\4\0\20\5\1\0\12\5\47\0"+
    "\2\5\1\0\1\5\2\0\2\5\1\0\1\5\2\0\1\5\6\0"+
    "\4\5\1\0\7\5\1\0\3\5\1\0\1\5\1\0\1\5\2\0"+
    "\2\5\1\0\15\5\1\0\3\5\2\0\5\5\1\0\1\5\1\0"+
    "\6\5\2\0\12\5\2\0\2\5\42\0\1\5\27\0\2\5\6\0"+
    "\12\5\13\0\1\5\1\0\1\5\1\0\1\5\4\0\12\5\1\0"+
    "\44\5\4\0\24\5\1\0\22\5\1\0\44\5\11\0\1\5\71\0"+
    "\112\5\6\0\116\5\2\0\46\5\12\0\53\5\1\0\1\5\3\0"+
    "\u0149\5\1\0\4\5\2\0\7\5\1\0\1\5\1\0\4\5\2\0"+
    "\51\5\1\0\4\5\2\0\41\5\1\0\4\5\2\0\7\5\1\0"+
    "\1\5\1\0\4\5\2\0\17\5\1\0\71\5\1\0\4\5\2\0"+
    "\103\5\2\0\3\5\40\0\20\5\20\0\125\5\14\0\u026c\5\2\0"+
    "\21\5\1\0\32\5\5\0\113\5\3\0\3\5\17\0\15\5\1\0"+
    "\7\5\13\0\25\5\13\0\24\5\14\0\15\5\1\0\3\5\1\0"+
    "\2\5\14\0\124\5\3\0\1\5\3\0\3\5\2\0\12\5\41\0"+
    "\3\5\2\0\12\5\6\0\130\5\10\0\53\5\5\0\106\5\12\0"+
    "\35\5\3\0\14\5\4\0\14\5\12\0\50\5\2\0\5\5\13\0"+
    "\54\5\4\0\32\5\6\0\12\5\46\0\34\5\4\0\77\5\1\0"+
    "\35\5\2\0\13\5\6\0\12\5\15\0\1\5\130\0\114\5\4\0"+
    "\12\5\21\0\11\5\14\0\53\5\3\0\14\5\6\0\64\5\14\0"+
    "\70\5\10\0\12\5\3\0\61\5\122\0\3\5\1\0\37\5\15\0"+
    "\347\5\25\0\u011a\5\2\0\6\5\2\0\46\5\2\0\6\5\2\0"+
    "\10\5\1\0\1\5\1\0\1\5\1\0\1\5\1\0\37\5\2\0"+
    "\65\5\1\0\7\5\1\0\1\5\3\0\3\5\1\0\7\5\3\0"+
    "\4\5\2\0\6\5\4\0\15\5\5\0\3\5\1\0\7\5\16\0"+
    "\5\5\32\0\5\5\20\0\2\5\23\0\1\5\13\0\5\5\5\0"+
    "\6\5\1\0\1\5\15\0\1\5\20\0\15\5\3\0\32\5\26\0"+
    "\15\5\4\0\1\5\3\0\14\5\21\0\1\5\4\0\1\5\2\0"+
    "\12\5\1\0\1\5\3\0\5\5\6\0\1\5\1\0\1\5\1\0"+
    "\1\5\1\0\4\5\1\0\13\5\2\0\4\5\5\0\5\5\4\0"+
    "\1\5\21\0\51\5\u0a77\0\57\5\1\0\57\5\1\0\205\5\6\0"+
    "\7\5\16\0\46\5\12\0\66\5\11\0\1\5\17\0\30\5\11\0"+
    "\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0"+
    "\7\5\1\0\7\5\1\0\7\5\1\0\40\5\57\0\1\5\u01d5\0"+
    "\3\5\31\0\17\5\1\0\5\5\2\0\5\5\4\0\126\5\2\0"+
    "\2\5\2\0\3\5\1\0\132\5\1\0\4\5\5\0\51\5\3\0"+
    "\136\5\21\0\33\5\65\0\20\5\u0200\0\u19b6\5\112\0\u51cc\5\64\0"+
    "\u048d\5\103\0\56\5\2\0\u010d\5\3\0\34\5\24\0\60\5\14\0"+
    "\2\5\1\0\31\5\10\0\122\5\45\0\11\5\2\0\147\5\2\0"+
    "\4\5\1\0\2\5\16\0\12\5\120\0\56\5\20\0\1\5\7\0"+
    "\64\5\14\0\105\5\13\0\12\5\6\0\30\5\3\0\1\5\4\0"+
    "\56\5\2\0\44\5\14\0\35\5\3\0\101\5\16\0\13\5\46\0"+
    "\67\5\11\0\16\5\2\0\12\5\6\0\27\5\3\0\2\5\4\0"+
    "\103\5\30\0\3\5\43\0\6\5\2\0\6\5\2\0\6\5\11\0"+
    "\7\5\1\0\7\5\221\0\53\5\1\0\2\5\2\0\12\5\6\0"+
    "\u2ba4\5\14\0\27\5\4\0\61\5\u2104\0\u012e\5\2\0\76\5\2\0"+
    "\152\5\46\0\7\5\14\0\5\5\5\0\14\5\1\0\15\5\1\0"+
    "\5\5\1\0\1\5\1\0\2\5\1\0\2\5\1\0\154\5\41\0"+
    "\u016b\5\22\0\100\5\2\0\66\5\50\0\15\5\3\0\20\5\20\0"+
    "\7\5\14\0\2\5\30\0\3\5\31\0\1\5\6\0\5\5\1\0"+
    "\207\5\2\0\1\5\4\0\1\5\13\0\12\5\7\0\32\5\4\0"+
    "\1\5\1\0\32\5\13\0\131\5\3\0\6\5\2\0\6\5\2\0"+
    "\6\5\2\0\3\5\3\0\2\5\3\0\2\5\22\0\3\5\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\4\1\3\1\5\7\4"+
    "\1\6\3\4\1\1\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\1\1\22"+
    "\1\1\1\23\1\24\1\25\1\26\1\27\1\30\3\4"+
    "\1\31\1\32\1\33\2\34\2\2\2\0\14\4\1\35"+
    "\1\36\2\4\1\0\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\2\4"+
    "\1\53\1\54\1\55\1\56\1\57\12\4\1\60\2\4"+
    "\1\61\2\4\1\62\2\4\1\63\1\4\1\64\3\4"+
    "\1\65\1\66\2\4\1\67\2\4\1\70\1\4\1\71"+
    "\1\72\1\73";

  private static int [] zzUnpackAction() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\320\0\u0104\0\u0138"+
    "\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8"+
    "\0\u030c\0\320\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\320"+
    "\0\u0444\0\u0478\0\u04ac\0\u04e0\0\320\0\320\0\u0514\0\320"+
    "\0\u0548\0\u057c\0\320\0\u05b0\0\320\0\320\0\320\0\320"+
    "\0\320\0\320\0\u05e4\0\u0618\0\u064c\0\u0680\0\320\0\u06b4"+
    "\0\u06e8\0\320\0\u071c\0\u0750\0\u0784\0\u016c\0\u07b8\0\u07ec"+
    "\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c"+
    "\0\u09c0\0\u09f4\0\u0138\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\320"+
    "\0\320\0\320\0\320\0\320\0\320\0\320\0\320\0\320"+
    "\0\320\0\320\0\u0138\0\u0af8\0\u0b2c\0\320\0\320\0\320"+
    "\0\320\0\u0784\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64"+
    "\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0138\0\u0a28\0\u0d68\0\u0138"+
    "\0\u0d9c\0\u0dd0\0\320\0\u0e04\0\u0e38\0\u0138\0\u0e6c\0\u0138"+
    "\0\u0ea0\0\u0ed4\0\u0f08\0\u0138\0\u0138\0\u0f3c\0\u0f70\0\u0138"+
    "\0\u0fa4\0\u0fd8\0\u0138\0\u100c\0\u0138\0\u0138\0\u0138";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\2\6\1\7\1\10\1\5\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\10\1\20\1\21\1\22"+
    "\1\6\1\23\3\10\1\24\1\10\1\25\1\10\1\26"+
    "\1\5\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\1\5\1\56\2\0\54\56\1\57\3\56\1\60\1\6"+
    "\1\61\1\62\62\6\1\63\41\6\1\64\20\6\67\0"+
    "\1\7\2\0\1\7\11\0\1\65\46\0\4\10\1\0"+
    "\10\10\2\0\10\10\1\0\1\10\24\0\3\10\4\0"+
    "\1\66\2\0\1\66\11\0\1\65\46\0\1\7\2\0"+
    "\1\66\60\0\4\10\1\0\1\10\1\67\1\70\5\10"+
    "\2\0\10\10\1\0\1\10\24\0\1\71\2\10\4\0"+
    "\4\10\1\0\3\10\1\72\4\10\2\0\10\10\1\0"+
    "\1\10\24\0\3\10\4\0\4\10\1\0\10\10\2\0"+
    "\1\10\1\73\6\10\1\0\1\10\24\0\3\10\4\0"+
    "\4\10\1\0\6\10\1\74\1\10\2\0\10\10\1\0"+
    "\1\10\24\0\3\10\4\0\4\10\1\0\5\10\1\75"+
    "\1\76\1\10\2\0\10\10\1\0\1\10\24\0\1\77"+
    "\2\10\4\0\4\10\1\0\3\10\1\100\4\10\2\0"+
    "\1\101\7\10\1\0\1\10\24\0\3\10\4\0\4\10"+
    "\1\0\1\102\7\10\2\0\10\10\1\0\1\10\24\0"+
    "\3\10\4\0\4\10\1\0\4\10\1\103\3\10\2\0"+
    "\1\10\1\104\6\10\1\0\1\10\24\0\3\10\4\0"+
    "\4\10\1\0\10\10\2\0\2\10\1\105\5\10\1\0"+
    "\1\10\24\0\3\10\4\0\4\10\1\0\10\10\2\0"+
    "\7\10\1\106\1\0\1\10\24\0\3\10\4\0\2\107"+
    "\1\0\1\107\1\0\10\107\2\0\10\107\1\0\1\107"+
    "\24\0\3\107\35\0\1\110\65\0\1\111\63\0\1\112"+
    "\63\0\1\113\63\0\1\114\70\0\1\115\1\116\66\0"+
    "\1\117\63\0\1\120\1\121\64\0\1\122\15\0\4\10"+
    "\1\0\10\10\2\0\2\10\1\123\5\10\1\0\1\10"+
    "\24\0\3\10\4\0\4\10\1\0\10\10\2\0\7\10"+
    "\1\124\1\0\1\10\24\0\3\10\4\0\4\10\1\0"+
    "\10\10\2\0\2\10\1\125\5\10\1\0\1\10\24\0"+
    "\3\10\1\0\1\56\2\0\54\56\1\0\3\56\11\0"+
    "\1\126\1\127\11\0\1\130\33\0\1\131\6\0\1\62"+
    "\63\0\1\6\125\0\1\62\22\0\1\132\2\0\1\132"+
    "\60\0\4\10\1\0\2\10\1\133\5\10\2\0\10\10"+
    "\1\0\1\10\24\0\3\10\4\0\4\10\1\0\10\10"+
    "\2\0\3\10\1\134\4\10\1\0\1\10\24\0\3\10"+
    "\4\0\4\10\1\0\3\10\1\135\4\10\2\0\10\10"+
    "\1\0\1\10\24\0\3\10\4\0\4\10\1\0\1\136"+
    "\7\10\2\0\3\10\1\137\4\10\1\0\1\10\24\0"+
    "\3\10\4\0\4\10\1\0\1\140\7\10\2\0\10\10"+
    "\1\0\1\10\24\0\3\10\4\0\4\10\1\0\7\10"+
    "\1\141\2\0\10\10\1\0\1\10\24\0\3\10\4\0"+
    "\4\10\1\0\6\10\1\142\1\10\2\0\10\10\1\0"+
    "\1\10\24\0\3\10\4\0\4\10\1\0\10\10\2\0"+
    "\2\10\1\143\5\10\1\0\1\10\24\0\3\10\4\0"+
    "\4\10\1\0\3\10\1\144\4\10\2\0\10\10\1\0"+
    "\1\10\24\0\3\10\4\0\4\10\1\0\10\10\2\0"+
    "\1\10\1\145\6\10\1\0\1\10\24\0\3\10\4\0"+
    "\4\10\1\0\7\10\1\146\2\0\10\10\1\0\1\10"+
    "\24\0\3\10\4\0\4\10\1\0\1\10\1\147\6\10"+
    "\2\0\10\10\1\0\1\10\24\0\3\10\4\0\4\10"+
    "\1\0\1\150\7\10\2\0\10\10\1\0\1\10\24\0"+
    "\3\10\4\0\4\10\1\0\10\10\2\0\2\10\1\151"+
    "\5\10\1\0\1\10\24\0\3\10\4\0\4\10\1\0"+
    "\5\10\1\152\2\10\2\0\10\10\1\0\1\10\24\0"+
    "\3\10\33\0\1\153\34\0\4\10\1\0\10\10\2\0"+
    "\1\154\7\10\1\0\1\10\24\0\3\10\4\0\4\10"+
    "\1\0\10\10\2\0\1\155\7\10\1\0\1\10\24\0"+
    "\3\10\4\0\4\10\1\0\3\10\1\156\4\10\2\0"+
    "\10\10\1\0\1\10\24\0\3\10\4\0\4\10\1\0"+
    "\6\10\1\157\1\10\2\0\10\10\1\0\1\10\24\0"+
    "\3\10\4\0\4\10\1\0\4\10\1\160\3\10\2\0"+
    "\10\10\1\0\1\10\24\0\3\10\4\0\4\10\1\0"+
    "\2\10\1\161\5\10\2\0\10\10\1\0\1\10\24\0"+
    "\3\10\4\0\4\10\1\0\3\10\1\162\4\10\2\0"+
    "\10\10\1\0\1\10\24\0\3\10\4\0\4\10\1\0"+
    "\10\10\2\0\1\163\7\10\1\0\1\10\24\0\3\10"+
    "\4\0\4\10\1\0\3\10\1\164\4\10\2\0\10\10"+
    "\1\0\1\10\24\0\3\10\4\0\4\10\1\0\7\10"+
    "\1\133\2\0\10\10\1\0\1\10\24\0\3\10\4\0"+
    "\4\10\1\0\5\10\1\146\2\10\2\0\10\10\1\0"+
    "\1\10\24\0\3\10\4\0\4\10\1\0\4\10\1\165"+
    "\3\10\2\0\10\10\1\0\1\10\24\0\3\10\4\0"+
    "\4\10\1\0\10\10\2\0\1\166\7\10\1\0\1\10"+
    "\24\0\3\10\4\0\4\10\1\0\6\10\1\150\1\10"+
    "\2\0\10\10\1\0\1\10\24\0\3\10\4\0\4\10"+
    "\1\0\1\10\1\150\6\10\2\0\10\10\1\0\1\10"+
    "\24\0\3\10\4\0\4\10\1\0\6\10\1\167\1\10"+
    "\2\0\10\10\1\0\1\10\24\0\3\10\4\0\4\10"+
    "\1\0\10\10\2\0\10\10\1\0\1\10\24\0\1\170"+
    "\2\10\4\0\4\10\1\0\3\10\1\150\4\10\2\0"+
    "\10\10\1\0\1\10\24\0\3\10\4\0\4\10\1\0"+
    "\1\10\1\171\6\10\2\0\10\10\1\0\1\10\24\0"+
    "\3\10\4\0\4\10\1\0\5\10\1\172\2\10\2\0"+
    "\10\10\1\0\1\10\24\0\3\10\4\0\4\10\1\0"+
    "\6\10\1\173\1\10\2\0\10\10\1\0\1\10\24\0"+
    "\3\10\4\0\4\10\1\0\10\10\2\0\1\10\1\174"+
    "\6\10\1\0\1\10\24\0\3\10\4\0\4\10\1\0"+
    "\3\10\1\175\4\10\2\0\10\10\1\0\1\10\24\0"+
    "\3\10\4\0\4\10\1\0\10\10\2\0\1\10\1\176"+
    "\6\10\1\0\1\10\24\0\3\10\4\0\4\10\1\0"+
    "\1\177\7\10\2\0\10\10\1\0\1\10\24\0\3\10"+
    "\4\0\4\10\1\0\10\10\2\0\5\10\1\150\2\10"+
    "\1\0\1\10\24\0\3\10\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4160];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\2\11\13\1\1\11\5\1\1\11\4\1\2\11"+
    "\1\1\1\11\2\1\1\11\1\1\6\11\4\1\1\11"+
    "\2\1\1\11\2\1\2\0\20\1\1\0\13\11\3\1"+
    "\4\11\21\1\1\11\24\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  StringBuffer string = new StringBuffer();
  
  private Symbol symbol(int type) { 
    return new Symbol(type, yyline, yycolumn);
  } 
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1900) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 20: 
          { return symbol(sym.RPAREN);
          }
        case 60: break;
        case 4: 
          { return symbol(sym.ID, yytext());
          }
        case 61: break;
        case 52: 
          { QCup.section = "Type Declaration"; 
						return symbol(sym.TDEF);
          }
        case 62: break;
        case 43: 
          { string.append('\t');
          }
        case 63: break;
        case 17: 
          { return symbol(sym.LSQPAREN);
          }
        case 64: break;
        case 21: 
          { return symbol(sym.LBRACE);
          }
        case 65: break;
        case 24: 
          { string.setLength(0); yybegin(STRING);
          }
        case 66: break;
        case 41: 
          { return symbol(sym.AND);
          }
        case 67: break;
        case 34: 
          { return symbol(sym.LESSOREQ);
          }
        case 68: break;
        case 10: 
          { return symbol(sym.NOT);
          }
        case 69: break;
        case 27: 
          { string.append('\\');
          }
        case 70: break;
        case 58: 
          { return symbol(sym.RETURN);
          }
        case 71: break;
        case 44: 
          { string.append('\r');
          }
        case 72: break;
        case 37: 
          { yybegin(ENDOFLINECOMMENT);
          }
        case 73: break;
        case 1: 
          { QCup.numOfErrors++;  System.err.println("Illegal character <"+
                                                    yytext()+"> at line " + (yyline + 1) + ", column " + (yycolumn + 1) + " at section " + QCup.section);
          }
        case 74: break;
        case 31: 
          { return symbol(sym.CONCAT);
          }
        case 75: break;
        case 28: 
          { yybegin(YYINITIAL);
          }
        case 76: break;
        case 13: 
          { return symbol(sym.PLUS);
          }
        case 77: break;
        case 48: 
          { return symbol(sym.LEN);
          }
        case 78: break;
        case 38: 
          { return symbol(sym.LTUPLE);
          }
        case 79: break;
        case 11: 
          { return symbol(sym.LESS);
          }
        case 80: break;
        case 51: 
          { return symbol(sym.BOOL, new Boolean(yytext()));
          }
        case 81: break;
        case 18: 
          { return symbol(sym.RSQPAREN);
          }
        case 82: break;
        case 49: 
          { return symbol(sym.TYPE, yytext());
          }
        case 83: break;
        case 55: 
          { return symbol(sym.VOID);
          }
        case 84: break;
        case 42: 
          { return symbol(sym.DO);
          }
        case 85: break;
        case 14: 
          { return symbol(sym.TIMES);
          }
        case 86: break;
        case 3: 
          { return symbol(sym.INT, new Integer(yytext()));
          }
        case 87: break;
        case 53: 
          { return symbol(sym.ELSE);
          }
        case 88: break;
        case 46: 
          { string.append('\"');
          }
        case 89: break;
        case 7: 
          { return symbol(sym.COLON);
          }
        case 90: break;
        case 12: 
          { return symbol(sym.GREATER);
          }
        case 91: break;
        case 57: 
          { return symbol(sym.WHILE);
          }
        case 92: break;
        case 29: 
          { return symbol(sym.IF);
          }
        case 93: break;
        case 19: 
          { return symbol(sym.LPAREN);
          }
        case 94: break;
        case 54: 
          { QCup.section = "Function Declaration"; 
						return symbol(sym.FDEF);
          }
        case 95: break;
        case 56: 
          { return symbol(sym.UNTIL);
          }
        case 96: break;
        case 39: 
          { return symbol(sym.OR);
          }
        case 97: break;
        case 30: 
          { return symbol(sym.IN);
          }
        case 98: break;
        case 9: 
          { return symbol(sym.EQ);
          }
        case 99: break;
        case 22: 
          { return symbol(sym.RBRACE);
          }
        case 100: break;
        case 47: 
          { return symbol(sym.FLOAT, new Float(yytext()));
          }
        case 101: break;
        case 45: 
          { string.append('\n');
          }
        case 102: break;
        case 8: 
          { return symbol(sym.SEMI);
          }
        case 103: break;
        case 26: 
          { yybegin(YYINITIAL); 
                          return symbol(sym.STRING_LITERAL, 
                          string.toString());
          }
        case 104: break;
        case 5: 
          { return symbol(sym.MINUS);
          }
        case 105: break;
        case 36: 
          { yybegin(TRADITIONALCOMMENT);
          }
        case 106: break;
        case 35: 
          { return symbol(sym.GREATEROREQ);
          }
        case 107: break;
        case 40: 
          { return symbol(sym.RTUPLE);
          }
        case 108: break;
        case 15: 
          { return symbol(sym.DIVIDE);
          }
        case 109: break;
        case 50: 
          { return symbol(sym.CHAR, yytext().charAt(1));
          }
        case 110: break;
        case 33: 
          { return symbol(sym.NOTEQ);
          }
        case 111: break;
        case 23: 
          { return symbol(sym.COMMA);
          }
        case 112: break;
        case 32: 
          { return symbol(sym.EQCOMP);
          }
        case 113: break;
        case 25: 
          { string.append( yytext() );
          }
        case 114: break;
        case 16: 
          { return symbol(sym.POWER);
          }
        case 115: break;
        case 59: 
          { return symbol(sym.REPEAT);
          }
        case 116: break;
        case 6: 
          { return symbol(sym.DOT);
          }
        case 117: break;
        case 2: 
          { 
          }
        case 118: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
