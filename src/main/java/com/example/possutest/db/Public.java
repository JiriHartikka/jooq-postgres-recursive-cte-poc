/*
 * This file is generated by jOOQ.
 */
package com.example.possutest.db;


import com.example.possutest.db.tables.PermissionGroup;
import com.example.possutest.db.tables.Role;
import com.example.possutest.db.tables.RolePermission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 600597508;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.permission_group</code>.
     */
    public final PermissionGroup PERMISSION_GROUP = com.example.possutest.db.tables.PermissionGroup.PERMISSION_GROUP;

    /**
     * The table <code>public.role</code>.
     */
    public final Role ROLE = com.example.possutest.db.tables.Role.ROLE;

    /**
     * The table <code>public.role_permission</code>.
     */
    public final RolePermission ROLE_PERMISSION = com.example.possutest.db.tables.RolePermission.ROLE_PERMISSION;

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
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.PERMISSION_GROUP_ID_SEQ,
            Sequences.ROLE_ID_SEQ,
            Sequences.ROLE_PERMISSION_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            PermissionGroup.PERMISSION_GROUP,
            Role.ROLE,
            RolePermission.ROLE_PERMISSION);
    }
}