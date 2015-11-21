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
package org.apache.kerby.cms;

import org.apache.kerby.asn1.type.Asn1Choice;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1OctetString;

/**
 * <a href="http://tools.ietf.org/html/rfc5652#section-5.3">RFC 5652</a>:
 * Identify who signed the containing {@link SignerInfo} object.
 * <p>
 * The certificates referred to by this are at containing {@link SignedData} structure.
 * <p>
 * <pre>
 * SignerIdentifier ::= CHOICE {
 *     issuerAndSerialNumber IssuerAndSerialNumber,
 *     subjectKeyIdentifier [0] SubjectKeyIdentifier 
 * }
 *
 * SubjectKeyIdentifier ::= OCTET STRING
 * </pre>
 */
public class SignerIdentifier
    extends Asn1Choice {
    private static final int ISSUER_AND_SERIAL_NUMBER = 0;
    private static final int SUBJECT_KEY_IDENTIFIER = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[]{
        new Asn1FieldInfo(ISSUER_AND_SERIAL_NUMBER, IssuerAndSerialNumber.class),
        new Asn1FieldInfo(SUBJECT_KEY_IDENTIFIER, Asn1OctetString.class)
    };

    public SignerIdentifier() {
        super(fieldInfos);
    }
}