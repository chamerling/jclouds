/**
 *
 * Copyright (C) 2009 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 */
package org.jclouds.blobstore.domain;

import org.jclouds.http.PayloadEnclosing;

import com.google.common.collect.Multimap;
import com.google.inject.internal.Nullable;

/**
 * Value type for an HTTP Blob service. Blobs are stored in containers and consist
 * of a {@link org.jclouds.blobstore.domain.Value#getContent() value}, a {@link Blob#getKey key and
 * 
 * @link Blob.Metadata#getUserMetadata() metadata}
 * 
 * @author Adrian Cole
 */
public interface Blob extends PayloadEnclosing, Comparable<Blob> {
   public interface Factory {
      Blob create(@Nullable MutableBlobMetadata metadata);
   }

   /**
    * @return System and User metadata relevant to this object.
    */
   MutableBlobMetadata getMetadata();

   Multimap<String, String> getAllHeaders();

   void setAllHeaders(Multimap<String, String> allHeaders);

}