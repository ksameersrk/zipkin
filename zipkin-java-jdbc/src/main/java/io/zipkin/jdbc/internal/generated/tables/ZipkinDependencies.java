/**
 * Copyright 2015 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/**
 * This class is generated by jOOQ
 */
package io.zipkin.jdbc.internal.generated.tables;


import io.zipkin.jdbc.internal.generated.Zipkin;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ZipkinDependencies extends TableImpl<Record> {

	private static final long serialVersionUID = 338851961;

	/**
	 * The reference instance of <code>zipkin.zipkin_dependencies</code>
	 */
	public static final ZipkinDependencies ZIPKIN_DEPENDENCIES = new ZipkinDependencies();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>zipkin.zipkin_dependencies.dlid</code>.
	 */
	public final TableField<Record, Long> DLID = createField("dlid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>zipkin.zipkin_dependencies.start_ts</code>.
	 */
	public final TableField<Record, Long> START_TS = createField("start_ts", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>zipkin.zipkin_dependencies.end_ts</code>.
	 */
	public final TableField<Record, Long> END_TS = createField("end_ts", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>zipkin.zipkin_dependencies</code> table reference
	 */
	public ZipkinDependencies() {
		this("zipkin_dependencies", null);
	}

	/**
	 * Create an aliased <code>zipkin.zipkin_dependencies</code> table reference
	 */
	public ZipkinDependencies(String alias) {
		this(alias, ZIPKIN_DEPENDENCIES);
	}

	private ZipkinDependencies(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private ZipkinDependencies(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, Zipkin.ZIPKIN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZipkinDependencies as(String alias) {
		return new ZipkinDependencies(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ZipkinDependencies rename(String name) {
		return new ZipkinDependencies(name, null);
	}
}
