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
package org.apache.kerby.asn1;

import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class TestAsn1ObjectIdentifier {

    @Test
    public void testEncoding() throws Exception {
        testEncodingWith("1.2.840.113549.2.5",
                "0x06 08 2A 86 48 86 F7 0D 02 05");
    }

    private void testEncodingWith(String oid, String expectedEncoding) {
        byte[] expected = Util.hex2bytes(expectedEncoding);
        Asn1ObjectIdentifier aValue = new Asn1ObjectIdentifier(oid);
        aValue.getEncodingOption().useDer();
        byte[] encodingBytes = aValue.encode();
        assertThat(encodingBytes).isEqualTo(expected);
    }

    @Test
    public void testDecoding() throws Exception {
        testDecodingWith("1.2.840.113549.2.5",
                "0x06 08 2A 86 48 86 F7 0D 02 05");
    }

    private void testDecodingWith(String expectedValue, String content) throws IOException {
        Asn1ObjectIdentifier decoded = new Asn1ObjectIdentifier();
        decoded.getEncodingOption().useDer();
        decoded.decode(Util.hex2bytes(content));
        assertThat(decoded.getValue()).isEqualTo(expectedValue);
    }
}
