/*
 * This file is generated by jOOQ.
 */
package com.machingclee.jooq.generated;


import com.machingclee.jooq.generated.tables.Student;
import com.machingclee.jooq.generated.tables._PrismaMigrations;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public._prisma_migrations</code>.
     */
    public final _PrismaMigrations _PRISMA_MIGRATIONS = _PrismaMigrations._PRISMA_MIGRATIONS;

    /**
     * The table <code>public.student</code>.
     */
    public final Student STUDENT = Student.STUDENT;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            _PrismaMigrations._PRISMA_MIGRATIONS,
            Student.STUDENT);
    }
}
