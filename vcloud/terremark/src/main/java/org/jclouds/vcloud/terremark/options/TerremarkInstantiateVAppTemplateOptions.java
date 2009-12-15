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
package org.jclouds.vcloud.terremark.options;

import java.net.URI;

import org.jclouds.vcloud.options.InstantiateVAppTemplateOptions;

/**
 * 
 * @author Adrian Cole
 * 
 */
public class TerremarkInstantiateVAppTemplateOptions extends InstantiateVAppTemplateOptions {

   private String password;
   private String group;
   private String row;

   public TerremarkInstantiateVAppTemplateOptions withPassword(String password) {
      this.password = password;
      return this;
   }

   public TerremarkInstantiateVAppTemplateOptions inGroup(String group) {
      this.group = group;
      return this;
   }

   public TerremarkInstantiateVAppTemplateOptions inRow(String row) {
      this.row = row;
      return this;
   }

   public static class Builder {

      /**
       * @see TerremarkInstantiateVAppTemplateOptions#cpuCount(int)
       */
      public static TerremarkInstantiateVAppTemplateOptions cpuCount(int cpuCount) {
         TerremarkInstantiateVAppTemplateOptions options = new TerremarkInstantiateVAppTemplateOptions();
         return options.cpuCount(cpuCount);
      }

      /**
       * @see TerremarkInstantiateVAppTemplateOptions#megabytes(int)
       */
      public static TerremarkInstantiateVAppTemplateOptions megabytes(int megabytes) {
         TerremarkInstantiateVAppTemplateOptions options = new TerremarkInstantiateVAppTemplateOptions();
         return options.megabytes(megabytes);
      }

      /**
       * @see TerremarkInstantiateVAppTemplateOptions#inNetwork(URI)
       */
      public static TerremarkInstantiateVAppTemplateOptions inNetwork(URI networkLocation) {
         TerremarkInstantiateVAppTemplateOptions options = new TerremarkInstantiateVAppTemplateOptions();
         return options.inNetwork(networkLocation);
      }

      /**
       * @see TerremarkInstantiateVAppTemplateOptions#withPassword(String)
       */
      public static TerremarkInstantiateVAppTemplateOptions withPassword(String password) {
         TerremarkInstantiateVAppTemplateOptions options = new TerremarkInstantiateVAppTemplateOptions();
         return options.withPassword(password);
      }

      /**
       * @see TerremarkInstantiateVAppTemplateOptions#inGroup(String)
       */
      public static TerremarkInstantiateVAppTemplateOptions inGroup(String group) {
         TerremarkInstantiateVAppTemplateOptions options = new TerremarkInstantiateVAppTemplateOptions();
         return options.inGroup(group);
      }

      /**
       * @see TerremarkInstantiateVAppTemplateOptions#inRow(String)
       */
      public static TerremarkInstantiateVAppTemplateOptions inRow(String row) {
         TerremarkInstantiateVAppTemplateOptions options = new TerremarkInstantiateVAppTemplateOptions();
         return options.inRow(row);
      }

   }

   @Override
   public TerremarkInstantiateVAppTemplateOptions cpuCount(int cpuCount) {
      return (TerremarkInstantiateVAppTemplateOptions) super.cpuCount(cpuCount);
   }

   @Override
   public TerremarkInstantiateVAppTemplateOptions inNetwork(URI networkLocation) {
      return (TerremarkInstantiateVAppTemplateOptions) super.inNetwork(networkLocation);
   }

   @Override
   public TerremarkInstantiateVAppTemplateOptions megabytes(int megabytes) {
      return (TerremarkInstantiateVAppTemplateOptions) super.megabytes(megabytes);
   }

   public String getPassword() {
      return password;
   }

   public String getGroup() {
      return group;
   }

   public String getRow() {
      return row;
   }
}