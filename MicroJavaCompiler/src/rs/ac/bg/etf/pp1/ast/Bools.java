// generated with ast extension for cup
// version 0.8
// 12/0/2020 22:4:43


package rs.ac.bg.etf.pp1.ast;

public class Bools extends Const {

    private Integer bool;

    public Bools (Integer bool) {
        this.bool=bool;
    }

    public Integer getBool() {
        return bool;
    }

    public void setBool(Integer bool) {
        this.bool=bool;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Bools(\n");

        buffer.append(" "+tab+bool);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Bools]");
        return buffer.toString();
    }
}
