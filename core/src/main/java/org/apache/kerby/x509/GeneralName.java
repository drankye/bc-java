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
import org.apache.kerby.cms.Name;

/**
 * The GeneralName object.
 * <pre>
 * GeneralName ::= CHOICE {
 *      otherName                       [0]     OtherName,
 *      rfc822Name                      [1]     IA5String,
 *      dNSName                         [2]     IA5String,
 *      x400Address                     [3]     ORAddress,
 *      directoryName                   [4]     Name,
 *      ediPartyName                    [5]     EDIPartyName,
 *      uniformResourceIdentifier       [6]     IA5String,
 *      iPAddress                       [7]     OCTET STRING,
 *      registeredID                    [8]     OBJECT IDENTIFIER}
 *
 * OtherName ::= SEQUENCE {
 *      type-id    OBJECT IDENTIFIER,
 *      value      [0] EXPLICIT ANY DEFINED BY type-id }
 *
 * EDIPartyName ::= SEQUENCE {
 *      nameAssigner            [0]     DirectoryString OPTIONAL,
 *      partyName               [1]     DirectoryString }
 * 
 * Name ::= CHOICE { RDNSequence }
 * </pre>
 */
public class GeneralName extends Asn1Choice {

    private static final int OTHER_NAME = 0;
    private static final int RFC822_NAME = 1;
    private static final int DNS_NAME = 2;
    private static final int X400_ADDRESS = 3;
    private static final int DIRECTORY_NAME = 4;
    private static final int EDI_PARTY_NAME = 5;
    private static final int UNIFORM_RESOURCE_IDENTIFIER = 6;
    private static final int IP_ADDRESS = 7;
    private static final int REGISTERED_ID = 8;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(OTHER_NAME, -1, OtherName.class),
        new Asn1FieldInfo(RFC822_NAME, -1, Asn1IA5String.class),
        new Asn1FieldInfo(DNS_NAME, -1, Asn1IA5String.class),
        // ORAddress is to be defined.
        new Asn1FieldInfo(X400_ADDRESS, -1, Asn1Item.class),
        new Asn1FieldInfo(DIRECTORY_NAME, -1, Name.class),
        new Asn1FieldInfo(EDI_PARTY_NAME, -1, EDIPartyName.class),
        new Asn1FieldInfo(UNIFORM_RESOURCE_IDENTIFIER, -1, Asn1IA5String.class),
        new Asn1FieldInfo(IP_ADDRESS, -1, Asn1OctetString.class),
        new Asn1FieldInfo(REGISTERED_ID, -1, Asn1ObjectIdentifier.class)
    };

    public GeneralName() {
        super(fieldInfos);
    }

    public OtherName getOtherName() {
        return getFieldAs(OTHER_NAME, OtherName.class);
    }

    public void setOtherName(OtherName otherName) {
        setFieldAs(OTHER_NAME, otherName);
    }

    public Asn1IA5String getRfc822Name() {
        return getFieldAs(RFC822_NAME, Asn1IA5String.class);
    }

    public void setRfc822Name(Asn1IA5String rfc822Name) {
        setFieldAs(RFC822_NAME, rfc822Name);
    }

    public Asn1IA5String getDNSName() {
        return getFieldAs(DNS_NAME, Asn1IA5String.class);
    }

    public void setDNSName(Asn1IA5String dnsName) {
        setFieldAs(DNS_NAME, dnsName);
    }

    public Asn1Item getX400Address() {
        return getFieldAs(X400_ADDRESS, Asn1Item.class);
    }

    public void setX400Address(Asn1Item x400Address) {
        setFieldAs(X400_ADDRESS, x400Address);
    }

    public Name getDirectoryName() {
        return getFieldAs(DIRECTORY_NAME,Name.class);
    }

    public void setDirectoryName(Name directoryName) {
        setFieldAs(DIRECTORY_NAME, directoryName);
    }

    public EDIPartyName getEdiPartyName() {
        return getFieldAs(EDI_PARTY_NAME, EDIPartyName.class);
    }

    public void setEdiPartyName(EDIPartyName ediPartyName) {
        setFieldAs(EDI_PARTY_NAME, ediPartyName);
    }

    public Asn1IA5String getUniformResourceIdentifier() {
        return getFieldAs(UNIFORM_RESOURCE_IDENTIFIER, Asn1IA5String.class);
    }

    public void setUniformResourceIdentifier(Asn1IA5String uniformResourceIdentifier) {
        setFieldAs(UNIFORM_RESOURCE_IDENTIFIER, uniformResourceIdentifier);
    }

    public Asn1OctetString getIPAddress() {
        return getFieldAs(IP_ADDRESS, Asn1OctetString.class);
    }

    public void setIpAddress(Asn1OctetString ipAddress) {
        setFieldAs(IP_ADDRESS, ipAddress);
    }

    public Asn1ObjectIdentifier getRegisteredID() {
        return getFieldAs(REGISTERED_ID, Asn1ObjectIdentifier.class);
    }

    public void setRegisteredID(Asn1ObjectIdentifier registeredID) {
        setFieldAs(REGISTERED_ID, registeredID);
    }
}
