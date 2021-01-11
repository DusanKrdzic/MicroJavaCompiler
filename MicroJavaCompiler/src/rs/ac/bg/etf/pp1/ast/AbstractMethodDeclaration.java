// generated with ast extension for cup
// version 0.8
// 12/0/2020 22:4:43


package rs.ac.bg.etf.pp1.ast;

public class AbstractMethodDeclaration extends AbstractMethodDecl {

    private AbstractMethod AbstractMethod;
    private Return Return;
    private AbstractMethodName AbstractMethodName;
    private FormParam FormParam;

    public AbstractMethodDeclaration (AbstractMethod AbstractMethod, Return Return, AbstractMethodName AbstractMethodName, FormParam FormParam) {
        this.AbstractMethod=AbstractMethod;
        if(AbstractMethod!=null) AbstractMethod.setParent(this);
        this.Return=Return;
        if(Return!=null) Return.setParent(this);
        this.AbstractMethodName=AbstractMethodName;
        if(AbstractMethodName!=null) AbstractMethodName.setParent(this);
        this.FormParam=FormParam;
        if(FormParam!=null) FormParam.setParent(this);
    }

    public AbstractMethod getAbstractMethod() {
        return AbstractMethod;
    }

    public void setAbstractMethod(AbstractMethod AbstractMethod) {
        this.AbstractMethod=AbstractMethod;
    }

    public Return getReturn() {
        return Return;
    }

    public void setReturn(Return Return) {
        this.Return=Return;
    }

    public AbstractMethodName getAbstractMethodName() {
        return AbstractMethodName;
    }

    public void setAbstractMethodName(AbstractMethodName AbstractMethodName) {
        this.AbstractMethodName=AbstractMethodName;
    }

    public FormParam getFormParam() {
        return FormParam;
    }

    public void setFormParam(FormParam FormParam) {
        this.FormParam=FormParam;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(AbstractMethod!=null) AbstractMethod.accept(visitor);
        if(Return!=null) Return.accept(visitor);
        if(AbstractMethodName!=null) AbstractMethodName.accept(visitor);
        if(FormParam!=null) FormParam.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(AbstractMethod!=null) AbstractMethod.traverseTopDown(visitor);
        if(Return!=null) Return.traverseTopDown(visitor);
        if(AbstractMethodName!=null) AbstractMethodName.traverseTopDown(visitor);
        if(FormParam!=null) FormParam.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(AbstractMethod!=null) AbstractMethod.traverseBottomUp(visitor);
        if(Return!=null) Return.traverseBottomUp(visitor);
        if(AbstractMethodName!=null) AbstractMethodName.traverseBottomUp(visitor);
        if(FormParam!=null) FormParam.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AbstractMethodDeclaration(\n");

        if(AbstractMethod!=null)
            buffer.append(AbstractMethod.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Return!=null)
            buffer.append(Return.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AbstractMethodName!=null)
            buffer.append(AbstractMethodName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FormParam!=null)
            buffer.append(FormParam.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AbstractMethodDeclaration]");
        return buffer.toString();
    }
}
