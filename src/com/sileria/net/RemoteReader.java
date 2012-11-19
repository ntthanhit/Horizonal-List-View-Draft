/*
 * Copyright (c) 2001 - 2012 Sileria, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */

package com.sileria.net;

import java.io.*;
import java.net.URL;

/**
 * Interface to be used by {@link RemoteRequest} for reading http data.
 * <p/>
 * Your own custom implementation can be provided to read from other kind of web services.
 *
 * @author Ahmed Shakil
 * @date Mar 20, 2010
 */
public interface RemoteReader extends Closeable {

    ByteArrayOutputStream readBytes (URL url) throws IOException;

}