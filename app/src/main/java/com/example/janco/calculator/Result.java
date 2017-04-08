package com.example.janco.calculator;

import java.math.BigInteger;

import bsh.EvalError;
import bsh.Interpreter;

/**
 * Created by janco on 08.04.2017.
 */

public class Result {
    private String expresion;

    public Result(String expresion) {
        this.expresion = expresion;
    }

    String calculate() {

        Interpreter bsh = new Interpreter();

        try {
            bsh.eval("foo=" + expresion);
            return bsh.get("foo").toString();

        } catch (Exception exeption) {
            exeption.printStackTrace();
            return "blad";
        }

    }
}
