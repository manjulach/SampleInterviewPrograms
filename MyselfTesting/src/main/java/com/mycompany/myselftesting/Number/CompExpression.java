/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.Number;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * As part of this program we are trying to resolve String expression like 4+5*8 
 * @author Sreeja
 */
public class CompExpression {

    public static void main(String[] args) {
        CompExpression comp = new CompExpression();
        //System.out.println("---->" + comp.calc("4+5*8")); 
        
        ScriptEngine  engine = new ScriptEngineManager().getEngineByExtension("js");
        try {
            Object result = engine.eval("4+5*8/2");
            
            System.out.println("4+5*8 = "+ result);
            
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
    
    public static int calc(String str) {
        int result = 0;
        String numbers = "0123456789";
        String operations = "+-*/";
        for (int i=0; i<str.length();i++) {
            if (numbers.contains(str.charAt(i)+ "")) {
                result = result * 10 +(Integer.parseInt(str.charAt(i)+""));
            } else {
                if (str.charAt(i) == '+') { result += calc(str.substring(i+1));}
                if (str.charAt(i) == '-') { result -= calc(str.substring(i+1));}
                if (str.charAt(i) == '*') { result *= calc(str.substring(i+1));}
                if (str.charAt(i) == '/') { result /= calc(str.substring(i+1));}
            }
            break;
        }
        return result;
    }
    
}
