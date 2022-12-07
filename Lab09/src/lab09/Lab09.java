/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09;

import java.util.Stack;

/**
 *
 * @author rodri
 */
public class Lab09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Hello lab 09");
    }
    public static Boolean isBalanced(String expression){
      
        char[] exp = expression.toCharArray();
        
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i < exp.length; i++ ){
            if(exp[i] == '('){
                stack.push(')');
            }
            if(exp[i] == ')'){
                if(stack.isEmpty()){
                return false;
                
                }
                stack.pop();
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }
        
        
        return false;
    }
}
