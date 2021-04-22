/*
 *  Copyright (c) 2020 - 2021 The original author or authors
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of Apache License v2.0 which
 *  accompanies this distribution.
 *
 *       The Apache License v2.0 is available at
 *       http://www.opensource.org/licenses/apache2.0.php
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package io.github.gaol.commons;

import java.util.regex.Pattern;

/**
 * This provides common Java Patterns used to match specific strings.
 *
 * @author <a href="mailto:aoingl@gmail.com">Lin Gao</a>
 */
public final class Patterns {

    /**
     * Java Pattern used to match IPV4.
     * This checks only the format is xxx.xxx.xxx.xxx, it does not check if part of the xxx is larger than 255 or not.
     */
    public static final Pattern PATTERN_IPV4 = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");

}
