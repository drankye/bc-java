package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Any;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;
import org.apache.kerby.asn1.type.Asn1SequenceType;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.Time;

/**
 * <pre>
 *  Certificate ::= SEQUENCE {
 *      tbsCertificate          TBSCertificate,
 *      signatureAlgorithm      AlgorithmIdentifier,
 *      signature               BIT STRING
 *  }
 * </pre>
 */
public class Certificate extends Asn1SequenceType {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public Certificate() {
        super(fieldInfos);
    }

    public TBSCertificate getTBSCertificate() {
        return null;
    }

    public int getVersion() {
        return -1;
    }

    public int getVersionNumber() {
        return -1;
    }

    public int getSerialNumber() {
        return -1;
    }

    public X500Name getIssuer() {
        return null;
    }

    public Time getStartDate() {
        return null;
    }

    public Time getEndDate() {
        return null;
    }

    public X500Name getSubject() {
        return null;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return null;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return null;
    }

    public byte[] getSignature() {
        return null;
    }
}
