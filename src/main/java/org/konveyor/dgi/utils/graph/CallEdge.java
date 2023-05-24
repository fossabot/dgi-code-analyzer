package org.konveyor.dgi.utils.graph;

import org.jgrapht.nio.Attribute;
import org.jgrapht.nio.DefaultAttribute;
import java.util.LinkedHashMap;
import java.util.Map;

public class CallEdge extends AbstractGraphEdge {
    public final String type;
    public static final long serialVersionUID = -8284030936836318929L;
    public CallEdge() {
        super();
        this.type = toString();
    }
    public CallEdge(String context) {
        super(context);
        this.type = toString();
    }
    @Override
    public String toString() {
        return "CALL_DEP";
    }
    @Override
    public boolean equals(Object o) {
        return (o instanceof CallEdge) && (toString().equals(o.toString()));
    }

    public Map<String, Attribute> getAttributes() {
        Map<String, Attribute> map = new LinkedHashMap<>();
        map.put("id", DefaultAttribute.createAttribute(getId()));
        map.put("context", DefaultAttribute.createAttribute(getContext()));
        map.put("type", DefaultAttribute.createAttribute(toString()));
        map.put("weight", DefaultAttribute.createAttribute(getWeight()));
        return map;
    }
}