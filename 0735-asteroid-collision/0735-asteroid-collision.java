import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            // collision only when stack top > 0 and current < 0
            while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {
                if (stack.peek() < -a) {
                    stack.pop();          // top asteroid explodes
                    continue;
                } else if (stack.peek() == -a) {
                    stack.pop();          // both explode
                }
                destroyed = true;         // current asteroid explodes
                break;
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        // convert stack to array
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}