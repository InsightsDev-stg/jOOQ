/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TBookToBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = 211792075;

	/**
	 * The singleton instance of <code>T_BOOK_TO_BOOK_STORE</code>
	 */
	public static final org.jooq.test.firebird.generatedclasses.tables.TBookToBookStore T_BOOK_TO_BOOK_STORE = new org.jooq.test.firebird.generatedclasses.tables.TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord> getRecordType() {
		return org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord.class;
	}

	/**
	 * The column <code>T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(400), this);

	/**
	 * The column <code>T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_BOOK_TO_BOOK_STORE.STOCK</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> STOCK = createField("STOCK", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>T_BOOK_TO_BOOK_STORE</code> table reference
	 */
	public TBookToBookStore() {
		super("T_BOOK_TO_BOOK_STORE", org.jooq.test.firebird.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_BOOK_TO_BOOK_STORE</code> table reference
	 */
	public TBookToBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.firebird.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.firebird.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.firebird.generatedclasses.Keys.PK_B2BS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord>>asList(org.jooq.test.firebird.generatedclasses.Keys.PK_B2BS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord, ?>>asList(org.jooq.test.firebird.generatedclasses.Keys.FK_B2BS_BS_NAME, org.jooq.test.firebird.generatedclasses.Keys.FK_B2BS_B_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.firebird.generatedclasses.tables.TBookToBookStore as(java.lang.String alias) {
		return new org.jooq.test.firebird.generatedclasses.tables.TBookToBookStore(alias);
	}
}
