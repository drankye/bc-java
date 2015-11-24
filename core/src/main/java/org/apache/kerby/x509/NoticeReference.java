/**
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1SequenceType;

/**
 * <code>NoticeReference</code> class, used in
 * <code>CertificatePolicies</code> X509 V3 extensions
 * (in policy qualifiers).
 * 
 * <pre>
 *  NoticeReference ::= SEQUENCE {
 *      organization     DisplayText,
 *      noticeNumbers    SEQUENCE OF INTEGER }
 *
 * </pre> 
 * 
 * @see PolicyQualifierInfo
 * @see PolicyInformation
 */
public class NoticeReference extends Asn1SequenceType {
    private static final int ORGANIZATION = 0;
    private static final int NOTICE_NUMBERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ORGANIZATION, -1, DisplayText.class),
        new Asn1FieldInfo(NOTICE_NUMBERS, -1, NoticeNumbers.class)
    };

    public NoticeReference() {
        super(fieldInfos);
    }

    public DisplayText getOrganization() {
        return getFieldAs(ORGANIZATION, DisplayText.class);
    }

    public void setOrganization(DisplayText organization) {
        setFieldAs(ORGANIZATION, organization);
    }

    public NoticeNumbers getNoticeNumbers() {
        return getFieldAs(NOTICE_NUMBERS, NoticeNumbers.class);
    }

    public void setNoticeNumbers(NoticeNumbers noticeNumbers) {
        setFieldAs(NOTICE_NUMBERS, noticeNumbers);
    }
}
