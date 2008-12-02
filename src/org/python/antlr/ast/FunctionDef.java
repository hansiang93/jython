// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.FunctionDef", base = PyObject.class)
public class FunctionDef extends stmtType {
public static final PyType TYPE = PyType.fromClass(FunctionDef.class);
    private String name;
    public String getInternalName() {
        return name;
    }
    @ExposedGet(name = "name")
    public PyObject getName() {
        if (name == null) return Py.None;
        return new PyString(name);
    }
    @ExposedSet(name = "name")
    public void setName(PyObject name) {
        this.name = AstAdapters.to_identifier(name);
    }

    private argumentsType args;
    public argumentsType getInternalArgs() {
        return args;
    }
    @ExposedGet(name = "args")
    public PyObject getArgs() {
        return args;
    }
    @ExposedSet(name = "args")
    public void setArgs(PyObject args) {
        this.args = AstAdapters.to_arguments(args);
    }

    private java.util.List<stmtType> body;
    public java.util.List<stmtType> getInternalBody() {
        return body;
    }
    @ExposedGet(name = "body")
    public PyObject getBody() {
        return new AstList(body, AstAdapters.stmtAdapter);
    }
    @ExposedSet(name = "body")
    public void setBody(PyObject body) {
        this.body = AstAdapters.to_stmtList(body);
    }

    private java.util.List<exprType> decorator_list;
    public java.util.List<exprType> getInternalDecorator_list() {
        return decorator_list;
    }
    @ExposedGet(name = "decorator_list")
    public PyObject getDecorator_list() {
        return new AstList(decorator_list, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "decorator_list")
    public void setDecorator_list(PyObject decorator_list) {
        this.decorator_list = AstAdapters.to_exprList(decorator_list);
    }


    private final static String[] fields = new String[] {"name", "args",
                                                          "body",
                                                          "decorator_list"};
@ExposedGet(name = "_fields")
    public String[] get_fields() { return fields; }

    public FunctionDef() {
        this(TYPE);
    }
    public FunctionDef(PyType subType) {
        super(subType);
    }
    @ExposedNew
    @ExposedMethod
    public void Module___init__(PyObject[] args, String[] keywords) {}
    public FunctionDef(PyObject name, PyObject args, PyObject body, PyObject
    decorator_list) {
        setName(name);
        setArgs(args);
        setBody(body);
        setDecorator_list(decorator_list);
    }

    public FunctionDef(Token token, String name, argumentsType args,
    java.util.List<stmtType> body, java.util.List<exprType> decorator_list) {
        super(token);
        this.name = name;
        this.args = args;
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.decorator_list = decorator_list;
        if (decorator_list == null) {
            this.decorator_list = new ArrayList<exprType>();
        }
        for(PythonTree t : this.decorator_list) {
            addChild(t);
        }
    }

    public FunctionDef(Integer ttype, Token token, String name, argumentsType
    args, java.util.List<stmtType> body, java.util.List<exprType>
    decorator_list) {
        super(ttype, token);
        this.name = name;
        this.args = args;
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.decorator_list = decorator_list;
        if (decorator_list == null) {
            this.decorator_list = new ArrayList<exprType>();
        }
        for(PythonTree t : this.decorator_list) {
            addChild(t);
        }
    }

    public FunctionDef(PythonTree tree, String name, argumentsType args,
    java.util.List<stmtType> body, java.util.List<exprType> decorator_list) {
        super(tree);
        this.name = name;
        this.args = args;
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.decorator_list = decorator_list;
        if (decorator_list == null) {
            this.decorator_list = new ArrayList<exprType>();
        }
        for(PythonTree t : this.decorator_list) {
            addChild(t);
        }
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "FunctionDef";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("FunctionDef(");
        sb.append("name=");
        sb.append(dumpThis(name));
        sb.append(",");
        sb.append("args=");
        sb.append(dumpThis(args));
        sb.append(",");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("decorator_list=");
        sb.append(dumpThis(decorator_list));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitFunctionDef(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null)
            args.accept(visitor);
        if (body != null) {
            for (PythonTree t : body) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (decorator_list != null) {
            for (PythonTree t : decorator_list) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    private int lineno = -1;
@ExposedGet(name = "lineno")
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

@ExposedSet(name = "lineno")
    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
@ExposedGet(name = "col_offset")
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

@ExposedSet(name = "col_offset")
    public void setCol_offset(int num) {
        col_offset = num;
    }

}
