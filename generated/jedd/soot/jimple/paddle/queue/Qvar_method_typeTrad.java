package soot.jimple.paddle.queue;

import soot.util.*;
import soot.jimple.paddle.bdddomains.*;
import soot.jimple.paddle.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public class Qvar_method_typeTrad extends Qvar_method_type {
    public Qvar_method_typeTrad(String name) { super(name); }
    
    private ChunkedQueue q = new ChunkedQueue();
    
    public void add(VarNode _var, SootMethod _method, Type _type) {
        q.add(_var);
        q.add(_method);
        q.add(_type);
    }
    
    public void add(final jedd.internal.RelationContainer in) {
        Iterator it =
          new jedd.internal.RelationContainer(new Attribute[] { method.v(), type.v(), var.v() },
                                              new PhysicalDomain[] { T1.v(), T2.v(), V1.v() },
                                              ("in.iterator(new jedd.Attribute[...]) at /home/olhotak/soot-r" +
                                               "ef2/src/soot/jimple/paddle/queue/Qvar_method_typeTrad.jedd:3" +
                                               "9,22-24"),
                                              in).iterator(new Attribute[] { var.v(), method.v(), type.v() });
        while (it.hasNext()) {
            Object[] tuple = (Object[]) it.next();
            for (int i = 0; i < 3; i++) { this.add((VarNode) tuple[0], (SootMethod) tuple[1], (Type) tuple[2]); }
        }
    }
    
    public Rvar_method_type reader(String rname) { return new Rvar_method_typeTrad(q.reader(), name + ":" + rname); }
}
