package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Any;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;
import org.apache.kerby.asn1.type.Asn1SequenceType;
import org.bouncycastle.asn1.x509.GeneralSubtree;

/*
 * NameConstraints ::= SEQUENCE {
 *     permittedSubtrees [0] GeneralSubtrees OPTIONAL,
 *     excludedSubtrees [1] GeneralSubtrees OPTIONAL
 * }
 */
public class NameConstraints extends Asn1SequenceType {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public NameConstraints() {
        super(fieldInfos);
    }

    public GeneralSubtree[] getPermittedSubtrees() {
        return null;
    }

    public GeneralSubtree[] getExcludedSubtrees() {
        return null;
    }
}
