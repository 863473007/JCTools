package org.jctools.channels.mapping;

import java.lang.reflect.Type;

public final class Variable {

    public final Type type;
    public final String name;
    public final int fieldOffset;
    public final String unsafeMethodSuffix;

    public Variable(Type type, String name, int fieldOffset, String unsafeMethodSuffix) {
        this.type = type;
        this.name = name;
        this.fieldOffset = fieldOffset;
        this.unsafeMethodSuffix = unsafeMethodSuffix;
    }

}
