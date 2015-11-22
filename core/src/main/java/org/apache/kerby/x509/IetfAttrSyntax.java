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
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;
import org.apache.kerby.asn1.type.Asn1OctetString;
import org.apache.kerby.asn1.type.Asn1SequenceType;

/**
 * Ref. RFC3281
 * <pre>
 *
 *  IetfAttrSyntax ::= SEQUENCE {
 *    policyAuthority [0] GeneralNames OPTIONAL,
 *    values SEQUENCE OF CHOICE {
 *      octets OCTET STRING,
 *      oid OBJECT IDENTIFIER,
 *      string UTF8String
 *    }
 *  }
 *
 * </pre>
 */
public class IetfAttrSyntax extends Asn1SequenceType {
    public static final int OCTETS    = 1;
    public static final int OID       = 2;
    public static final int UTF8      = 3;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(OCTETS, -1, Asn1OctetString.class),
        new Asn1FieldInfo(OID, -1, Asn1ObjectIdentifier.class)
    };

    public IetfAttrSyntax() {
        super(fieldInfos);
    }

    public GeneralNames getPolicyAuthority() {
        return null;
    }

    public int getValueType() {
        return -1;
    }
}
