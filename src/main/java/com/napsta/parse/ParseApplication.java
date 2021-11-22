package com.napsta.parse;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class ParseApplication {

    public static void main(String[] args) throws IOException {
        ExpressionParser parser = new SpelExpressionParser();
        System.out.print("请输入多项式：");
        Expression expression = parser.parseExpression((new BufferedReader(new InputStreamReader(System.in))).readLine());
        int result = (Integer) expression.getValue();
        System.out.println("计算结果是：" + result);
    }

}
