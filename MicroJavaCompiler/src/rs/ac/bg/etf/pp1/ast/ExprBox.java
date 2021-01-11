// generated with ast extension for cup
// version 0.8
// 12/0/2020 22:4:43


package rs.ac.bg.etf.pp1.ast;

public class ExprBox extends ExprOptionalBox {

    private NewLBoxBr NewLBoxBr;
    private Expr Expr;

    public ExprBox (NewLBoxBr NewLBoxBr, Expr Expr) {
        this.NewLBoxBr=NewLBoxBr;
        if(NewLBoxBr!=null) NewLBoxBr.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public NewLBoxBr getNewLBoxBr() {
        return NewLBoxBr;
    }

    public void setNewLBoxBr(NewLBoxBr NewLBoxBr) {
        this.NewLBoxBr=NewLBoxBr;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(NewLBoxBr!=null) NewLBoxBr.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(NewLBoxBr!=null) NewLBoxBr.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(NewLBoxBr!=null) NewLBoxBr.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprBox(\n");

        if(NewLBoxBr!=null)
            buffer.append(NewLBoxBr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprBox]");
        return buffer.toString();
    }
}
