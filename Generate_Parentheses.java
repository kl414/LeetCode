/**
 * below solution needs more explanation(DFS)
 * May be explanation
 * The idea here is to only add '(' and ')' that we know will guarantee us a solution (instead of adding 1 too many close). Once we add a '(' we will then discard it and try a ')' which can only close a valid '('. Each of these steps are recursively called.
 * all of them need more understanding since right now I'm only copying them
 */
/*
public class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> result = new LinkedList<String>();
        if (n > 0) generateParenthesisCore("", n, n, result); 
        return result;
    }
    
    private void generateParenthesisCore(String prefix, int left, int right, List<String> result)
    {
        if (left == 0 && right == 0) result.add(prefix);
        // Has left Parenthesis    
        if (left > 0) generateParenthesisCore(prefix+'(', left-1, right, result);
        // has more right Parenthesis
        if (left < right) generateParenthesisCore(prefix+')', left, right-1, result);
    }
}
*/
/**
 * DP way: 
 * f(0): ""
 *f(1): "("f(0)")"
 *f(2): "("f(0)")"f(1), "("f(1)")"
 *f(3): "("f(0)")"f(2), "("f(1)")"f(1), "("f(2)")"
 *So f(n) = "("f(0)")"f(n-1) , "("f(1)")"f(n-2) "("f(2)")"f(n-3) ... "("f(i)")"f(n-1-i) ... "(f(n-1)")"
*/
/*
public class Solution
{
    public List<String> generateParenthesis(int n)
    {
        List<List<String>> lists = new ArrayList<>();
        lists.add(Collections.singletonList(""));

        for (int i = 1; i <= n; ++i)
        {
            final List<String> list = new ArrayList<>();

            for (int j = 0; j < i; ++j)
            {
                for (final String first : lists.get(j))
                {
                    for (final String second : lists.get(i - 1 - j))
                    {
                        list.add("(" + first + ")" + second);
                    }
                }
            }

            lists.add(list);
        }

        return lists.get(lists.size() - 1);
    }
}
*/
