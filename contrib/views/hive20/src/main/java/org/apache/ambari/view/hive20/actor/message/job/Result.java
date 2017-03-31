/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.view.hive20.actor.message.job;

import com.google.common.collect.ImmutableList;
import org.apache.ambari.view.hive20.client.ColumnDescription;
import org.apache.ambari.view.hive20.client.Row;

import java.util.List;

public class Result {
  private final List<ColumnDescription> columns;
  private final List<Row> rows;

  public Result(List<Row> rows, List<ColumnDescription> columns) {
    this.rows = ImmutableList.copyOf(rows);
    this.columns = columns;
  }

  public List<Row> getRows() {
    return rows;
  }

  public List<ColumnDescription> getColumns() {
    return columns;
  }
}
