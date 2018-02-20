// Question: https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

public class EvaluateReversePolishNotation {
  public int evalRPN(String[] tokens) {
    if (tokens == null || tokens.length == 0) {
      return 0;
    }

    Stack<Integer> s = new Stack<>();

    for (String t : tokens) {
      int oper1, oper2;
      if ("+".equals(t)) {
        oper2 = s.pop();
        oper1 = s.pop();
        s.push(oper1 + oper2);
      } else if ("-".equals(t)) {
        oper2 = s.pop();
        oper1 = s.pop();
        s.push(oper1 - oper2);
      } else if ("*".equals(t)) {
        oper2 = s.pop();
        oper1 = s.pop();
        s.push(oper1 * oper2);
      } else if ("/".equals(t)) {
        oper2 = s.pop();
        oper1 = s.pop();
        s.push(oper1 / oper2);
      } else {
        s.push(Integer.parseInt(t));
      }
    }

    return s.pop();
  }
}
