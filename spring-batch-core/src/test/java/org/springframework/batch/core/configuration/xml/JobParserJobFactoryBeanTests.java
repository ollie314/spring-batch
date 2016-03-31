/*
 * Copyright 2009 the original author or authors.
 *
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
 */
package org.springframework.batch.core.configuration.xml;

import static org.junit.Assert.*;

import org.junit.Test;


public class JobParserJobFactoryBeanTests {
	
	private JobParserJobFactoryBean factory = new JobParserJobFactoryBean("jobFactory");
	
	@Test
	public void testSingleton() throws Exception {
		assertTrue("Expected singleton", factory.isSingleton());
	}

}
