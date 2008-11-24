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

public class If extends stmtType {
    private exprType test;
    public exprType getInternalTest() {
        return test;
    }
    public Object getTest() {
        return test;
    }
    public void setTest(Object test) {
        this.test = AstAdapter.to_expr(test);
    }

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

    private java.util.List<stmtType> orelse;
    public java.util.List<stmtType> getInternalOrelse() {
        return orelse;
    }
    public Object getOrelse() {
        return new ListWrapper(orelse);
    }
    public void setOrelse(Object orelse) {
        this.orelse = AstAdapter.to_stmtList(orelse);
    }


    private final static String[] fields = new String[] {"test", "body",
                                                          "orelse"};
    public String[] get_fields() { return fields; }

    public If() {}
    public If(Object test, Object body, Object orelse) {
        setTest(test);
        setBody(body);
        setOrelse(orelse);
    }

    public If(Token token, exprType test, java.util.List<stmtType> body,
    java.util.List<stmtType> orelse) {
        super(token);
        this.test = test;
        addChild(test);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.orelse = orelse;
        if (orelse == null) {
            this.orelse = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.orelse) {
            addChild(t);
        }
    }

    public If(Integer ttype, Token token, exprType test,
    java.util.List<stmtType> body, java.util.List<stmtType> orelse) {
        super(ttype, token);
        this.test = test;
        addChild(test);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.orelse = orelse;
        if (orelse == null) {
            this.orelse = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.orelse) {
            addChild(t);
        }
    }

    public If(PythonTree tree, exprType test, java.util.List<stmtType> body,
    java.util.List<stmtType> orelse) {
        super(tree);
        this.test = test;
        addChild(test);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.orelse = orelse;
        if (orelse == null) {
            this.orelse = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.orelse) {
            addChild(t);
        }
    }

    public String toString() {
        return "If";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("If(");
        sb.append("test=");
        sb.append(dumpThis(test));
        sb.append(",");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("orelse=");
        sb.append(dumpThis(orelse));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitIf(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (test != null)
            test.accept(visitor);
        if (body != null) {
            for (PythonTree t : body) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (orelse != null) {
            for (PythonTree t : orelse) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
