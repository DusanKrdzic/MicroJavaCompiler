// generated with ast extension for cup
// version 0.8
// 12/0/2020 22:4:43


package rs.ac.bg.etf.pp1.ast;

public class NewFact extends Factor {

    private NewType NewType;
    private ExprOptionalBox ExprOptionalBox;

    public NewFact (NewType NewType, ExprOptionalBox ExprOptionalBox) {
        this.NewType=NewType;
        if(NewType!=null) NewType.setParent(this);
        this.ExprOptionalBox=ExprOptionalBox;
        if(ExprOptionalBox!=null) ExprOptionalBox.setParent(this);
    }

    public NewType getNewType() {
        return NewType;
    }

    public void setNewType(NewType NewType) {
        this.NewType=NewType;
    }

    public ExprOptionalBox getExprOptionalBox() {
        return ExprOptionalBox;
    }

    public void setExprOptionalBox(ExprOptionalBox ExprOptionalBox) {
        this.ExprOptionalBox=ExprOptionalBox;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(NewType!=null) NewType.accept(visitor);
        if(ExprOptionalBox!=null) ExprOptionalBox.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(NewType!=null) NewType.traverseTopDown(visitor);
        if(ExprOptionalBox!=null) ExprOptionalBox.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(NewType!=null) NewType.traverseBottomUp(visitor);
        if(ExprOptionalBox!=null) ExprOptionalBox.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NewFact(\n");

        if(NewType!=null)
            buffer.append(NewType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprOptionalBox!=null)
            buffer.append(ExprOptionalBox.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NewFact]");
        return buffer.toString();
    }
}
