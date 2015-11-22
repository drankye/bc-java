package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Any;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;
import org.apache.kerby.asn1.type.Asn1SequenceType;
import org.bouncycastle.asn1.x509.GeneralName;

/**
 *
 * Ref. RFC 3280.
 * <pre>
 *       GeneralSubtree ::= SEQUENCE 
 *       {
 *         base                    GeneralName,
 *         minimum         [0]     BaseDistance DEFAULT 0,
 *         maximum         [1]     BaseDistance OPTIONAL 
 *       }
 * </pre>
 * 
 */
public class GeneralSubtree extends Asn1SequenceType {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public GeneralSubtree() {
        super(fieldInfos);
    }

    public GeneralName getBase() {
        return null;
    }

    public int getMinimum() {
        return -1;
    }

    public int getMaximum() {
        return -1;
    }
}
