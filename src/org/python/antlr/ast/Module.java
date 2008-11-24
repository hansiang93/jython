// Autogenerated AST node
package org.python.antlr.ast;
import java.util.ArrayList;
import org.python.antlr.AstAdapter;
import org.python.antlr.PythonTree;
import org.python.antlr.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Module extends modType {
    private java.util.List<stmtType> body;
    public java.util.List<stmtType> getInternalBody() {
        return body;
    }
    public Object getBody() {
        return new ListWrapper(body);
    }
    public void setBody(Object body) {
        this.body = AstAdapter.to_stmtList(body);
    }


    private final static String[] fields = new String[] {"body"};
    public String[] get_fields() { return fields; }

    public Module() {}
    public Module(Object body) {
        setBody(body);
    }

    public Module(Token token, java.util.List<stmtType> body) {
        super(token);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
    }

    public Module(Integer ttype, Token token, java.util.List<stmtType> body) {
        super(ttype, token);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
    }

    public Module(PythonTree tree, java.util.List<stmtType> body) {
        super(tree);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
    }

    public String toString() {
        return "Module";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Module(");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitModule(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (body != null) {
            for (PythonTree t : body) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

}
