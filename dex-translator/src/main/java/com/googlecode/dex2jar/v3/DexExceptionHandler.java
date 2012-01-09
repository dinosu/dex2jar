/*
 * dex2jar - A tool for converting Android .dex format to Java .class format 
 * Copyright (c) 2009-2012 Panxiaobo
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.dex2jar.v3;

import org.objectweb.asm.tree.MethodNode;

import com.googlecode.dex2jar.Method;
import com.googlecode.dex2jar.ir.IrMethod;

public interface DexExceptionHandler {
    public void handleFileException(Exception e);

    public void handleMethodTranslateException(Method method, IrMethod irMethod, MethodNode methodNode, Exception e);
}
