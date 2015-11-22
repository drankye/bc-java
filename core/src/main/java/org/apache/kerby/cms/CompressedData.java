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

import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1SequenceType;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/** 
 * RFC 3274: CMS Compressed Data.
 * 
 * <pre>
 * CompressedData ::= SEQUENCE {
 *     version CMSVersion,
 *     compressionAlgorithm CompressionAlgorithmIdentifier,
 *     encapContentInfo EncapsulatedContentInfo
 * }
 * </pre>
 */
public class CompressedData extends Asn1SequenceType {
    private ASN1Integer           version;
    private AlgorithmIdentifier  compressionAlgorithm;
    private ContentInfo encapContentInfo;

    public CompressedData(Asn1FieldInfo[] tags) {
        super(tags);
    }

    public ASN1Integer getVersion() {
        return version;
    }

    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return compressionAlgorithm;
    }

    public ContentInfo getEncapContentInfo() {
        return encapContentInfo;
    }
}
