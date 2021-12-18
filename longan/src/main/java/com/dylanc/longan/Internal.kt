/*
 * Copyright (c) 2021. Dylan Cai
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dylanc.longan

import android.view.View
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat


internal const val NO_GETTER: String = "Property does not have a getter"

internal fun noGetter(): Nothing = throw NotImplementedError(NO_GETTER)

internal var View.isAddedMarginTop: Boolean? by viewTags(-101)
internal var View.isAddedPaddingTop: Boolean? by viewTags(-102)
internal var View.isAddedMarginBottom: Boolean? by viewTags(-103)
internal var View.lastClickTime: Long? by viewTags(-104)
internal var View.rootWindowInsetsCompatCache: WindowInsetsCompat? by viewTags(-105)
internal var View.windowInsetsControllerCompatCache: WindowInsetsControllerCompat? by viewTags(-106)
