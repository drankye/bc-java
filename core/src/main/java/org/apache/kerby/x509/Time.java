package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Any;
import org.apache.kerby.asn1.type.Asn1Choice;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;

import java.util.Date;

/**
 * Produce an object suitable for an ASN1OutputStream.
 * <pre>
 * Time ::= CHOICE {
 *             utcTime        UTCTime,
 *             generalTime    GeneralizedTime
 *          }
 * </pre>
 */
public class Time extends Asn1Choice {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public Time() {
        super(fieldInfos);
    }

    public Date getTime() {
        return null;
    }
}
