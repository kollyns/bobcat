/*-
 * #%L
 * Bobcat Parent
 * %%
 * Copyright (C) 2016 Cognifide Ltd.
 * %%
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
 * #L%
 */
package com.cognifide.qa.bb.aem.data.components;

import java.util.Map;

import com.cognifide.qa.bb.guice.ThreadScoped;
import com.fasterxml.jackson.core.type.TypeReference;
import com.cognifide.qa.bb.aem.util.YamlReader;
import com.google.inject.Provider;

@ThreadScoped
public class ComponentsProvider implements Provider<Components> {

  public static final String CONFIG_PATH = "component-descriptions";

  private Components descriptions;

  @Override
  @SuppressWarnings("unchecked")
  public Components get() {
    if (descriptions == null) {
      descriptions = new Components(readConfig());
    }
    return descriptions;
  }

  private Map readConfig() {
    TypeReference<Map<String, ComponentDescription>> typeReference = new TypeReference<Map<String,
        ComponentDescription>>() {
    };
    return YamlReader.read(CONFIG_PATH, typeReference);
  }
}
