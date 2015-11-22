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
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;

/**
 *
 * <pre>
 *  AttCertIssuer ::= CHOICE {
 *       v1Form   GeneralNames,  -- MUST NOT be used in this profile
 *       v2Form   [0] V2Form     -- v2 only
 *  }
 * </pre>
 */
public class AttCertIssuer extends Asn1Choice {
    private static final int V1_FORM = 0;
    private static final int V2_FORM = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(V1_FORM, -1, GeneralNames.class),
        new Asn1FieldInfo(V2_FORM, -1, V2Form.class)
    };

    public AttCertIssuer() {
        super(fieldInfos);
    }

    public ASN1Encodable getCertIssuer() {
        return null;
    }
}
