package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.*;

/**
 * Ref. RFC3280
 * <pre>
 *    PolicyMappings ::= SEQUENCE SIZE (1..MAX) OF SEQUENCE {
 *      issuerDomainPolicy      CertPolicyId,
 *      subjectDomainPolicy     CertPolicyId }
 * </pre>
 *
 */
public class PolicyMapping extends Asn1SequenceType {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public PolicyMapping() {
        super(fieldInfos);
    }
}
