package com.example.junkcalculator;

import java.util.ArrayList;
import java.lang.Math;

public class Calculator {
    static final int maxInputSize = 21;
    static final String err1 = "Not an Operator!";
    static final String err2 = "Improper Length!";
    static final String err3 = "Division by 0!";
    static final String err4 = "No Operator!";

    String ret = "";
    int result = 0;
    ArrayList<String> arrayList;


    void push(String value) {
        arrayList = new ArrayList<String>();

        String temp = value;

        temp = temp.replaceAll(" ", "");
        temp = temp.replaceAll("POW", "P");
        temp = temp.replaceAll("MIN", "<");
        temp = temp.replaceAll("MAX", ">");

        for (int i = 0; i < temp.length(); i++) {
            arrayList.add(temp.substring(i, i+1));
        }
    }

    boolean maxSize(String eval) {
        String temp = eval;
        temp = temp.replaceAll(" ", "");

        boolean max = false;

        if (temp.length() >= maxInputSize) {
            max = true;
        }

        return max;
    }

    String calculate() {
        String operator = " ";
        int rhs = 0;
        boolean errState = false;

        if (arrayList.size() > 2) {
            //We get the very first number
            if (!arrayList.get(0).equals("+") && !arrayList.get(0).equals("-") && !arrayList.get(0).equals("/") && !arrayList.get(0).equals("*") &&
                    !arrayList.get(0).equals("%") && !arrayList.get(0).equals("P") && !arrayList.get(0).equals("<") && !arrayList.get(0).equals(">")) {
                result = Integer.parseInt(arrayList.get(0));

            } else {
                errState = true;
                ret = err1;
            }

            for (int i = 1; i <= arrayList.size()-1 && !errState; i+=2) {

                //First, we get the operator
                if (arrayList.get(i).equals("+") || arrayList.get(i).equals("-") || arrayList.get(i).equals("/") || arrayList.get(i).equals("*") ||
                        arrayList.get(i).equals("%") || arrayList.get(i).equals("P") || arrayList.get(i).equals("<") || arrayList.get(i).equals(">")) {
                    operator = arrayList.get(i);
                } else {
                    errState = true;
                    ret = err4;
                    break;
                }

                //Second, we get the RHS
                if (!arrayList.get(i+1).equals("+") && !arrayList.get(i+1).equals("-") && !arrayList.get(i+1).equals("/") && !arrayList.get(i+1).equals("*") &&
                        !arrayList.get(i+1).equals("%") && !arrayList.get(i+1).equals("P") && !arrayList.get(i+1).equals("<") && !arrayList.get(i+1).equals(">")
                ) {
                    rhs = Integer.valueOf(arrayList.get(i+1));
                } else {
                    errState = true;
                    ret = err1;
                    break;
                }

                //Finally, we calculate
                if (!errState) {
                    if (operator.equals("+")) {
                        result += rhs;
                    } else if (operator.equals("-")) {
                        result -= rhs;
                    } else if (operator.equals("/")) {
                        if (rhs != 0) {
                            result /= rhs;
                        } else {
                            errState = true;
                            ret = err3;
                            break;
                        }
                    } else if (operator.equals("*")) {
                        result *= rhs;
                    } else if (operator.equals("%")) {
                        result %= rhs;
                    } else if (operator.equals("P")) {
                        result = (int) Math.pow(result, rhs);
                    } else if (operator.equals("<")) {
                        result = Math.min(result, rhs);
                    } else if (operator.equals(">")) {
                        result = Math.max(result, rhs);
                    } else {
                        errState = true;
                        ret = err1;
                    }
                }
            }


        } else {
            errState = true;
            ret = err2;
        }

        if (!errState) {
            ret = String.valueOf(result);
        }

        return String.valueOf(ret);
    }

}
