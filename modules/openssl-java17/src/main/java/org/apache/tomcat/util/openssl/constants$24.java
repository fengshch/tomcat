/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$24 {

    static final FunctionDescriptor ERR_clear_error$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle ERR_clear_error$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "ERR_clear_error",
        "()V",
        constants$24.ERR_clear_error$FUNC, false
    );
    static final FunctionDescriptor ERR_error_string$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle ERR_error_string$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "ERR_error_string",
        "(JLjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$24.ERR_error_string$FUNC, false
    );
    static final FunctionDescriptor PKCS12_verify_mac$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PKCS12_verify_mac$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "PKCS12_verify_mac",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$24.PKCS12_verify_mac$FUNC, false
    );
    static final FunctionDescriptor PKCS12_free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PKCS12_free$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "PKCS12_free",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$24.PKCS12_free$FUNC, false
    );
    static final FunctionDescriptor PKCS12_parse$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PKCS12_parse$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "PKCS12_parse",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$24.PKCS12_parse$FUNC, false
    );
    static final FunctionDescriptor d2i_PKCS12_bio$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle d2i_PKCS12_bio$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "d2i_PKCS12_bio",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$24.d2i_PKCS12_bio$FUNC, false
    );
}

