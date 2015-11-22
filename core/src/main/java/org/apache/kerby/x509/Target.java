package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Choice;
import org.apache.kerby.asn1.type.Asn1FieldInfo;

/**
 * Ref. RFC 3281
 * <pre>
 *     Target  ::= CHOICE {
 *       targetName          [0] GeneralName,
 *       targetGroup         [1] GeneralName,
 *       targetCert          [2] TargetCert
 *     }
 * </pre>
 */
public class Target extends Asn1Choice {
    private static final int TARGET_NAME = 0;
    private static final int TARGET_GROUP = 1;
    private static final int TARGET_CERT = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(TARGET_NAME, -1, GeneralName.class),
        new Asn1FieldInfo(TARGET_GROUP, -1, GeneralName.class),
        //new Asn1FieldInfo(TARGET_CERT, -1, TargetCert.class),
    };

    public Target() {
        super(fieldInfos);
    }


    public GeneralName getTargetName() {
        return null;
    }
}
