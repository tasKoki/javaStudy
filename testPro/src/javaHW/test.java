package javaHW;

import java.io.IOException;

public class test {

	/**
	 * @param args
	 */
	//
	public static void main(String[] args) {
	    app();
	    cs();
	    array();
	    bool();
	    testByte();
	    testChar();
	    classArray();
	    doubleMeth();
	    floatMeth();
	    integerMeth();

	}
	// 10/5
    public static void app() {
	     app a = new app();
      char paramChar='c';
      try {
      a.append(paramChar);
      } catch(IOException e) {
          // 処理なし
      }
      System.out.println(a.equals(null));
      System.out.println(cs());
	}
    // 10/6
	public static int cs() {
	    charSeq a = new charSeq();
	    return a.length();
	}
	// 10/7
	public static void array () {
	    String[] array = new String[]{
	            "test","banana"
	    };
	    System.out.println(array[0]);
	}
	// 10/8
    private static void bool() {
        Boolean bl = new Boolean(true);
        if (bl.booleanValue()) {
            System.out.println("true");
        }
    }
    // 10/9
    private static void testByte() {
        Byte by = new Byte("-123");
        System.out.println(by);

    }
    // 10/10
    private static void testChar() {
        Character c = new Character('c');
        System.out.println(c);
    }
    // 10/11
    private static void classArray() {

        if (test.class.isArray()) {
            System.out.println("配列クラスです");
        } else {
            System.out.println("配列クラスではありません");
        }
    }
    // 10/12
    private static void doubleMeth() {
        Double d = new Double(123.456789);
        System.out.println(d);
    }
    // 10/13
    private static void floatMeth() {
       Float f = new Float(123.4f);
       System.out.println(f);
    }
    // 10/14
    private static void integerMeth() {
        Integer i = new Integer(121345678);
        System.out.println(i);
    }
}
