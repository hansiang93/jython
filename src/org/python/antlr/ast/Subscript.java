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

public class Subscript extends exprType implements Context {
    private exprType value;
    public exprType getInternalValue() {
        return value;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = AstAdapter.to_expr(value);
    }

    private sliceType slice;
    public sliceType getInternalSlice() {
        return slice;
    }
    public Object getSlice() {
        return slice;
    }
    public void setSlice(Object slice) {
        this.slice = AstAdapter.to_slice(slice);
    }

    private expr_contextType ctx;
    public expr_contextType getInternalCtx() {
        return ctx;
    }
    public Object getCtx() {
        return ctx;
    }
    public void setCtx(Object ctx) {
        this.ctx = AstAdapter.to_expr_context(ctx);
    }


    private final static String[] fields = new String[] {"value", "slice",
                                                          "ctx"};
    public String[] get_fields() { return fields; }

    public Subscript() {}
    public Subscript(Object value, Object slice, Object ctx) {
        setValue(value);
        setSlice(slice);
        setCtx(ctx);
    }

    public Subscript(Token token, exprType value, sliceType slice,
    expr_contextType ctx) {
        super(token);
        this.value = value;
        addChild(value);
        this.slice = slice;
        this.ctx = ctx;
    }

    public Subscript(Integer ttype, Token token, exprType value, sliceType
    slice, expr_contextType ctx) {
        super(ttype, token);
        this.value = value;
        addChild(value);
        this.slice = slice;
        this.ctx = ctx;
    }

    public Subscript(PythonTree tree, exprType value, sliceType slice,
    expr_contextType ctx) {
        super(tree);
        this.value = value;
        addChild(value);
        this.slice = slice;
        this.ctx = ctx;
    }

    public String toString() {
        return "Subscript";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Subscript(");
        sb.append("value=");
        sb.append(dumpThis(value));
        sb.append(",");
        sb.append("slice=");
        sb.append(dumpThis(slice));
        sb.append(",");
        sb.append("ctx=");
        sb.append(dumpThis(ctx));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitSubscript(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (value != null)
            value.accept(visitor);
        if (slice != null)
            slice.accept(visitor);
    }

    public void setContext(expr_contextType c) {
        this.ctx = c;
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
