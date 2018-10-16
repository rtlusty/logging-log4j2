/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j.jdbc.appender;

/**
 *
 */
public class JdbcAppenderH2DataSourceTest extends AbstractJdbcAppenderDataSourceTest {
    public JdbcAppenderH2DataSourceTest() {
        super(new JdbcRule(JdbcH2TestHelper.TEST_CONFIGURATION_SOURCE_MEM,
                "CREATE TABLE dsLogEntry ("
                        + "id INTEGER IDENTITY, eventDate DATETIME, literalColumn VARCHAR(255), level NVARCHAR(10), "
                        + "logger NVARCHAR(255), message VARCHAR(1024), exception NCLOB, anotherDate TIMESTAMP" + ")",
                "DROP TABLE dsLogEntry"));
    }
}
