package org.superbiz.jsf;

import jakarta.ejb.EJB;
//import jakarta.ejb.Stateful;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;

//@ManagedBean　指定しないと実行時エラー; @SessionScoped セッションスコープで計算ページに戻っても入力値が保持される [注意]アノーテーションと同じ行にコメントを書くと実行時エラー
@ManagedBean
@SessionScoped
//@Stateful
public class CalculatorBean {
    @EJB
    Calculator calculator;
    private double x;
    private double y;
    private double result;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String add() {
        result = calculator.add(x, y);
        return "success";
    }
}