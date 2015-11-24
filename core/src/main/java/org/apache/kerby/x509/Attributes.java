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

import org.apache.kerby.asn1.type.Asn1SequenceOf;

/**
 * This extension may contain further X.500 attributes of the subject. See also
 * RFC 3039.
 *
 * <pre>
 *     SubjectDirectoryAttributes ::= Attributes
 *     Attributes ::= SEQUENCE SIZE (1..MAX) OF Attribute
 *     Attribute ::= SEQUENCE
 *     {
 *       type AttributeType
 *       values SET OF AttributeValue
 *     }
 *
 *     AttributeType ::= OBJECT IDENTIFIER
 *     AttributeValue ::= ANY DEFINED BY AttributeType
 * </pre>
 *
 * @see org.bouncycastle.asn1.x500.style.BCStyle for AttributeType ObjectIdentifiers.
 */
public class Attributes extends Asn1SequenceOf<Attribute> {

}
