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
package com.cognifide.qa.bb.aem.modules;

import com.cognifide.qa.bb.aem.pageobjects.touchui.dialogfields.Checkbox;
import com.cognifide.qa.bb.aem.pageobjects.touchui.dialogfields.DialogField;
import com.cognifide.qa.bb.aem.pageobjects.touchui.dialogfields.Image;
import com.cognifide.qa.bb.aem.pageobjects.touchui.dialogfields.Multifield;
import com.cognifide.qa.bb.aem.pageobjects.touchui.dialogfields.MultifieldItem;
import com.cognifide.qa.bb.aem.pageobjects.touchui.dialogfields.PathBrowser;
import com.cognifide.qa.bb.aem.pageobjects.touchui.dialogfields.RichText;
import com.cognifide.qa.bb.aem.pageobjects.touchui.dialogfields.Select;
import com.cognifide.qa.bb.aem.pageobjects.touchui.dialogfields.Textfield;
import com.cognifide.qa.bb.aem.pageobjects.touchui.dialogfields.Variant;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class FieldsModule extends AbstractModule {

  @Override
  protected void configure() {
    Multibinder<DialogField> fieldsBinder = Multibinder.newSetBinder(binder(), DialogField.class);
    fieldsBinder.addBinding().to(Checkbox.class);
    fieldsBinder.addBinding().to(Textfield.class);
    fieldsBinder.addBinding().to(Image.class);
    fieldsBinder.addBinding().to(PathBrowser.class);
    fieldsBinder.addBinding().to(Select.class);
    fieldsBinder.addBinding().to(RichText.class);
    fieldsBinder.addBinding().to(Variant.class);
    fieldsBinder.addBinding().to(Multifield.class);
    fieldsBinder.addBinding().to(MultifieldItem.class);
  }
}
