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

import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="mailto:aoingl@gmail.com">Lin Gao</a>
 */
public class PatternsTest {

    @Test
    public void testPatterns() {
        Assert.assertTrue(Patterns.PATTERN_IPV4.matcher("192.168.1.1").matches());
        Assert.assertTrue(Patterns.PATTERN_IPV4.matcher("255.255.255.255").matches());
        Assert.assertTrue(Patterns.PATTERN_IPV4.matcher("127.0.0.1").matches());
        Assert.assertTrue(Patterns.PATTERN_IPV4.matcher("172.17.0.1").matches());

        Assert.assertFalse(Patterns.PATTERN_IPV4.matcher("172.172.0.1024").matches());
        Assert.assertFalse(Patterns.PATTERN_IPV4.matcher("a.b.c.d").matches());
        Assert.assertFalse(Patterns.PATTERN_IPV4.matcher("a.b.c.D").matches());
    }

}
