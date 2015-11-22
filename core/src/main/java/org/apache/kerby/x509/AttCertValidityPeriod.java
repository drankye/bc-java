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

import org.apache.kerby.asn1.type.*;
import org.bouncycastle.asn1.ASN1GeneralizedTime;

/**
 * <pre>
 *  AttCertValidityPeriod  ::= SEQUENCE {
 *       notBeforeTime  GeneralizedTime,
 *       notAfterTime   GeneralizedTime
 *  }
 * </pre>
 */
public class AttCertValidityPeriod extends Asn1SequenceType {
    private static final int NOT_BEFORE = 0;
    private static final int NOT_AFTER = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(NOT_BEFORE, -1, Asn1GeneralizedTime.class),
        new Asn1FieldInfo(NOT_AFTER, -1, Asn1GeneralizedTime.class)
    };

    public AttCertValidityPeriod() {
        super(fieldInfos);
    }

    public ASN1GeneralizedTime getNotBeforeTime() {
        return null;
    }

    public ASN1GeneralizedTime getNotAfterTime() {
        return null;
    }
}
