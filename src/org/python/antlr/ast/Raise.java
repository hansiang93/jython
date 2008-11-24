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

public class Raise extends stmtType {
    private exprType excepttype;
    public exprType getInternalExcepttype() {
        return excepttype;
    }
    public Object getExcepttype() {
        return excepttype;
    }
    public void setExcepttype(Object excepttype) {
        this.excepttype = AstAdapter.to_expr(excepttype);
    }

    private exprType inst;
    public exprType getInternalInst() {
        return inst;
    }
    public Object getInst() {
        return inst;
    }
    public void setInst(Object inst) {
        this.inst = AstAdapter.to_expr(inst);
    }

    private exprType tback;
    public exprType getInternalTback() {
        return tback;
    }
    public Object getTback() {
        return tback;
    }
    public void setTback(Object tback) {
        this.tback = AstAdapter.to_expr(tback);
    }


    private final static String[] fields = new String[] {"excepttype", "inst",
                                                          "tback"};
    public String[] get_fields() { return fields; }

    public Raise() {}
    public Raise(Object excepttype, Object inst, Object tback) {
        setExcepttype(excepttype);
        setInst(inst);
        setTback(tback);
    }

    public Raise(Token token, exprType excepttype, exprType inst, exprType
    tback) {
        super(token);
        this.excepttype = excepttype;
        addChild(excepttype);
        this.inst = inst;
        addChild(inst);
        this.tback = tback;
        addChild(tback);
    }

    public Raise(Integer ttype, Token token, exprType excepttype, exprType
    inst, exprType tback) {
        super(ttype, token);
        this.excepttype = excepttype;
        addChild(excepttype);
        this.inst = inst;
        addChild(inst);
        this.tback = tback;
        addChild(tback);
    }

    public Raise(PythonTree tree, exprType excepttype, exprType inst, exprType
    tback) {
        super(tree);
        this.excepttype = excepttype;
        addChild(excepttype);
        this.inst = inst;
        addChild(inst);
        this.tback = tback;
        addChild(tback);
    }

    public String toString() {
        return "Raise";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Raise(");
        sb.append("excepttype=");
        sb.append(dumpThis(excepttype));
        sb.append(",");
        sb.append("inst=");
        sb.append(dumpThis(inst));
        sb.append(",");
        sb.append("tback=");
        sb.append(dumpThis(tback));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitRaise(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (excepttype != null)
            excepttype.accept(visitor);
        if (inst != null)
            inst.accept(visitor);
        if (tback != null)
            tback.accept(visitor);
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
