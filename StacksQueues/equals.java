// Checks if 2 stacks passed in are equal

public boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
    Stack<Integer> s = new ArrayStack<Integer>();
    boolean flag = true;
    int count1 = 0;
    int count2 = 0;
    for (int n : s1) {
        count1++;
    }
    for (int n : s2) {
        count2++;
    }
    if (count1 != count2) {
        flag = false;
    } else {
        while (!s1.isEmpty()) {
            int num1 = s1.pop();
            int num2 = s2.pop();
            s.push(num1);
            s.push(num2);
        }
        
        while (!s.isEmpty()) {
            int num2 = s.pop();
            int num1 = s.pop();
            if (num1 != num2) {
                flag = false;
            }
            s2.push(num2);
            s1.push(num1);
        }
    }
    return flag;
}