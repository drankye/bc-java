package org.apache.kerby.cms;

import org.apache.kerby.asn1.type.*;

/**
 * AttributeTypeAndValue ::= SEQUENCE {
 *     type  OBJECT IDENTIFIER,
 *     value ANY }
 */
public class AttributeTypeAndValue extends Asn1SequenceType {

    private static final int TYPE = 0;
    private static final int VALUE = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[]{
            new Asn1FieldInfo(TYPE, Asn1ObjectIdentifier.class),
            new Asn1FieldInfo(VALUE, Asn1Any.class)
    };

    public AttributeTypeAndValue() {
        super(fieldInfos);
    }

    public Asn1ObjectIdentifier getType() {
        return getFieldAs(TYPE, Asn1ObjectIdentifier.class);
    }

    public void setType(Asn1ObjectIdentifier type) {
        setFieldAs(TYPE, type);
    }

    public Asn1Type getAttributeValue() {
        return getFieldAsAny(VALUE);
    }

    public void setAttributeValue(Asn1Type value) {
        setFieldAsAny(VALUE, value);
    }
}
