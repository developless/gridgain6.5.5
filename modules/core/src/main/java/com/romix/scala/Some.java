/*
 Copyright (C) Roman Levenstein. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.romix.scala;

/**
 * Mimic Some in Scala
 *
 * @param <V>
 * @author Roman Levenstein <romixlev@gmail.com>
 */
public class Some<V> extends Option<V> {
    final V value;

    public Some(V v) {
        value = v;
    }

    public V get() {
        return value;
    }

    public boolean nonEmpty() {
        return value != null;
    }
}
