// generated with ast extension for cup
// version 0.8
// 12/0/2020 22:4:43


package rs.ac.bg.etf.pp1.ast;

public class AbstractClassMethList extends AbstractClassMethodList {

    private AbstractClassMethodList AbstractClassMethodList;
    private AbstractOrRegularMethod AbstractOrRegularMethod;

    public AbstractClassMethList (AbstractClassMethodList AbstractClassMethodList, AbstractOrRegularMethod AbstractOrRegularMethod) {
        this.AbstractClassMethodList=AbstractClassMethodList;
        if(AbstractClassMethodList!=null) AbstractClassMethodList.setParent(this);
        this.AbstractOrRegularMethod=AbstractOrRegularMethod;
        if(AbstractOrRegularMethod!=null) AbstractOrRegularMethod.setParent(this);
    }

    public AbstractClassMethodList getAbstractClassMethodList() {
        return AbstractClassMethodList;
    }

    public void setAbstractClassMethodList(AbstractClassMethodList AbstractClassMethodList) {
        this.AbstractClassMethodList=AbstractClassMethodList;
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
        if(AbstractClassMethodList!=null) AbstractClassMethodList.accept(visitor);
        if(AbstractOrRegularMethod!=null) AbstractOrRegularMethod.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(AbstractClassMethodList!=null) AbstractClassMethodList.traverseTopDown(visitor);
        if(AbstractOrRegularMethod!=null) AbstractOrRegularMethod.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(AbstractClassMethodList!=null) AbstractClassMethodList.traverseBottomUp(visitor);
        if(AbstractOrRegularMethod!=null) AbstractOrRegularMethod.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AbstractClassMethList(\n");

        if(AbstractClassMethodList!=null)
            buffer.append(AbstractClassMethodList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AbstractOrRegularMethod!=null)
            buffer.append(AbstractOrRegularMethod.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AbstractClassMethList]");
        return buffer.toString();
    }
}
