package org.apache.kerby.x509;

import java.util.Enumeration;

import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1GeneralizedTime;
import org.apache.kerby.asn1.type.Asn1SequenceType;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/**
 * <pre>
 *    PrivateKeyUsagePeriod ::= SEQUENCE {
 *      notBefore       [0]     GeneralizedTime OPTIONAL,
 *      notAfter        [1]     GeneralizedTime OPTIONAL }
 * </pre>
 */
public class PrivateKeyUsagePeriod extends Asn1SequenceType {
    private static final int NOT_BEFORE = 0;
    private static final int NOT_AFTER = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(NOT_BEFORE, -1, Asn1GeneralizedTime.class),
        new Asn1FieldInfo(NOT_AFTER, -1, Asn1GeneralizedTime.class)
    };

    public PrivateKeyUsagePeriod() {
        super(fieldInfos);
    }

    public ASN1GeneralizedTime getNotBeforeTime() {
        return null;
    }

    public ASN1GeneralizedTime getNotAfterTime() {
        return null;
    }
}
