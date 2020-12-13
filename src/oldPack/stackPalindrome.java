package oldPack;

import java.util.*;

public class stackPalindrome {
Node top;
Scanner s;
String inputStr;
String outputStr;
char[] charArray;


stackPalindrome() {
    top = null;
    s = new Scanner(System.in);
    outputStr = "";
}

void processString() {
    String inputStr = s.next();
    inputStr = (inputStr.replaceAll("\\s+", "")).toLowerCase();
    charArray = inputStr.toCharArray();
    this.inputStr = inputStr;

    for (char a: charArray) {
        push(a);
    }

}

void push(char a) {
    Node temp = new Node();
    temp.data = a;
    temp.link = top;
    top = temp;
}

void repush(){
    while (top!=null) {
        outputStr += top.data;
        top = top.link;
    }
}

void compareString() {
    if (inputStr.equals(outputStr)) {
        System.out.println("The given string is Pallindrome");
    } else {
        System.out.println("The given string is not Pallindrome");
    }
}

    public static void main(String[] args) {
        stackPalindrome obj = new stackPalindrome();
        obj.processString();
        obj.repush();
        obj.compareString();

    }
}
