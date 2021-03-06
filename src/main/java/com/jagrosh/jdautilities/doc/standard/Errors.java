/*
 * Copyright 2016-2018 John Grosh (jagrosh) & Kaidan Gustave (TheMonitorLizard)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jagrosh.jdautilities.doc.standard;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The {@link java.lang.annotation.Repeatable @Repeatable} value
 * for {@link com.jagrosh.jdautilities.doc.standard.Error @Error}.
 * <br>Useful for organizing multiple @Error annotations
 *
 * @author Kaidan Gustave
 * @see Error
 * @since 2.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface Errors {
    /**
     * One or more {@link com.jagrosh.jdautilities.doc.standard.Error @Error}
     * annotations.
     *
     * @return One or more @Error annotations
     */
    Error[] value();
}
