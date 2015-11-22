package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Any;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;
import org.apache.kerby.asn1.type.Asn1SequenceType;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.asn1.x509.NoticeReference;

/**
 *
 * <pre>
 * UserNotice ::= SEQUENCE {
 *      noticeRef        NoticeReference OPTIONAL,
 *      explicitText     DisplayText OPTIONAL}
 *
 * </pre>
 *
 */
public class UserNotice extends Asn1SequenceType {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public UserNotice() {
        super(fieldInfos);
    }

    public NoticeReference getNoticeRef() {
        return null;
    }
    
    public DisplayText getExplicitText() {
        return null;
    }
}
