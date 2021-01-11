// generated with ast extension for cup
// version 0.8
// 12/0/2020 22:4:43


package rs.ac.bg.etf.pp1.ast;

public class AbsOrRegMeth extends AbstractClassMethodList {

    private AbstractOrRegularMethod AbstractOrRegularMethod;

    public AbsOrRegMeth (AbstractOrRegularMethod AbstractOrRegularMethod) {
        this.AbstractOrRegularMethod=AbstractOrRegularMethod;
        if(AbstractOrRegularMethod!=null) AbstractOrRegularMethod.setParent(this);
    }

    public AbstractOrRegularMethod getAbstractOrRegularMethod() {
        return AbstractOrRegularMethod;
    }

    public void setAbstractOrRegularMethod(AbstractOrRegularMethod AbstractOrRegularMethod) {
        this.AbstractOrRegularMethod=AbstractOrRegularMethod;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(AbstractOrRegularMethod!=null) AbstractOrRegularMethod.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(AbstractOrRegularMethod!=null) AbstractOrRegularMethod.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(AbstractOrRegularMethod!=null) AbstractOrRegularMethod.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AbsOrRegMeth(\n");

        if(AbstractOrRegularMethod!=null)
            buffer.append(AbstractOrRegularMethod.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AbsOrRegMeth]");
        return buffer.toString();
    }
}
