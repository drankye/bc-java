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
import org.apache.kerby.asn1.type.Asn1Integer;
import org.apache.kerby.asn1.type.Asn1SequenceType;

/**
 * Ref. RFC 5280
 * <pre>
 * id-ce-policyConstraints OBJECT IDENTIFIER ::=  { id-ce 36 }
 *
 * PolicyConstraints ::= SEQUENCE {
 *      requireExplicitPolicy           [0] SkipCerts OPTIONAL,
 *      inhibitPolicyMapping            [1] SkipCerts OPTIONAL }
 *
 * SkipCerts ::= INTEGER (0..MAX)
 * </pre>
 */
public class PolicyConstraints extends Asn1SequenceType {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1Integer.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Integer.class)
    };

    public PolicyConstraints() {
        super(fieldInfos);
    }

    public long getRequireExplicitPolicyMapping() {
        return -1;
    }

    public long getInhibitPolicyMapping() {
        return -1;
    }
}
